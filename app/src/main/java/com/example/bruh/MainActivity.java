package com.example.bruh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loginbutt = (TextView)findViewById(R.id.loginbutt);
        final EditText name = findViewById(R.id.PersonName);
        final EditText pass = findViewById((R.id.Password));
        loginbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String userpass = pass.getText().toString();
                Intent intent1 = new Intent(MainActivity.this,SecActivity.class);
                intent1.putExtra("Keyname",username);
                ActivityOptionsCompat compat=ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.loginbutt),
                "trans1");
                startActivity(intent1,compat.toBundle());

            }
        });
    }
}