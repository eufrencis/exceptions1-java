package Assistente;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Enum.WorkerLevel_C;

public class Worker2_C {
    private String name;
    private WorkerLevel_C level;
    private Double baseSalary;

    // Agora vou colocar as associações no caso do departamento so temos um departamento

   
    private Department_C department;

     // Um Worker tem varios contracts que vao ser representados com uma lista

     public Department_C getDepartment() {
        return department;
    }

     private List <HourContract_C> contracts = new ArrayList<>(); // Quando temos uma composição que tem muitas coisas não pode ser colocado no
    
     // construtor vc so inicia o instaciando aqui.  
     public Worker2_C(){

     }
     //Criei um construtor sem colocar a lista
public Worker2_C(String name, WorkerLevel_C level, Double baseSalary, Department_C department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
     
     }
      public List<HourContract_C> getContracts() {
        return contracts;
    }
      public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel_C getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel_C level) {
        this.level = level;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract (HourContract_C contract){ // Pega a lista de contracts e adicionar e o contrato do argumento
        contracts.add(contract);
    }

    public void removeContract (HourContract_C contract){
        contracts.remove(contract);
    }

    public double income (int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract_C c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }

        }
        return sum;

    }
}
