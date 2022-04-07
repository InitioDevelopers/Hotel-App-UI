package com.example.hoteltravelappui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hoteltravelappui.DataModel.DataModelHotelList;
import com.example.hoteltravelappui.Adapter.MyHotelListAdapter;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModelHotelList> hdata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewHotelList);
        MyHotelListAdapter adapter = new MyHotelListAdapter(hdata,MainActivity.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        addData();

        ImageView imageView = findViewById(R.id.imageBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);

            }
        });
    }

    private void addData() {

        DataModelHotelList dataModelHotelList1 = new DataModelHotelList();
        dataModelHotelList1.setId(1);
        dataModelHotelList1.setTitle("Canberra, Australia");
        dataModelHotelList1.setName("Super Paim Hotel");
        dataModelHotelList1.setSubTitle("$320.00");
        dataModelHotelList1.setNumber("(4.6)");
        dataModelHotelList1.setImagePath(R.drawable.hotels);
        hdata.add(dataModelHotelList1);

        DataModelHotelList dataModelHotelList2 = new DataModelHotelList();
        dataModelHotelList2.setId(2);
        dataModelHotelList2.setTitle("Phuket, Thailand");
        dataModelHotelList2.setName("Hotel Blue Sea");
        dataModelHotelList2.setSubTitle("$420.00");
        dataModelHotelList2.setNumber("(4.9)");
        dataModelHotelList2.setImagePath(R.drawable.hotel);
        hdata.add(dataModelHotelList2);

        DataModelHotelList dataModelHotelList3 = new DataModelHotelList();
        dataModelHotelList3.setId(3);
        dataModelHotelList3.setTitle("Miami, Florida");
        dataModelHotelList3.setName("Super Paim Hotel");
        dataModelHotelList3.setSubTitle("$120.00");
        dataModelHotelList3.setNumber("(3.9)");
        dataModelHotelList3.setImagePath(R.drawable.miami);
        hdata.add(dataModelHotelList3);

    }

}