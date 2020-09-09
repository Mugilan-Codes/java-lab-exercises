package lab.four.animals;

public class Dog extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("Dog is Playing with Children");
    }
}
