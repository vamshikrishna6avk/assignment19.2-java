package treesetinjava;//created package as treesetinjava

/**
 * 
 * creating a class Student as mention in the question;
 * than created three fields- name, rollNo and department 
 * and than created a constructor and used getter-setter;
 * this program is based on TreeSet so i need to implement
 * Comparable interface. 
 *
 */
public class Student implements Comparable<Student> {//Here public is a access modifier which defines who can access this method
	                                                // created class as student implementing comprable
	String name;//here taking three different types of variable
	 int rollNo;
	 String department;
	public Student(String name, int rollNo, String department) {//Here public is a access modifier which defines who can access this method
		super();//super keyword used to refer variable
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}// here we are using the getter n setter
	// for three different properties
	public String getName() {//Here public is a access modifier which defines who can access this method
		return name;//return name
	}
	public void setName(String name) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.name = name;
	}
	public int getRollNo() {//Here public is a access modifier which defines who can access this method
		return rollNo;//returns rollNo
	}
	public void setRollNo(int rollNo) {//Here public is a access modifier which defines who can access this method
		this.rollNo = rollNo;
	}
	public String getDepartment() {//Here public is a access modifier which defines who can access this method
		return department;//returns department
	}
	public void setDepartment(String department) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.department = department;//departement
	}
	/**
	 * In here creating toString method
	 * The toString() method returns the string
	 * representation of the object.
	 * 
	 */
	public  String toString(){//Here public is a access modifier which defines who can access this method
		return "Student name is "+ name+".\nRoll number is :"+rollNo+"\nDepartment is "+department+".\n";//returns student name
		}
	/**
	 * In here i'm overriding  method
	 * and comparing with rollNo by using if statement;
	 * In the TreeSet(),elements in TreeSet must be of Comparable type. 
	 * compareTo(), this method compares this String to another Object.
	 * student-> the Object to be compared.
	 */
	public int compareTo(Student student) {//Here public is a access modifier which defines who can access this method
		if(rollNo>student.rollNo){ //using for loop  
	        return 1;  //returns
	    }else if(rollNo<student.rollNo){  //using if for statement
	        return -1;  //returns either false or ture
	    }else{  
	    return 0;  //returns
	    }  
	}
	
}
	
