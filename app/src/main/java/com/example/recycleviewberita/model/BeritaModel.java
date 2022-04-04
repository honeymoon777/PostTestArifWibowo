package com.example.recycleviewberita.model;


public class BeritaModel {
    private String judul;
    private String kategori;
    private String images;

    public BeritaModel() {
    }

    public BeritaModel(String judul, String kategori, String images) {
        this.judul = judul;
        this.kategori = kategori;
        this.images = images;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
