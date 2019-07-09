package com.m3710.mercurius.interfaces;

public interface PermissionRequester {
    void onRequestPermissionsResult(String[] permissions, int[] grantResults);
}