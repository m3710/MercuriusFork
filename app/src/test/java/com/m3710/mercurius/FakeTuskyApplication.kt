package com.m3710.mercurius

/**
 * Created by charlag on 3/7/18.
 */

class FakeMercuriusApplication : MercuriusApplication() {

    private lateinit var locator: ServiceLocator

    override fun initSecurityProvider() {
        // No-op
    }

    override fun initAppInjector() {
        // No-op
    }

    override fun getServiceLocator(): ServiceLocator {
        return locator
    }
}