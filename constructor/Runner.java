import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
  

public class Runner{

	static Scanner input=new Scanner(System.in); 	
  
	public static void main(String[] args){
		System.out.println("enter your choice");
		int choice=input.nextInt();
		
		switch(choice){
		
		case 1: 
	           Employees call=new  Employees();
	           System.out.println(call);
	           break;
	    case 2:
	           System.out.println("enter the name");
	           String name=input.next();
	           Employees call1=new  Employees(name);
	           System.out.println(call1);   
	           break; 
	    case 3:
	           System.out.println("enter the number");
	           int  number=input.nextInt();
	           Employees call2=new  Employees(number);  
	           System.out.println(call2);        
	          break;   
	             
	    case 4:
	           ArrayList<String> list=new ArrayList<>();
	           System.out.println("enter the count");
	           int count=input.nextInt();
	           	
	           		for(int run=0; run<count;run++){
	           			System.out.println("enter your name");
	           		    name=input.next();
	           			list.add(name);
	           		}		
	           Employees call3=new  Employees(list);
	           System.out.println(call3);          
	           break;  
	               
	   case 5:
	   		  Employee obj=new Employee("nivas", 22);
	          Employees employee=new Employees(obj);
	          System.out.println(obj);
	          System.out.println(employee);
              break;
	
	  case 6:  
	          Employee detailsOne=new Employee("nivas",21, new ArrayList<>(), new Employee());
	          System.out.println(detailsOne);
	         break;            
	  case 7:   
	          Employee  objOne=new Employee();
	          objOne.setName("nivas");
	          objOne.setAge(21);
	          objOne.setList(new ArrayList<>());
              objOne.setEmployee(new Employee());      
              System.out.println(objOne.getName());
              System.out.println(objOne.getAge());
	          System.out.println(objOne.getList());
	          System.out.println(objOne.getEmployee());
	          
	         break;
	 case 8:
	         Custructors.dummy();
	         break;
	      
	 case 9:
	          Student staticObject=new Student();
	          break;  
	    
	 case 10:
	          Cat objeTen=new Cat ();
	          Cat sub=new Tiger();
	          sub.eat();     
	          break;           
	     }    
	  }
    }	
