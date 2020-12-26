package com.uliahdaraihan_18102034.praktikum9.preferences

import android.bluetooth.le.AdvertiseData
import android.content.Context
import com.uliahdaraihan_18102034.praktikum9.data.SettingModel


    internal class SettingPreference(context: Context) {
        companion object {
            private const val PREFS_NAME = "setting_pref"
            private const val NAME = "name"
            private const val EMAIL = "email"
            private const val AGE = "age"
            private const val PHONE_NUMBER = "phone"
            private const val MOTTO = "motto_hidup"
            private const val ADDRESS = "alamat"
            private const val THEME = "theme"
        }

        private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        fun setSetting(value: SettingModel) {
            val editor = preferences.edit()
            editor.putString(NAME, value.name)
            editor.putString(EMAIL, value.email)
            editor.putInt(AGE, value.age)
            editor.putString(PHONE_NUMBER, value.phoneNumber)
            editor.putString(MOTTO, value.motto)
            editor.putString(ADDRESS, value.address)
            editor.putBoolean(THEME, value.isDarkTheme)
            editor.apply()
        }
        fun getSetting(): SettingModel {
            val model = SettingModel()
            model.name = preferences.getString(NAME, "")
            model.email = preferences.getString(EMAIL, "")
            model.age = preferences.getInt(AGE, 0)
            model.phoneNumber = preferences.getString(PHONE_NUMBER, "")
            model.motto = preferences.getString(MOTTO, "")
            model.address = preferences.getString(ADDRESS, "")
            model.isDarkTheme = preferences.getBoolean(THEME, false)
            return model
        }
    }
