package com.github.gouravkhunger.androiddemos

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.gouravkhunger.androiddemos.databinding.ExampleActivityBinding

class ExampleActivity : AppCompatActivity() {

    // Variable that stores Binding for this activity
    private lateinit var binding: ExampleActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the xml file by calling inflate() and passing in
        // the layout inflater from the Activity class
        binding = ExampleActivityBinding.inflate(layoutInflater)

        // Get the root view and set it as the content to be displayed
        val rootView = binding.root
        setContentView(rootView)

        // Access an element from the binding
        binding.clickMeButton.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        // Access multiple elements without excessively typing binding.<view>
        binding.apply {
            helloWorld.text = helloWorld.text.toString()
            clickMeButton.setOnLongClickListener {
                Toast.makeText(this@ExampleActivity, "Long click!", Toast.LENGTH_SHORT).show()
                true
            }
        }
    }
}
