abstract public class Cat{

	public Cat (){
	
	   System.out.println("Default  Custructors called");
	 }
	 
	abstract public void  eat(){
   
     System.out.println("eating milk");
     
   }  
 }  
 
public class Tiger extends Cat{
 
  public void run(){  
   System.out.println("run 160Kmph");
 
   }
 }  
