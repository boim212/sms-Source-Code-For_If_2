package for_if_2;

import java.util.Scanner;

public class For_If_2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int baris, kolom, masuk;
        char titik = '.';
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Min 1) = ");
            masuk = input.nextInt();
        }
        while(masuk < 1);
        
        System.out.println("");
        System.out.println("+-----Tugas For if 2 -----+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 0; kolom < masuk; kolom++) 
            {
                if((baris+kolom)==(masuk-1))
                {
                    System.out.printf("%3d ", kolom);
                }
                else
                {
                    System.out.printf("%3c ", titik);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
        
    }
    
}
