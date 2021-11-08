package com.github.gouravkhunger.androiddemos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.github.gouravkhunger.androiddemos.databinding.Fragmen1Binding

class Fragment1 : Fragment() {

    // Variable that stores Binding for this fragment
    private var _binding: Fragmen1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = Fragmen1Binding.inflate(inflater, container, false)
        binding.fragmentFAB.setOnClickListener {
            Toast.makeText(it.context, "FAB clicked", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Prevent binding to outlive the fragment and cause memory leaks
        _binding = null
    }
}
