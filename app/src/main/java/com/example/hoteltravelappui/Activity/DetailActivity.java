package com.example.hoteltravelappui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoteltravelappui.Adapter.MyDetailAdapter;
import com.example.hoteltravelappui.DataModel.DataModelDetail;
import com.example.hoteltravelappui.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ArrayList<DataModelDetail> ddata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewplace);
        MyDetailAdapter adapter = new MyDetailAdapter(ddata);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        addData();


        Button button = findViewById(R.id.buttonBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, OrderActivity.class);
                startActivity(i);

            }
        });

        ImageView imageView = findViewById(R.id.imageviewProfile);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(i);

            }
        });
    }

    private void addData() {

        DataModelDetail DataModelDetail1 = new DataModelDetail();
        DataModelDetail1.setId(1);
        DataModelDetail1.setTitle("Wifi");
        DataModelDetail1.setImagePath(R.drawable.ic_baseline_wifi_24);
        ddata.add(DataModelDetail1);


        DataModelDetail DataModelDetail2 = new DataModelDetail();
        DataModelDetail2.setId(2);
        DataModelDetail2.setTitle("AC");
        DataModelDetail2.setImagePath(R.drawable.ic_baseline_call_to_action_24);
        ddata.add(DataModelDetail2);


        DataModelDetail DataModelDetail3 = new DataModelDetail();
        DataModelDetail3.setId(3);
        DataModelDetail3.setTitle("Pool");
        DataModelDetail3.setImagePath(R.drawable.ic_baseline_pool_24);
        ddata.add(DataModelDetail3);


        DataModelDetail DataModelDetail4 = new DataModelDetail();
        DataModelDetail4.setId(4);
        DataModelDetail4.setTitle("TV");
        DataModelDetail4.setImagePath(R.drawable.ic_baseline_tv_24);
        ddata.add(DataModelDetail4);


        DataModelDetail DataModelDetail5 = new DataModelDetail();
        DataModelDetail5.setId(5);
        DataModelDetail5.setTitle("bed");
        DataModelDetail5.setImagePath(R.drawable.ic_baseline_bed_24);
        ddata.add(DataModelDetail5);

    }
}