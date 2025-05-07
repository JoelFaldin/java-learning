package genericsexercise;

import logic.Box;

public class GenericsExercise {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        
        stringBox.setSomething("My name is Jowel :D");
        System.out.println("Content of the string box: " + stringBox.getSomething());
        
        Box<Integer> integerBox = new Box<>();
        
        integerBox.setSomething(22);
        System.out.println("Content of the integer box: " + integerBox.getSomething());
    }
    
}
