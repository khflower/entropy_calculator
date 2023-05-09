package com.example.myapplication1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Button op, btn,l,abc;
    EditText num1, num2;
    TextView res;
    private Button logg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op = findViewById(R.id.jh);
        l=findViewById(R.id.AT);
        abc=findViewById(R.id.SP);
        num1 = findViewById(R.id.war);
        num2 = findViewById(R.id.car);
        res = findViewById(R.id.home);
        btn = findViewById(R.id.RASCAL);
        logg = findViewById(R.id.loggg);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, result;

                if(num1.getText().toString().contains("/")){
                    String[] fraction = num1.getText().toString().split("/");
                    n1 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n1 = Double.parseDouble(num1.getText().toString());
                }
                if(num2.getText().toString().contains("/")){
                    String[] fraction = num2.getText().toString().split("/");
                    n2 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n2 = Double.parseDouble(num2.getText().toString());
                }

                result = Math.abs((n1/n2)*(Math.log10(n2/n1)/Math.log10(2))+((n2-n1)/n2)*(Math.log10(n2/(n2-n1))/Math.log10(2)) );
                res.setText(String.valueOf(result));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, result;
                if(num1.getText().toString().contains("/")){
                    String[] fraction = num1.getText().toString().split("/");
                    n1 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n1 = Double.parseDouble(num1.getText().toString());
                }
                if(num2.getText().toString().contains("/")){
                    String[] fraction = num2.getText().toString().split("/");
                    n2 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n2 = Double.parseDouble(num2.getText().toString());
                }
                result = Math.abs(1-(Math.pow(n1/n2,2))-(Math.pow((n2-n1)/n2,2)));
                res.setText(String.valueOf(result));
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, result;
                if(num1.getText().toString().contains("/")){
                    String[] fraction = num1.getText().toString().split("/");
                    n1 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n1 = Double.parseDouble(num1.getText().toString());
                }
                if(num2.getText().toString().contains("/")){
                    String[] fraction = num2.getText().toString().split("/");
                    n2 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n2 = Double.parseDouble(num2.getText().toString());
                }


                result = Math.abs(n1 * n2);
                res.setText(String.valueOf(result));
            }
        });

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, result;
                if(num1.getText().toString().contains("/")){
                    String[] fraction = num1.getText().toString().split("/");
                    n1 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n1 = Double.parseDouble(num1.getText().toString());
                }
                if(num2.getText().toString().contains("/")){
                    String[] fraction = num2.getText().toString().split("/");
                    n2 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n2 = Double.parseDouble(num2.getText().toString());
                }
                result = Math.abs(n1*(Math.log10(n1)/Math.log10(2)));
                res.setText(String.valueOf(result));
            }
        });

        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, result;
                if(num1.getText().toString().contains("/")){
                    String[] fraction = num1.getText().toString().split("/");
                    n1 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n1 = Double.parseDouble(num1.getText().toString());
                }
                if(num2.getText().toString().contains("/")){
                    String[] fraction = num2.getText().toString().split("/");
                    n2 = Double.parseDouble(fraction[0])/Double.parseDouble(fraction[1]);
                }
                else {
                    n2 = Double.parseDouble(num2.getText().toString());
                }
                result = Math.abs(Math.log10(n1)/Math.log10(2));
                res.setText(String.valueOf(result));
            }
        });



    }
}