package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String about = new String("Appen är uttänkt för en målgrupp som befinner sig i skolåldern, allt mellan 8-12 år. Appens syfte ör att lära barn fakta om de största städerna, såsom geografisk plats, folkmängd med mera.");
        Toast.makeText(getApplicationContext(),about, Toast.LENGTH_SHORT).show();

        button = (Button) findViewById(R.id.button_about);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}