package com.example.materialcomponentsexamples.topappbar

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.AppbarlayoutToolbar1ActivityBinding
import com.google.android.material.appbar.AppBarLayout
import com.wzc.coordinatorlayout.examples.ListFragment
import kotlinx.android.synthetic.main.activity_app_bar_layout.*

class AppBarLayoutToolbar1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AppbarlayoutToolbar1ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener { finish() }
        setupFragment()
    }

    private fun setupFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, ListFragment.newInstance("Android"))
            .commit()
    }

    companion object {
        private const val TAG = "AppBarLayoutActivity"
    }
}
