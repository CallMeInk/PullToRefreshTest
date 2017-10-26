package com.example.yukai.pulltorefreshtest.PullToRefreshRecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.yukai.pulltorefreshtest.R;

import java.util.ArrayList;

/**
 * Created by yukai on 2017/10/26.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private Context mContext;
    private ArrayList<String> mDatas;

    public MyRecyclerViewAdapter(Context context, ArrayList<String> datas){
        mContext = context;
        mDatas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }


}
