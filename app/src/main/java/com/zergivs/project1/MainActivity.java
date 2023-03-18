package com.zergivs.project1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inchesInput;
    private TextView centimetersOutput;

    public MainActivity(Button convertButton) {
    }

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inchesInput = findViewById(R.id.textInputEditText);
        centimetersOutput = findViewById(R.id.textView);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button convertButton = findViewById(R.id.buttonConvert);

        convertButton.setOnClickListener(v -> {
            String inchesString = inchesInput.getText().toString();
            if (!inchesString.isEmpty()) {
                double inches = Double.parseDouble(inchesString);
                double centimeters = inches * 2.54;
                centimetersOutput.setText(String.format("%.2f cm", centimeters));
            }
        });
    }
}