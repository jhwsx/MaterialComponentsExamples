package com.example.materialcomponentsexamples.toolbar

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.ToolbarActivityBinding

/**
 * {@link androidx.appcompat.R.attr#buttonGravity}
 * {@link androidx.appcompat.R.attr#collapseContentDescription}
 * {@link androidx.appcompat.R.attr#collapseIcon}
 * {@link androidx.appcompat.R.attr#contentInsetEnd}
 * {@link androidx.appcompat.R.attr#contentInsetLeft}
 * {@link androidx.appcompat.R.attr#contentInsetRight}
 * {@link androidx.appcompat.R.attr#contentInsetStart}
 * {@link androidx.appcompat.R.attr#contentInsetStartWithNavigation}
 * {@link androidx.appcompat.R.attr#contentInsetEndWithActions}
 * {@link android.R.attr#gravity}
 * {@link androidx.appcompat.R.attr#logo} // 设置图标
 * {@link androidx.appcompat.R.attr#logoDescription} // 给 accessibility 使用的
 * {@link androidx.appcompat.R.attr#maxButtonHeight}
 * {@link androidx.appcompat.R.attr#navigationContentDescription}
 * {@link androidx.appcompat.R.attr#navigationIcon} // 设置导航图标
 * {@link androidx.appcompat.R.attr#popupTheme} // 设置弹出菜单的主题
 * {@link androidx.appcompat.R.attr#subtitle} // 副标题文本
 * {@link androidx.appcompat.R.attr#subtitleTextAppearance} // 副标题文本样式
 * {@link androidx.appcompat.R.attr#subtitleTextColor} // 副标题文字颜色
 * {@link androidx.appcompat.R.attr#title} // 标题
 * {@link androidx.appcompat.R.attr#titleMargin}
 * {@link androidx.appcompat.R.attr#titleMarginBottom}
 * {@link androidx.appcompat.R.attr#titleMarginEnd}
 * {@link androidx.appcompat.R.attr#titleMarginStart}
 * {@link androidx.appcompat.R.attr#titleMarginTop}
 * {@link androidx.appcompat.R.attr#titleTextAppearance} // 设置标题文字样式（大小，大小写，风格）
 * {@link androidx.appcompat.R.attr#titleTextColor} // 设置标题文字颜色
 * {@link androidx.appcompat.R.attr#menu} // 设置菜单
 *
 * @author wangzhichao
 * @date 8/4/20
 */
class ToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ToolbarActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarToolbar)
        // 开启默认的 navigationIcon, 如果属性 app:navigationIcon="@drawable/ic_back_circle" 设置了，无需写下面这行。
         supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setDisplayShowHomeEnabled(true)
        binding.toolbarToolbar.setNavigationOnClickListener { finish() }

        setSupportActionBar(binding.toolbarToolbar1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbarToolbar2.setNavigationOnClickListener { finish() }

        val function: (MenuItem) -> Boolean = {
            when (it.itemId) {
                R.id.menu_toolbar_edit -> {
                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_edit, Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                R.id.menu_toolbar_send -> {
                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_send, Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                R.id.menu_toolbar_settings -> {
                    Toast.makeText(
                        this@ToolbarActivity,
                        R.string.toolbar_settings,
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }
                R.id.menu_toolbar_favorite -> {
                    Toast.makeText(
                        this@ToolbarActivity,
                        R.string.toolbar_favorite,
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }
                R.id.menu_toolbar_share -> {
                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_share, Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                else -> {
                    false
                }
            }
        }
        binding.toolbarToolbar3.setOnMenuItemClickListener(function)
        binding.toolbarToolbar4.setOnMenuItemClickListener(function)

    }

}