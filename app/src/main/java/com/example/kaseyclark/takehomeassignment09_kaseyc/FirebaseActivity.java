package com.example.kaseyclark.takehomeassignment09_kaseyc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.Date;

public class FirebaseActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference treeRef =database.getReference("tree");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        TextView textView =(TextView)findViewById(R.id.dateText);
        Date date = new Date();
        textView.setText(date.toString());
    }
    public void set (View view) {
        treeRef.setValue(new Tree("oak", true, 20));
    }

}

