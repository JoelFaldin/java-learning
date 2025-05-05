package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        
        List<Person> list = new ArrayList<Person>();
        
        list.add(new Person(1, "Jowel", 22));
        list.add(new Person(2, "Jowel2", 22));
        list.add(new Person(3, "Jowel3", 22));
        list.add(new Person(4, "Jowel4", 22));
        
        // Iterate by index:
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Test: " + list.get(i).getName());
        }
        
        System.out.println("-----------------------------");
        
        // Iterate with foreach:
        for (Person perso: list) {
            System.out.println("Test2: " + perso.getName());
        }
        
        // Removing an element:
        System.out.println("-----------------------------");
        System.out.println("Removing an element!");
        list.remove(2);
        
        for (Person perso: list) {
            System.out.println(perso.getName());
        }
        
        System.out.println("-----------------------------");
        System.out.println("List size:");
        
        System.out.println(list.size());
        
        // Clear the list:
        list.clear();
        
        System.out.println(list.isEmpty());
    }
    
}
