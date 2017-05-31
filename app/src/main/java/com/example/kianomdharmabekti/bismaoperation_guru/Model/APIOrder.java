package com.example.kianomdharmabekti.bismaoperation_guru.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ryan Bagus Susilo on 5/31/2017.
 */
public class APIOrder implements Serializable {


    /**
     * status : true
     * status_code : 200
     * message : Data Ditemukan
     * respon : [{"id":52,"id_pengajar":[{"id":1,"nama_depan":"tintin","nama_belakang":"tintin","alamat":"jln TB 13 Yogyakarta","telepon":"087837863110","tempat_lahir":"Magelang","kelamin":"Wanita","tanggal_lahir":"1996-10-08","profil":"http://bismaapi.bismaoperation.id/public/image/murid/lgend of blue sea.PNG","status":null,"email":"tintin@gmail.com","username":"tintin","password":"$2y$10$sZOV5VoNbCbVJnZGVMt.0.D4tVHkwJ5eNPWfNo9EfF9jWsnVZvQCm","longitude":null,"latitude":null,"created_at":"2017-05-25 19:51:04","updated_at":"2017-05-25 19:51:04"}],"id_murid":"1","status":"Order","tanggal":null,"jam":null,"total_biaya":null,"created_at":"2017-05-31 06:48:51","updated_at":"2017-05-31 06:48:51"},{"id":56,"id_pengajar":[{"id":4,"nama_depan":"kaguya","nama_belakang":"kaguya","alamat":"jlnbabarsari","telepon":"087837863110","tempat_lahir":"gmbng","kelamin":"Pria","tanggal_lahir":"0000-00-00","profil":null,"status":null,"email":"ryan@gmail.com","username":"kaguya","password":"$2y$10$/myhnbD/i7M0qYkz7hGHgOzKOmK3EHYCZKa/2.YP/7jaJC0wlNLZ.","longitude":"","latitude":"","created_at":"2017-05-31 16:01:28","updated_at":"2017-05-31 16:01:28"}],"id_murid":"4","status":"Order","tanggal":null,"jam":null,"total_biaya":null,"created_at":"2017-05-31 16:01:56","updated_at":"2017-05-31 16:01:56"}]
     */

    private boolean status;
    private int status_code;
    private String message;
    private List<ResponBean> respon;

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

    public List<ResponBean> getRespon() {
        return respon;
    }

    public void setRespon(List<ResponBean> respon) {
        this.respon = respon;
    }

    public static class ResponBean {
        /**
         * id : 52
         * id_pengajar : [{"id":1,"nama_depan":"tintin","nama_belakang":"tintin","alamat":"jln TB 13 Yogyakarta","telepon":"087837863110","tempat_lahir":"Magelang","kelamin":"Wanita","tanggal_lahir":"1996-10-08","profil":"http://bismaapi.bismaoperation.id/public/image/murid/lgend of blue sea.PNG","status":null,"email":"tintin@gmail.com","username":"tintin","password":"$2y$10$sZOV5VoNbCbVJnZGVMt.0.D4tVHkwJ5eNPWfNo9EfF9jWsnVZvQCm","longitude":null,"latitude":null,"created_at":"2017-05-25 19:51:04","updated_at":"2017-05-25 19:51:04"}]
         * id_murid : 1
         * status : Order
         * tanggal : null
         * jam : null
         * total_biaya : null
         * created_at : 2017-05-31 06:48:51
         * updated_at : 2017-05-31 06:48:51
         */

        private int id;
        private String id_murid;
        private String status;
        private String tanggal;
        private String jam;
        private String total_biaya;
        private String created_at;
        private String updated_at;
        private List<IdPengajarBean> id_pengajar;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getId_murid() {
            return id_murid;
        }

        public void setId_murid(String id_murid) {
            this.id_murid = id_murid;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTanggal() {
            return tanggal;
        }

        public void setTanggal(String tanggal) {
            this.tanggal = tanggal;
        }

        public String getJam() {
            return jam;
        }

        public void setJam(String jam) {
            this.jam = jam;
        }

        public String getTotal_biaya() {
            return total_biaya;
        }

        public void setTotal_biaya(String total_biaya) {
            this.total_biaya = total_biaya;
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

        public List<IdPengajarBean> getId_pengajar() {
            return id_pengajar;
        }

        public void setId_pengajar(List<IdPengajarBean> id_pengajar) {
            this.id_pengajar = id_pengajar;
        }

        public static class IdPengajarBean {
            /**
             * id : 1
             * nama_depan : tintin
             * nama_belakang : tintin
             * alamat : jln TB 13 Yogyakarta
             * telepon : 087837863110
             * tempat_lahir : Magelang
             * kelamin : Wanita
             * tanggal_lahir : 1996-10-08
             * profil : http://bismaapi.bismaoperation.id/public/image/murid/lgend of blue sea.PNG
             * status : null
             * email : tintin@gmail.com
             * username : tintin
             * password : $2y$10$sZOV5VoNbCbVJnZGVMt.0.D4tVHkwJ5eNPWfNo9EfF9jWsnVZvQCm
             * longitude : null
             * latitude : null
             * created_at : 2017-05-25 19:51:04
             * updated_at : 2017-05-25 19:51:04
             */

            private int id;
            private String nama_depan;
            private String nama_belakang;
            private String alamat;
            private String telepon;
            private String tempat_lahir;
            private String kelamin;
            private String tanggal_lahir;
            private String profil;
            private String status;
            private String email;
            private String username;
            private String password;
            private Object longitude;
            private Object latitude;
            private String created_at;
            private String updated_at;

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

            public String getTempat_lahir() {
                return tempat_lahir;
            }

            public void setTempat_lahir(String tempat_lahir) {
                this.tempat_lahir = tempat_lahir;
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
