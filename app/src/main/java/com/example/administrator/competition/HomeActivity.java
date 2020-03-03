package com.example.administrator.competition;

import android.widget.CompoundButton;

import com.example.administrator.competition.fragment.CustomFragment;
import com.example.administrator.competition.fragment.GuessFragment;
import com.example.administrator.competition.fragment.HomeFragment;
import com.example.administrator.competition.fragment.MyFragment;
import com.yidao.module_lib.anotation.FragmentId;
import com.yidao.module_lib.base.BaseFragment;
import com.yidao.module_lib.base.BaseView;

import androidx.fragment.app.FragmentTransaction;
import butterknife.OnCheckedChanged;

public class HomeActivity extends BaseView {

    HomeFragment mHomeFragment = new HomeFragment();
    GuessFragment mGuessFragment = new GuessFragment();
    CustomFragment mCustomFragment = new CustomFragment();
    MyFragment mMyFragment = new MyFragment();

    BaseFragment[] mBaseFragments = new BaseFragment[]{mHomeFragment, mGuessFragment, mCustomFragment, mMyFragment};

    @Override
    protected int getView() {
        return R.layout.activity_home;
    }

    @Override
    public void init() {
        showFragment(FragmentId.VideoPlay_Fragment);
    }


    @OnCheckedChanged({R.id.radio_home, R.id.radio_guess, R.id.radio_custom, R.id.radio_my})
    public void onCheckedChanged(CompoundButton view, boolean isCheck) {
        setCompentButton(view);
        switch (view.getId()) {
            case R.id.radio_home:
                if (isCheck) {
                    showFragment(FragmentId.VideoPlay_Fragment);
                }
                break;
            case R.id.radio_guess:
                if (isCheck) {
                    showFragment(FragmentId.GrassStar_Fragment);
                }
                break;
            case R.id.radio_custom:
                if (isCheck) {
                    showFragment(FragmentId.Message_Fragment);
                }
                break;
            case R.id.radio_my:
                if (isCheck) {
                    showFragment(FragmentId.My_Fragment);
                }
                break;
        }
    }

    private void setCompentButton(CompoundButton view){
        view.setTextColor(getResources().getColor(view.isChecked() ? R.color.color_BCA081 : R.color.color_999999));
    }


    public void showFragment(@FragmentId int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!mBaseFragments[position].isAdded()) {
            transaction.add(R.id.frameLayout_home, mBaseFragments[position], position + "");
        }
        for (int i = 0; i < mBaseFragments.length; i++) {
            if (position == i) {
//                mHomeFragment.backToHome();
                transaction.show(mBaseFragments[i]);
            } else {
                transaction.hide(mBaseFragments[i]);
            }
        }
        transaction.commit();
    }
}
