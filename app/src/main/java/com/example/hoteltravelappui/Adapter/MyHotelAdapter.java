package com.example.hoteltravelappui.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.Activity.DetailActivity;
import com.example.hoteltravelappui.Activity.HomeActivity;
import com.example.hoteltravelappui.Activity.MainActivity;
import com.example.hoteltravelappui.DataModel.DataModelHotel;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyHotelAdapter extends RecyclerView.Adapter<MyHotelAdapter.ViewHolder> {
    private final ArrayList<DataModelHotel> listdata;
    private HomeActivity homeActivity;


    // RecyclerView recyclerView;
    public MyHotelAdapter(ArrayList<DataModelHotel> listdata,HomeActivity homeActivity) {
        this.listdata = listdata;
        this.homeActivity = homeActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_hotel, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.textView.setText(listdata.get(Position).getTitle());
        holder.TextViewLocation.setText(listdata.get(Position).getSubTitle());
        holder.imageView.setImageResource(listdata.get(Position).getImagePath());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homeActivity, DetailActivity.class);
                homeActivity.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView TextViewLocation;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.TextView);
            this.TextViewLocation = itemView.findViewById(R.id.TextViewLocation);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}