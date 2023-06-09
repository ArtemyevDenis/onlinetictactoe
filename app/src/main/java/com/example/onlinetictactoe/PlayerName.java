package com.example.onlinetictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        final EditText playerNameEt = findViewById(R.id.playerNameEt);
        final AppCompatButton startGameBtn = findViewById(R.id.startGameBtn);

        startGameBtn.setOnClickListener(v -> {

            final String getPlayerName = playerNameEt.getText().toString();

            if (getPlayerName.isEmpty()){
                Toast.makeText(PlayerName.this,"Please enter player name!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent  = new Intent(PlayerName.this, MainActivity.class);
                intent.putExtra("playerName",getPlayerName);
                startActivity(intent);
                finish();
            }
        });
    }
}