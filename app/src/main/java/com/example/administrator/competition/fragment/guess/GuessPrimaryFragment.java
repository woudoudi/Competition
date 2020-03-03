package com.example.administrator.competition.fragment.guess;

import com.base.scanlistlibrary.scanlist.ScanVideoPlayView;
import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseFragment;

import butterknife.BindView;

public class GuessPrimaryFragment extends BaseFragment {

    @BindView(R.id.scan_guess)
    ScanVideoPlayView scanGuess;

    @Override
    protected int getLayoutId() {
        return R.layout.framelayout_guess_primary;
    }

    @Override
    protected void initPress() {
    }

    @Override
    protected void init() {
    }
}
