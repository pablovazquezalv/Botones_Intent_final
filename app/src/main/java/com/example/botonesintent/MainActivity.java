package com.example.botonesintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Botones> btnlist;
    private RecyclerView recyclerVieww;
    BotonesAdaptador botonesAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerVieww=findViewById(R.id.recylclerview);
        btnlist = new ArrayList<>();

        setUserInfo();
        setAdapter();


    }
   /* private void showToast(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }*/


    private void setAdapter()
    {
        BotonesAdaptador adaptador = new BotonesAdaptador(btnlist);
        RecyclerView.LayoutManager LayoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerVieww.setLayoutManager(LayoutManager);
        recyclerVieww.setItemAnimator(new DefaultItemAnimator());
        recyclerVieww.setAdapter(adaptador);
        recyclerVieww.setHasFixedSize(true);
    }
    private void setUserInfo()
    {
       btnlist.add(new Botones("GOOGLE", new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))));
        btnlist.add(new Botones("CAMARA", new Intent(MediaStore.ACTION_IMAGE_CAPTURE)));
        btnlist.add(new Botones("GATO", new Intent(getApplicationContext(),Gato.class)));
        btnlist.add(new Botones("YOUTUBE", new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VtKcDwz6hiM"))));
    }


}