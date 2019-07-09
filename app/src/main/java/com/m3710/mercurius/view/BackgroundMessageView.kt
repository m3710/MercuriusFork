package com.m3710.mercurius.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.m3710.mercurius.R
import com.m3710.mercurius.util.visible
import kotlinx.android.synthetic.main.view_background_message.view.*


/**
 * This view is used for screens with downloadable content which may fail.
 * Can show an image, text and button below them.
 */
class BackgroundMessageView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.view_background_message, this)
        gravity = Gravity.CENTER_HORIZONTAL
        orientation = VERTICAL

        if (isInEditMode) {
            setup(R.drawable.elephant_offline, R.string.error_network) {}
        }
    }

    /**
     * Setup image, message and button.
     * If [clickListener] is `null` then the button will be hidden.
     */
    fun setup(@DrawableRes imageRes: Int, @StringRes messageRes: Int,
              clickListener: ((v: View) -> Unit)?) {
        messageTextView.setText(messageRes)
        messageTextView.setCompoundDrawablesWithIntrinsicBounds(0, imageRes, 0, 0)
        button.setOnClickListener(clickListener)
        button.visible(clickListener != null)
    }
}