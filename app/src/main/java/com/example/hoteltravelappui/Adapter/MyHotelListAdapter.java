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
import com.example.hoteltravelappui.Activity.MainActivity;
import com.example.hoteltravelappui.DataModel.DataModelHotelList;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyHotelListAdapter extends RecyclerView.Adapter<MyHotelListAdapter.ViewHolder>{
    private ArrayList<DataModelHotelList> hdata;
    private MainActivity mainActivity;


    // RecyclerView recyclerView;
    public MyHotelListAdapter(ArrayList<DataModelHotelList> hdata, MainActivity  mainActivity) {
        this.hdata = hdata;
        this.mainActivity = mainActivity;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_hotellist, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.TextViewLocation.setText(hdata.get(Position).getTitle());
        holder.TextViewName.setText(hdata.get(Position).getName());
        holder.TextViewPrice.setText(hdata.get(Position).getSubTitle());
        holder.TextViewNumber.setText(hdata.get(Position).getNumber());
        holder.imageView.setImageResource(hdata.get(Position).getImagePath());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainActivity, DetailActivity.class);
                mainActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView TextViewName;
        public TextView TextViewLocation;
        public TextView TextViewPrice;
        public TextView TextViewNumber;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.TextViewName = (TextView) itemView.findViewById(R.id.TextViewName);
            this.TextViewLocation = (TextView) itemView.findViewById(R.id.TextViewLocation);
            this.TextViewPrice = (TextView) itemView.findViewById(R.id.TextViewPrice);
            this.TextViewNumber = (TextView) itemView.findViewById(R.id.TextViewNumber);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}