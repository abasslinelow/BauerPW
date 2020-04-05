package com.android.example.bpw

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.customer_card.view.*

class CustomerAdapter(private val customers: ArrayList<Customer>, private val context: Context) :
        RecyclerView.Adapter<CustomerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerViewHolder {
        return CustomerViewHolder(LayoutInflater.from(context).inflate(R.layout.customer_card, parent, false))
    }

    override fun onBindViewHolder(holder: CustomerViewHolder, position: Int) {
        holder.custFName.text = customers[position].fname
        holder.custLName.text = customers[position].lname

    }

    override fun getItemCount() = customers.size
}

class CustomerViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
    val custFName: TextView = view.cust_fname
    val custLName: TextView = view.cust_lname

    init {
        view.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Log.d("RecyclerView", "CLICK!")
    }

    companion object {
        private val CUSTOMER_KEY = "CUSTOMER"
    }
}