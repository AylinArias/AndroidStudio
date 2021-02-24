package com.example.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskListAdapter(var list: TaskList) : RecyclerView.Adapter<TaksListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaksListViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_view_holder, parent, false)
        return TaksListViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }

    override fun onBindViewHolder(holder: TaksListViewHolder, position: Int) {
        holder.taskTextView?.text = list.tasks[position]
    }
}