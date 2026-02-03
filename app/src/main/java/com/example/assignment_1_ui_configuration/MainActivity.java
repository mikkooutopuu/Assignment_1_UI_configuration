package com.example.assignment_1_ui_configuration;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String tag="EVH_Demo: ";

    private EditText firstName;
    private EditText lastName;
    private EditText phone;
    private EditText feedback;
    private Button sendButton;
    private Button resetButton;
    private long lastTime = System.currentTimeMillis();
    private void logTime(String eventName) {
        long currentTime = System.currentTimeMillis();
        long elapsed = currentTime - lastTime;
        Log.d(tag, tag + eventName + " - Time elapsed: " + elapsed + "ms");
        lastTime = currentTime;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()");
        logTime("onCreate()");

        initializeViews(); // UI initialisation

        sendButton.setOnClickListener(v -> submitFeedback()); // Listeners for sending and resetting
        resetButton.setOnClickListener(v -> resetForm());
    }
    protected void onStart() {
        super.onStart();
        Log.d(tag, tag + "onStart()");
        logTime("onStart()");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, tag + "onReStart()");
        logTime("onRestart()");
    }
    protected void onResume() {
        super.onResume();
        Log.d(tag, tag + "onResume()");
        logTime("onResume()");
    }
    protected void onPause() {
        super.onPause();
        Log.d(tag, tag + "onPause()");
        logTime("onPause()");
    }
    protected void onStop() {
        super.onStop();
        Log.d(tag, tag + "onStop()");
        logTime("onStop()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, tag + "onDestroy()");
        logTime("onDestroy()");
    }

    private void initializeViews() {
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        phone = findViewById(R.id.phone);
        feedback = findViewById(R.id.feedback);
        sendButton = findViewById(R.id.send_button);
        resetButton = findViewById(R.id.reset_button);
    }

    private void submitFeedback() {
        String userFirstName = firstName.getText().toString().trim();
        String userLastName = lastName.getText().toString().trim();
        String userPhone = phone.getText().toString().trim();
        String userFeedback = feedback.getText().toString().trim();

        Log.d(tag, "--------- FEEDBACK ---------");
        Log.d(tag, "Name: " + userFirstName + " " + userLastName);
        Log.d(tag, "Phone number: " + userPhone);
        Log.d(tag, "feedback: " + userFeedback);
        Log.d(tag, "---------------------------");

        Toast.makeText(this, "Thank you, " + userFirstName + "! Feedback deleted successfully.", Toast.LENGTH_LONG).show();

        finish();
    }

    private void resetForm() {
        firstName.setText("");
        lastName.setText("");
        phone.setText("");
        feedback.setText("");

    }
}