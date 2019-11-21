package snacks;

import java.util.Scanner;



public class pastry extends burger {
	public String orderpa="";
	public int sumpa = 0;
	public void pastry() {
		
		Scanner inp = new Scanner(System.in);
		Boolean quit =false;
		int i= 0;
		
		
		int chp = 49, blp = 39, chep = 49, frp = 59, sum = 0;
		
        do {
		System.out.println("==================================================");
		System.out.println("PASTRY"+"\t\t\t\t\t\tMRP");
    	System.out.println("1. Choco Pastry"+"\t\t\t\t\t"+"49Rs");
        System.out.println("2. BlackForest Pastry"+"\t\t\t\t"+"39Rs");
        System.out.println("3. Cheese Pastry "+"\t\t\t\t"+"49Rs");
        System.out.println("4. Fruit Pastry "+"\t\t\t\t"+"59Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+orderpa);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{
            		sumpa=sumpa+chp;
                    orderpa=orderpa.concat("Choco Pastry"+"\n");
                    break;
            	   }	
            
            case 2:{	
                 	sumpa=sumpa+blp;
                 	orderpa=orderpa.concat("BlackForest Pastry"+"\n");
                 	break;
        		   }
            
            case 3:{
                	sumpa=sumpa+chep;
                	orderpa=orderpa.concat("Cheese Pastry"+"\n");
                	break;
        		   }
            
            case 4:{
                	 sumpa=sumpa+frp;
                	 orderpa=orderpa.concat("Fruit Pastry"+"\n");
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
        System.out.println("Your Order is:\n"+orderpa);
  
        }
	}

		

	