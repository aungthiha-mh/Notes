package com.flexath.notes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.flexath.notes.R
import com.flexath.notes.data.room.NoteEntity
import com.flexath.notes.databinding.FragmentHomeBinding
import com.flexath.notes.ui.fragment.HomeFragmentDirections
import kotlinx.android.synthetic.main.list_item.view.*

class NoteHomeAdapter(private val noteList: List<NoteEntity>)
    : RecyclerView.Adapter<NoteHomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = noteList[position]
        holder.itemView.recyclerTitle.text = note.title
        holder.itemView.setOnClickListener { view ->
            val action = HomeFragmentDirections.actionHomeToUpdate()
            action.note = noteList[position]
            view.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}