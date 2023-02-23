import java.util.Scanner;

public class OperatorTernaryandScanner {
    public static void main(String[] args) {
        Scanner link = new Scanner(System.in);
        String nama,alamat,perkerjaan,hobi;
        int umur,tinggi ;

        System.out.print("MASUKAN NAMA   = ");
        nama = link.next();
        System.out.print("MASUKAN ALAMAT = ");
        alamat = link.nextLine();
        System.out.print("MASUKAN UMUR   = ");
        umur = link.nextInt();
        System.out.print("MASUKAN TINGGI = ");
        tinggi = link.nextInt();
        perkerjaan = umur%2==0 ? "SALES" : "KREATOR";
        hobi = tinggi%2==0 ? "CATUR" : "SEPAKBOLA";

        System.out.println("NAMA ANDA  = "+nama);
        System.out.println("ALAMAT     = "+alamat);
        System.out.println("UMUR       = " +umur+"Cm");
        System.out.println("TINGGI     = "+tinggi+"Tahun");
        System.out.println("PERKARJAAN = "+perkerjaan);
        System.out.println("HOBI       = "+hobi);



    }


}
