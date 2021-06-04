package com.example.damwonkia.FragmentGallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.damwonkia.R;

import java.util.List;

public class RecycleViewAdapterGallery extends RecyclerView.Adapter<RecycleViewAdapterGallery.MyViewHolder> {

    private Context mContext;
    private List<Gallery> mData;

    public RecycleViewAdapterGallery(Context mContext, List<Gallery> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        v = mInflater.inflate(R.layout.recycleview_gallery,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_friend_name.setText(mData.get(position).getNama());
        holder.img_friend_thumbnail.setImageResource(mData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_friend_name;
        ImageView img_friend_thumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_friend_name = (TextView)itemView.findViewById(R.id.friend_name);
            img_friend_thumbnail = (ImageView) itemView.findViewById(R.id.friend_img);
        }
    }


}
