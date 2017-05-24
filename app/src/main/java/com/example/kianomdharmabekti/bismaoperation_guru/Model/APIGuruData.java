package com.example.kianomdharmabekti.bismaoperation_guru.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ki Anom Dharma Bekti on 5/24/2017.
 */
public class APIGuruData implements Serializable {

    /**
     * status : true
     * status_code : 200
     * message : Data Ditemukan
     * respon : {"total":5,"per_page":10,"current_page":1,"last_page":1,"next_page_url":null,"prev_page_url":null,"from":1,"to":5,"data":[{"id":20,"id_pengajar":"20170522184603","nama_depan":"Francisca","nama_belakang":"Noventa","alamat":"Desa Jrakah, Bayan, Purworejo","telepon":"082134306001","kelamin":"Wanita","tempat_lahir":"Palembang","tanggal_lahir":"1999-03-29","profil":"http://api.bismaoperation.id/public/image/pengajar/13606974_1656362658018980_4059039883996572665_n.jpg","status":"On","email":"francisca29031999@gmail.com","username":"venta","password":"$2y$10$CHJZeZ.QY7t8aUUkgKRjOedAcXhPSATFARrAQJguw9/wS6y4g/rWO","longitude":null,"latitude":null,"harga":"70000","billing":"210000","riwayat_pendidikan":null,"mata_pelajaran":"Bahasa Jawa SD SMP SMA","created_at":"2017-05-22 18:46:03","updated_at":"2017-05-22 23:15:38"},{"id":19,"id_pengajar":"20170522184336","nama_depan":"Agus","nama_belakang":"Muchamad","alamat":"Desa Jrakah, Bayan, Purworejo","telepon":"085743081166","kelamin":"Wanita","tempat_lahir":"Kendal","tanggal_lahir":"1999-05-25","profil":"http://api.bismaoperation.id/public/image/pengajar/IMG_4046.JPG","status":"On","email":"agus@gmail.com","username":"agus","password":"$2y$10$1cPOzLDyFjfPlglIKO/gw.CchHekOM/e2xInHZgFehb0.mfWeK3rW","longitude":null,"latitude":null,"harga":"70000","billing":"0","riwayat_pendidikan":null,"mata_pelajaran":"Matematika SMP","created_at":"2017-05-22 18:43:36","updated_at":"2017-05-22 18:43:36"},{"id":18,"id_pengajar":"20170522184226","nama_depan":"Supriyanto","nama_belakang":"Bahagia","alamat":"Jl Babarsari 18","telepon":"0878378631101","kelamin":"Pria","tempat_lahir":"Gombong Kebumen Jawa Tengah","tanggal_lahir":"0000-00-00","profil":"http://www.api.bismaoperation.id/public/image/pengajar/user.png","status":"On","email":"ryan2009321bs@gmail.com","username":"subagio321","password":"$2y$10$X9iLpgappkvH16tb.KZBNO3hIQHqZTsCIOvGtW6Dm4/hyepyquOMC","longitude":null,"latitude":null,"harga":"100000","billing":"0","riwayat_pendidikan":"S1 Pendidikan Guru","mata_pelajaran":"IPS SMA SMP","created_at":"2017-05-22 18:42:26","updated_at":"2017-05-22 18:42:26"},{"id":5,"id_pengajar":"20170521211412","nama_depan":"Dharma","nama_belakang":"Bekti","alamat":"Jrakah","telepon":"085740126916","kelamin":"Pria","tempat_lahir":"Purworejo","tanggal_lahir":"1996-06-16","profil":"http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg","status":"On","email":"dharmabekti@gmail.com","username":"dharma","password":"$2y$10$gPF95Ur1NFHkG/wDoSuA4e2FMtRBwYxaoHZImitNOlWYOUnI7YTOa","longitude":null,"latitude":null,"harga":"50000","billing":"0","riwayat_pendidikan":"SMA","mata_pelajaran":"Matematika SD, Matematika SMP, Matematika SMA","created_at":"2017-05-21 14:14:12","updated_at":"2017-05-23 02:45:30"},{"id":1,"id_pengajar":"20170519173939","nama_depan":"Subagio","nama_belakang":"Bahagia","alamat":"Jl Babarsari 18","telepon":"087837863110","kelamin":"Pria","tempat_lahir":"Gombong Kebumen Jawa Tengah","tanggal_lahir":"1996-10-08","profil":"http://www.bisma.bluecrawler.com/public/image/pengajar/17475406_120300002722112740_141495971_o.jpg","status":"On","email":"ryan2009bs@gmail.com","username":"subagio","password":"$2y$10$VJYzSvpuyrgsULHai5yxN.ofvQyq9mjZHo9BrJem2bKfDeixcbxlG","longitude":"-3234456","latitude":"-2342342","harga":"100000","billing":"800000","riwayat_pendidikan":"S1","mata_pelajaran":"Matematika","created_at":"2017-05-19 17:39:39","updated_at":"2017-05-22 06:57:35"}]}
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
         * total : 5
         * per_page : 10
         * current_page : 1
         * last_page : 1
         * next_page_url : null
         * prev_page_url : null
         * from : 1
         * to : 5
         * data : [{"id":20,"id_pengajar":"20170522184603","nama_depan":"Francisca","nama_belakang":"Noventa","alamat":"Desa Jrakah, Bayan, Purworejo","telepon":"082134306001","kelamin":"Wanita","tempat_lahir":"Palembang","tanggal_lahir":"1999-03-29","profil":"http://api.bismaoperation.id/public/image/pengajar/13606974_1656362658018980_4059039883996572665_n.jpg","status":"On","email":"francisca29031999@gmail.com","username":"venta","password":"$2y$10$CHJZeZ.QY7t8aUUkgKRjOedAcXhPSATFARrAQJguw9/wS6y4g/rWO","longitude":null,"latitude":null,"harga":"70000","billing":"210000","riwayat_pendidikan":null,"mata_pelajaran":"Bahasa Jawa SD SMP SMA","created_at":"2017-05-22 18:46:03","updated_at":"2017-05-22 23:15:38"},{"id":19,"id_pengajar":"20170522184336","nama_depan":"Agus","nama_belakang":"Muchamad","alamat":"Desa Jrakah, Bayan, Purworejo","telepon":"085743081166","kelamin":"Wanita","tempat_lahir":"Kendal","tanggal_lahir":"1999-05-25","profil":"http://api.bismaoperation.id/public/image/pengajar/IMG_4046.JPG","status":"On","email":"agus@gmail.com","username":"agus","password":"$2y$10$1cPOzLDyFjfPlglIKO/gw.CchHekOM/e2xInHZgFehb0.mfWeK3rW","longitude":null,"latitude":null,"harga":"70000","billing":"0","riwayat_pendidikan":null,"mata_pelajaran":"Matematika SMP","created_at":"2017-05-22 18:43:36","updated_at":"2017-05-22 18:43:36"},{"id":18,"id_pengajar":"20170522184226","nama_depan":"Supriyanto","nama_belakang":"Bahagia","alamat":"Jl Babarsari 18","telepon":"0878378631101","kelamin":"Pria","tempat_lahir":"Gombong Kebumen Jawa Tengah","tanggal_lahir":"0000-00-00","profil":"http://www.api.bismaoperation.id/public/image/pengajar/user.png","status":"On","email":"ryan2009321bs@gmail.com","username":"subagio321","password":"$2y$10$X9iLpgappkvH16tb.KZBNO3hIQHqZTsCIOvGtW6Dm4/hyepyquOMC","longitude":null,"latitude":null,"harga":"100000","billing":"0","riwayat_pendidikan":"S1 Pendidikan Guru","mata_pelajaran":"IPS SMA SMP","created_at":"2017-05-22 18:42:26","updated_at":"2017-05-22 18:42:26"},{"id":5,"id_pengajar":"20170521211412","nama_depan":"Dharma","nama_belakang":"Bekti","alamat":"Jrakah","telepon":"085740126916","kelamin":"Pria","tempat_lahir":"Purworejo","tanggal_lahir":"1996-06-16","profil":"http://bismaoperation.id/uploads/Pengajar/Profil/Dharma_dharma.jpg","status":"On","email":"dharmabekti@gmail.com","username":"dharma","password":"$2y$10$gPF95Ur1NFHkG/wDoSuA4e2FMtRBwYxaoHZImitNOlWYOUnI7YTOa","longitude":null,"latitude":null,"harga":"50000","billing":"0","riwayat_pendidikan":"SMA","mata_pelajaran":"Matematika SD, Matematika SMP, Matematika SMA","created_at":"2017-05-21 14:14:12","updated_at":"2017-05-23 02:45:30"},{"id":1,"id_pengajar":"20170519173939","nama_depan":"Subagio","nama_belakang":"Bahagia","alamat":"Jl Babarsari 18","telepon":"087837863110","kelamin":"Pria","tempat_lahir":"Gombong Kebumen Jawa Tengah","tanggal_lahir":"1996-10-08","profil":"http://www.bisma.bluecrawler.com/public/image/pengajar/17475406_120300002722112740_141495971_o.jpg","status":"On","email":"ryan2009bs@gmail.com","username":"subagio","password":"$2y$10$VJYzSvpuyrgsULHai5yxN.ofvQyq9mjZHo9BrJem2bKfDeixcbxlG","longitude":"-3234456","latitude":"-2342342","harga":"100000","billing":"800000","riwayat_pendidikan":"S1","mata_pelajaran":"Matematika","created_at":"2017-05-19 17:39:39","updated_at":"2017-05-22 06:57:35"}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private Object next_page_url;
        private Object prev_page_url;
        private int from;
        private int to;
        private List<DataBean> data;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public Object getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(Object next_page_url) {
            this.next_page_url = next_page_url;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 20
             * id_pengajar : 20170522184603
             * nama_depan : Francisca
             * nama_belakang : Noventa
             * alamat : Desa Jrakah, Bayan, Purworejo
             * telepon : 082134306001
             * kelamin : Wanita
             * tempat_lahir : Palembang
             * tanggal_lahir : 1999-03-29
             * profil : http://api.bismaoperation.id/public/image/pengajar/13606974_1656362658018980_4059039883996572665_n.jpg
             * status : On
             * email : francisca29031999@gmail.com
             * username : venta
             * password : $2y$10$CHJZeZ.QY7t8aUUkgKRjOedAcXhPSATFARrAQJguw9/wS6y4g/rWO
             * longitude : null
             * latitude : null
             * harga : 70000
             * billing : 210000
             * riwayat_pendidikan : null
             * mata_pelajaran : Bahasa Jawa SD SMP SMA
             * created_at : 2017-05-22 18:46:03
             * updated_at : 2017-05-22 23:15:38
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
            private Object riwayat_pendidikan;
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

            public Object getRiwayat_pendidikan() {
                return riwayat_pendidikan;
            }

            public void setRiwayat_pendidikan(Object riwayat_pendidikan) {
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
}
