package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.LoadingLayoutBase;

/**
 * Created by yukai on 2017/10/26.
 */

public class MyHeaderLoadingLayout extends LoadingLayoutBase {

    private final String TAG = "yk";
    private TextView mTextView;
    private TextView mSubTextView;
    private FrameLayout mFrameLayout;

    public MyHeaderLoadingLayout(Context context) {
        this(context, null);
    }

    public MyHeaderLoadingLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyHeaderLoadingLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_header_layout, this, true);
        mFrameLayout = (FrameLayout) findViewById(R.id.fl_inner);
        mTextView = (TextView) findViewById(R.id.pull_to_refresh_text);
        mSubTextView = (TextView) findViewById(R.id.pull_to_refresh_sub_text);

        LayoutParams lp = (LayoutParams) mFrameLayout.getLayoutParams();
        lp.gravity = Gravity.BOTTOM;

        reset();
    }

    //设置下拉标题
    @Override
    public void setPullLabel(CharSequence pullLabel) {

    }

    //设置释放标题
    @Override
    public void setRefreshingLabel(CharSequence refreshingLabel) {

    }

    //设置完全展示标题
    @Override
    public void setReleaseLabel(CharSequence releaseLabel) {

    }

    //获取待加载头部的高度
    @Override
    public int getContentSize() {
        return mFrameLayout.getHeight();
    }

    //下拉回调
    @Override
    public void pullToRefresh() {
        Log.e(TAG, "pullToRefresh");
    }

    //加载头部完全显示时的回调
    @Override
    public void releaseToRefresh() {
        Log.e(TAG, "releaseToRefresh");
    }

    //拖动回调
    @Override
    public void onPull(float scaleOfLayout) {
        Log.e(TAG, scaleOfLayout + "");
        Log.e(TAG, "onPull");
    }

    //释放刷新回调
    @Override
    public void refreshing() {
        Log.e(TAG, "refreshing");
    }

    //初始化
    @Override
    public void reset() {
        Log.e(TAG, "reset");
    }
}
