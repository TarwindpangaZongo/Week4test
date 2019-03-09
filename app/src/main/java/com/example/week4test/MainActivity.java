package com.example.week4test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

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

        char[] in  = toEncode.toCharArray();
        int [] asciiIn = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            asciiIn[i] = (int)in[i];
        }
        asciiIn = reversNum(asciiIn);

        for (int i = 0; i < toEncode.length(); i++) {

            if  (asciiIn[i] == 65 || asciiIn[i] == 97)      asciiIn[i] = 49;
            else if(asciiIn[i] == 69 || asciiIn[i] == 101)  asciiIn[i] = 50;
            else if (asciiIn[i] == 73 || asciiIn[i] == 105) asciiIn[i] = 51;
            else if (asciiIn[i] == 79 || asciiIn[i] == 111) asciiIn[i] = 52;
            else if (asciiIn[i] == 85 || asciiIn[i] == 117) asciiIn[i] = 23;
            else if (asciiIn[i] == 89 || asciiIn[i] == 121) asciiIn[i] = 32;
            else if (asciiIn[i] == 32 ) asciiIn[i]                     = 121;
            else if (asciiIn[i] > 64 && asciiIn[i] < 91  )   asciiIn[i] = asciiIn[i] -= 1;
            else if (asciiIn[i] > 96 && asciiIn[i] < 123  )  asciiIn[i] = asciiIn[i] -= 1;

        }

        in = convertToChar(asciiIn);
        return new String(in);
    }



    private int[] reversNum(int[] asciiIn) {
        int numbers = 0;
        for (int i = 0; i < asciiIn.length; i++) {
            System.out.println("i is "+i);
            if (asciiIn[i] < 48 || asciiIn[i] > 57 && numbers > 0  && i <= asciiIn.length -1 ){
                for (int j = i-numbers,k = i-1 ; j < k ; j++, k--) {
                    System.out.println("k "+ k + " j "+j+" i "+i);
                    int temp = asciiIn[j];
                    asciiIn[j] = asciiIn[k];
                    asciiIn[k] = temp;

                }
                numbers = 0;
            }
            else if (asciiIn[i] > 47 && asciiIn[i] < 58  ) {
                numbers++;
            }

        }
        char [] o = convertToChar(asciiIn);
        String p = new String(o);
        System.out.println(p);
        return asciiIn;
    }

    private char[] convertToChar(int[] asciiIn) {
        char[]toReturn = new char[asciiIn.length];
        for(int i = 0; i < asciiIn.length;i++) {
            toReturn[i] = (char) asciiIn[i];
        }
        return toReturn;
    }
}
