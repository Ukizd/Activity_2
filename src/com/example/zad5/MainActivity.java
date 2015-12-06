package com.example.zad5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int par = 0;
	TextView tv2;
	int kod =10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button start = (Button)findViewById(R.id.button1);
		
		tv2=(TextView)findViewById(R.id.textView2);
		
		
		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				tv2.setText(Integer.toString(par));
				Intent i = new Intent(MainActivity.this,Druga_aktywnosc.class);
				i.putExtra("Parametr", par);
				startActivityForResult(i, kod); //dziwna funkcja;
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if((requestCode == kod)&& (resultCode==RESULT_OK)){
			par = data.getExtras().getInt("Parametr");
			tv2.setText(Integer.toString(par));
		}
	}
}
