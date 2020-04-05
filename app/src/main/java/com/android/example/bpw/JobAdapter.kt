package com.android.example.bpw

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.example.bpw.com.android.example.bpw.Job
import kotlinx.android.synthetic.main.job_card.view.*
import org.threeten.bp.format.DateTimeFormatter

// This class is exactly like CustomerAdapter, except it tracks jobs and creates a job card.
class JobAdapter(private val jobs: ArrayList<Job>, private val context: Context) :
    RecyclerView.Adapter<JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        return JobViewHolder(LayoutInflater.from(context).inflate(R.layout.job_card, parent, false))
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.jobDate.text = jobs[position].date.format(DateTimeFormatter.ISO_DATE)
        holder.jobType.text = jobs[position].type
        holder.custFName.text = jobs[position].customer.fname
        holder.custLName.text = jobs[position].customer.lname
    }

    override fun getItemCount() = jobs.size
}

class JobViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
    val jobDate: TextView = view.job_date
    val jobType: TextView = view.job_type
    val custFName: TextView = view.cust_fname
    val custLName: TextView = view.cust_lname

    init {
        view.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Log.d("RecyclerView", "CLICK!")
    }
}