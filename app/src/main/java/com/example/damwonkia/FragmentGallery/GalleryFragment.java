package com.example.damwonkia.FragmentGallery;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damwonkia.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    View v;
    List<Gallery> lstGallery;
    private RecyclerView myrecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_gallery, container,false);

        myrecyclerView = (RecyclerView)v.findViewById(R.id.recycleview_gallery);
        RecycleViewAdapterGallery recycleViewAdapterGallery = new RecycleViewAdapterGallery(getContext(), lstGallery);
        myrecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        myrecyclerView.setAdapter(recycleViewAdapterGallery);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstGallery = new ArrayList<>();

        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
        lstGallery.add(new Gallery("Lux","080808","Description",R.drawable.lux));
        lstGallery.add(new Gallery("Kaisa","080808","Description",R.drawable.kaisa));
        lstGallery.add(new Gallery("Senna","080808","Description",R.drawable.senna));
        lstGallery.add(new Gallery("Sylas","080808","Description",R.drawable.sylas));
    }
}
