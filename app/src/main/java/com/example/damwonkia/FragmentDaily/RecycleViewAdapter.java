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

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {


    Context mContext;
    List<Daily> mData;

    public RecycleViewAdapter(Context mContext, List<Daily> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.recycleview_daily_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_daily.setText(mData.get(position).getDaily());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_daily;
        private ImageView img;

        public MyViewHolder(View itemView){
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.textview1_daily);
            tv_daily = (TextView) itemView.findViewById(R.id.textview2_daily);
            img = (ImageView) itemView.findViewById(R.id.img_daily);
        }
    }
}
