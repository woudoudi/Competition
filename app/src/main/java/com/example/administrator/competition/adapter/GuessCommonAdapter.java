package com.example.administrator.competition.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.base.scanlistlibrary.base.ScanBaseRecyclerViewAdapter;
import com.base.scanlistlibrary.base.ScanRecyclerViewHolder;
import com.example.administrator.competition.R;
import com.example.administrator.competition.entity.CommonConfig;

import java.util.List;

import butterknife.BindView;

/**
 * Created with XIAOYUDEXIEE.
 * Date: 2019/9/5
 */
public class GuessCommonAdapter extends ScanBaseRecyclerViewAdapter<Object> {

    private int mType;

    private OnGuessItemClick mOnGuessItemClick;

    public void setOnGuessItemClick(OnGuessItemClick onGuessItemClick) {
        mOnGuessItemClick = onGuessItemClick;
    }

    public GuessCommonAdapter(Context context, List<Object> list, int type) {
        super(context, list, R.layout.item_guess);
        this.mContext = context;
        this.mType = type;
    }

    @Override
    protected void onBindData(ScanRecyclerViewHolder holder, final Object item, final int position) {
        ImageView ivGuessState = (ImageView) holder.getView(R.id.iv_guess_state);
        TextView tvGuessState = (TextView) holder.getView(R.id.tv_guess_state);
        TextView tvPersonNumber = (TextView) holder.getView(R.id.tv_person_number);
        RelativeLayout rlGuessContainer = (RelativeLayout) holder.getView(R.id.rl_guess_container);

        rlGuessContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnGuessItemClick!=null){
                    mOnGuessItemClick.onItemClick();
                }
            }
        });
    }

    public interface OnGuessItemClick{
        void onItemClick();
    }
}
