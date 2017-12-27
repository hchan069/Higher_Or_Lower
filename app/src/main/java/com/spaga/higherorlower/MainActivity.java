package com.spaga.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int ans;

    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessFunc(View view) {

        EditText guessNumEditText = findViewById(R.id.guessNumEditText);
        int guessNum = Integer.parseInt(guessNumEditText.getText().toString());

        if (guessNum < ans)
            makeToast("Number is larger.");
        else if (guessNum > ans)
            makeToast("Number is smaller.");
        else {
            makeToast("You guessed it. Try again!");
            Random rand = new Random();
            ans = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        ans = rand.nextInt(20) + 1;
    }
}
