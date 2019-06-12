package shap;

public class Circle {
    private String color = "blue";
    private boolean filled=true;
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color , boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=false;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cricle  radius= "
                +getRadius()
                +", color= "
                +getColor()
                +(isFilled() ? " filled " : " not filled");
    }
}
