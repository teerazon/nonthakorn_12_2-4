package com.nonthakorn.sheetwork

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // ประกาศตัวแปรสำหรับ View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // เริ่มต้นใช้งาน Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // --- การจัดการ Event เมื่อกดปุ่ม ---
        binding.myButton.setOnClickListener {
            // เมื่อกดปุ่ม ให้เปลี่ยนข้อความใน TextView
            binding.myTextView.text = "ยินดีด้วย! คุณกดปุ่มแล้ว"
        }
    }
}