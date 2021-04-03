package org.nsh.dailyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Swalayan extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftarSwalayan = new String[] {"Hypermart","Planet99","Indo Grosir" };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftarSwalayan));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Hypermart")){
                a = new Intent(this,Hypermart.class);


            }else if (pilihan.equals("Planet99")){

            }else if (pilihan.equals("Indo Grosir")){

            }
            startActivity(a);

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
