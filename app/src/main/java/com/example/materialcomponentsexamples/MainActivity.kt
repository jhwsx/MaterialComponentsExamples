package com.example.materialcomponentsexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponentsexamples.databinding.MainActivityBinding
import com.example.materialcomponentsexamples.toolbar.ToolbarActivity
import com.example.materialcomponentsexamples.topappbar.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private val list: List<Data> = listOf(
        Data("Toolbar", ToolbarActivity::class.java, "Toolbar 的使用"),
        Data("AppbarLayout+Toolbar", AppBarLayoutToolbar1Activity::class.java, "AppBarLayout包裹 Toolbar，实现 Toolbar 的滚动效果。"),
        Data("AppbarLayout+Toolbar", AppBarLayoutToolbar2Activity::class.java, "AppBarLayout包裹 Toolbar，实现 Toolbar 的滚动效果（透明状态栏）。"),
        Data("AppbarLayout+Toolbar", AppBarLayoutToolbar3Activity::class.java, "AppBarLayout包裹 Toolbar，实现 Toolbar 的滚动效果（悬停 TabLayout）。"),
        Data("CollapsingToolbarLayout", CollapsingToolbarLayout1Activity::class.java, "突出的顶部应用栏效果，单行标题"),
        Data("CollapsingToolbarLayout", CollapsingToolbarLayout2Activity::class.java, "突出的顶部应用栏效果，多行标题"),
        Data("CollapsingToolbarLayout", CollapsingToolbarLayout3Activity::class.java, "突出的顶部应用栏效果，带有图片"),
        Data("CollapsingToolbarLayout", CollapsingToolbarLayout4Activity::class.java, "突出的顶部应用栏效果，带有图片,折叠后变为正常的应用栏")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)
        binding.recyclerviewMain.layoutManager = LinearLayoutManager(this)
        binding.recyclerviewMain.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        binding.recyclerviewMain.adapter = RecyclerViewAdapter(list) {
            val intent = Intent(this@MainActivity, it.clazz)
            startActivity(intent)
        }
    }
}