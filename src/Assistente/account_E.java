package Assistente;

public class account_E { // account 
    
private Integer number;
private String holder;
protected Double balance;

public account_E (){}

public account_E(Integer number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
}

public Integer getNumber() {
    return number;
}

public void setNumber(Integer number) {
    this.number = number;
}

public String getHolder() {
    return holder;
}

public void setHolder(String holder) {
    this.holder = holder;
}

public Double getBalance() {
    return balance;
}

public void withdraw (Double amount){
    balance -= amount + 5.0; //balance -= amount 

}

public void deposit (Double amount){
    balance = balance + amount; // balance += amount
}



}
