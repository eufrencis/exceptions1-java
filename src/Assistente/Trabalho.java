package Assistente;

public class Trabalho {
    
    private int Conta;
    private String name;
    private double initialValue;

    //Construtores

    public Trabalho(int conta, String name, double initialDeposit) {
        Conta = conta;
        this.name = name;
        deposit(initialDeposit);
    }

    // Sobrecarga caso nao precise do valor inicial 

    public Trabalho(int conta, String name) {
        Conta = conta;
        this.name = name;
        
    }

    // Encapsulamento


    public int getConta() {
        return Conta;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public double getInitialValue (){
        return initialValue;
    }

    public void setInitialValue(Double initialValue){
        this.initialValue = initialValue;
    }

    public void deposit (double amount){
        initialValue += amount;

    }
    public void withdraw (double amount){
        initialValue -= (amount) + 5;
    }


@Override
    public String toString() {
        return "Account data:\n" +
        "Account " + Conta + ", Holder: " + name + ",  Balance: $ " + String.format("%.2f", initialValue);
    }


    




}
