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
import javax.swing.table. * ;
public class TabelFirst extends DefaultTableModel {
    // menambahkan String Array Var agar nama kolom tersimpan
    private String[] kolom ;

    // menambahkan fungsi Constructor 
    public TabelFirst () {
        this.kolom = new String [] {
            "Nama" , "Harga" , "Jumlah"} ;
    }
    
    
}
