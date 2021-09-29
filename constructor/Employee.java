import java.util.ArrayList;
public class Employee{

  private String name;
  private int age;
  private ArrayList<String> list;
  private Employee employee;
  

  public Employee(){
  
 } 
  public Employee(String name,int age){
  this.name=name;
  this.age=age;
  }
  
  public Employee(String name,int age,ArrayList<String> list,Employee employee){
    this.name=name;
    this.age=age;
    this.list=list;
    this.employee=employee;
  }
public void setName(String name){
   this.name=name;
  }
 
public String getName(){
   return name;
  }
  
  
 public void setAge(int age){
   this.age=age;
  } 
  
 public  int getAge(){
   return age;
  } 
  
  public void setList(ArrayList<String> list){
   this.list=list;
  } 
  
 public  ArrayList<String>  getList(){
   return list;
  }
  
  public void setEmployee(Employee employee){
   this.employee=employee;
  } 
  
 public  Employee getEmployee(){
   return employee;
  }
 public String toString(){
  return ("employee name = "+getName()+"   employee age=  "+getAge()+"arrayList" +getList()+ "employee"+getEmployee());
     }
  }   

