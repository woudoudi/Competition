package com.example.administrator.competition.fragment.guess;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class GuessRankingActivity extends BaseView {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.tv_trumpet)
    TextView tvTrumpet;
    @BindView(R.id.tv_home_game)
    TextView tvHomeGame;
    @BindView(R.id.tv_look_on)
    TextView tvLookOn;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.tv_question_number)
    TextView tvQuestionNumber;
    @BindView(R.id.tv_score)
    TextView tvScore;

    @Override
    protected int getView() {
        return R.layout.activity_guess_ranking;
    }

    @Override
    public void init() {
        tvTitle.setText("初级场");
        ivRight.setImageResource(R.mipmap.detail);
    }

    @OnClick({R.id.iv_back, R.id.iv_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.iv_right:
                break;
        }
    }
}
