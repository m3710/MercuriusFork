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

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.m3710.mercurius.MercuriusApplication
import com.m3710.mercurius.appstore.EventHub
import com.m3710.mercurius.appstore.EventHubImpl
import com.m3710.mercurius.db.AccountManager
import com.m3710.mercurius.db.AppDatabase
import com.m3710.mercurius.network.MastodonApi
import com.m3710.mercurius.network.TimelineCases
import com.m3710.mercurius.network.TimelineCasesImpl
import com.m3710.mercurius.util.HtmlConverter
import com.m3710.mercurius.util.HtmlConverterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by charlag on 3/21/18.
 */

@Module
class AppModule {

    @Provides
    fun providesApplication(app: MercuriusApplication): Application = app

    @Provides
    fun providesContext(app: Application): Context = app

    @Provides
    fun providesSharedPreferences(app: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(app)
    }

    @Provides
    fun providesBroadcastManager(app: Application): LocalBroadcastManager {
        return LocalBroadcastManager.getInstance(app)
    }

    @Provides
    fun providesTimelineUseCases(api: MastodonApi,
                                 eventHub: EventHub): TimelineCases {
        return TimelineCasesImpl(api, eventHub)
    }

    @Provides
    @Singleton
    fun providesAccountManager(app: MercuriusApplication): AccountManager {
        return app.serviceLocator.get(AccountManager::class.java)
    }

    @Provides
    @Singleton
    fun providesEventHub(): EventHub = EventHubImpl

    @Provides
    @Singleton
    fun providesDatabase(app: MercuriusApplication): AppDatabase {
        return app.serviceLocator.get(AppDatabase::class.java)
    }

    @Provides
    @Singleton
    fun providesHtmlConverter(): HtmlConverter {
        return HtmlConverterImpl()
    }
}