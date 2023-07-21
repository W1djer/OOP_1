package home_2;

public class Rectangle {
    private double width;
    private double height;


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){
        this.width = 13;
        this.height = 7;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return this.height * this.width;
    }

    public double calculatePerimeter(){
        return 2 * (this.height + this.width);
    }
}
