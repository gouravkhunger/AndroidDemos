package com.github.gouravkhunger.androiddemos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.gouravkhunger.androiddemos.databinding.ExampleFragmentBinding

class ExampleFragment : AppCompatActivity() {

    // Variable that stores Binding for this activity
    private lateinit var binding: ExampleFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the xml file by calling inflate() and passing in
        // the layout inflater from the Activity class
        binding = ExampleFragmentBinding.inflate(layoutInflater)

        // Get the root view and set it as the content to be displayed
        val rootView = binding.root
        setContentView(rootView)
    }
}
