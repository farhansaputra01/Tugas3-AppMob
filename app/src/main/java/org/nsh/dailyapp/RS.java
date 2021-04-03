package org.nsh.dailyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftarRS = new String[] {"Rumah Sakit Awal Bros","Rumah Sakit Eka Hospital","Rumah Sakit Ibnu Sina",
        "Rumah Sakit Jiwa Tampan","Rumah Sakit Syafira" };
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,daftarRS));
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
            if (pilihan.equals("Rumah Sakit Awal Bros")){
            a = new Intent(this,RSAwalBross.class);


            }else if (pilihan.equals("Rumah Sakit Eka Hospital")){

            }else if (pilihan.equals("Rumah Sakit Jiwa Tampan")){

            }else if (pilihan.equals("Rumah Sakit Syafira")){

            }
            startActivity(a);

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
