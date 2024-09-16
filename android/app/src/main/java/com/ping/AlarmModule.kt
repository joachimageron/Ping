package com.ping; // replace your-apps-package-name with your app’s package name
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

import android.content.Intent
import android.provider.AlarmClock

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
        fun setAlarm(hour: Int, minute: Int, message: String) {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_HOUR, hour)
                putExtra(AlarmClock.EXTRA_MINUTES, minute)
                putExtra(AlarmClock.EXTRA_MESSAGE, message)
                putExtra(AlarmClock.EXTRA_SKIP_UI, true)  // Cette option saute l'interface utilisateur de l'application Horloge
            }
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            reactApplicationContext.startActivity(intent)
        }

    @ReactMethod
    fun deleteAlarm(id: Int) {
        // TODO Code to delete an alarm
    }
}
