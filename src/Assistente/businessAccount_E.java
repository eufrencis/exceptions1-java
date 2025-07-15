package Assistente;

public class businessAccount_E extends account_E { //Business account 
// Com esse extends eu to dizendo que ela vai ter todos os dados e comportamentos 
//da herança 1

private Double loanLimit;

public businessAccount_E (){
    super();
}

public businessAccount_E(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance); //Executa a lógica do construtor da classe base (heranca)
    this.loanLimit = loanLimit;
}

public Double getLoanLimit() {
    return loanLimit;
}

public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
}

public void loan(double amount){
    if (amount <=loanLimit)
    balance += amount - 10.0;
}
@Override
public void withdraw (Double amount){
    super.withdraw(amount);
    balance -= 2;
}











}
