package com.m3710.mercurius.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import com.m3710.mercurius.fragment.ViewMediaFragment
import java.lang.IllegalStateException

class AvatarImagePagerAdapter(fragmentManager: FragmentManager, private val avatarUrl: String) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            ViewMediaFragment.newAvatarInstance(avatarUrl)
        } else {
            throw IllegalStateException()
        }
    }

    override fun getCount() = 1

}
