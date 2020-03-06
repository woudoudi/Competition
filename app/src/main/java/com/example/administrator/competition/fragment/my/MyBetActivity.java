package com.example.administrator.competition.fragment.my;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class MyBetActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_king)
    TextView tvKing;
    @BindView(R.id.tv_all_guess)
    TextView tvAllGuess;
    @BindView(R.id.frameLayout_my)
    FrameLayout frameLayoutMy;

    @Override
    protected int getView() {
        return R.layout.activity_my_bet;
    }


    @Override
    public void init() {
        tvTitle.setText("押注记录");
    }

    @OnClick({R.id.iv_back,R.id.tv_king,R.id.tv_all_guess})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_king:
                break;
            case R.id.tv_all_guess:
                break;
        }
    }
}
