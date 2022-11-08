//Java Program to demonstrate the use of static variable  
class student{  
   int rollno;//instance variable  
   String name;  
   static String Office ="ITS";//static variable  
   //constructor  
   student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display () {
	   System.out.println(rollno+" "+name+" "+Office);
	   }  
}  
//Test class to show the values of objects  
public class Employeeinformation{  
public static void main(String args[]){  
student e1 = new student(111,"Karan");  
student e2 = new student (222,"Aryan");
e1.display();
e2.display();

	
	// TODO Auto-generated method stub
	
}


 //we can change the college of all objects by the single line of code  
 //Student.college="BBDIT";  
 
 }

  
