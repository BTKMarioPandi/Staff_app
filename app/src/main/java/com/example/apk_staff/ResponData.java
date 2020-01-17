package com.example.apk_staff;

import java.util.List;

class ResponData {
    String kode,pesan,respon;

    List<DataKaryawan> result;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
    }

    public List<DataKaryawan> getResult() {
        return result;
    }

    public void setResult(List<DataKaryawan> result) {
        this.result = result;
    }
}
