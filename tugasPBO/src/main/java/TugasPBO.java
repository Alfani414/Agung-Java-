
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
public class TugasPBO {
    
    public static void main(String[] args) {
        
        int nilaiA_integer = 10;
        int nilaiB_integer = 20;
        
        double nilaiA_double = 10.1;
        double nilaiB_double = 20.1;
        
        float varA = 10.11f;
        float varB = 20.22f;
        
        String varName = "Agung";
        boolean isPlus = true;
        
        System.out.println("Nilai A = "+nilaiA_integer);
        System.out.println("Nilai B = "+nilaiB_integer );       
        System.out.println("double A = "+nilaiA_double );
        System.out.println("double B = "+nilaiB_double );       
        System.out.println("Nilai float A = "+varA );
        System.out.println("Nilai float B = "+varB );
        System.out.println(varName);
        System.out.println(isPlus);

    Scanner input = new Scanner(System.in);
    
    //---------------- inputan ---------------
    //INTEGER-------
        System.out.println("Silahkan input nilai integer A");
        System.out.println("input nilai integer A = ");
        nilaiA_integer = input.nextInt();

        System.out.println("Silahkan input nilai integer B");
        System.out.println("input nilai integer B = ");
        nilaiB_integer = input.nextInt();
        System.out.println("Nilai baru integer A = "+nilaiA_integer + ", Nilai baru integer B = "+nilaiB_integer);

    //DOUBLE--------
        System.out.println("Silahkan input nilai double A");
        System.out.println("input nilai double A = ");
        nilaiA_double = input.nextDouble();
        
        System.out.println("Silahkan input nilai double B");
        System.out.println("input nilai double B = ");
        nilaiB_double = input.nextDouble();
        System.out.println("Nilai baru double A = "+nilaiA_double + ", Nilai baru double B = "+nilaiB_double);
        
    //FLOAT--------
        System.out.println("Silahkan input nilai float A");
        System.out.println("input nilai float A = ");
        varA = input.nextFloat();
        
        System.out.println("Silahkan input nilai float B");
        System.out.println("input nilai float A = ");
        varB = input.nextFloat();
        System.out.println("Nilai baru float A = "+varA + ", Nilai baru doub B = "+nilaiB_double);
        
    //STRING-------
        System.out.println("Silahkan input nama = ");
        varName = input.next();
        System.out.println("Nama anda adalah = "+varName);
        
    //BOOLEAN
        System.out.println("Silahkan input boolean(false/true) = ");
        isPlus = input.nextBoolean();
        System.out.println("boolean = "+isPlus);
         





    }
}
