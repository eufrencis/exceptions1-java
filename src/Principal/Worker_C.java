package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Assistente.Department_C;
import Assistente.HourContract_C;
import Assistente.Worker2_C;
import Enum.WorkerLevel_C;

public class Worker_C {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Configurando para o usuario digitar a data
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data");
        System.out.println("Name");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary ");
        double baseSalary = sc.nextDouble();

        Worker2_C worker = new Worker2_C(workerName, WorkerLevel_C.valueOf(workerLevel), baseSalary, new Department_C(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i ++){
            System.out.printf("Enter contract #%d data", i + 1);
            System.out.print("Date (DD/MM/YYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract_C contract = new HourContract_C(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month =Integer.parseInt( monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));











        sc.close();

        
    }
}
