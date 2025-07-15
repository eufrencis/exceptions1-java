package Principal;

import java.util.Scanner;

import Assistente.Trabalho;

public class TrabalhoPrin {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double initialValue = 0;

        System.out.printf("Enter account number: ");
        int Conta = sc.nextInt();
        sc.nextLine();

        System.out.printf("Enter account name: ");
        String name = sc.nextLine();

        char resposta = 0;

        while (resposta != 'y' && resposta != 'n'){
            System.out.printf("Is there na initial deposit (y/n)? ");    
            resposta = sc.next().toLowerCase().charAt(0);

            if (resposta != 'y' && resposta != 'n') {
            System.out.println("Invalid input! Please enter 'y' or 'n'.");

        }
    }
       
    if (resposta == 'y'){
        System.out.printf("Enter initial deposit value: ");
        initialValue = sc.nextDouble();

    } else if  ( resposta == 'n'){
        initialValue = 0;
    }
        
    Trabalho banco = new Trabalho(Conta, name, initialValue);

    System.out.println(banco);


    System.out.print("Enter a deposit value: ");
    double amount = sc.nextDouble();
    banco.deposit(amount);

    System.out.println("Updated data:");
     System.out.println(banco);

    System.out.print("Enter a withdraw value: ");
    amount = sc.nextDouble();
    banco.withdraw(amount);

    System.out.println(banco);

















        sc.close();
    
}
}