package home_1;

public class home_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.setAge(3);
        cat1.setName("Мурзик");
        cat2.setAge(4);
        cat2.setName("Кузя");

        cat1.setOwner("Маргарита");

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        cat1.greet();

    }

}
