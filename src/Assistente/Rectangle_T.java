package Assistente;

import Enum.Color_T;

public  class Rectangle_T extends Shape_T { // Como essa classe não é abstrata ela é obrigada a sobrescrever o método abstrato da super classe;

    private Double widht;
    private Double height;
    
    public Rectangle_T(Color_T color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() { 
        return widht * height;
    }



    
    
}
