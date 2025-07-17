package Aplication;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.Entities.Reservation;
import model.Exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner (System.in);
    try{
        
        System.out.print("Room number: ");
        int roomN = sc.nextInt();
        sc.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(), dtf);

        Reservation reservation = new Reservation(roomN, checkIn, checkOut);
        System.out.println(reservation);
        System.out.println();

        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = LocalDate.parse(sc.nextLine(), dtf);
        
        reservation.updateDates(checkIn, checkOut);
        System.out.println(reservation);
    } 
    catch (java.time.format.DateTimeParseException e){
        System.out.println("Invalid date format use dd/MM/yyyy");
    }
    catch (DomainException e){
        System.out.println(e.getMessage());
    }
    catch (RuntimeException e){
        System.out.println("Unexoected error");
    }

        
        
        

    

    

    










    sc.close();
    
    }
}
