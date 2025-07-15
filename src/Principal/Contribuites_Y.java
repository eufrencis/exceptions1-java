package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Assistente.Company_Y;
import Assistente.Individual_Y;
import Assistente.TaxPayer_Y;

public class Contribuites_Y {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List <TaxPayer_Y> taxa = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++){
            
            char opcao;
            do{
            System.out.printf("Tax payer #%d data : \n", i);
            System.out.print("Individual or company (i/c)?");
            opcao = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            if (opcao != 'I' && opcao != 'C'){
                System.out.println("Escolha uma opção entre i/c");
            } 
        } while (opcao != 'I' && opcao != 'C');
        
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double AnualIncome = sc.nextDouble();
            
            if (opcao == 'I'){
                System.out.print("Heath expenditures:  ");
                double heathExp = sc.nextDouble();
                sc.nextLine();
                taxa.add(new Individual_Y(name, AnualIncome, heathExp));
                
            }   
            else {
                System.out.print("Number of employees: ");
                int numberEmp = sc.nextInt();
                sc.nextLine();
                taxa.add(new Company_Y(name, AnualIncome, numberEmp) );

            }
            
        } 
        System.out.println();
        System.out.println("TAXES PAID: ");
        double soma = 0;
        for (TaxPayer_Y list : taxa){
            System.out.println(list.getName() + ": $" + String.format("%.2f",list.tax()));
            soma +=  list.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES : %.2f", soma );

        sc.close();
    }
}
