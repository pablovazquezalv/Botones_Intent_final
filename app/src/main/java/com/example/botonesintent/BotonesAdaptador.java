package com.example.botonesintent;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BotonesAdaptador extends RecyclerView.Adapter<BotonesAdaptador.MyViewHolder> {

    private ArrayList<Botones> btnlist;

    public BotonesAdaptador(ArrayList <Botones> btnlist)
    {
        this.btnlist=btnlist;

    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView btnttxt;

        public MyViewHolder(final View view)
        {
            super(view);
            btnttxt=view.findViewById(R.id.btntxt);
        }


    }

    @NonNull
    @Override
    public BotonesAdaptador.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listabtn,parent,false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull BotonesAdaptador.MyViewHolder holder, int position)
    {
        String name=btnlist.get(position).getBoton();
        holder.btnttxt.setText(name);
         Intent accion=btnlist.get(position).getAccion();
         holder.btnttxt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 view.getContext().startActivity(accion);
             }
         });

        //holder.itemView.getContext().startActivity(accion);

    }

    @Override
    public int getItemCount()
    {
        return  btnlist.size();
    }

            /*public void OnClick(View view)
        {
            view.getContext().startActivity(holder.getAccion);
        }*/



}
