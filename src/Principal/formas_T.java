package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Assistente.Circle_T;
import Assistente.Rectangle_T;
import Assistente.Shape_T;
import Enum.Color_T;

public class formas_T {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in );
        List <Shape_T> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        Shape_T shape;
        for (int i = 1 ; i <= n; i++){
            
            System.out.printf("Shape #%d data: \n", i);
            char opcao;
            do {
            System.out.print("Rectangle or Circle (R/C)? ");
            opcao = sc.nextLine().toUpperCase().charAt(0);
             if (opcao != 'R' && opcao != 'C') {
                System.out.println("Opção errada escolha (R/C)");
             }  
            } while (opcao != 'R' && opcao != 'C');
            
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color_T color = Color_T.valueOf(sc.nextLine().toUpperCase());
                        
            if (opcao == 'R'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                shape = new Rectangle_T(color, width, height);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                shape = new Circle_T(color, radius);
                
            }
            list.add(shape);
        }

        System.out.println("Shape areas: ");
        for (Shape_T sp : list){
            System.out.println(String.format("%.2f",sp.area()));
        }
           sc.close();  
        }
        
    }

