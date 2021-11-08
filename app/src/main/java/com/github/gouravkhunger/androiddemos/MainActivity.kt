package com.github.gouravkhunger.androiddemos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.gouravkhunger.androiddemos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Variable that stores Binding for this activity
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            viewBindignInActivity.setOnClickListener {
                startActivity(Intent(this@MainActivity, ExampleActivity::class.java))
            }
            viewBindingInFragment.setOnClickListener {
                startActivity(Intent(this@MainActivity, ExampleFragment::class.java))
            }
        }
    }
}