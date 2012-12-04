package generics;

import interfaces.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class BoxDemo3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get(); // no cast!
        System.out.println(someInteger);
        
        
        
        GenericBox<User> userBox = new GenericBox<User> ();
        userBox.add(new User());
        
        
        GenericBox<PowerUser> pwrUserBox = new GenericBox<PowerUser> ();
        userBox.add(new PowerUser());
        
        
        
        //userBox = pwrUserBox;
        
        
        User u = new PowerUser();
        
        User users[] = new User[10];
        PowerUser pwUsers[] = new PowerUser[10];
        
        users = pwUsers;
        
        
        
        
        
        //GenericBox<User> = new 
        
        List l = new ArrayList<User>();
        
      
        
        
    }
}
