package com.example.mohammed.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarField =(EditText) findViewById(R.id.dollarField);

        //This is a second commit
        int test = 5 + 4;
        
        double dollarAmount= Double.parseDouble(dollarField.getText().toString());

        Double poundAmount= dollarAmount*0.65;

        //Log.i("poundAmount", poundAmount.toString());
        // toast is used to show  the result to the user
        Toast.makeText(getApplicationContext(),"£"+poundAmount.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void swap(int one, int two){
      int temp = one;
      one = two;
      two = temp;s
    }
}
