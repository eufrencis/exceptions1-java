package Assistente;

public class OrderItem_W {
    

private Integer quantity;

private Double price;

private Product_W product;

public OrderItem_W (){}

public OrderItem_W(Integer quantity, Double price, Product_W product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
}

public Integer getQuantity() {
    return quantity;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

public Double subTotal(){
    return price * quantity;
}

public Product_W getProduct(){
    return product;
}

public void setProduct(Product_W product){
    this.product = product;
}

public String toString(){
    return product.getName()
    + ", $" + price + ", Quantity: "
    + quantity + ", Subtotal: $"
    + subTotal();
}

}

