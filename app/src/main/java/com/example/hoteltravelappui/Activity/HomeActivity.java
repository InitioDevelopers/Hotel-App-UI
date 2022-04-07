package com.example.hoteltravelappui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.hoteltravelappui.DataModel.DataModelHotel;
import com.example.hoteltravelappui.DataModel.DataModelPlace;
import com.example.hoteltravelappui.Adapter.MyHotelAdapter;
import com.example.hoteltravelappui.Adapter.MyPlaceListAdapter;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<DataModelHotel> arrayList = new ArrayList<>();
    ArrayList<DataModelPlace> mdata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewHotel);
        RecyclerView recyclerViewPlace = (RecyclerView) findViewById(R.id.recyclerViewPlace);
        MyHotelAdapter adapter = new MyHotelAdapter(arrayList,HomeActivity.this);
        MyPlaceListAdapter placeadapter = new MyPlaceListAdapter(mdata,HomeActivity.this);
        recyclerView.setHasFixedSize(true);
        recyclerViewPlace.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewPlace.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        recyclerViewPlace.setAdapter(placeadapter);

        addDatahotel();
        addDataplace();


    }

    private void addDatahotel() {

        DataModelHotel dataModelHotel1 = new DataModelHotel();
        dataModelHotel1.setId(1);
        dataModelHotel1.setTitle("Super Paim Hotel");
        dataModelHotel1.setSubTitle("Canberra, Australia");
        dataModelHotel1.setImagePath(R.drawable.hotels);
        arrayList.add(dataModelHotel1);

        DataModelHotel dataModelHotel2 = new DataModelHotel();
        dataModelHotel2.setId(2);
        dataModelHotel2.setTitle("Hotel Blue Sea");
        dataModelHotel2.setSubTitle("Phuket, Thailand");
        dataModelHotel2.setImagePath(R.drawable.hotel);
        arrayList.add(dataModelHotel2);

    }

    private void addDataplace() {

        DataModelPlace DataModelPlace1 = new DataModelPlace();
        DataModelPlace1.setId(1);
        DataModelPlace1.setTitle("Phuket");
        DataModelPlace1.setImagePath(R.drawable.phuket);
        mdata.add(DataModelPlace1);

        DataModelPlace DataModelPlace2 = new DataModelPlace();
        DataModelPlace2.setId(2);
        DataModelPlace2.setTitle("Mexico");
        DataModelPlace2.setImagePath(R.drawable.mexico);
        mdata.add(DataModelPlace2);

        DataModelPlace DataModelPlace3 = new DataModelPlace();
        DataModelPlace3.setId(3);
        DataModelPlace3.setTitle("Santorini");
        DataModelPlace3.setImagePath(R.drawable.santorini);
        mdata.add(DataModelPlace3);

        DataModelPlace DataModelPlace4 = new DataModelPlace();
        DataModelPlace4.setId(4);
        DataModelPlace4.setTitle("Miami");
        DataModelPlace4.setImagePath(R.drawable.miami);
        mdata.add(DataModelPlace4);

        DataModelPlace DataModelPlace5 = new DataModelPlace();
        DataModelPlace5.setId(5);
        DataModelPlace5.setTitle("Denver");
        DataModelPlace5.setImagePath(R.drawable.denver);
        mdata.add(DataModelPlace5);

        DataModelPlace DataModelPlace6 = new DataModelPlace();
        DataModelPlace6.setId(6);
        DataModelPlace6.setTitle("Sicily");
        DataModelPlace6.setImagePath(R.drawable.sicily);
        mdata.add(DataModelPlace6);

        DataModelPlace DataModelPlace7 = new DataModelPlace();
        DataModelPlace7.setId(7);
        DataModelPlace7.setTitle("Portland");
        DataModelPlace7.setImagePath(R.drawable.portland);
        mdata.add(DataModelPlace7);

        DataModelPlace DataModelPlace8 = new DataModelPlace();
        DataModelPlace8.setId(8);
        DataModelPlace8.setTitle("Detroit");
        DataModelPlace8.setImagePath(R.drawable.detroit);
        mdata.add(DataModelPlace8);

    }
}