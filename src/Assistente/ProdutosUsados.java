package Assistente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutosUsados extends Produto {

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
private LocalDate manufactureDate;

public ProdutosUsados(String name, Double price, LocalDate manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
}

public LocalDate getManufactureDate() {
    return manufactureDate;
}

public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
}


@Override
 public String priceTag(){
        return getName() + " (used) $ " 
        + String.format("%.2f", getPrice())
        + " (Manufacture date: " + dtf.format(manufactureDate)
        + ")";
    }


}


    

