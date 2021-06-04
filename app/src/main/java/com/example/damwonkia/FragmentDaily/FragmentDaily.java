package com.example.damwonkia.FragmentDaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damwonkia.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentDaily extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Daily> lstDaily;

    public FragmentDaily() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.recycleview_daily, container,false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.recycleview_daily1);
        RecycleViewAdapter recyclerAdapter = new RecycleViewAdapter(getContext(), lstDaily);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstDaily = new ArrayList<>();
        lstDaily.add(new Daily("7am-10am", "Study",R.drawable.study));
        lstDaily.add(new Daily("10am-11am", "Lunch",R.drawable.lunch));
        lstDaily.add(new Daily("11am-17pm", "Study",R.drawable.study));
        lstDaily.add(new Daily("17pm-23pm", "Playing some games",R.drawable.lol));
        lstDaily.add(new Daily("23pm-5am", "Sleep",R.drawable.sleep));
    }
}
