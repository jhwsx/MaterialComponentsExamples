package com.example.materialcomponentsexamples.topappbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.Collapsingtoolbarlayout3ActivityBinding
import com.wzc.coordinatorlayout.examples.ListFragment

/**
 * @author wangzhichao
 * @date 2020/8/9
 */
class CollapsingToolbarLayout3Activity : AppCompatActivity() {
    private lateinit var binding: Collapsingtoolbarlayout3ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Collapsingtoolbarlayout3ActivityBinding.inflate(layoutInflater)
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