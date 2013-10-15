package com.example.tipcalculator;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private double tipAmount = 0;
	private double number = 0;
        
    public Button tenButton;
    public Button twentyButton;
    public Button fifteenButton;
    public EditText num;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tenButton = (Button) findViewById(R.id.btn10);
        twentyButton = (Button) findViewById(R.id.btn20);
        fifteenButton = (Button) findViewById(R.id.btn15);
        num = (EditText) findViewById(R.id.editText1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void OnTenClick(View v){
    	number = Double.valueOf(num.getText().toString());
    	tipAmount = 0.1 * number;
		TextView tip = (TextView) findViewById(R.id.textView2);
		tip.setText("Tip is: $" + tipAmount);
    }
    
    public void OnFifteenClick(View v){
    	number = Double.valueOf(num.getText().toString());
    	tipAmount = 0.15 * number;
		TextView tip = (TextView) findViewById(R.id.textView2);
		tip.setText("Tip is: $" + tipAmount);
    }
    
    public void OnTwentyClick(View v){
    	number = Double.valueOf(num.getText().toString());
    	tipAmount = 0.2 * number;
		TextView tip = (TextView) findViewById(R.id.textView2);
		tip.setText("Tip is: $" + tipAmount);
    }
    
}
