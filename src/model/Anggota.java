package model;

import java.sql.Blob;

public class Anggota {
    String id;
    String namaAnggota;
    String jenisKelamin;
    String tanggalLahir;
    String agama;
    Petugas petugas;
    Blob fotoAnggota;

    public String getId() {
        return id;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public Blob getFotoAnggota() {
        return fotoAnggota;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public void setFotoAnggota(Blob fotoAnggota) {
        this.fotoAnggota = fotoAnggota;
    }

    public Anggota() {
    }

    public Anggota(String id, String namaAnggota, String jenisKelamin,  
        String tanggalLahir, String agama, int idPetugas,  
        String namaPetugas, Blob fotoAnggota) { 
        petugas = new Petugas(); 
        petugas.setId(idPetugas); 
        petugas.setNamaPetugas(namaPetugas); 
   
        this.id = id; 
        this.namaAnggota = namaAnggota; 
        this.jenisKelamin = jenisKelamin; 
        this.tanggalLahir = tanggalLahir; 
        this.agama = agama;         
        this.fotoAnggota = fotoAnggota; 
    }
    
    
    
}
