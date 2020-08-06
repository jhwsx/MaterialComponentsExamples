package com.example.materialcomponentsexamples.topappbar

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.materialcomponentsexamples.R
import com.google.android.material.appbar.AppBarLayout
import com.wzc.coordinatorlayout.examples.ListFragment
import kotlinx.android.synthetic.main.activity_app_bar_layout.*

/**
 * https://blog.csdn.net/willway_wang/article/details/96720903
 */
class AppBarLayoutActivity : AppCompatActivity() {

    private val list = listOf(
        PageData("Android", ListFragment.newInstance("Android")),
        PageData("Kotlin", ListFragment.newInstance("Kotlin")),
        PageData("Flutter", ListFragment.newInstance("Flutter"))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar_layout)
        viewpager.adapter = object : FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment = list[position].fragment

            override fun getCount(): Int = list.size

            override fun getPageTitle(position: Int): CharSequence? = list[position].title

        }
        tablayout.setupWithViewPager(viewpager)

        appbar.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            override fun onOffsetChanged(appbarLayout: AppBarLayout, verticalOffset: Int) {
                val totalScrollRange = appbarLayout.totalScrollRange
                Log.d(TAG, "verticalOffset = $verticalOffset, totalScrollRange = $totalScrollRange")
            }
        })
    }

    companion object {
        private const val TAG = "AppBarLayoutActivity"
    }

    data class PageData(val title: String, val fragment: ListFragment)

}
