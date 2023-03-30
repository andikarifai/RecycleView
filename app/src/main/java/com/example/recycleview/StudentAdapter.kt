package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navcomp.R

class StudentAdapter(var listStudent: ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    class  ViewHolder( view : View) : RecyclerView.ViewHolder(view) {
        val nama = view.findViewById<TextView>(R.id.tvNama)
        val umur = view.findViewById<TextView>(R.id.tvUmur)
        val img = view.findViewById<ImageView>(R.id.imgStudent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_student_adapter,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.nama.text = listStudent[position].nama
        holder.umur.text = listStudent[position].umur.toString()
        holder.img.setImageResource(listStudent[position].img)


    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}


