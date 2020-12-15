package com.uliahdaraihan_18102034.praktikum8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_sms_receiver.*

class SmsReceiverActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)
        title = getString(R.string.incoming_message)
        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)?.toLowerCase()
        val penipuan = arrayOf("hadiah", "blogspot", "wordpress", "pulsa", "selamat", "transfer", "mobil", "polisi", "rumah")
        val match = penipuan.filter { it in senderMessage!!.split(" ") }
        if (match.isNotEmpty()) {
            tv_message.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
            }
        tv_from.text = getString(R.string.coming_from) + ": " + senderNo
        tv_message.text = senderMessage
        btn_close.setOnClickListener { finish() }
    }
}