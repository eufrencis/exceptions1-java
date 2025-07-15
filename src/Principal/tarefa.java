package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assistente.Produto;
import Assistente.Produtoimportado;
import Assistente.ProdutosUsados;

public class tarefa {
    public static void main(String[] args) {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    Scanner sc = new Scanner (System.in);
    List <Produto> lista = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    Produto produto;

    for (int i = 1 ; i <= n ; i ++){
        System.out.print("Common, used or imported (c/u/i)? ");
        char modo = sc.next().toUpperCase().charAt(0); // Converte a string para maiúscula e pega o primeiro char
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
       

        if (modo == 'I'){
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();
        sc.nextLine();
        produto  = new Produtoimportado(name, price, customsFee);
       
        }

        else if (modo == 'U' ){
        
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf1);

        produto = new ProdutosUsados(name, price, date);
        }

        else {
             produto  = new Produto(name, price);
         
        }

        lista.add(produto);

    }
        System.out.println("PRICE TAGS: ");
        for (Produto product : lista){
            System.out.println(product.priceTag());
        }
        sc.close();
        
    }










    
    }
