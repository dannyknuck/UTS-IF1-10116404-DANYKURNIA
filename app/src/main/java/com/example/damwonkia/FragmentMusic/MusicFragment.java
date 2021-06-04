package com.example.damwonkia.FragmentMusic;

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

public class MusicFragment extends Fragment {

    View v;
    private List<Music> lstMusic;
    RecyclerView myrecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_music, container,false);

        myrecyclerView = (RecyclerView)v.findViewById(R.id.recycleview_music);
        RecycleViewAdaperMusic recycleViewAdaperMusic = new RecycleViewAdaperMusic(getContext(), lstMusic);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recycleViewAdaperMusic);

        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstMusic = new ArrayList<>();

        lstMusic.add(new Music("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zF5Ddo9JdpY\" frameborder=\"0\" allowfullscreen></iframe>\""));
        lstMusic.add(new Music("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aR-KAldshAE\" frameborder=\"0\" allowfullscreen></iframe>\""));
        lstMusic.add(new Music("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wkihKQ7Exvo\" frameborder=\"0\" allowfullscreen></iframe>\""));
        lstMusic.add(new Music("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5-mT9D4fdgQ\" frameborder=\"0\" allowfullscreen></iframe>\""));
        lstMusic.add(new Music("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fB8TyLTD7EE\" frameborder=\"0\" allowfullscreen></iframe>\""));


    }


}
