package com.feicui.edu.gitdriod.github;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 作者：yuanchao on 2016/8/24 0024 11:36
 * 邮箱：yuanchao@feicuiedu.com
 */
public class HotRepoAdapter extends FragmentPagerAdapter {

    public HotRepoAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        return new HotRepoListFragment();
    }

    @Override public int getCount() {
        return 10;
    }

    @Override public CharSequence getPageTitle(int position) {
        return "Java"+position;
    }
}
