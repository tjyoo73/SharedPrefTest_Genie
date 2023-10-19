package com.tjlab.sharedpreftest_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.sharedpreftest_genie.databinding.ActivityMainBinding
import com.tjlab.sharedpreftest_genie.utils.ContextUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.autoLoginCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            ContextUtil.setAutoLogin(this, isChecked)
        }

        binding.autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)

    }
}