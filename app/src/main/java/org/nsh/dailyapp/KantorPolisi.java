package org.nsh.dailyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KantorPolisi extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftarKP = new String[] {"Polresta Pekanbaru","Polsek Tampan","Polres Siak" };
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
            if (pilihan.equals("Polresta Pekanbaru")){
                a = new Intent(this,PolrestaPekanbaru.class);


            }else if (pilihan.equals("Polsek Tampan")){

            }else if (pilihan.equals("Polres Siak")){

            }
            startActivity(a);

        }catch (Exception e){
            e.getStackTrace();
        }
    }

}
