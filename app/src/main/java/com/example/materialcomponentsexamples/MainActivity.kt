package com.example.materialcomponentsexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponentsexamples.databinding.MainActivityBinding
import com.example.materialcomponentsexamples.toolbar.ToolbarActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private val list: List<Data> = listOf(
        Data(R.string.toolbar, ToolbarActivity::class.java)
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