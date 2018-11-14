package com.example.Kei2.tallerlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Mensaje.class);
        EditText editText = (EditText) findViewById(R.id.user);
        EditText editText2 = (EditText) findViewById(R.id.password);
        EditText editText3 = (EditText) findViewById(R.id.codigo);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message +" "+ message2+" "+ message3);
        startActivity(intent);
    }

}
