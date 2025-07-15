package Principal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tempo {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.now(); //Para instanciar com a data de agora.
        LocalDateTime d02 = LocalDateTime.now(); // instacia data e hora 
        Instant d03 = Instant.now(); // Gera horario GMT/UTC de londres
        LocalDate d04 = LocalDate.parse("2026-06-11"); //gera data hora no padrao iso 8601
        

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Cria um formatador de data do jeito especificado
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Converte a String 20/07/2022 em um localDate
        LocalDateTime d10 = LocalDateTime.of(2022, 7, 020, 1, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d08 = " + d08);
        System.out.println("d10 = " + d10);

        // Convertendo data hora para texto:

        System.out.println("----------------------------------");


        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // passei para o jeito brasileiro de ver a data

        System.out.println("d04 = " + fm1.format(d10)); // impressao 

        // ou posso imprimir direto assim:
         System.out.println("d04 = " + d10.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));




    }
    
}
