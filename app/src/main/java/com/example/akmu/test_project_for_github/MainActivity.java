package com.example.akmu.test_project_for_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button send1,send2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send1=(Button)findViewById(R.id.button);
        send2=(Button)findViewById(R.id.button2);

        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"this is send1 ",Toast.LENGTH_LONG).show();
            }
        });

        send2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"this is send 2 ",Toast.LENGTH_LONG).show();
            }
        });
    }
}
