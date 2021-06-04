package com.example.damwonkia.FragmentMusic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.damwonkia.R;

import java.util.List;

public class RecycleViewAdaperMusic extends RecyclerView.Adapter<RecycleViewAdaperMusic.MyViewHolder> {

    private Context mContext;
    private List<Music> mData;

    public RecycleViewAdaperMusic(Context mContext, List<Music> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        v = mInflater.inflate(R.layout.recycleview_music,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //holder.textView_name.setText(mData.get(position).getName());
        //holder.textView_artis.setText(mData.get(position).getArtis());
       // holder.imageView_foto.setImageResource(mData.get(position).getFoto());
        holder.videoView_video.loadData(mData.get(position).getVideo(), "text/html", "utf-8");

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        //TextView textView_name;
        //TextView textView_artis;
       // ImageView imageView_foto;
        WebView videoView_video;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //textView_name = (TextView)itemView.findViewById(R.id.textview_music);
            //textView_artis = (TextView)itemView.findViewById(R.id.textview_musicartis);
            //imageView_foto = (ImageView)itemView.findViewById(R.id.image_album);
            videoView_video = (WebView)itemView.findViewById(R.id.videoView_music);

            videoView_video.getSettings().setJavaScriptEnabled(true);
            videoView_video.setWebChromeClient(new WebChromeClient());




        }
    }
}
