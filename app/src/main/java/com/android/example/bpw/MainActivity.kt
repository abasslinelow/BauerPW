package com.android.example.bpw

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.android.example.bpw.databinding.ActivityMainBinding
import com.jakewharton.threetenabp.AndroidThreeTen
import kotlinx.android.synthetic.main.activity_main.*
import org.threeten.bp.LocalDate
import java.math.BigDecimal
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var customers = ArrayList<Customer>()
    private var jobs = ArrayList<Job>()

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_customers -> {
                onCustomers()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_jobs -> {
                onJobs()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {
                onCalendar()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidThreeTen.init(this);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navView: BottomNavigationView = binding.navView
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)


        populateCustomers()
        populateJobs()

        // Since the program starts at the Customers view, we need to refresh the view.
        onCustomers()
    }

    private fun onCustomers() {
        binding.heading.setText(R.string.title_customers)

        customer_list.visibility = View.VISIBLE
        job_calendar.visibility = View.INVISIBLE

        customer_list.layoutManager = LinearLayoutManager(this)
        customer_list.adapter = CustomerAdapter(customers, this)

    }

    private fun onJobs() {
        binding.heading.setText(R.string.title_jobs)

        customer_list.visibility = View.VISIBLE
        job_calendar.visibility = View.INVISIBLE

        customer_list.layoutManager = LinearLayoutManager(this)
        customer_list.adapter = JobAdapter(jobs, this)
    }

    private fun onCalendar() {
        binding.heading.setText(R.string.title_calendar)

        job_calendar.visibility = View.VISIBLE
        customer_list.visibility = View.INVISIBLE
    }

    private fun populateCustomers() {
        val customer1 = Customer("Todd", "Bauer", "(098) 765-4321", "734 Memory Lane")
        val customer2 = Customer("Gerard", "Bauer", "(098) 765-4321", "8746 Graph Street")
        val customer3 = Customer("Hubert", "Cumberdale", "(098) 765-4321", "734 Exemplar Lane")
        val customer4 = Customer("Lemeza", "Kosugi", "(098) 765-4321", "396 Sesame Street")
        val customer5 = Customer("Lumisa", "Kosugi", "(098) 765-4321", "13983 Symmetrical Circle")
        val customer6 = Customer("Henry", "George", "(098) 765-4321", "683 South Washington Street")
        val customer7 = Customer("Dillinger", "Fugazi", "(098) 765-4321", "2841 Egg Fruit Circle")
        val customer8 = Customer("Samus", "Aran", "(098) 765-4321", "835 Franklin Road")
        val customer9 = Customer("Grover", "Cleveland", "(098) 765-4321", "1264 South Cleveland Boulevard")
        val customer10 = Customer("Cyan", "Garamonde", "(098) 765-4321", "734 Exemplar Lane")
        val customer11 = Customer("Alexander", "Hamilton", "(098) 765-4321", "1787 Constitutional Road")
        val customer12 = Customer("Sabin", "Figaro", "(098) 765-4321", "34 Figaro Castle")
        val customer13 = Customer("Edgar", "Figaro", "(098) 765-4321", "36 Figaro Castle")
        val customer14 = Customer("Setzer", "Gabbiani", "(098) 765-4321", "8264 Falcon Lane")
        val customer15 = Customer("Relm", "Arrowny", "(098) 765-4321", "8272 Thamasa Court")
        val customer16 = Customer("Strago", "Magus", "(098) 765-4321", "8272 Thamasa Court")
        val customer17 = Customer("Celes", "Chere", "(098) 765-4321", "82736 Gestahlian Court")
        val customer18 = Customer("Terra", "Branford", "(098) 765-4321", "734 Exemplar Lane")
        val customer19 = Customer("Locke", "Cole", "(098) 765-4321", "734 Exemplar Lane")
        val customer20 = Customer("Kefka", "Palazzo", "(098) 765-4321", "734 Tower of Rubble Road")

        customers.add(customer1)
        customers.add(customer2)
        customers.add(customer3)
        customers.add(customer4)
        customers.add(customer5)
        customers.add(customer6)
        customers.add(customer7)
        customers.add(customer8)
        customers.add(customer9)
        customers.add(customer10)
        customers.add(customer11)
        customers.add(customer12)
        customers.add(customer13)
        customers.add(customer14)
        customers.add(customer15)
        customers.add(customer16)
        customers.add(customer17)
        customers.add(customer18)
        customers.add(customer19)
        customers.add(customer20)
        customers.sortWith( compareBy{it.fname} )
    }

    private fun populateJobs() {
        val date1: LocalDate = LocalDate.of(2020, 4, 26)
        val date2: LocalDate = LocalDate.of(2020, 4, 28)
        val date3: LocalDate = LocalDate.of(2020, 4, 30)
        val date4: LocalDate = LocalDate.of(2020, 5, 1)
        val date5: LocalDate = LocalDate.of(2020, 5, 2)
        val date6: LocalDate = LocalDate.of(2020, 5, 5)
        val date7: LocalDate = LocalDate.of(2020, 5, 8)
        val date8: LocalDate = LocalDate.of(2020, 5, 13)
        val date9: LocalDate = LocalDate.of(2020, 5, 14)
        val date10: LocalDate = LocalDate.of(2020, 5, 14)
        val date11: LocalDate = LocalDate.of(2020, 5, 15)
        val date12: LocalDate = LocalDate.of(2020, 5, 16)
        val date13: LocalDate = LocalDate.of(2020, 5, 17)
        val date14: LocalDate = LocalDate.of(2020, 5, 18)
        val date15: LocalDate = LocalDate.of(2020, 5, 22)
        val date16: LocalDate = LocalDate.of(2020, 5, 24)
        val date17: LocalDate = LocalDate.of(2020, 5, 25)
        val date18: LocalDate = LocalDate.of(2020, 5, 26)
        val date19: LocalDate = LocalDate.of(2020, 5, 27)
        val date20: LocalDate = LocalDate.of(2020, 5, 28)

        val job1 = Job(customers[0], date1, "Pressure Wash", BigDecimal(89.95))
        val job2 = Job(customers[1], date2, "Pressure Wash", BigDecimal(89.95))
        val job3 = Job(customers[2], date3, "WiFi Antenna", BigDecimal(29.95))
        val job4 = Job(customers[3], date4, "Pressure Wash", BigDecimal(89.95))
        val job5 = Job(customers[4], date5, "WiFi Antenna", BigDecimal(29.95))
        val job6 = Job(customers[5], date6, "WiFi Antenna", BigDecimal(29.95))
        val job7 = Job(customers[6], date7, "Miscellaneous", BigDecimal(137.27))
        val job8 = Job(customers[7], date8, "Pressure Wash", BigDecimal(89.95))
        val job9 = Job(customers[8], date9, "Pressure Wash", BigDecimal(89.95))
        val job10 = Job(customers[9], date10, "WiFi Antenna", BigDecimal(29.95))
        val job11 = Job(customers[10], date11, "Pressure Wash", BigDecimal(89.95))
        val job12 = Job(customers[11], date12, "WiFi Antenna", BigDecimal(29.95))
        val job13 = Job(customers[12], date13, "WiFi Antenna", BigDecimal(29.95))
        val job14 = Job(customers[13], date14, "WiFi Antenna", BigDecimal(29.95))
        val job15 = Job(customers[14], date15, "WiFi Antenna", BigDecimal(29.95))
        val job16 = Job(customers[15], date16, "Pressure Wash", BigDecimal(89.95))
        val job17 = Job(customers[16], date17, "WiFi Antenna", BigDecimal(29.95))
        val job18 = Job(customers[17], date18, "Pressure Wash", BigDecimal(89.95))
        val job19 = Job(customers[18], date19, "Pressure Wash", BigDecimal(89.95))
        val job20 = Job(customers[19], date20, "WiFi Antenna", BigDecimal(29.95))

        jobs.add(job1)
        jobs.add(job2)
        jobs.add(job3)
        jobs.add(job4)
        jobs.add(job5)
        jobs.add(job6)
        jobs.add(job7)
        jobs.add(job8)
        jobs.add(job9)
        jobs.add(job10)
        jobs.add(job11)
        jobs.add(job12)
        jobs.add(job13)
        jobs.add(job14)
        jobs.add(job15)
        jobs.add(job16)
        jobs.add(job17)
        jobs.add(job18)
        jobs.add(job19)
        jobs.add(job20)
    }
}