package com.example.week4test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static int[] control = {32,65,69,73,79,85,89,91,92,93,94,95,96,97,101,105,111,117,121};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String input = "felix is not home";
        String toEncode ="ad1234 bye can!";

        String out = reverString(input);
        String encoded = encodedString(toEncode);
    }

    private String reverString(String input) {
        char[] in = input.toCharArray();

        for (int i = 0,j=(input.length()-1); i < j;i++, j--) {
            char temp = in[i];
            in[i] = in[j];
            in[j] = temp;
        }
        return new String(in);
    }

    private String encodedString(String toEncode) {
        return toEncode;
    }
}
