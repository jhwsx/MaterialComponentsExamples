# MaterialComponentsExamples

[https://www.material.io/develop/android](https://www.material.io/develop/android)

## 1. Toolbar

与 `Actionbar` 相比，`Toolbar` 不像 `Actionbar` 一样，一定要固定在 `Activity` 的头部，而是可以放到界面的任何位置。

`Toolbar` 继承于 `ViewGroup`，从左到右，包括 5 个可选的元素：

导航按钮

logo 图标

标题和副标题

一个或多个自定义的控件

菜单



# 2. AppBarLayout

`AppBarLayout` 是一个竖直向的 `LinearLayout`，主要实现了滚动手势。

`AppBarLayout` 的子 View 通过给布局参数设置 `setScrollFlags(@ScrollFlags int flags)`或者在 xml 中设置 `app:layout_scrollFlags`属性表明子 View 需要的滚动行为。

`AppBarLayout`必须作为 `CoordinatorLayout`的直接子 View，否则大多数的功能将不能起作用。

`AppBarLayout`需要一个单独的兄弟控件，来知道什么时候进行滚动。这个兄弟控件需要设置滚动行为：`app:layout_behavior="@string/appbar_scrolling_view_behavior"`。

`AppBarLayout` 可以有多个子 View，并不一定要包含 `Toolbar`。