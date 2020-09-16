package lab.two.newanimal;

import lab.two.animal.Animal;

public class NewAnimal extends Animal {

    public static void main(String[] args) {
        NewAnimal dog = new NewAnimal();

        // dog.jump(); // 'jump()' is not public in 'lab.two.animal.Animal'.
        // Cannot be accessed from outside package
        dog.display();
        // dog.run(); // 'run()' has private access in 'lab.two.animal.Animal'
        dog.eat();
    }

}
