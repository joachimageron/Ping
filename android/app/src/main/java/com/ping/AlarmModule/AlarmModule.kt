package com.ping; // replace your-apps-package-name with your app’s package name
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class AlarmModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "AlarmModule"
    }

    @ReactMethod
    fun logMessage(message: String) {
        Log.d("AlarmModule", message)
    }

    @ReactMethod
    fun createAlarm(hour: Int, minute: Int, id: Int) {
        // Code to create an alarm
    }

    @ReactMethod
    fun deleteAlarm(id: Int) {
        // Code to delete an alarm
    }
}