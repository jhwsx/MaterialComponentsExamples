package com.example.materialcomponentsexamples.topappbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialcomponentsexamples.R
import com.example.materialcomponentsexamples.databinding.Collapsingtoolbarlayout1ActivityBinding
import com.wzc.coordinatorlayout.examples.ListFragment

/**
 * CollapsingToolbarLayout 是 Toolbar 的包装类，它继承于 FrameLayout，实现了可折叠的应用栏。
 * 它被设计要用作 AppBarLayout 的直接子 View。CollapsingToolbarLayout 包含如下特性：
 * - 折叠的标题
 * 当布局完全可见时标题会大些，当布局滚出屏幕时标题会折叠变得更小些。通过 setTitle(CharSequence)
 * 方法可以设置展示的标题。通过 collapsedTextAppearance 和 expandedTextAppearance 属性可以调整
 * 标题的外观。
 * - 内容遮罩
 * 当滚动位置达到一个确定的阈值时会显示或隐藏的全出血遮罩。通过 setContentScrim(Drawable) 来改变它。
 * - 状态栏遮罩
 * 当滚动位置达到一个确定的阈值时会在状态栏后面显示或隐藏的遮罩。通过 setStatusBarScrim(Drawable) 来改变它。
 * 这个属性仅仅在设置 fitSystemWindow 的 LOLLIPOP 以上的设备。
 * - 视差滚动子 View
 * 子 View 可以选择在布局内以视差样式滚动。查看 LayoutParams#COLLAPSE_MODE_PARALLAX 和
 * LayoutParams#setParallaxMultiplier(float)
 * - 固定位置的子 View
 * 子 View 可以选择在全局空间被固定。查看 LayoutParams#COLLAPSE_MODE_PIN
 *
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_collapsedTitleTextAppearance 折叠标题的文字样式
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleTextAppearance 展开标题的文字样式
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_contentScrim 内容遮罩
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleMargin 展开标题的外边距
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleMarginStart 展开标题的左边外边距
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleMarginEnd 展开标题的右边外边距
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleMarginBottom 展开标题的底部外边距
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleMarginTop 展开标题的顶部外边距
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_expandedTitleGravity 展开标题在布局中的位置（居中，上下居中，左右居中，靠左，靠上，靠右，考下）
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_statusBarScrim
 * @attr ref com.google.android.material.R.styleable#CollapsingToolbarLayout_toolbarId
 * CollapsingToolbarLayout_Layout_layout_collapseMode 有三种：
 * off COLLAPSE_MODE_OFF 子 View 没有折叠行为
 * pin COLLAPSE_MODE_PIN The view will pin in place until it reaches the bottom of the {@link CollapsingToolbarLayout}.
 * parallax COLLAPSE_MODE_PARALLAX The view will scroll in a parallax fashion. See {@link #setParallaxMultiplier(float)} to change the multiplier used.
 * @author wangzhichao
 * @date 2020/8/8
 */
class CollapsingToolbarLayout1Activity : AppCompatActivity() {
    private lateinit var binding: Collapsingtoolbarlayout1ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Collapsingtoolbarlayout1ActivityBinding.inflate(layoutInflater)
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