package linkedlist;

import java.util.LinkedList;

public class LinkedLists {
 
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<Person>();
        
        // Adding persons in the end of the list:
        list.add(new Person(1, "Jowel", 22));
        list.add(new Person(2, "Jowel2", 22));
        list.add(new Person(3, "Jowel3", 22));
        list.add(new Person(4, "Jowel4", 22));
        
        // Add at the start:
        list.add(0, new Person(5, "Jowel5", 20));
        
        System.out.println("-----------------------");
        
        for (Person person: list) {
            System.out.println("Test: " + person.getName());
        }
        
        // Removing Jowel3:
        String nameToRemove = "Jowel3";
        for (Person person: list) {
            if (person.getName().equals(nameToRemove)) {
                list.remove(person);
                break;
            }
        }
        
        System.out.println("-----------------------");
        System.out.println("Removing an element!");
        
        for (Person person: list) {
            System.out.println(person.getName());
        }
        
        System.out.println("-----------------------------");
        System.out.println("List size:");
        
        System.out.println(list.size());
        
        // Exclusive of linked lists:
        System.out.println("-----------------------------");
        System.out.println("First element: " + list.getFirst().toString());
        System.out.println("First element: " + list.getLast().toString());
        
        // Delete full list:
        System.out.println("-----------------------------");
        list.clear();
        
        System.out.println(list.isEmpty());
    }
    
}
