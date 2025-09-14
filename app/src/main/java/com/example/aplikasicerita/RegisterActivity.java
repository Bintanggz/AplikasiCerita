package com.example.aplikasicerita;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameField, passwordField;
    Button daftarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameField = findViewById(R.id.usernameRegister);
        passwordField = findViewById(R.id.passwordRegister);
        daftarButton = findViewById(R.id.btnDaftar);

        daftarButton.setOnClickListener(v -> {
            String username = usernameField.getText().toString();
            String password = passwordField.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Lengkapi semua field", Toast.LENGTH_SHORT).show();
            } else {
                // Simulasi simpan akun (nanti bisa disimpan ke SharedPreferences atau Firebase)
                Toast.makeText(this, "Akun berhasil dibuat!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, login.class));
                finish();
            }
        });
    }
}
