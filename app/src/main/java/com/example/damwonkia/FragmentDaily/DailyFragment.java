package com.example.damwonkia.FragmentDaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damwonkia.Adapter.ViewPagerAdapter;
import com.example.damwonkia.R;

public class DailyFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daily, container,false);

        tabLayout = (TabLayout)view.findViewById(R.id.tablayout_daily);
        viewPager = (ViewPager)view.findViewById(R.id.viewpager_daily);
        adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.AddFragment(new FragmentDaily(),"Daily Activity");
        adapter.AddFragment(new FragmentFriend(),"Friend List");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }
}
