package com.example.userinputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        CheckBox oats = (CheckBox) findViewById(R.id.oatsBox);
        CheckBox cereal = (CheckBox) findViewById(R.id.cerealBox);
        CheckBox pancake = (CheckBox) findViewById(R.id.pancakeBox);
        CheckBox egg = (CheckBox) findViewById(R.id.eggBox);
        CheckBox sausage = (CheckBox) findViewById(R.id.sausageBox);

        String message = "Your breakfast will consist of ";

        if (oats.isChecked()) {
            message += "oats ";
        }
        if (cereal.isChecked()) {
            message += "cereal ";
        }

        if (pancake.isChecked()) {
            message += "pancakes ";
        }

        if (egg.isChecked()) {
            message += "eggs ";
        }

        if (sausage.isChecked()) {
            message += "sausage ";
        }

        if (message == "Your breakfast will consist of ") {
            Toast.makeText(this, "Please make a selection", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
}