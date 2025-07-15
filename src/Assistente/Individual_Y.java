package Assistente;

public class Individual_Y extends TaxPayer_Y{

private Double heathExpenditures;

public Individual_Y(String name, Double anualIncome, Double heathExpenditures) {
    super(name, anualIncome);
    this.heathExpenditures = heathExpenditures;
}

public Double getHeathExpenditures() {
    return heathExpenditures;
}

public void setHeathExpenditures(Double heathExpenditures) {
    this.heathExpenditures = heathExpenditures;
}

@Override
public Double tax(){
    double sum = 0;
    if (getAnualIncome() < 20000.0){
        sum += (getAnualIncome() * 0.15) - (heathExpenditures * 0.5);

    } else {
        sum += (getAnualIncome() * 0.25) - (heathExpenditures * 0.5);
    }

    if (sum < 0.0){
        return 0.0;
    } else {
    return sum;
    }
}
    
}
