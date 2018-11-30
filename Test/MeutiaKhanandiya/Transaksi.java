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
import java.util.* ;
public class Transaksi {
    // variable code untuk menampilkan kode pembayaran minuman
    private final String kode ;
    // variable untuk menampilkan item yang akan di beli
    private ArrayList<Item> items = new ArrayList<>();
    // variable total untuk menampilkan pembelian minuman
    private float total ;
    
    // menambahkan Constructor
    public Transaksi (String kode , ArrayList<item> items){
            this.kode = kode ;
            this.items = items ;
    }
    
    public void setTotal () {
        float total = 0 ;
        for (Item item : this.items) {
            total += item.hetTotal();
        }
        this.total = total ;
    }
    // memasukkan output transaksi
    public String Pembayaran() {
        setTotal();
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Item item : this.items){
            obt += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total ;
        return obt ;
        }
    }

    