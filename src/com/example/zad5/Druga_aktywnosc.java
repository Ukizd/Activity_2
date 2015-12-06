package com.example.zad5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Druga_aktywnosc extends Activity {
	
	int par= -2;
	TextView tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.druga_akt);
		
		Intent i = getIntent();
		par = i.getIntExtra("Parametr", -1);
		
		tv2=(TextView)findViewById(R.id.textView2);
		
		tv2.setText(Integer.toString(par));
		
		Button stop = (Button)findViewById(R.id.button1);
		stop.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = getIntent();
				++par;
				i.putExtra("Parametr", par);
				setResult(RESULT_OK, i); // wysyla 
				finish();
			}
		});
		
	}

}
