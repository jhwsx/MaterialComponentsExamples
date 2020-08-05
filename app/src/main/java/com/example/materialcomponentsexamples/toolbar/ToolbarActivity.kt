package com.example.materialcomponentsexamples.toolbar

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponentsexamples.Data
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.RecyclerViewAdapter
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
    private val list: List<Data> = listOf(
        Data("1, 演示：开启默认的返回箭头；显示默认的标题，副标题。", ToolbarDemo1Activity::class.java),
        Data("2, 演示：修改 1 中箭头，标题颜色为白色。", ToolbarDemo2Activity::class.java),
        Data("3, 演示：修改默认返回箭头的颜色。", ToolbarDemo3Activity::class.java),
        Data("4, 演示：使用自定义的返回箭头。", ToolbarDemo4Activity::class.java),
        Data("5, 演示：修改标题，副标题文本的颜色，样式。", ToolbarDemo5Activity::class.java),
        Data("6, 演示：给 Toolbar 添加一个 TextView，实现标题居中。", ToolbarDemo6Activity::class.java),
        Data("7, 演示：添加菜单。", ToolbarDemo7Activity::class.java),
        Data("8, 演示：修改溢出图标的颜色。", ToolbarDemo8Activity::class.java),
        Data("9, 演示：使用自定义的溢出图标。", ToolbarDemo9Activity::class.java),
        Data("10, 演示：调整弹出菜单的背景，水平位置偏移量，以及不遮挡 Toolbar。", ToolbarDemo10Activity::class.java),
        Data("11, 演示：调整标题和导航图标的距离。", ToolbarDemo11Activity::class.java)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ToolbarActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarToolbar)
        binding.recyclerviewToolbar.layoutManager = LinearLayoutManager(this)
        binding.recyclerviewToolbar.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        binding.recyclerviewToolbar.adapter = RecyclerViewAdapter(list) {
            val intent = Intent(this@ToolbarActivity, it.clazz)
            startActivity(intent)
        }
//        // 开启默认的 navigationIcon, 如果属性 app:navigationIcon="@drawable/ic_back_circle" 设置了，无需写下面这行。
//         supportActionBar?.setDisplayHomeAsUpEnabled(true)
////        supportActionBar?.setDisplayShowHomeEnabled(true)
//        binding.toolbarToolbar.setNavigationOnClickListener { finish() }
//
//        setSupportActionBar(binding.toolbarToolbar1)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        binding.toolbarToolbar2.setNavigationOnClickListener { finish() }
//
//        val function: (MenuItem) -> Boolean = {
//            when (it.itemId) {
//                R.id.menu_toolbar_edit -> {
//                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_edit, Toast.LENGTH_SHORT)
//                        .show()
//                    true
//                }
//                R.id.menu_toolbar_send -> {
//                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_send, Toast.LENGTH_SHORT)
//                        .show()
//                    true
//                }
//                R.id.menu_toolbar_settings -> {
//                    Toast.makeText(
//                        this@ToolbarActivity,
//                        R.string.toolbar_settings,
//                        Toast.LENGTH_SHORT
//                    ).show()
//                    true
//                }
//                R.id.menu_toolbar_favorite -> {
//                    Toast.makeText(
//                        this@ToolbarActivity,
//                        R.string.toolbar_favorite,
//                        Toast.LENGTH_SHORT
//                    ).show()
//                    true
//                }
//                R.id.menu_toolbar_share -> {
//                    Toast.makeText(this@ToolbarActivity, R.string.toolbar_share, Toast.LENGTH_SHORT)
//                        .show()
//                    true
//                }
//                else -> {
//                    false
//                }
//            }
//        }
//        binding.toolbarToolbar3.setOnMenuItemClickListener(function)
//        binding.toolbarToolbar4.setOnMenuItemClickListener(function)

    }

}