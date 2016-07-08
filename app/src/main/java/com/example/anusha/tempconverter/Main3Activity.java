package com.example.anusha.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void CONVERT(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        String value = editText.getText().toString();
        float finalValue = Float.parseFloat(value);

        finalValue = (finalValue  * 9 / 5)+32;

        Toast.makeText(Main3Activity.this, "Temperature =" + finalValue +"°F", Toast.LENGTH_SHORT).show();
    }
}
