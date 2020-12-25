package com.uliahdaraihan_18102034.praktikum9.preferences

import android.content.Context
import com.uliahdaraihan_18102034.praktikum9.data.SettingModel

class SettingPreference {
    internal class SettingPreference(context: Context) {
        companion object {
            private const val PREFS_NAME = "setting_pref"
            private const val NAME = "name"
            private const val EMAIL = "email"
            private const val AGE = "age"
            private const val PHONE_NUMBER = "phone"
            private const val THEME = "theme"
        }

        private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        fun setSetting(value: SettingModel.SettingModel) {
            val editor = preferences.edit()
            editor.putString(NAME, value.name)
            editor.putString(EMAIL, value.email)
            editor.putInt(AGE, value.age)
            editor.putString(PHONE_NUMBER, value.phoneNumber)
            editor.putBoolean(THEME, value.isDarkTheme)
            editor.apply()
        }
    }
}