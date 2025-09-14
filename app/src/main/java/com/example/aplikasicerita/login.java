package com.example.aplikasicerita;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText username, password;
    Button btnlogin;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.editekuser);
        password = findViewById(R.id.editekpassword);
        btnlogin = findViewById(R.id.tombollogin);
        registerLink = findViewById(R.id.registerLink);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keynama = username.getText().toString();
                String keypass = password.getText().toString();

                if (keynama.equals("admin") && keypass.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "LOGIN BERHASIL", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(login.this, MainActivity.class));
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                    builder.setMessage("Username atau password salah")
                            .setNegativeButton("Ulangi", null)
                            .create()
                            .show();

                    username.setText("");
                    password.setText("");
                }
            }
        });

        // Simulasi tombol register
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, RegisterActivity.class));
            }
        });
    }
}
