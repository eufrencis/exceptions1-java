package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assistente.Employee_R;
import Assistente.OutsourcedEmploye_R;

public class EmployeeP_R {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    List <Employee_R> funcionario = new ArrayList<>();

    sc.nextLine();

    for (int i = 1; i <= n; i++){
    System.out.printf("Employee #%d data: \n", i);   
    System.out.print("Outsourced (y/n)? ");
    char resp = sc.next().charAt(0);
    sc.nextLine();
    
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Hours: ");
        int hours = sc.nextInt();
        sc.nextLine();
        System.out.print("Value per hour: ");
        double valueP = sc.nextDouble();

        if (resp == 'y' || resp == 'Y' ){
        System.out.print("Additional charge: ");
        Double additional = sc.nextDouble();
        Employee_R emp = new OutsourcedEmploye_R(name, hours, valueP, additional);
        funcionario.add(emp);

    }
        else if (resp == 'n' || resp == 'N'){
            Employee_R emp1 = new Employee_R(name, hours, valueP);
            funcionario.add(emp1);
        }

       
    }

    System.out.println("PAYMENTS: ");
    for (Employee_R empl : funcionario){
        System.out.printf("%s - $ %.2f \n", empl.getName(), empl.payment());
    }

    sc.close();
    }
}
