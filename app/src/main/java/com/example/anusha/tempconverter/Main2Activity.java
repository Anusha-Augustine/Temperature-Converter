package com.example.anusha.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void CONVERT(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        String value = editText.getText().toString();
        float finalValue = Float.parseFloat(value);

        finalValue = ((finalValue - 32) * 5) / 9;

        Toast.makeText(Main2Activity.this, "Temperature = " + finalValue +"°C" , Toast.LENGTH_SHORT).show();
    }
}
