/* Copyright 2018 Conny Duck
 *
 * This file is a part of Mercurius and originally was created for Tusky.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Mercurius is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Mercurius; if not,
 * see <http://www.gnu.org/licenses>. */

package com.m3710.mercurius.fragment.preference

import android.content.SharedPreferences
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.m3710.mercurius.R

class TabFilterPreferencesFragment : PreferenceFragmentCompat() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.timeline_filter_preferences)
        sharedPreferences = preferenceManager.sharedPreferences
    }

    companion object {

        fun newInstance(): TabFilterPreferencesFragment {
            return TabFilterPreferencesFragment()
        }
    }
}
