package com.example.aplikasicerita;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<cerita> ceritaList;
    CeritaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ceritaList = new ArrayList<>();
        ceritaList.add(new cerita("Kisah Si Kancil", "Seekor kancil cerdik menipu buaya untuk menyelamatkan diri Pada suatu hari di hutan, kancil yang lapar ingin menyeberangi sungai penuh buaya. Dengan kecerdikannya, kancil berpura-pura menghitung jumlah buaya untuk pesta raja hutan. Buaya percaya dan berbaris di sungai. Kancil meloncat di atas punggung mereka hingga sampa"));
        ceritaList.add(new cerita("Legenda Danau Toba", "Dikisahkan seorang pemuda bernama Toba menikahi seorang wanita cantik dari alam gaib dengan syarat tidak boleh membocorkan asal usul istrinya. Mereka punya anak bernama Samosir. Suatu hari, sang anak membuat kesalahan dan Toba memarahinya dengan menyebut 'anak ikan'. Sumpah pun pecah, sang istri kembali ke asalnya, dan air bah menenggelamkan desa. Tempat itu menjadi Danau Toba dan Pulau Samosir."));
        ceritaList.add(new cerita("Malin Kundang", "Seorang anak yang durhaka kepada ibunya..."));

        adapter = new CeritaAdapter(this, ceritaList);
        recyclerView.setAdapter(adapter);
    }
}
