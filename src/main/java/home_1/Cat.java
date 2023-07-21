package home_1;

public class Cat {
    private String name;
    private Integer age;

    private String owner;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет). Мой владелец %s \n", name, age, owner);
    }

}
