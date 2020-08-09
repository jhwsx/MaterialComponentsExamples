package com.example.materialcomponentsexamples.topappbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.Collapsingtoolbarlayout2ActivityBinding
import com.wzc.coordinatorlayout.examples.ListFragment

/**
 * @author wangzhichao
 * @date 2020/8/9
 */
class CollapsingToolbarLayout2Activity : AppCompatActivity() {
    private lateinit var binding: Collapsingtoolbarlayout2ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Collapsingtoolbarlayout2ActivityBinding.inflate(layoutInflater)
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
}