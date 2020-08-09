package com.example.materialcomponentsexamples.topappbar

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.AppbarlayoutToolbar3ActivityBinding
import com.google.android.material.appbar.AppBarLayout
import com.wzc.coordinatorlayout.examples.ListFragment
import kotlinx.android.synthetic.main.appbarlayout_toolbar3_activity.*

/**
 * https://blog.csdn.net/willway_wang/article/details/96720903
 */
class AppBarLayoutToolbar3Activity : AppCompatActivity() {

    private val list = listOf(
        PageData("Android", ListFragment.newInstance("Android")),
        PageData("Kotlin", ListFragment.newInstance("Kotlin")),
        PageData("Flutter", ListFragment.newInstance("Flutter"))
    )
    private lateinit var binding: AppbarlayoutToolbar3ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppbarlayoutToolbar3ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
        setupViewPager()

        binding.appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appbarLayout, verticalOffset ->
            val totalScrollRange = appbarLayout.totalScrollRange
            Log.d(TAG, "verticalOffset = $verticalOffset, totalScrollRange = $totalScrollRange")
        })
    }

    private fun setupViewPager() {
        binding.viewpager.adapter = object : FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment = list[position].fragment

            override fun getCount(): Int = list.size

            override fun getPageTitle(position: Int): CharSequence? = list[position].title

        }
        binding.tablayout.setupWithViewPager(viewpager)
    }

    companion object {
        private const val TAG = "AppBarLayoutActivity"
    }

    data class PageData(val title: String, val fragment: ListFragment)

}
