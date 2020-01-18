package com.example.listtorecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.PriorityQueue;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder> {

    private ArrayList<runner> mdataList;
    private Context context;

    public NewAdapter(ArrayList<runner> mdataList, Context context) {
        this.mdataList = mdataList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
         return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        runner dcsuper=mdataList.get(position);
        holder.DC.setText(dcsuper.getmDc());
        runner marvelsuper=mdataList.get(position);
        holder.MARVEL.setText(marvelsuper.getmMarvel());

      }

    @Override
    public int getItemCount() {
        return mdataList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

        TextView DC,MARVEL;


        public MyViewHolder(@NonNull View itemView) {


            super(itemView);

            DC=itemView.findViewById(R.id.dcc);
            MARVEL=itemView.findViewById(R.id.marvell);
        }
    }
}
