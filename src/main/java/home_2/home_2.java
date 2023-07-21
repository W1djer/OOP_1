package home_2;

public class home_2 {
    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle(10, 33);

        System.out.printf("Площадь прямоугольника one %s \n",  one.calculateArea());
        System.out.printf("Площадь прямоугольника two %s \n",  two.calculateArea());
        System.out.printf("Периметр прямоугольника one %s \n",  one.calculatePerimeter());
        System.out.printf("Периметр прямоугольника two %s \n",  two.calculatePerimeter());


    }


}
