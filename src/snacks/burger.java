package snacks;
import java.util.Scanner;

import beverages.*;


public class burger extends tea{
	public String orderbu="";
	public int sumbu = 0;
	public void burger() {
		
		Scanner inp = new Scanner(System.in);
		Boolean quit =false;
		int i= 0;
		int veb = 59, chb = 79, pab = 99, chib = 99, sum = 0;
		
        do {
		System.out.println("==================================================");
		System.out.println("BURGER"+"\t\t\t\t\t\tMRP");
    	System.out.println("1. Veggie Burger"+"\t\t\t\t"+"59Rs");
        System.out.println("2. Cheese Burger"+"\t\t\t\t"+"79Rs");
        System.out.println("3. Panner Spl Burger"+"\t\t\t\t"+"99Rs");
        System.out.println("4. Chicken Burger"+"\t\t\t\t"+"99Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+orderbu);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{
            		sumbu=sumbu+veb;
            		orderbu=orderbu.concat("Veggie Burger"+"\n");
            	    break;
            	   }
            
            case 2:{
                	sumbu=sumbu+chb;
                	orderbu=orderbu.concat("Cheese Burger"+"\n");
                    break;
        		   }
            
            case 3:{
                	sumbu=sumbu+pab;
                	orderbu=orderbu.concat("Panner Spl Burger"+"\n");
                	break;
        		   }	
            
            case 4:{
            		sumbu=sumbu+chib;
            		orderbu=orderbu.concat("Chicken Burger"+"\n");
            		break;
        		   }
            
            case 5:{
            		quit = true;
            		break;
            	   }	
            default: 
            	System.out.println("Wrong Input");
               	break;
        	}
		}while(quit != true);
		
		System.out.println("==================================================");
		System.out.println("Your Order is:\n"+orderbu);
                     
    }
}
