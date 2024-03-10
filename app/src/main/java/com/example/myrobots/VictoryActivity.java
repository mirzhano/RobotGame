package com.example.myrobots;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VictoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tvVictories = findViewById(R.id.tv_victories);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int robot1Victories = extras.getInt("robot1_victories");
            int robot2Victories = extras.getInt("robot2_victories");

            String victoryMessage = "Победы робота 1: " + robot1Victories + "\n" +
                    "Победы робота 2: " + robot2Victories;
            tvVictories.setText(victoryMessage);
        }
    }
}
