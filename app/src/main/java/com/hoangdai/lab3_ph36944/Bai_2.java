package com.hoangdai.lab3_ph36944;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bai_2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai_2);

        TextView txt1click = findViewById(R.id.txt1);
        txt1click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai_1.class);
                startActivity(intent);
            }
        });

        TextView txt3click = findViewById(R.id.txt3);
        txt3click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai_3.class);
                startActivity(intent);
            }
        });
    }
}
