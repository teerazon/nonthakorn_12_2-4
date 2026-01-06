package com.nonthakorn.sheetwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
// ตรวจสอบให้แน่ใจว่า import ชื่อแพ็กเกจถูกต้องตามโปรเจกต์ของคุณ
import com.nonthakorn.sheetwork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ประกาศตัวแปรสำหรับ View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // เริ่มต้นใช้งาน Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // การจัดการ Event เมื่อกดปุ่ม
        binding.myButton.setOnClickListener {
            // เมื่อกดปุ่ม ให้เปลี่ยนข้อความใน TextView
            binding.myTextView.text = "ยินดีด้วย! คุณกดปุ่มแล้ว"
        }
    }
}