package com.example.androidtestingfinal.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.androidtestingfinal.fragment.Fragment1
import com.example.androidtestingfinal.fragment.Fragment2
import com.example.androidtestingfinal.fragment.Fragment3

class TabLayoutAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            else -> Fragment3()
        }
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            else -> "Tab 3"
        }
    }
}