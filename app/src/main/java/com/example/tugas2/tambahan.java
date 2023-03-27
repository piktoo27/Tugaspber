package com.example.tugas2;

public class tambahan {

    String name;
    String instagram;

    String pesan;

    int image;

    public tambahan(String name, String instagram, String pesan, int image) {
        this.name = name;
        this.instagram = instagram;
        this.pesan = pesan;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

