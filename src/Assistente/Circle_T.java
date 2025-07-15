package Assistente;

import Enum.Color_T;

public class Circle_T extends Shape_T {

private Double radius;

public Circle_T(Color_T color, Double radius) {
    super(color);
    this.radius = radius;
}

public Double getRadius() {
    return radius;
}

public void setRadius(Double radius) {
    this.radius = radius;
}

@Override
public double area() {
    return Math.PI * radius * radius;
    
}


    
}
