package beverages;
import java.util.Scanner;


public class coffee{
	public String ordercf="";
	public int sumcf = 0;
	public void coffee() {
		Scanner inp = new Scanner(System.in);
		Boolean quit =false;
		int i= 0;
		
		int blc = 79, cal = 89, fra= 89, esp = 69, sum = 0;
		
        do {
        	System.out.println("\t\t"+" "+" "+"  "+"COFFEE");
        System.out.println("==================================================");
		System.out.println("Item"+"\t\t\t\t\tMRP");
    	System.out.println("1. Black Coffee"+"\t\t\t\t"+"79Rs");
        System.out.println("2. Cafe Latte"+"\t\t\t\t"+"89Rs");
        System.out.println("3. Frappucino"+"\t\t\t\t"+"89Rs");
        System.out.println("4. Espresso"+"\t\t\t\t"+"69Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+ordercf);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{ 
            		sumcf=sumcf+blc;
            		ordercf=ordercf.concat("Black Coffee"+"\n");
            		break;
            		}	
            case 2:{
                	sumcf=sumcf+cal;
                	ordercf=ordercf.concat("Cafe Latte"+"\n");
                	break;
            		}
            case 3:{ 
            		sumcf=sumcf+fra;
            		ordercf=ordercf.concat("Frappucino"+"\n");
            		break;
            		}
            case 4:{
            		sumcf=sumcf+esp;
            		ordercf=ordercf.concat("Espresso"+"\n");
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
        System.out.println("Your Order is:\n"+ordercf);

	}
}	
