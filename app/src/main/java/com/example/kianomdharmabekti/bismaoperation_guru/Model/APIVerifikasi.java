package com.example.kianomdharmabekti.bismaoperation_guru.Model;

import java.io.Serializable;

/**
 * Created by Ryan Bagus Susilo on 6/1/2017.
 */
public class APIVerifikasi implements Serializable{

    /**
     * status : true
     * status_code : 200
     * message : Verifikasi
     * respon : {"id":52,"id_pengajar":"8","id_murid":"1","status":"Verifikasi","tanggal":"2017-06-01","jam":"2","total_biaya":200000,"created_at":"2017-05-31 06:48:51","updated_at":"2017-06-01 07:30:33"}
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
         * id : 52
         * id_pengajar : 8
         * id_murid : 1
         * status : Verifikasi
         * tanggal : 2017-06-01
         * jam : 2
         * total_biaya : 200000
         * created_at : 2017-05-31 06:48:51
         * updated_at : 2017-06-01 07:30:33
         */

        private int id;
        private String id_pengajar;
        private String id_murid;
        private String status;
        private String tanggal;
        private String jam;
        private int total_biaya;
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

        public int getTotal_biaya() {
            return total_biaya;
        }

        public void setTotal_biaya(int total_biaya) {
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
    }
}
