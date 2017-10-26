package com.example.yukai.pulltorefreshtest.PullToRefreshRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.yukai.pulltorefreshtest.R;

/**
 * Created by yukai on 2017/10/26.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView mTextView;

    public MyViewHolder(View view){
        super(view);
        mTextView = (TextView) view.findViewById(R.id.tv);
    }
}
