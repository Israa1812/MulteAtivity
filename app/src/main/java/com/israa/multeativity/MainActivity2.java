package com.israa.multeativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String dateofbirth = intent.getStringExtra("DATA");
        String Gender = intent.getStringExtra("GENDER");
        String skills = intent.getStringExtra("Skills");



        TextView txtData = findViewById(R.id.edtname);
        TextView edtemail = findViewById(R.id.edtemail2);
        TextView edtskills = findViewById(R.id.edtskill2);
        TextView edtdate = findViewById(R.id.edtdate2);
        TextView edtgender = findViewById(R.id.edtgender);
        ImageView imge = findViewById(R.id.imageView2);


        txtData.setText(name);
        edtemail.setText(email);
        edtskills.setText(skills);
        edtdate.setText(dateofbirth);
        edtgender.setText(Gender);

    }
}