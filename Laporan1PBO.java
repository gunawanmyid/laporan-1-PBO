/*
 * Nama : Anwar Sandi
 * NIM  : 60200112032
 * Kelas: B
 */
package laporan.pkg1.pbo;

/**
 *
 * @author nhawa
 */
public class Laporan1PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        biodata();
        tambah();
    }
    
    public static void biodata(){
        System.out.println ("Nama : Anwar Sandi");
        System.out.println ("NIM  : 60200112032");
        System.out.println ("Kelas: E");
    }
    
    public static void tambah(){
        int a = 2 + 1;
        int b = a - 1;
        System.out.println ("a = 2 + 1 = "+a);
        System.out.println ("b = a - 1 = "+b);
    }
    
}
