package com.example.yukai.pulltorefreshtest.PullToRefreshRecyclerView;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.handmark.pulltorefresh.library.PullToRefreshBase;

/**
 * Created by yukai on 2017/10/26.
 */

public class PullToRefreshRecyclerView extends PullToRefreshBase<RecyclerView>{

    public PullToRefreshRecyclerView(Context context) {
        super(context);
    }

    public PullToRefreshRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullToRefreshRecyclerView(Context context, Mode mode) {
        super(context);
    }

    public PullToRefreshRecyclerView(Context context, Mode mode, AnimationStyle animStyle) {
        super(context);
    }

    @Override
    public Orientation getPullToRefreshScrollDirection() {
        return Orientation.VERTICAL;
    }

    @Override
    protected RecyclerView createRefreshableView(Context context, AttributeSet attrs) {
        RecyclerView recyclerView = new RecyclerView(context, attrs);
        return recyclerView;
    }

    @Override
    protected boolean isReadyForPullEnd() {
        return false;
    }

    @Override
    protected boolean isReadyForPullStart() {
        return isFirstItemVisible();
    }

    private boolean isFirstItemVisible(){
        final RecyclerView.Adapter<?> adapter = getRefreshableView().getAdapter();
        if (adapter == null || adapter.getItemCount() == 0){
            return true;
        }else{
            if (getFirstVisiblePosition() == 0){
                return getRefreshableView().getChildAt(0).getTop() >= getRefreshableView().getTop();
            }
        }
        return false;
    }

    private int getFirstVisiblePosition(){
        View firstChild = getRefreshableView().getChildAt(0);
        return firstChild != null ? getRefreshableView().getChildAdapterPosition(firstChild) : -1;
    }

    public void setAdapter(RecyclerView.Adapter<?> adapter){
        getRefreshableView().setAdapter(adapter);
    }

    public void setLinearLayoutManager(LinearLayoutManager linearLayoutManager){
        getRefreshableView().setLayoutManager(linearLayoutManager);
    }

}
