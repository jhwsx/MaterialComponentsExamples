package com.example.materialcomponentsexamples.toolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.databinding.ToolbarDemo5ActivityBinding

/**
 *
 *
 * @author wangzhichao
 * @date 8/5/20
 */
class ToolbarDemo5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ToolbarDemo5ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarToolbar)
        // 开启默认的向上导航箭头
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // 点击向上导航的监听
        binding.toolbarToolbar.setNavigationOnClickListener {
            finish()
        }
    }
}