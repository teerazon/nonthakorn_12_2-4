package com.nonthakorn.sheetwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nonthakorn.sheetwork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // โค้ดจัดการเหตุการณ์เมื่อคลิกปุ่ม
        binding.myButton.setOnClickListener {
            binding.myTextView.text = "ยินดีด้วย! คุณกดปุ่มแล้ว"
        }
    }
}