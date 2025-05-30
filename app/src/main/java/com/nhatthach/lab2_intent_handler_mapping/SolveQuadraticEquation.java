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

public class SolveQuadraticEquation extends AppCompatActivity {

    EditText edA, edB, edC;
    Button btnSolve, btnBackToMain;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_quadratic_equation);

        edA = findViewById(R.id.edA);
        edB = findViewById(R.id.edB);
        edC = findViewById(R.id.edC);
        btnSolve = findViewById(R.id.btnSolve);
        btnBackToMain = findViewById(R.id.btnBackToMain);
        tvResult = findViewById(R.id.tvResult);

        btnSolve.setOnClickListener(v -> {
            String strA = edA.getText().toString().trim();
            String strB = edB.getText().toString().trim();
            String strC = edC.getText().toString().trim();

            if (strA.isEmpty() || strB.isEmpty() || strC.isEmpty()) {
                tvResult.setText("Vui lòng nhập đầy đủ các hệ số");
                return;
            }

            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            double c = Double.parseDouble(strC);

            if (a == 0) {
                if (b == 0) {
                    tvResult.setText(c == 0 ? "Vô số nghiệm." : "Vô nghiệm.");
                } else {
                    double x = -c / b;
                    tvResult.setText("Phương trình bậc nhất, x = " + x);
                }
                return;
            }

            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                tvResult.setText("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                tvResult.setText("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                tvResult.setText("Phương trình có hai nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2);
            }
        });

        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}