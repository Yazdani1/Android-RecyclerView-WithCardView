package com.yazdaniscodelab.android_recyclerview_withcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] F_name,L_name;

    int[] image=new int[]{

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.d


    };

     ArrayList<Data> arrayList=new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview_xml);
        F_name=getResources().getStringArray(R.array.first_name);
        L_name=getResources().getStringArray(R.array.last_name);

        int i=0;

        for (String name:F_name){

            Data data=new Data(image[i],name,L_name[i]);
            arrayList.add(data);
            i++;
        }

        adapter=new RecyclerViewAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);




    }
}
