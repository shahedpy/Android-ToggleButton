package com.callnsolution.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeToggleState(View view) {

        boolean checked = ((ToggleButton) view).isChecked();

        if (checked) {

            Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_LONG).show();

        }

    }
}
