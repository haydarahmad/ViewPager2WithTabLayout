package com.haydar.viewpager2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haydar.viewpager2practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            val fragment = TestFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragment, TestFragment::class.simpleName)
                .commit()
        }

    }
}

