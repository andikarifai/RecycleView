package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navcomp.R
import com.example.navcomp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudentData = arrayListOf(
            ListStudent("Andika",23, R.drawable.ic_launcher_foreground),
            ListStudent("Nur", 19, R.drawable.ic_launcher_background),
            ListStudent("Rifai",23, R.drawable.ic_launcher_foreground),
            ListStudent("Ayu", 19, R.drawable.ic_launcher_background),
            ListStudent("Rara",23, R.drawable.ic_launcher_foreground),
            ListStudent("Bagus", 19, R.drawable.ic_launcher_background),
            ListStudent("Pangeran",23, R.drawable.ic_launcher_foreground),
            ListStudent("Dipo", 19, R.drawable.ic_launcher_background),
            ListStudent("Way",23, R.drawable.ic_launcher_foreground),
            ListStudent("Cau", 19, R.drawable.ic_launcher_background)
        )
//        panggil class adapter lalu isi data arraylist
        val adapterStudent = StudentAdapter(listStudentData)

//        mengatur tata letak recycleview
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
//        val gl = GridLayout(this)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
    }
}