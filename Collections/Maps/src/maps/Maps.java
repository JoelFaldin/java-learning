package maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    
    public static void main(String[] args) {
        
        Map<Integer, String> employeeMap = new HashMap<>();
        
        employeeMap.put(2359, "Jowel");
        employeeMap.put(2360, "Jowel2");
        employeeMap.put(2361, "Jowel3");
        
        boolean existsValue = employeeMap.containsValue("Jowel3");
        
        if (existsValue) {
            System.out.println("Jowel3 exists in the hashmap!");
        } else {
            System.out.println("Jowel3 does not exists/");
        }
        
        boolean existsKey = employeeMap.containsKey(2359);
        
        if (existsKey) {
            System.out.println("The key 2359 exists!");
        } else {
            System.out.println("The key 2359 does not exists.");
        }
        
        // Showing values and keys:
        System.out.println(employeeMap.values());
        System.out.println(employeeMap.keySet());
        
        // Getting the value of an specific key:
        String name = employeeMap.get(2359);
        System.out.println(name);
        
        // Delete a value from the map:
        employeeMap.remove(2361);
        System.out.println(employeeMap);
        
        
    }
    
}
