package com.example.hoteltravelappui.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.DataModel.DataModelDetail;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;


public class MyDetailAdapter extends RecyclerView.Adapter<MyDetailAdapter.ViewHolder> {
    private final ArrayList<DataModelDetail> listdata;


    // RecyclerView recyclerView;
    public MyDetailAdapter(ArrayList<DataModelDetail> listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.row_detail, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int Position) {
        holder.textView.setText(listdata.get(Position).getTitle());
        holder.imageView.setImageResource(listdata.get(Position).getImagePath());
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.TextView);
            this.imageView = itemView.findViewById(R.id.image);


        }
    }
}