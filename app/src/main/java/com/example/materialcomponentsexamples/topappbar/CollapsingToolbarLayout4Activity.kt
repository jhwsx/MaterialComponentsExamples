package com.example.materialcomponentsexamples.topappbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.Collapsingtoolbarlayout4ActivityBinding
import com.wzc.coordinatorlayout.examples.ListFragment

/**
 * @author wangzhichao
 * @date 2020/8/9
 */
class CollapsingToolbarLayout4Activity : AppCompatActivity() {
    private lateinit var binding: Collapsingtoolbarlayout4ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Collapsingtoolbarlayout4ActivityBinding.inflate(layoutInflater)
//        window.statusBarColor = Color.TRANSPARENT
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