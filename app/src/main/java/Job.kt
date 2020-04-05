package com.android.example.bpw

import org.threeten.bp.Duration
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalTime
import java.math.BigDecimal

class Job(var customer: Customer, var date: LocalDate, var type: String, var price: BigDecimal, var time: LocalTime? = null, var duration: Duration? = null) {
}