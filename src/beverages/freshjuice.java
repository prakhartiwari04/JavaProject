package beverages;
import java.util.Scanner;



public class freshjuice extends colddrink {
	public String orderfj="";
	public int sumfj = 0;
	
	public void freshjuice() {
	 Scanner inp = new Scanner(System.in);
	 Boolean quit =false;
	 int i= 0;
	 int orj=39, mij=39, apj=39, waj=39, sum = 0;
		
        do {
        	System.out.println("\t\t"+" "+" "+"  "+"FRESH JUICE");
		System.out.println("==================================================");
		System.out.println("Items"+"\t\t\t\t\t\tMRP");
    	System.out.println("1. Orange Juice"+"\t\t\t\t\t"+"39Rs");
        System.out.println("2. Mixed Fruit Juice"+"\t\t\t\t"+"39Rs");
        System.out.println("3. Apple Juice"+"\t\t\t\t\t"+"39Rs");
        System.out.println("4. Watermelon Juice"+"\t\t\t\t"+"39Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+orderfj);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{ 
            		sumfj=sumfj+orj;
            		orderfj=orderfj.concat("Orange Juice"+"\n");
            		break;
            		}
            case 2:{
                	sumfj=sumfj+mij;
                	orderfj=orderfj.concat("Mixed Fruit Juice"+"\n");
                	break;
            		}
            case 3:{ 
            		sumfj=sumfj+apj;
            		orderfj=orderfj.concat("Apple Juice"+"\n");
            		break;
            		}
            case 4:{
            		sumfj=sumfj+waj;
            		orderfj=orderfj.concat("Watermelon Juice"+"\n");
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
        System.out.println("Your Order is:\n"+orderfj);
 
	}
}