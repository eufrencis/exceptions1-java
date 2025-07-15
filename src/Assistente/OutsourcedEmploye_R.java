package Assistente;

public class OutsourcedEmploye_R extends Employee_R {
    
private Double additionalCharge;




public OutsourcedEmploye_R(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
}




@Override
public Double payment(){
    double valor = (additionalCharge * 110 ) / 100;
        return super.payment() + valor;
    }

}
