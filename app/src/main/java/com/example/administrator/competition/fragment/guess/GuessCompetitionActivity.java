package com.example.administrator.competition.fragment.guess;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.example.administrator.competition.entity.CommonConfig;
import com.example.administrator.competition.view.RunTextView;
import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class GuessCompetitionActivity extends BaseView {
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

    @BindView(R.id.tickerView1)
    TickerView tickerView1;
    @BindView(R.id.tickerView2)
    TickerView tickerView2;
    @BindView(R.id.tickerView3)
    TickerView tickerView3;
    @BindView(R.id.tickerView4)
    TickerView tickerView4;
    @BindView(R.id.tickerView5)
    TickerView tickerView5;

    private RunTextView mRunTextView = new RunTextView();

    private int mGuessGradeValue;

    @Override
    protected int getView() {
        return R.layout.activity_guess_competition;
    }

    @Override
    public void init() {
        mGuessGradeValue = getIntent().getIntExtra(CommonConfig.guessGradeKey,0);
        if(mGuessGradeValue == CommonConfig.primaryValue){
            tvTitle.setText("初级场");
        } else if(mGuessGradeValue == CommonConfig.middleValue){
            tvTitle.setText("中级场");
        } else if(mGuessGradeValue == CommonConfig.highValue){
            tvTitle.setText("高级场");
        }

        ivRight.setImageResource(R.mipmap.detail);

        tickerView1.setCharacterLists(TickerUtils.provideNumberList());
        tickerView1.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        tickerView2.setCharacterLists("+-");
        tickerView2.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        tickerView3.setCharacterLists(TickerUtils.provideNumberList());
        tickerView3.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        tickerView4.setCharacterLists("+-");
        tickerView4.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        tickerView5.setCharacterLists(TickerUtils.provideNumberList());
        tickerView5.setPreferredScrollingDirection(TickerView.ScrollingDirection.ANY);

        tickerView2.setText("+");
        tickerView4.setText("-");
    }

    @OnClick({R.id.iv_back, R.id.iv_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.iv_right:

                mRunTextView.runWithAnimation(9, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (int) animation.getAnimatedValue();
                        tickerView1.setText(value+"");
                        tickerView3.setText(value+"");
                        tickerView5.setText(value+"");
                    }
                });
                break;
        }
    }

}
