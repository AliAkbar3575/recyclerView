package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

public class userInputActivity extends AppCompatActivity {

    private TextInputEditText editText1, editText2;
    private Button saveButton, showButton;

    String name;
    int age;

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        saveButton = findViewById(R.id.buttonId1);
        showButton = findViewById(R.id.buttonId2);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = editText1.getText().toString().trim();
                age = Integer.parseInt(editText2.getText().toString().trim());

                names.add(name);
                ages.add(age);

                Log.wtf("size", "" + names.size());

                editText1.setText("");
                editText2.setText("");

            }
        });


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(userInputActivity.this, recyclerView_Activity.class);
                intent.putExtra("key1", names);
                intent.putExtra("key2", ages);
                startActivity(intent);

            }
        });
    }
}
