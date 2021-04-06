package com.israa.multeativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtData;
    private ImageView imgview;
    private Spinner spinner;
    private  EditText edtEmail;
    private  EditText editTextDate;
    private CheckBox check_Female;
    private CheckBox check_Male;
    private ArrayList<String> Gender;
    private Switch on_off;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = findViewById(R.id.edtData);
        imgview = findViewById(R.id.imageView3);
        edtEmail = findViewById(R.id.edtEmail);
        check_Male = findViewById(R.id.check_Male);
        editTextDate = findViewById(R.id.editTextDate);
        spinner = findViewById(R.id.spnLanguages);
        check_Female = findViewById(R.id.check_Female);
        Gender = new ArrayList<>();
        populateSpinner();

        check_Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_Female.isChecked()) {
                    Gender.add("Female");
                    Gender.remove("Male");
                }else
                    Gender.remove("Female");
            }
        });
        check_Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_Male.isChecked()) {
                    Gender.add("Male");
                    Gender.remove("Female");

                }else
                    Gender.remove("Male");
            }
        });
    }


    private void populateSpinner() {
        ArrayList<String> data =new ArrayList<>();
        data.add("Computer Expert");
        data.add("Good in English");
        data.add("Quick to Understand");
        data.add("Chef");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,data);
        spinner .setAdapter(adapter);
    }

    public void btnSend_onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String name = edtData.getText().toString();
        String email = edtEmail.getText().toString();
        String dateofbirth = editTextDate.getText().toString();
        StringBuilder  stringBuilder = new StringBuilder();
        for (String s :Gender)
        stringBuilder.append(s).toString();
        String genderf = check_Female.getText().toString();
        String spin = spinner.getSelectedItem().toString();
        intent.putExtra("NAME", name);
        intent.putExtra("EMAIL" ,email);
        intent.putExtra("DATA" ,dateofbirth);
        intent.putExtra("GENDER" ,genderf);
        intent.putExtra("Skills",spin);


        startActivity(intent);

    }


}