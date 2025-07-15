package Principal;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
    // O que esta dentro do <> é o generics é usado quando quero parametrizar informando um outro tipo
        List <String> list; // Não aceita tipos primitivos tem que usar wrapper class
    
    // é preciso instanciar a lista nao posso usar apenas esse formato.   
    
    list = new ArrayList<>();

    // Agora vou adicionar elementos na lista

    list.add ("Maria");
    list.add ("Alex");
    list.add ("Bob");
    list.add ("Ana");
    // Caso eu queira adicionar um novo elemento na posição dois eu utilizo:
    list.add (2, "Marco");
    //Como ver o tamanho da lista?
    System.out.println(list.size());


     for (String x: list){
        System.out.println(x);
    }
    
    System.out.println("----------------------------------------------------------------------------");


    // Como remover um elemnto da lista?
    // list.remove("Ana"); // Posso remover pelo nome que a lista usa a comparação ou pela posição usando list.remove(4).
    // tbm posso remover elementos da lista que atendam a um predicado como remover todo mundo que começa com a letra M.
    list.removeIf(x -> x.charAt(0) == 'M'); //Função lambda
    // Quero remover todo string x tal que a primeira letra de x seja igual a M
    for (String x: list){
        System.out.println(x);
    }

   System.out.println("----------------------------------------------------------------------------");

    // Agora quero encontrar a posição de um elemento:
    System.out.println("Index of Bob: " + list.indexOf("Bob")); // Quando ele nao encontra ngm ele retorna -1


    System.out.println("----------------------------------------------------------------------------");


    // Deixar na lista so quem tem nome que começa com a. 

    List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    
    for (String x : result){
        System.out.println(x);
    }
    System.out.println("----------------------------------------------------------------------------");

    // Econtrar o primeiro elemento da lista que começa com a letra a

    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);










    }
}
