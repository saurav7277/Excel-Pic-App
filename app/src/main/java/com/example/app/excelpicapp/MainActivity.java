package com.example.app.excelpicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    Button selectexcel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        selectexcel=(Button)findViewById(R.id.select_excel_button);
    }

    public void selectExcelFile(View view) {
        Intent i=new Intent(this,FilePath.class);
        startActivity(i);
    }
}
