package lab.two.animal;

public class Animal {

    void jump() {
        System.out.println("I can Jump");
    }

    public void display() {
        System.out.println("I am an Animal");
    }

    private void run() {
        System.out.println("Animal is running");
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

}

class Cat extends Animal {

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.jump();
        cat.display();
//        cat.run();
        cat.eat();

    }

}
