package treesetinjava;//created package as treesetinjava

/**
 * In here importing class, which are belong from java.util.package;
 */
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
import java.util.Iterator;//iterator is an interface,used to iterator collection of objects
import java.util.TreeSet;//treeset class implements the set interface that uses a tree for storage
/**
 * 
 * In here created a class StudentDetail to store detail of 
 * students by using TreeSet;
 * 
 *
 */
public class StudentDetail {//Here public is a access modifier which defines who can access this method

	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		TreeSet<Student> objStudent= new TreeSet<Student>();// here we are creating the object of hashset
		System.out.println("Display of students detail by using TreeSet\n");//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		 /**
		  * Creating Students  
		  * and adding Students to TreeSet 
		  * 
		  */
		Student one= new Student("Mahesh",4005,"Physics");//taking three student name with rollno and department
		Student second= new Student("Sanjai",4012,"Chemistry");
		Student third= new Student("Vikram",4032,"maths");
		objStudent.add(one); //adding serially
		objStudent.add(second);  
		objStudent.add(third);
		/**
		 * In here using iterator
		 * and than using while loop for checking the value
		 * and call hasNext() which will returns true if there are 
		 * more elements. Otherwise, returns false.
		 */
		Iterator iterator=objStudent.iterator();//iterator is an interface,used to iterator collection of objects
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}

	}

}