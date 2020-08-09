package com.example.tablamultiplicar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	ListView lv1;
	String[] numeros;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lv1=(ListView)findViewById(R.id.listView1);
        numeros=new String[10];
        for(int f=1; f<=10; f++) {
        	numeros[f-1]=String.valueOf(f);
        }
        ArrayAdapter<String> adaptador1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numeros);
        lv1.setAdapter(adaptador1);
        //numeros  ->  adaptador1  ->  lv1
        
        lv1.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// Toast.makeText(MainActivity.this, String.valueOf(arg2), Toast.LENGTH_LONG).show(); //posición desde 0 a 9
				//Toast.makeText(MainActivity.this, numeros[arg2], Toast.LENGTH_LONG).show(); //contenido del String
				Intent intento1=new Intent(MainActivity.this, ListadoTabla.class);
				intento1.putExtra("tabla", numeros[arg2]);
				startActivity(intento1);
				//envía hacia Bundle en class destino
			}});
        
    }


    
}
