package com.zolad.zoominimageview.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageListAdapter adapter = new ImageListAdapter(this);
        mRecyclerView = findViewById(R.id.rv_imagelist);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.img_1);
        imageList.add(R.drawable.img_3);
        imageList.add(R.drawable.img_2);
        imageList.add(R.drawable.img_4);
        adapter.setImgList(imageList);
        adapter.notifyDataSetChanged();
    }
}
