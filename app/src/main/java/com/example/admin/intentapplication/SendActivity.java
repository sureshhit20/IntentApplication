package com.example.admin.intentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

    }

        /*public void onClickButton(View view){
        Intent intent = new Intent(this, ReceiveActivity.class);
            EditText message_view = (EditText) findViewById(R.id.message);
            String message_text = message_view.getText().toString();
            intent.putExtra(ReceiveActivity.EXTRA_MESSAGE, message_text);
        startActivity(intent);*/

    public void onClickButton(View view){

        EditText message_view = (EditText) findViewById(R.id.message);
        String message_text = message_view.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message_text);
        startActivity(intent);


    }

}
