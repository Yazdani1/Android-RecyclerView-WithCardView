package com.yazdaniscodelab.android_recyclerview_withcardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yazdani on 5/4/2017.
 */

public  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyRecyclerViewHolder> {


    private ArrayList<Data> arrayList=new ArrayList<Data>();

    public RecyclerViewAdapter(ArrayList<Data> arrayList){

        this.arrayList=arrayList;

    }



    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        MyRecyclerViewHolder myRecyclerViewHolder=new MyRecyclerViewHolder(myview);

        return myRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        Data data=arrayList.get(position);
        holder.imageView.setImageResource(data.getImage_re());
        holder.f_name.setText(data.getF_name());
        holder.l_name.setText(data.l_name);
    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyRecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView f_name;
        TextView l_name;

      public MyRecyclerViewHolder(View view){

          super(view);
          imageView=(ImageView)view.findViewById(R.id.image_xml);
          f_name=(TextView)view.findViewById(R.id.textf_xml);
          l_name=(TextView)view.findViewById(R.id.textL_xml);

        }


    }



}
