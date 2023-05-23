/* Hernan Yudistira
   227064516003 */
package hernanuts;
import java.util.Scanner; 
public class hrn {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
        System.out.println();
        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. Category 1 (Rp5.000.000)");
        System.out.println("2. Category 2 (Rp4.000.000)");
        System.out.println("3. Category 3 (Rp3.250.000)");
        System.out.println("4. Category 4 (Rp2.500.000)");

        System.out.print("Pilih kategori tiket (1-4): ");
        int kategori_tiket = scan.nextInt();

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlah_tiket = scan.nextInt();

        int harga_tiket = 0;
        switch (kategori_tiket) {
            case 1:
                harga_tiket = 5000000;
                break;
            case 2:
                harga_tiket = 4000000;
                break;
                
                
                
                
                
            case 3:
                harga_tiket = 3250000;
                break;
            case 4:
                harga_tiket = 2500000;
                break;
            default:
                System.out.println("Kategori tiket tidak valid!");
                return;
        }

        int totalPrice = harga_tiket * jumlah_tiket;

        System.out.println("==========================================");
        System.out.println("              INVOICE PEMBELIAN");
        System.out.println("==========================================");
        System.out.println("Kategori Tiket\t: Category " + kategori_tiket);
        System.out.println("Jumlah Tiket\t: " + jumlah_tiket);
        System.out.println("Harga Tiket\t: Rp" + totalPrice);
        System.out.println("==========================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: Rp ");
        int payment = scan.nextInt();

        int change = payment - totalPrice;

        System.out.println("Kembalian\t: Rp" + change);
        System.out.println("=========================================="); 
    
    }
    
}
