package com.example.tablamultiplicar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;


public class ListadoTabla extends Activity {
	String[] lineas= new String[10];
	ListView lv1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listado_tabla);
		Bundle b=getIntent().getExtras();
		String cad=b.getString("tabla");
		int nro=Integer.parseInt(cad);
        for(int f=1; f<=10; f++) {
        	int termino=f*nro;
        	String lin=f+" x "+nro+" = "+termino;
        	lineas[f-1]=lin;
        }
        ArrayAdapter<String> adaptador1=new ArrayAdapter(this, android.R.layout.simple_list_item_1, lineas);
        lv1=(ListView)findViewById(R.id.listView1);
        lv1.setAdapter(adaptador1);
        
	}

	public void retornar (View v) {
		finish();
	}

}
