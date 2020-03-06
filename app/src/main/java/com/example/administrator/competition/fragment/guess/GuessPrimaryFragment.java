package com.example.administrator.competition.fragment.guess;

import android.os.Bundle;

import com.base.scanlistlibrary.scanlist.ScanVideoPlayView;
import com.example.administrator.competition.R;
import com.example.administrator.competition.adapter.GuessAdapter;
import com.example.administrator.competition.adapter.GuessCommonAdapter;
import com.example.administrator.competition.entity.CommonConfig;
import com.yidao.module_lib.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class GuessPrimaryFragment extends BaseFragment {

    @BindView(R.id.scan_guess)
    ScanVideoPlayView scanGuess;

    GuessCommonAdapter mGuessCommonAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.framelayout_guess_primary;
    }

    @Override
    protected void initPress() {
    }

    @Override
    protected void init() {

        List<Object> list = new ArrayList<>();
        for (int i=0;i<3;i++){
            list.add(i+"");
        }

        mGuessCommonAdapter = new GuessCommonAdapter(getCtx(),list,0);
        scanGuess.initPlayListView(mGuessCommonAdapter,3,0,false);
        mGuessCommonAdapter.setOnGuessItemClick(mOnGuessItemClick);
    }

    GuessCommonAdapter.OnGuessItemClick mOnGuessItemClick = new GuessCommonAdapter.OnGuessItemClick() {
        @Override
        public void onItemClick() {
            Bundle bundle = new Bundle();
            bundle.putInt(CommonConfig.guessGradeKey,CommonConfig.primaryValue);
            skipActivity(GuessCompetitionActivity.class,bundle);
        }
    };
}
