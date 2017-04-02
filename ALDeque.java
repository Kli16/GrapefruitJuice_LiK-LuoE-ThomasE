//Team GrapefruitJuice: Kevin Li, Edward Luo, Eugene Thomas
//APCS2 pd4
//Lab02 -- All Hands on Deque!
//2017-04-04

import java.util.ArrayList; 

public class ALDeque<D> implements Deque<D> {
    
    private ArrayList<D> arr; 
    private int size; 

    public ALDeque() {
	arr = new ArrayList<D>(); 
	size = 0;
    }

    public int size() {
	return size; 
    }

    public boolean isEmpty() {
	return size() == 0; 
    }

    public void addFirst( D d ) {
	arr.add(0,d); 
	size++; 
    }

    public void addLast( D d ) {
	arr.add(d); 
	size++;
    }

    public D removeFirst() {
	D hold = arr.get(0); 
	arr.remove(0);
	size--;
	return hold; 
    }

    public D removeLast() {
	D hold = arr.get(size()-1); 
	arr.remove(size()-1);
	size--;
	return hold; 
    }

    public D peekFirst() {
	return arr.get(0); 
    }

    public D peekLast() {
	return arr.get(size()-1); 
    }

    public String toString() { 
	String retStr = ""; 
	for (D d: arr) { 
	    retStr += d + " "; 
	}
	return retStr; 
    } 

    public static void main (String[] args) { 

	// creates three deques to test methods on: 

	Deque<String> Eddie = new ALDeque<String>(); 
	Deque<String> Eugene = new ALDeque<String>(); 
	Deque<String> Kli6 = new ALDeque<String>();

	// Inserts words in using addFirst:

	System.out.println("Adding to Eddie... ");
	Eddie.addFirst("Luo!"); 
	Eddie.addFirst("Edward"); 
	Eddie.addFirst("is"); 
	Eddie.addFirst("name"); 
	Eddie.addFirst("My"); 
	System.out.println(Eddie); // "My name is Edward Luo!"

	System.out.println("Adding to Eugenio... ");
	Eugene.addFirst("Thomas!"); 
	Eugene.addFirst("Eugene"); 
	Eugene.addFirst("is"); 
	Eugene.addFirst("name"); 
	Eugene.addFirst("My"); 
	System.out.println(Eugene);  // "My name is Eugene Thomas!"

	System.out.println("Adding to Kli6");
	Kli6.addFirst("Li!"); 
	Kli6.addFirst("Kevin"); 
	Kli6.addFirst("is"); 
	Kli6.addFirst("name"); 
	Kli6.addFirst("My"); 
	System.out.println(Kli6);  // "My name is Kevin Li!"
	
	// Removes our names from the deque using removeLast: 

	System.out.println("Removing....."); 
	Eddie.removeLast(); 
	Eugene.removeLast(); 
	Kli6.removeLast();
	Eddie.removeLast(); 
	Eugene.removeLast(); 
	Kli6.removeLast();  
	System.out.println(Eddie); // "My name is"
	System.out.println(Eugene); // "My name is" 
	System.out.println(Kli6); // "My name is" 

	// Adds nicknames to each deque using addLast: 

	System.out.println("Adding nicknames..."); 
	Eddie.addLast("E-Luo!"); 
	Eugene.addLast("Eugenio!"); 
	Kli6.addLast("Kli6!");
	System.out.println(Eddie); // "My name is E-Luo!"
	System.out.println(Eugene); // "My name is Eugenio!" 
	System.out.println(Kli6); // "My name is Kli6!"
	
	// Gets only the nickname by using removeFirst:
 
	System.out.println("Removing greetings..."); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	System.out.println(Eddie); // "E-Luo!"
	System.out.println(Eugene); // "Eugenio!" 
	System.out.println(Kli6); // "Kli6!"

	// Returns the nicknames by using peekFirst and peekLast: 

	System.out.println("Nicknames^2..."); 
	System.out.println(Eddie.peekFirst()); // "E-Luo!"
	System.out.println(Eugene.peekFirst()); // "Eugenio!" 
	System.out.println(Kli6.peekFirst()); // "Kli6!"
	System.out.println(Eddie.peekLast()); // "E-Luo!"
	System.out.println(Eugene.peekLast()); // "Eugenio!" 
	System.out.println(Kli6.peekLast()); // "Kli6!"

	// Removes the nicknames by using removeFirst.
	// Tests isEmpty: 

	System.out.println("isEmpty pre-removal..."); 
        System.out.println(Eddie.isEmpty()); // false
	System.out.println(Eugene.isEmpty()); // false 
	System.out.println(Kli6.isEmpty()); // false
	System.out.println("Removing..."); 
	Eddie.removeFirst(); 
	Eugene.removeFirst();
	Kli6.removeFirst(); 
	System.out.println("isEmpty post-removal..."); 
        System.out.println(Eddie.isEmpty()); // true
	System.out.println(Eugene.isEmpty()); // true
	System.out.println(Kli6.isEmpty()); // true
	
	// Tries to remove while empty, an error should be returned: 
	
	System.out.println("Removing an empty deque (an error should be returned)..."); 
	Eddie.removeFirst(); // ERROR
	Eugene.removeFirst(); // ERROR
	Kli6.removeFirst(); // ERROR	
    } 
}
