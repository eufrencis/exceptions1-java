package Principal;

import java.util.Scanner;

import Assistente.Tarefa;

public class TarefaP {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n, j = 0;
        double sum = 0, average = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        Tarefa [] persons = new Tarefa[n];

        for (int i = 0; i < persons.length; i ++){
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            persons[i] = new Tarefa();
            persons[i].setNome(name);
            persons[i].setIdade(age);
            persons[i].setAltura(height);

        }

        for (int i = 0; i < persons.length; i ++){
            sum += persons[i].getAltura();
        }

        average = (double) sum / persons.length;

        System.out.printf("Average height: %.2f\n", average);

        System.out.print("People under 16 years old: ");
        for (int i = 0; i < persons.length; i ++){
            if (persons[i].getIdade() < 16){
                j++;
                
            }

        }

        double percetage = (double) j / persons.length * 100;
        
        System.out.printf("%.1f\n", percetage);

        for (int i = 0; i < persons.length; i ++){
            if (persons[i].getIdade() < 16){
                System.out.println(persons[i].getNome());
        }
    }
        sc.close();
    }
}
