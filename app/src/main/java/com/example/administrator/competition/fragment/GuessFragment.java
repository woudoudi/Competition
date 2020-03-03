package com.example.administrator.competition.fragment;

import com.example.administrator.competition.R;
import com.example.administrator.competition.adapter.GuessAdapter;
import com.google.android.material.tabs.TabLayout;
import com.yidao.module_lib.base.BaseFragment;

import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class GuessFragment extends BaseFragment {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @BindView(R.id.viewPage_guess)
    ViewPager viewPageGuess;

    @Override
    protected int getLayoutId() {
        return R.layout.framelayout_guess;
    }

    @Override
    protected void initPress() {

    }

    @Override
    protected void init() {
        GuessAdapter adapter = new GuessAdapter(getFragmentManager());
        viewPageGuess.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPageGuess);
    }
}
