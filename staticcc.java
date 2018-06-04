package com.basic;

public class staticcc {

	public static void main(String[] args) {
		static int age;
		  static String name;
		  
		  static void disp(){
		      System.out.println("Age is: "+age);
		      System.out.println("Name is: "+name);
		  }
		  
		  public static void main(String args[]) 
		  {
			  age = 30;
			  name = "Steve";
		      disp();
		  }
		
	}

}
