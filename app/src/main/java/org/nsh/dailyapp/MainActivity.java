package org.nsh.dailyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.PolicySpi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //Gambar Rumah Sakit di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);

    }

    public void clickPolisi(View view) {
        //Gambar Polisi di click
        Intent i = new Intent(this,KantorPolisi.class);
        startActivity(i);
    }

    public void clickMarket(View view) {
        //Gambar Super Market di click
        Intent i = new Intent(this,Swalayan.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
        //Gambar Sekolah di click
        Intent i = new Intent(this,Sekolah.class);
        startActivity(i);
    }
}