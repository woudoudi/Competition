package com.example.administrator.competition.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.base.scanlistlibrary.base.ScanBaseRecyclerViewAdapter;
import com.base.scanlistlibrary.base.ScanRecyclerViewHolder;
import com.example.administrator.competition.R;

import java.util.List;

/**
 * Created with XIAOYUDEXIEE.
 * Date: 2019/9/5
 */
public class HomeFreeConfrontationAdapter extends ScanBaseRecyclerViewAdapter<Object> {

    public HomeFreeConfrontationAdapter(Context context, List<Object> list) {
        super(context, list, R.layout.item_home_free_confrontation);
        this.mContext = context;
    }

    @Override
    protected void onBindData(ScanRecyclerViewHolder holder, final Object item, final int position) {
        TextView tvName = (TextView) holder.getView(R.id.tv_name);
        TextView tvTime = (TextView) holder.getView(R.id.tv_time);
        TextView tvBetDetail = (TextView) holder.getView(R.id.tv_bet_detail);
        TextView tvAccept = (TextView) holder.getView(R.id.tv_accept);
        View viewGap =  holder.getView(R.id.view_gap);
        TextView tvRefuse = (TextView) holder.getView(R.id.tv_refuce);
        ImageView ivBetState = (ImageView) holder.getView(R.id.iv_bet_state);

        tvName.setText(item.toString());
    }
}
