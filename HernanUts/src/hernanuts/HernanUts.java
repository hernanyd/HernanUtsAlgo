/* Hernan Yudistira
   227064516003 
   program membuat kalkulator */
package hernanuts;
import java.util.Scanner; 
public class HernanUts {
    public static void main(String[] args) {
         System.out.println("PROGRAM KALKULATOR");
          System.out.println("==============================");                
       Scanner scanner = new Scanner(System.in);//membuat scanner
        double angka1, angka2, hasil;//membuat variabel untuk menyimpan input
        char operator;
        
              do { //perulangan do-while akan dijalankan setidaknya sekali            
            System.out.print("Masukkan angka pertama: ");//memasukan input angka pertama
            angka1 = scanner.nextDouble();
            //memasukan operator angka pertama atau k untuk keluar
            System.out.print("Masukkan operator (+, -, *, /) atau ketik k untuk keluar : ");
            operator = scanner.next().charAt(0);
            //jika input memilih k , maka program akan berhenti
            if (operator == 'K' || operator == 'k') {
                break;}         
            //memasukan input angka kedua
            System.out.print("Masukkan angka kedua: ");
            angka2 = scanner.nextDouble();
            //percabangan kondisi
            switch (operator) {
                case '+':/*jika memilih operator + maka lanjut keprogram hasil
                    yang mana angka1 ditambah angka2*/                   
                    hasil = angka1 + angka2;//hasilnya angka1 ditambah angka2
                    System.out.println("Hasil: " + hasil);//menampilkan hasil
                    break;
                                                                            
                case '-':/*jika memilih operator - maka lanjut keprogram hasil
                    yang mana angka1 dikurang angka2*/
                    hasil = angka1 - angka2;//hasilnya angka1 dikurang angka2
                    System.out.println("Hasil: " + hasil);//menampilkan hasil
                    break;
                case '*':/*jika memilih operator * maka lanjut keprogram hasil 
                    yang mana angka1 dikali angka2*/
                    hasil = angka1 * angka2;//hasilnya angka1 dikali angka2
                    System.out.println("Hasil: " + hasil);//menampilkan hasil
                    break;
                case '/':/*jika memilih operator / maka lanjut keprogram hasil
                    yang mana angka1 dibagi angka2*/
                    if (angka2 != 0) /*jika tidak dibagi dengan 0 lanjut program
                        hasil*/
                    {
                        hasil = angka1 / angka2;/*program hasilnya dengan rumus
    a                                             ngka1 dibagi angka2*/
                        System.out.println("Hasil: " + hasil);//menampilkan hasil
                    } else {//jika memasukan nol maka tidak bisa
                        System.out.println(" Pembagian oleh nol tidak bisa");
                    }
                    break;
                default://selain memasukan operator +, -, *, / maka tidak valid
                    System.out.println("Operator yang Anda masukkan tidak valid");
            }

            System.out.println();//cetak baris kosong
        } while (true);//jika kondisi true maka akan terus berulang
    }
}
   
    

