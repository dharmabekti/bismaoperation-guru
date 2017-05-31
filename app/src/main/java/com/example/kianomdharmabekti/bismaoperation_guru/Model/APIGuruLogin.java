package com.example.kianomdharmabekti.bismaoperation_guru.Model;

import java.io.Serializable;

/**
 * Created by mery on 5/25/2017.
 */
public class APIGuruLogin implements Serializable {

    /**
     * status : true
     * status_code : 200
     * message : Login Berhasil
     * respon : {"id":1,"nama_depan":"Dharma","nama_belakang":"Bekti","tempat_lahir":"Puworejo","alamat":"Jalan Janti 65 Banguntapan, Bantul, DIY","telepon":"0857430811","kelamin":"Pria","tanggal_lahir":"1996-06-16","status":"On","email":"dharmabekti@gmail.com","longitude":null,"latitude":null,"harga":"70000","billing":"140000","riwayat_pendidikan":"SMA","mata_pelajaran":"Matematika SD, Matematika SMP, Matematika SMA","username":"dharma","profil":"http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg"}
     */

    private boolean status;
    private int status_code;
    private String message;
    private ResponBean respon;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponBean getRespon() {
        return respon;
    }

    public void setRespon(ResponBean respon) {
        this.respon = respon;
    }

    public static class ResponBean {
        /**
         * id : 1
         * nama_depan : Dharma
         * nama_belakang : Bekti
         * tempat_lahir : Puworejo
         * alamat : Jalan Janti 65 Banguntapan, Bantul, DIY
         * telepon : 0857430811
         * kelamin : Pria
         * tanggal_lahir : 1996-06-16
         * status : On
         * email : dharmabekti@gmail.com
         * longitude : null
         * latitude : null
         * harga : 70000
         * billing : 140000
         * riwayat_pendidikan : SMA
         * mata_pelajaran : Matematika SD, Matematika SMP, Matematika SMA
         * username : dharma
         * profil : http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg
         */

        private int id;
        private String nama_depan;
        private String nama_belakang;
        private String tempat_lahir;
        private String alamat;
        private String telepon;
        private String kelamin;
        private String tanggal_lahir;
        private String status;
        private String email;
        private Object longitude;
        private Object latitude;
        private String harga;
        private String billing;
        private String riwayat_pendidikan;
        private String mata_pelajaran;
        private String username;
        private String profil;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNama_depan() {
            return nama_depan;
        }

        public void setNama_depan(String nama_depan) {
            this.nama_depan = nama_depan;
        }

        public String getNama_belakang() {
            return nama_belakang;
        }

        public void setNama_belakang(String nama_belakang) {
            this.nama_belakang = nama_belakang;
        }

        public String getTempat_lahir() {
            return tempat_lahir;
        }

        public void setTempat_lahir(String tempat_lahir) {
            this.tempat_lahir = tempat_lahir;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getTelepon() {
            return telepon;
        }

        public void setTelepon(String telepon) {
            this.telepon = telepon;
        }

        public String getKelamin() {
            return kelamin;
        }

        public void setKelamin(String kelamin) {
            this.kelamin = kelamin;
        }

        public String getTanggal_lahir() {
            return tanggal_lahir;
        }

        public void setTanggal_lahir(String tanggal_lahir) {
            this.tanggal_lahir = tanggal_lahir;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public String getHarga() {
            return harga;
        }

        public void setHarga(String harga) {
            this.harga = harga;
        }

        public String getBilling() {
            return billing;
        }

        public void setBilling(String billing) {
            this.billing = billing;
        }

        public String getRiwayat_pendidikan() {
            return riwayat_pendidikan;
        }

        public void setRiwayat_pendidikan(String riwayat_pendidikan) {
            this.riwayat_pendidikan = riwayat_pendidikan;
        }

        public String getMata_pelajaran() {
            return mata_pelajaran;
        }

        public void setMata_pelajaran(String mata_pelajaran) {
            this.mata_pelajaran = mata_pelajaran;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getProfil() {
            return profil;
        }

        public void setProfil(String profil) {
            this.profil = profil;
        }
    }
}
