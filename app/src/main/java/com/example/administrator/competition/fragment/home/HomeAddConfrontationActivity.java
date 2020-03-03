package com.example.administrator.competition.fragment.home;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeAddConfrontationActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_first_nick)
    EditText etFirstNick;
    @BindView(R.id.et_first_phone)
    EditText etFirstPhone;
    @BindView(R.id.et_first_number)
    EditText etFirstNumber;
    @BindView(R.id.et_second_nick)
    EditText etSecondNick;
    @BindView(R.id.et_second_phone)
    EditText etSecondPhone;
    @BindView(R.id.et_second_number)
    EditText etSecondNumber;
    @BindView(R.id.tv_send_confrontation)
    TextView tvSendConfrontation;

    @Override
    protected int getView() {
        return R.layout.activity_home_add_confrontation;
    }

    @Override
    public void init() {
        tvTitle.setText("添加邀请");
    }


    @OnClick({R.id.iv_back, R.id.tv_send_confrontation})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_send_confrontation:
                skipActivity(HomeConfrontationSureActivity.class);
                break;
        }
    }
}
