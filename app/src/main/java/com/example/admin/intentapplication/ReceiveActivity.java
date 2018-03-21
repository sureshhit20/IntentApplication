package com.example.admin.intentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "dummy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        Intent intent =getIntent();
        String text_from_send = intent.getStringExtra(EXTRA_MESSAGE);
        StringBuilder temp = new StringBuilder();
        temp.append("hello ").append(text_from_send);
        TextView text = (TextView) findViewById(R.id.message);
        text.setText(temp);
    }
}
