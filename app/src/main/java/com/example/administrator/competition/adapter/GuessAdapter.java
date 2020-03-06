package com.example.administrator.competition.adapter;

import com.example.administrator.competition.fragment.guess.GuessHighFragment;
import com.example.administrator.competition.fragment.guess.GuessKingFragment;
import com.example.administrator.competition.fragment.guess.GuessMiddleFragment;
import com.example.administrator.competition.fragment.guess.GuessOneToOneFragment;
import com.example.administrator.competition.fragment.guess.GuessPrimaryFragment;
import com.yidao.module_lib.base.BaseFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class GuessAdapter extends FragmentPagerAdapter {

    private GuessPrimaryFragment mGuessPrimaryFragment = new GuessPrimaryFragment();
    private GuessPrimaryFragment mGuessMiddleFragment = new GuessPrimaryFragment();
    private GuessPrimaryFragment mGuessHighFragment = new GuessPrimaryFragment();
    private GuessPrimaryFragment mGuessOneToOneFragment = new GuessPrimaryFragment();
    private GuessKingFragment mGuessKingFragment = new GuessKingFragment();

    private String[] mTitles = {"初级场", "中级场","高级场","一对一","王者专题"};
    private BaseFragment[] mBaseFragments = new BaseFragment[]{mGuessPrimaryFragment, mGuessMiddleFragment,mGuessHighFragment,mGuessOneToOneFragment,mGuessKingFragment};

    public GuessAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public BaseFragment getItem(int position) {
        return mBaseFragments[position];
    }

    @Override
    public int getCount() {
        return mBaseFragments.length;
    }

    //重写这个方法，将设置每个Tab的标题
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
