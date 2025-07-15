package Assistente;

import Enum.Color_T;

public abstract class Shape_T {
    
    private Color_T color;

    public Shape_T(Color_T color) {
        this.color = color;
    }

    public Color_T getColor() {
        return color;
    }

    public void setColor(Color_T color) {
        this.color = color;
    }

    public abstract double  area();

    
}
