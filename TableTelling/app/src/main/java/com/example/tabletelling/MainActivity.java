package com.example.tabletelling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.id.editText);
        button = findViewById(R.id.button);
        result=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer Buffer= new StringBuffer();
                String a=editText.getText().toString();
                int n= Integer.parseInt(a);
                for(int i=1;i<=10;i++){
                    ans=(i*n);
                    Buffer.append(n+"X"+i+"="+ans+"\n\n");
                }
                result.setText(Buffer);
                editText.setText("");
            }
        });
    }
}