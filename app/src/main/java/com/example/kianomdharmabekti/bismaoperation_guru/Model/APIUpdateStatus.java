package com.example.kianomdharmabekti.bismaoperation_guru.Model;

import java.io.Serializable;

/**
 * Created by Ki Anom Dharma Bekti on 5/29/2017.
 */
public class APIUpdateStatus implements Serializable {

    /**
     * status : true
     * status_code : 200
     * message : Status Pengajar Berhasil Diubah
     * respon : {"id":1,"id_pengajar":"20170525192735","nama_depan":"Dharma","nama_belakang":"Bekti","alamat":"Jalan Janti 65 Banguntapan, Bantul, DIY","telepon":"0857430811","kelamin":"Pria","tempat_lahir":"Puworejo","tanggal_lahir":"1996-06-16","profil":"http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg","status":"On","email":"dharmabekti@gmail.com","username":"dharma","password":"$2y$10$iHi9AA1lSStqKeYmCKRyqukJf/G9DGPGHZBKr9L.FWaiFyDv5RDYe","longitude":null,"latitude":null,"harga":"70000","billing":"140000","riwayat_pendidikan":"SMA","mata_pelajaran":"Matematika SD, Matematika SMP, Matematika SMA","created_at":"2017-05-25 12:27:36","updated_at":"2017-05-29 16:19:34"}
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
         * id_pengajar : 20170525192735
         * nama_depan : Dharma
         * nama_belakang : Bekti
         * alamat : Jalan Janti 65 Banguntapan, Bantul, DIY
         * telepon : 0857430811
         * kelamin : Pria
         * tempat_lahir : Puworejo
         * tanggal_lahir : 1996-06-16
         * profil : http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg
         * status : On
         * email : dharmabekti@gmail.com
         * username : dharma
         * password : $2y$10$iHi9AA1lSStqKeYmCKRyqukJf/G9DGPGHZBKr9L.FWaiFyDv5RDYe
         * longitude : null
         * latitude : null
         * harga : 70000
         * billing : 140000
         * riwayat_pendidikan : SMA
         * mata_pelajaran : Matematika SD, Matematika SMP, Matematika SMA
         * created_at : 2017-05-25 12:27:36
         * updated_at : 2017-05-29 16:19:34
         */

        private int id;
        private String id_pengajar;
        private String nama_depan;
        private String nama_belakang;
        private String alamat;
        private String telepon;
        private String kelamin;
        private String tempat_lahir;
        private String tanggal_lahir;
        private String profil;
        private String status;
        private String email;
        private String username;
        private String password;
        private Object longitude;
        private Object latitude;
        private String harga;
        private String billing;
        private String riwayat_pendidikan;
        private String mata_pelajaran;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getId_pengajar() {
            return id_pengajar;
        }

        public void setId_pengajar(String id_pengajar) {
            this.id_pengajar = id_pengajar;
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

        public String getTempat_lahir() {
            return tempat_lahir;
        }

        public void setTempat_lahir(String tempat_lahir) {
            this.tempat_lahir = tempat_lahir;
        }

        public String getTanggal_lahir() {
            return tanggal_lahir;
        }

        public void setTanggal_lahir(String tanggal_lahir) {
            this.tanggal_lahir = tanggal_lahir;
        }

        public String getProfil() {
            return profil;
        }

        public void setProfil(String profil) {
            this.profil = profil;
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

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
