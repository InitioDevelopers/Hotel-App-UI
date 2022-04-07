package com.example.hoteltravelappui.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.DataModel.DataModeOrderPendingList;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyHotelOrderPendingAdapter extends RecyclerView.Adapter<MyHotelOrderPendingAdapter.ViewHolder> {
    private final ArrayList<DataModeOrderPendingList> pdata;


    // RecyclerView recyclerView;
    public MyHotelOrderPendingAdapter(ArrayList<DataModeOrderPendingList> pdata) {
        this.pdata = pdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_hotelpendingorder, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.TextViewID.setText(pdata.get(Position).getTitle());
        holder.TextViewLocation.setText(pdata.get(Position).getSubtitle());
        holder.TextView.setText(pdata.get(Position).getName());
        holder.TextViewDate.setText(pdata.get(Position).getNumber());
        holder.TextViewPayment.setText(pdata.get(Position).getPayment());
        holder.imageView.setImageResource(pdata.get(Position).getImagePath());
    }


    @Override
    public int getItemCount() {
        return pdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView TextView;
        public TextView TextViewLocation;
        public TextView TextViewDate;
        public TextView TextViewPayment;
        public TextView TextViewID;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.TextView = itemView.findViewById(R.id.TextView);
            this.TextViewID = itemView.findViewById(R.id.TextViewID);
            this.TextViewLocation = itemView.findViewById(R.id.TextViewLocation);
            this.TextViewDate = itemView.findViewById(R.id.TextViewDate);
            this.TextViewPayment = itemView.findViewById(R.id.TextViewPayment);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}