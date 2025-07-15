package Assistente;

public class savingAccount_E extends account_E { //savingsAccount
    
private Double interestRate;

public savingAccount_E(){
    super();
}

public savingAccount_E(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
}

public Double getInterestRate() {
    return interestRate;
}

public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
}
public void updateBalance (){
    balance += balance * interestRate;
}
@Override // mostra que eu fiz a sobreposição para o compilador
public void withdraw (Double amount){
    balance -= amount ;

}
}