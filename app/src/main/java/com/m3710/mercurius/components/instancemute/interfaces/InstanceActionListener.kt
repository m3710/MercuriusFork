package com.m3710.mercurius.components.instancemute.interfaces

interface InstanceActionListener {
    fun mute(mute: Boolean, instance: String, position: Int)
}