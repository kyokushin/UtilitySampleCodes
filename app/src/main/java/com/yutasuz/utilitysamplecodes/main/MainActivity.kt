package com.yutasuz.utilitysamplecodes.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.yutasuz.utilitysamplecodes.R
import com.yutasuz.utilitysamplecodes.fixaspectratio.FixAspectRratioActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = ActivityListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        adapter.activities.apply {
            add(FixAspectRratioActivity::class.java)
        }

        recycler_view.apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        }
    }

    class ActivityListAdapter: RecyclerView.Adapter<ActivityItemViewHolder>(){
        val activities = arrayListOf<Class<*>>()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ActivityItemViewHolder(parent)

        override fun getItemCount() = activities.size

        override fun onBindViewHolder(holder: ActivityItemViewHolder, position: Int) {
            holder.onBind(activities[position])
        }
    }

    class ActivityItemViewHolder(parent: ViewGroup)
        : RecyclerView.ViewHolder(
            LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.viewholder_activity_item,
                    parent, false)){

        fun onBind(clazz: Class<*>){
            itemView.findViewById<TextView>(R.id.name).apply {
                val str = clazz.name.split('.')
                text = str[str.size - 2]
                setOnClickListener {
                    context.startActivity(Intent(context, clazz))
                }
            }
        }
    }
}
