package org.nsh.dailyapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MANICSIAK extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] daftarAksi = new String[] {"Call Center","SMS Center","Driving Direction",
                "Website","Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftarAksi));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")) {
                String nomortel ="tel:0761-90897090";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));


            }else if (pilihan.equals("SMS Center")){
                String smsText="Farhan Saputra/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082235870287"));
                a.putExtra("sms_body",smsText);

            }else if (pilihan.equals("Driving Direction")){
                String lokasisp ="https://goo.gl/maps/oLbH4WZEdksaCfcB9";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(lokasisp));

            }else if (pilihan.equals("Website")){
                String website ="https://icsiak.sch.id/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            }else if (pilihan.equals("Info di Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"MAN IC SIAK");
            }


            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
