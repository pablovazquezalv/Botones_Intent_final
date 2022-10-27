package com.example.botonesintent;

import android.content.Intent;

import java.io.Serializable;

public class Botones implements Serializable {

    private String Btn;
    private Intent accion;

    public Botones( String Btn,Intent accion)
    {
        this.Btn = Btn;
        this.accion=accion;
    }
    public Intent getAccion()
    {
        return accion;
    }

    public void setAccion(Intent accion)
    {
        this.accion= accion;
    }
    public String getBoton()
    {
        return Btn;
    }

    public void setBoton(String Btn)
    {
        this.Btn = Btn;
    }

}
