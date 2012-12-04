package generics;

import poo.interfaces.User;
import poo.interfaces.PowerUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoxDemo3 {

    public static void main(String[] args) {
	GenericBox<Integer> integerBox = new GenericBox<>();
	integerBox.add(new Integer(10));
	Integer someInteger = integerBox.get(); // no cast!
	System.out.println(someInteger);



	GenericBox<User> userBox = new GenericBox<>();
	userBox.add(new User());


	GenericBox<PowerUser> pwrUserBox = new GenericBox<>();
	userBox.add(new PowerUser());


	User u = new PowerUser();

	User users[] = new User[10];
	PowerUser pwUsers[] = new PowerUser[10];

	users = pwUsers;



	List<User> l = new ArrayList<>();




    }
}
