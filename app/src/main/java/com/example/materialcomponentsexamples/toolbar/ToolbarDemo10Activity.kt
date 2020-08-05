package com.example.materialcomponentsexamples.toolbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.*

/**
 *
 *
 * @author wangzhichao
 * @date 8/5/20
 */
class ToolbarDemo10Activity : AppCompatActivity() {
    val function: (MenuItem) -> Boolean = {
        when (it.itemId) {
            R.id.menu_toolbar_edit -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_edit, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            R.id.menu_toolbar_send -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_send, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            R.id.menu_toolbar_settings -> {
                Toast.makeText(
                    this@ToolbarDemo10Activity,
                    R.string.toolbar_settings,
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
            R.id.menu_toolbar_favorite -> {
                Toast.makeText(
                    this@ToolbarDemo10Activity,
                    R.string.toolbar_favorite,
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
            R.id.menu_toolbar_share -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_share, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> {
                false
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ToolbarDemo10ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarToolbar)
        // 开启默认的向上导航箭头
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // 点击向上导航的监听
        binding.toolbarToolbar.setNavigationOnClickListener {
            finish()
        }
        // 这种方式设置了，比 onOptionsItemSelected 要优先。
//        binding.toolbarToolbar.setOnMenuItemClickListener(function)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_toolbar_edit -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_edit, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            R.id.menu_toolbar_send -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_send, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            R.id.menu_toolbar_settings -> {
                Toast.makeText(
                    this@ToolbarDemo10Activity,
                    R.string.toolbar_settings,
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
            R.id.menu_toolbar_favorite -> {
                Toast.makeText(
                    this@ToolbarDemo10Activity,
                    R.string.toolbar_favorite,
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
            R.id.menu_toolbar_share -> {
                Toast.makeText(this@ToolbarDemo10Activity, R.string.toolbar_share, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}