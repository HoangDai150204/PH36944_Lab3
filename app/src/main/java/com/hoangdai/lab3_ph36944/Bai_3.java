package com.hoangdai.lab3_ph36944;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bai_3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai_3);

        TextView txt1click = findViewById(R.id.txt1);
        txt1click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai_1.class);
                startActivity(intent);
            }
        });

        TextView txt2click = findViewById(R.id.txt2);
        txt2click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai_2.class);
                startActivity(intent);
            }
        });
    }
}
