package com.m3710.mercurius.viewdata

import android.os.Parcelable
import com.m3710.mercurius.entity.Attachment
import com.m3710.mercurius.entity.Status
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AttachmentViewData(
        val attachment: Attachment,
        val statusId: String,
        val statusUrl: String
) : Parcelable {
    companion object {
        @JvmStatic
        fun list(status: Status): List<AttachmentViewData> {
            val actionable = status.actionableStatus
            return actionable.attachments.map {
                AttachmentViewData(it, actionable.id, actionable.url!!)
            }
        }
    }
}