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

public class FragmentFriend extends Fragment {

    View v;
    private RecyclerView myecyclerView;
    private List<Friend> lstFriend;

    public FragmentFriend() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.recycleview_friend, container,false);

        myecyclerView = (RecyclerView)v.findViewById(R.id.recycleview_friend);
        RecycleViewAdapterFriend recycleViewAdapterFriend = new RecycleViewAdapterFriend(getContext(), lstFriend);
        myecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        myecyclerView.setAdapter(recycleViewAdapterFriend);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstFriend = new ArrayList<>();

        lstFriend.add(new Friend("Lux", R.drawable.lux));
        lstFriend.add(new Friend("Kaisa", R.drawable.kaisa));
        lstFriend.add(new Friend("Senna", R.drawable.senna));
        lstFriend.add(new Friend("Sylas", R.drawable.sylas));
        lstFriend.add(new Friend("Draven", R.drawable.draven));
    }
}
