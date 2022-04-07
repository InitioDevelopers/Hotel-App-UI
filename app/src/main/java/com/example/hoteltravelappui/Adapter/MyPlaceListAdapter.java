package com.example.hoteltravelappui.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.Activity.HomeActivity;
import com.example.hoteltravelappui.Activity.MainActivity;
import com.example.hoteltravelappui.DataModel.DataModelPlace;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyPlaceListAdapter extends RecyclerView.Adapter<MyPlaceListAdapter.ViewHolder>{
    private ArrayList<DataModelPlace> mdata;
    private HomeActivity homeActivity;

    // RecyclerView recyclerView;
    public MyPlaceListAdapter(ArrayList<DataModelPlace> listdata,HomeActivity homeActivity) {
        this.mdata = listdata;
        this.homeActivity = homeActivity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_place, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.textView.setText(mdata.get(Position).getTitle());
        holder.imageView.setImageResource(mdata.get(Position).getImagePath());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homeActivity, MainActivity.class);
                homeActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.TextView);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}