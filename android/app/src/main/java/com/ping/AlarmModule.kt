package com.ping; // replace your-apps-package-name with your app’s package name
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


import android.widget.Toast


class AlarmModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "AlarmModule"
    }

    @ReactMethod
    fun logMessage(message: String) {
        Toast.makeText(reactApplicationContext, "Log: $message", Toast.LENGTH_SHORT).show()

    }

    @ReactMethod
    fun createAlarm(hour: Int, minute: Int, id: Int) {
        // TODO Code to create an alarm
    }

    @ReactMethod
    fun deleteAlarm(id: Int) {
        // TODO Code to delete an alarm
    }
}
