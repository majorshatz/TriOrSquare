package com.theshatz.triorsquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TriOrSquare extends AppCompatActivity {

    class Number{
        int number;
        public boolean isTriangular(){
            int x=1;
            int triangularNumber=1;
            while (triangularNumber< number){
                x++;
                triangularNumber=triangularNumber+x;

            }
            if(triangularNumber==number){
                return true;
            }
            else {return false;}

        }
        public boolean isSquare(){
            double squareRoot=Math.sqrt(number);

            if(squareRoot==Math.floor(squareRoot)){
                return true;
            }
            else return false;
        }
    }

    public void testNumber(View view) {
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);
        String message = "";
        if (usersNumber.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(usersNumber.getText().toString());


            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + " is both triangular and square";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                } else {
                    message = myNumber.number + " is  Square but not triangular";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                }
            } else {
                if (myNumber.isSquare()) {
                    message = myNumber.number + " is Square but not triangular";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                } else {
                    message = myNumber.number + " is  neither square or triangular";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                }
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_or_square);
    }
}
