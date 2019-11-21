package snacks;
import java.util.*;



public class pizza extends pastry{
	public String orderpi="";
	public int sumpi = 0;
	public void pizza() {
		Scanner inp = new Scanner(System.in);
		Boolean quit =false;
		int i= 0;
		int sus = 399, vev = 449, chc = 449, mac = 499, sum = 0;
		
        do {
		System.out.println("==================================================");
		System.out.println("PIZZA"+"\t\t\t\t\t\tMRP");
    	System.out.println("1. Super Supreme"+"\t\t\t\t"+"399Rs");
        System.out.println("2. Very Veggie"+"\t\t\t\t\t"+"449Rs");
        System.out.println("3. Chilli Cheese "+"\t\t\t\t"+"449Rs");
        System.out.println("4. Masala Chicken "+"\t\t\t\t"+"499Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+orderpi);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1: sumpi=sumpi+sus;
                    orderpi=orderpi.concat("Super Supreme"+"\n");
                   
                break;
            case 2:
                sumpi=sumpi+vev;
                orderpi=orderpi.concat("Very Veggie"+"\n");
                
                   break;
            case 3:
                sumpi=sumpi+chc;
                orderpi=orderpi.concat("Chilli Chicken"+"\n");
                  break;
            case 4:
                sumpi=sumpi+mac;
                orderpi=orderpi.concat("Masala Chicken"+"\n");
                break;
            case 5:
            	quit = true;
            	break;
            default: 
            	System.out.println("Wrong Input");
               	break;
        	}
		}while(quit != true);
		
		System.out.println("==================================================");
        System.out.println("Your Order is:\n"+orderpi);
	}
}

