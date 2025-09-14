package com.example.aplikasicerita;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CeritaAdapter extends RecyclerView.Adapter<CeritaAdapter.CeritaViewHolder> {

    private Context context; // Tambah context
    private List<cerita> listCerita;

    // Constructor dengan context
    public CeritaAdapter(Context context, List<cerita> listCerita) {
        this.context = context;
        this.listCerita = listCerita;
    }

    public static class CeritaViewHolder extends RecyclerView.ViewHolder {
        public TextView judulCerita;
        public TextView deskripsiCerita;

        public CeritaViewHolder(View itemView) {
            super(itemView);
            judulCerita = itemView.findViewById(R.id.judulCerita);
            deskripsiCerita = itemView.findViewById(R.id.deskripsiCerita);
        }
    }

    @Override
    public CeritaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cerita, parent, false);
        return new CeritaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CeritaViewHolder holder, int position) {
        cerita cerita = listCerita.get(position);
        holder.judulCerita.setText(cerita.getJudul());
        holder.deskripsiCerita.setText(cerita.getDeskripsi());

        // Tambahkan onClickListener di sini
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("judul", cerita.getJudul());
            intent.putExtra("deskripsi", cerita.getDeskripsi());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listCerita.size();
    }
}
