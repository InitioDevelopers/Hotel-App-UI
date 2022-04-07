package com.example.hoteltravelappui.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.DataModel.DataModeOrderslist;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyHotelOrderAdapter extends RecyclerView.Adapter<MyHotelOrderAdapter.ViewHolder> {
    private final ArrayList<DataModeOrderslist> odata;


    // RecyclerView recyclerView;
    public MyHotelOrderAdapter(ArrayList<DataModeOrderslist> odata) {
        this.odata = odata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_hotelorder, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.TextViewID.setText(odata.get(Position).getTitle());
        holder.TextViewLocation.setText(odata.get(Position).getSubtitle());
        holder.TextView.setText(odata.get(Position).getName());
        holder.TextViewDate.setText(odata.get(Position).getNumber());
        holder.imageView.setImageResource(odata.get(Position).getImagePath());
    }


    @Override
    public int getItemCount() {
        return odata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView TextView;
        public TextView TextViewLocation;
        public TextView TextViewDate;
        public TextView TextViewID;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.TextView = itemView.findViewById(R.id.TextView);
            this.TextViewID = itemView.findViewById(R.id.TextViewID);
            this.TextViewLocation = itemView.findViewById(R.id.TextViewLocation);
            this.TextViewDate = itemView.findViewById(R.id.TextViewDate);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}