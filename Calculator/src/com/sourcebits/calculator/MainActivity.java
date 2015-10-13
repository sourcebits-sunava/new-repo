package com.sourcebits.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends Activity {
	 String temp;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main) ; 
	}
	 
	 //onClick method 
	 
	 public void onClick(View view)
	 {
		 EditText num1= (EditText)findViewById(R.id.op1);
		 EditText num2= (EditText)findViewById(R.id.op2);
		 
		 String a = num1.getText().toString();
		 String b = num2.getText().toString();
		 
		 Double n1 = Double.parseDouble(a);
		 Double n2 = Double.parseDouble(b);
		 
		 Double temp = 0.0 ;
		
		 TextView result = (TextView)findViewById(R.id.result_id);
		 
		 if(view.getId()==R.id.Btn1_id) 
		 {
			 temp = n1+n2 ;
		 }
		 if(view.getId()==R.id.Btn2_id) 
		 {
			 temp = n1-n2 ;
			 
		 }
		 if(view.getId()==R.id.Btn3_id) 
		 {
			 
			 temp = n1*n2 ;
		 }
		 if(view.getId()==R.id.Btn4_id) 
		 {
			 
			 temp = n1/n2 ;
		 }
		 
		 result.setText(""+temp);
		 
	 }
	 

}
