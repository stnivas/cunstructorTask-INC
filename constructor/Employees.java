import java.util.ArrayList;
public class Employees{

 private String name;
 private String  id;
 private String address;
 private Employee employee;
//q1
	public  Employees(){
	  	System.out.println("Default Constructor called");
	 }
	 
//q2	 
   public Employees(String name){
	       
	  	System.out.println(name);
	 }
	 
//q3	 
	public  Employees(int number){
	   System.out.println(number); 	 
   }
   
//q4   
   public Employees(ArrayList<String>list){
	   System.out.println(list); 	 
   }	
//q5   
  public Employees(Employee employee) {
  this.employee=employee;
  System.out.println(this.employee);
  } 
 
 public void setName(String name){
  this.name=name;
  }
  
  public String getName(){
  return name;
  }
  public  void setId(String id){
  this.id=id;
  }
  public String getId(){
  return id;
  }
  public  void setAddress(String address){
  this.address=address;
  }
  public String getAddress(){
  return address;
  }
}  
 
