    package com.example.aplikasicerita;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;
    import androidx.appcompat.app.AppCompatActivity;

    public class DetailActivity extends AppCompatActivity {

        TextView judulText, deskripsiText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            judulText = findViewById(R.id.judulDetail);
            deskripsiText = findViewById(R.id.deskripsiDetail);
            Button btnKembali = findViewById(R.id.btnKembali);
            btnKembali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish(); // kembali ke list
                }
            });


            String judul = getIntent().getStringExtra("judul");
            String deskripsi = getIntent().getStringExtra("deskripsi");

            judulText.setText(judul);
            deskripsiText.setText(deskripsi);
        }
    }
