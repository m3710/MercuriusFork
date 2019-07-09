package com.m3710.mercurius.di

import com.google.gson.Gson
import com.m3710.mercurius.db.AccountManager
import com.m3710.mercurius.db.AppDatabase
import com.m3710.mercurius.network.MastodonApi
import com.m3710.mercurius.repository.TimelineRepository
import com.m3710.mercurius.repository.TimelineRepositoryImpl
import com.m3710.mercurius.util.HtmlConverter
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun providesTimelineRepository(db: AppDatabase, mastodonApi: MastodonApi,
                                   accountManager: AccountManager, gson: Gson,
                                   htmlConverter: HtmlConverter): TimelineRepository {
        return TimelineRepositoryImpl(db.timelineDao(), mastodonApi, accountManager, gson,
                htmlConverter)
    }
}