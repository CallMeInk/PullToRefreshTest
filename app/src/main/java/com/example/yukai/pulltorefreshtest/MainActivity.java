package com.example.yukai.pulltorefreshtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.yukai.pulltorefreshtest.PullToRefreshRecyclerView.MyRecyclerViewAdapter;
import com.example.yukai.pulltorefreshtest.PullToRefreshRecyclerView.PullToRefreshRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PullToRefreshRecyclerView mPullToRefreshRecyclerView;
    private MyRecyclerViewAdapter mMyRecyclerViewAdapter;
    private ArrayList<String> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPullToRefreshRecyclerView = (PullToRefreshRecyclerView) findViewById(R.id.pull_to_refresh_recycler_view);
        initialData();
        mMyRecyclerViewAdapter = new MyRecyclerViewAdapter(this, mDatas);
        mPullToRefreshRecyclerView.setAdapter(mMyRecyclerViewAdapter);
        mPullToRefreshRecyclerView.setLinearLayoutManager(new LinearLayoutManager(this));
    }

    private void initialData(){
        int n = 30;
        for (int i = 0; i < n; i++){
            mDatas.add(i + "");
        }
    }
}
