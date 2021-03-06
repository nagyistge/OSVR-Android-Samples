/*
 * Copyright (C) 2015 Sensics, Inc. and contributors.
 *
 * Based on Android NDK samples, which are:
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.osvr.common.jni;

// Wrapper for native library

public class JNIBridge {

    private static boolean librariesLoaded = false;

     public static void loadLibraries() {
         if(!librariesLoaded) {
             System.loadLibrary("gnustl_shared");
             System.loadLibrary("crystax");
             System.loadLibrary("jsoncpp");
             System.loadLibrary("usb1.0");
             System.loadLibrary("osvrUtil");
             System.loadLibrary("osvrCommon");
             System.loadLibrary("osvrClient");
             System.loadLibrary("osvrClientKit");
             System.loadLibrary("functionality");
             System.loadLibrary("osvrConnection");
             System.loadLibrary("osvrPluginHost");
             System.loadLibrary("osvrPluginKit");
             System.loadLibrary("osvrVRPNServer");
             System.loadLibrary("osvrServer");
             System.loadLibrary("osvrJointClientKit");
//             System.loadLibrary("com_osvr_android_jniImaging");
             System.loadLibrary("com_osvr_android_sensorTracker");
             System.loadLibrary("com_osvr_Multiserver");
//             System.loadLibrary("org_osvr_filter_deadreckoningrotation");
             System.loadLibrary("org_osvr_filter_oneeuro");
             System.loadLibrary("native-activity");
             librariesLoaded = true;
         }
     }
    static {
        loadLibraries();
    }
    /**
     * @param width the current view width
     * @param height the current view height
     */
     public static native void reportFrame(byte[] data, long width, long height);
}
