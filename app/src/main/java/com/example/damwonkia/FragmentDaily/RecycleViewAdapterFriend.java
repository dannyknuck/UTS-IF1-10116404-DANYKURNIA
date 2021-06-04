package com.example.damwonkia.FragmentDaily;

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

public class RecycleViewAdapterFriend extends RecyclerView.Adapter<RecycleViewAdapterFriend.MyViewHolder> {

    private Context mContext;
    private List<Friend> mData;

    public RecycleViewAdapterFriend(Context mContext, List<Friend> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.recycleview_friend_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView_friend.setImageResource(mData.get(position).getPhoto());
        holder.textView_friend.setText(mData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView_friend;
        TextView textView_friend;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView_friend = (ImageView) itemView.findViewById(R.id.imagefriend);
            textView_friend = (TextView) itemView.findViewById(R.id.textview1_friend);
        }
    }
}
