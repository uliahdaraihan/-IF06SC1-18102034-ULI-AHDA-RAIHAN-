package com.uliahdaraihan_18102034.praktikum14.`interface`

import com.uliahdaraihan_18102034.praktikum14.model.Login
import com.uliahdaraihan_18102034.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login) }