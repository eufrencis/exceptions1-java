package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCath {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    try{
        String [] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
    }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid position!");
    }

    catch (InputMismatchException e){   
        System.out.println("Input error");
    }
    System.out.println("End of program");

    // Try cath captura o erro e mostra na tela para o usuario, assim o programa não para de funcionar

    sc.close();
    }
}
