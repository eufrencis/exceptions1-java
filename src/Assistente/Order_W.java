package Assistente;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Enum.OrderStatus_W;

public class Order_W {

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
private LocalDateTime moment;
private OrderStatus_W status;
private Cliente_W cliente;
private List <OrderItem_W> items = new ArrayList<>();

public Order_W(LocalDateTime moment, OrderStatus_W status, Cliente_W cliente) {
    this.moment = moment;
    this.status = status;
    this.cliente = cliente;
    
}

public LocalDateTime getMoment() {
    return moment;
}

public void setMoment(LocalDateTime moment) {
    this.moment = moment;
}

public OrderStatus_W getStatus() {
    return status;
}

public void setStatus(OrderStatus_W status) {
    this.status = status;
}


public Cliente_W getCliente() {
    return cliente;
}

public void setCliente(Cliente_W cliente) {
    this.cliente = cliente;
}

public void addItem(OrderItem_W item){
    items.add(item);
}

public void removeItem (OrderItem_W item){
    items.remove(item);
}

public Double total(){
    double sum = 0;

    for (OrderItem_W item : items ){
        sum = sum + item.subTotal();
    }
    return sum;
}

public String toString (){
    
    StringBuilder sb = new StringBuilder();

    sb.append("Order moment: ");
    sb.append(moment.format(dtf) + "\n");
    sb.append("Order status: ");
    sb.append(status + "\n");
    sb.append(cliente + "\n");
    sb.append("Order items: \n");
    for (OrderItem_W item : items){ // treinar isso
        sb.append(item + "\n");
    }
    sb.append("Total price: ") ;
    sb.append(total());

    return sb.toString();

}

}
