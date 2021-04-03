package org.nsh.dailyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftarKP = new String[] {"MAN IC SIAK","MAN 2 ","SMAN 8", "SMA Plus" };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftarKP));
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
            if (pilihan.equals("MAN IC SIAK")){
                a = new Intent(this,MANICSIAK.class);


            }else if (pilihan.equals("MAN 2")){

            }else if (pilihan.equals("SMAN 8")){

            }else if (pilihan.equals("SMA Plus")){

            }
            startActivity(a);

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
