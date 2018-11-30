/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeutiaKhanandiya;

/**
 *
 * @author MEUTIA KHANANDIYA
 */

// Deklarasi class Item untuk merepresentasikan barang
// yang akan dimasukkan dalam daftar belanja.
public class item {
     private String nama;
     // atribut yang digunakan untuk menyimpan nama barang
     private float harga;
     // atribut yang digunakan untuk menyimpan harga barang
     private int jumlah;
     // atribut yang digunakan untuk menunjukan jumlah barang
     
     //menambahkan Constructor pada Class Item
     public item(){
     }
     
     
    public item(String nama, float harga, int jumlah) {
        //memberi tau nama barang yang tersedia
        this.nama = nama;
        //memberi tau harga yang telah di tetapkan
        this.harga = harga;
        //memberi tau jumlah barang yang telah di beli 
        this.jumlah = jumlah;
    }
        // menambahkan Getter Setter Pada Class Item
    
    //Get Nama
    public String getNama() {
        return nama;
    }
    //set Nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Get Harga
    public float getHarga() {
        return harga;
    }
    //Set Harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
    //Get Jumlah
    public int getJumlah() {
        return jumlah;
    }
    //Set Jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        
    }
    // perkalian harga dan jumlah
    public float getTotal () {
        return this.harga * this.jumlah ;
    }
    
    public String toString () {
        return this.nama ;
    }
}
