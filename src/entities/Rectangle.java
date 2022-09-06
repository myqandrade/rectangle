package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {

    private double width;
    private double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }

    @Override
    public String toString(){
        return "AREA = " + String.format("%.2f%n", area())
                + "PERIMETER = " + String.format("%.2f%n", perimeter())
                + "DIAGONAL = " + String.format("%.2f%n", diagonal());
    }
}
