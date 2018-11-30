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
    
    private final String kode ;
    private ArrayList<Item> items = new ArrayList<>();
    private float total ;
    
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
    
    public String Pembayaran() {
        setTotal();
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        
    }

    