package com.xuezitime.hellogit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private TextView tv_text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		tv_text=(TextView) findViewById(R.id.tv_text);
	
	}


}
