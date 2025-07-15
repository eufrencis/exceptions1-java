package Assistente;

public class Company_Y extends TaxPayer_Y {
    
    private int numberOfEmployees;

    public Company_Y(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public  Double tax(){
        double sum = 0;
        if (numberOfEmployees > 10){
            sum += getAnualIncome() * 0.14;
        } else {
            sum += getAnualIncome() * 0.16;
        }
        return sum;
    }
}
