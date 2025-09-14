package com.example.aplikasicerita;

public class cerita {
    private String judul;
    private String deskripsi;

    public cerita(String judul, String deskripsi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
