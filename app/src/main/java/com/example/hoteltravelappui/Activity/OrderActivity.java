package com.example.hoteltravelappui.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteltravelappui.Adapter.MyHotelOrderAdapter;
import com.example.hoteltravelappui.Adapter.MyHotelOrderPendingAdapter;
import com.example.hoteltravelappui.DataModel.DataModeOrderPendingList;
import com.example.hoteltravelappui.DataModel.DataModeOrderslist;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ArrayList<DataModeOrderslist> odata = new ArrayList<>();
    ArrayList<DataModeOrderPendingList> pdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.recyclerViewOrder);
        RecyclerView recyclerViewHotelOrder = findViewById(R.id.recyclerViewHotelOrder);
        MyHotelOrderAdapter adapter = new MyHotelOrderAdapter(odata);
        MyHotelOrderPendingAdapter myHotelOrderAdapter = new MyHotelOrderPendingAdapter(pdata);
        recyclerView.setHasFixedSize(true);
        recyclerViewHotelOrder.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerViewHotelOrder.setAdapter(myHotelOrderAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerViewHotelOrder.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        addDatahotel();
        addDatahotelpending();

        ImageView imageView = findViewById(R.id.imageBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OrderActivity.this, DetailActivity.class);
                startActivity(i);

            }
        });
    }

    private void addDatahotel() {

        DataModeOrderslist DataModeOrderslist1 = new DataModeOrderslist();
        DataModeOrderslist1.setId(1);
        DataModeOrderslist1.setTitle("ID837102");
        DataModeOrderslist1.setName("Blue Star Hotel");
        DataModeOrderslist1.setSubtitle("Miami, Florida");
        DataModeOrderslist1.setNumber("17 June - 23 June");
        DataModeOrderslist1.setImagePath(R.drawable.hotels);
        odata.add(DataModeOrderslist1);
    }


    private void addDatahotelpending() {

        DataModeOrderPendingList dataModeOrderPendingList1 = new DataModeOrderPendingList();
        dataModeOrderPendingList1.setId(1);
        dataModeOrderPendingList1.setTitle("ID320508");
        dataModeOrderPendingList1.setName("Star Hotel");
        dataModeOrderPendingList1.setSubtitle("Miami, Florida");
        dataModeOrderPendingList1.setNumber("20 June - 23 June");
        dataModeOrderPendingList1.setPayment("Waiting For Payment");
        dataModeOrderPendingList1.setImagePath(R.drawable.hotel);
        pdata.add(dataModeOrderPendingList1);


        DataModeOrderPendingList dataModeOrderPendingList2 = new DataModeOrderPendingList();
        dataModeOrderPendingList2.setId(2);
        dataModeOrderPendingList2.setTitle("ID214094");
        dataModeOrderPendingList2.setName("Dream Vacation Hotel");
        dataModeOrderPendingList2.setSubtitle("canberra, Australia");
        dataModeOrderPendingList2.setNumber("12 July - 23 July");
        dataModeOrderPendingList2.setImagePath(R.drawable.miami);
        dataModeOrderPendingList2.setPayment("Ongoing");
        pdata.add(dataModeOrderPendingList2);

        DataModeOrderPendingList dataModeOrderPendingList3 = new DataModeOrderPendingList();
        dataModeOrderPendingList3.setId(3);
        dataModeOrderPendingList3.setTitle("ID837102");
        dataModeOrderPendingList3.setName("Blue Star Hotel");
        dataModeOrderPendingList3.setSubtitle("Miami, Florida");
        dataModeOrderPendingList3.setNumber("17 June - 23 June");
        dataModeOrderPendingList3.setPayment("Waiting For Payment");
        dataModeOrderPendingList3.setImagePath(R.drawable.hotels);
        pdata.add(dataModeOrderPendingList3);






    }
}