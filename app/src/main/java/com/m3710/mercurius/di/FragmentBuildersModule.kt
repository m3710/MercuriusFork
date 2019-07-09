/* Copyright 2018 charlag
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


package com.m3710.mercurius.di

import com.m3710.mercurius.AccountsInListFragment
import com.m3710.mercurius.components.conversation.ConversationsFragment
import com.m3710.mercurius.components.instancemute.fragment.InstanceListFragment
import com.m3710.mercurius.fragment.*
import com.m3710.mercurius.fragment.preference.AccountPreferencesFragment
import com.m3710.mercurius.fragment.preference.NotificationPreferencesFragment
import com.m3710.mercurius.components.report.fragments.ReportDoneFragment
import com.m3710.mercurius.components.report.fragments.ReportNoteFragment
import com.m3710.mercurius.components.report.fragments.ReportStatusesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by charlag on 3/24/18.
 */

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun accountListFragment(): AccountListFragment

    @ContributesAndroidInjector
    abstract fun accountMediaFragment(): AccountMediaFragment

    @ContributesAndroidInjector
    abstract fun viewThreadFragment(): ViewThreadFragment

    @ContributesAndroidInjector
    abstract fun timelineFragment(): TimelineFragment

    @ContributesAndroidInjector
    abstract fun notificationsFragment(): NotificationsFragment

    @ContributesAndroidInjector
    abstract fun searchFragment(): SearchFragment

    @ContributesAndroidInjector
    abstract fun notificationPreferencesFragment(): NotificationPreferencesFragment

    @ContributesAndroidInjector
    abstract fun accountPreferencesFragment(): AccountPreferencesFragment

    @ContributesAndroidInjector
    abstract fun directMessagesPreferencesFragment(): ConversationsFragment

    @ContributesAndroidInjector
    abstract fun accountInListsFragment(): AccountsInListFragment

    @ContributesAndroidInjector
    abstract fun reportStatusesFragment(): ReportStatusesFragment

    @ContributesAndroidInjector
    abstract fun reportNoteFragment(): ReportNoteFragment

    @ContributesAndroidInjector
    abstract fun reportDoneFragment(): ReportDoneFragment

    @ContributesAndroidInjector
    abstract fun instanceListFragment(): InstanceListFragment
}
