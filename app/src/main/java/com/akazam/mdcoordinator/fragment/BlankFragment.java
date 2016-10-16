package com.akazam.mdcoordinator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akazam.mdcoordinator.R;
import com.akazam.mdcoordinator.adapter.RecyclerAdapter;

public class BlankFragment extends Fragment {

    private RecyclerView recycler_view;
    private int mFlag = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        recycler_view = (RecyclerView) view.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager manager;
        //设置布局管理器三种可选,线性，网格，流式布局
        switch (mFlag) {
            case 0:
                manager = new StaggeredGridLayoutManager(2,
                        StaggeredGridLayoutManager.VERTICAL);
                recycler_view.setLayoutManager((StaggeredGridLayoutManager) manager);
                break;
            case 1:
                manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                recycler_view.setLayoutManager((LinearLayoutManager) manager);
                break;
            case 2:
                manager = new GridLayoutManager(getActivity(), 2);
                recycler_view.setLayoutManager((GridLayoutManager) manager);
                break;
        }
        recycler_view.setAdapter(new RecyclerAdapter(getActivity()));
    }


    public static Fragment getInstace(int i) {
        BlankFragment fragment = new BlankFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("layout", i);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFlag = getArguments().getInt("layout");
        } else {
            mFlag = 0;
        }
    }
}
