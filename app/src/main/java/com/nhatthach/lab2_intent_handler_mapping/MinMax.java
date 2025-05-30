package com.nhatthach.lab2_intent_handler_mapping;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MinMax extends AppCompatActivity {

    EditText edNumberA, edNumberB, edNumberC;
    TextView tvResult;
    Button btnFindMin, btnFindMax, btnFindMinMax;
    Button btnBackToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_max);


        edNumberA = findViewById(R.id.edNumberA);
        edNumberB = findViewById(R.id.edNumberB);
        edNumberC = findViewById(R.id.edNumberC);
        tvResult = findViewById(R.id.tvResult);
        btnFindMin = findViewById(R.id.btnFindMin);
        btnFindMax = findViewById(R.id.btnFindMax);
        btnFindMinMax = findViewById(R.id.btnFindMinMax);
        btnBackToMain = findViewById(R.id.btnBackToMain);

        // Find Min
        btnFindMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = edNumberA.getText().toString();
                String strB = edNumberB.getText().toString();
                String strC = edNumberC.getText().toString();
                if (strA.isEmpty() || strB.isEmpty() || strC.isEmpty()) {
                    tvResult.setText("Result: Please enter all numbers");
                    return;
                }
                try {
                    int a = Integer.parseInt(strA);
                    int b = Integer.parseInt(strB);
                    int c = Integer.parseInt(strC);
                    int min = Math.min(a, Math.min(b, c));
                    tvResult.setText("Result: Min = " + min);
                } catch (NumberFormatException e) {
                    tvResult.setText("Result: Invalid input");
                }
            }
        });

        // Find Max
        btnFindMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = edNumberA.getText().toString();
                String strB = edNumberB.getText().toString();
                String strC = edNumberC.getText().toString();
                if (strA.isEmpty() || strB.isEmpty() || strC.isEmpty()) {
                    tvResult.setText("Result: Please enter all numbers");
                    return;
                }
                try {
                    int a = Integer.parseInt(strA);
                    int b = Integer.parseInt(strB);
                    int c = Integer.parseInt(strC);
                    int max = Math.max(a, Math.max(b, c));
                    tvResult.setText("Result: Max = " + max);
                } catch (NumberFormatException e) {
                    tvResult.setText("Result: Invalid input");
                }
            }
        });

        // Find Min Max
        btnFindMinMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = edNumberA.getText().toString();
                String strB = edNumberB.getText().toString();
                String strC = edNumberC.getText().toString();
                if (strA.isEmpty() || strB.isEmpty() || strC.isEmpty()) {
                    tvResult.setText("Result: Please enter all numbers");
                    return;
                }
                try {
                    int a = Integer.parseInt(strA);
                    int b = Integer.parseInt(strB);
                    int c = Integer.parseInt(strC);
                    int min = Math.min(a, Math.min(b, c));
                    int max = Math.max(a, Math.max(b, c));
                    tvResult.setText("Result: Min = " + min + ", Max = " + max);
                } catch (NumberFormatException e) {
                    tvResult.setText("Result: Invalid input");
                }
            }
        });

        // Back to Main
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}