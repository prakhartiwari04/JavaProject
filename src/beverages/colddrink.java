package beverages;
import java.util.Scanner;



public class colddrink extends coffee {
	public  String ordercd="";
	public int sumcd = 0;
	public void colddrink() {
	 Scanner inp = new Scanner(System.in);
	 Boolean quit =false;
	 int i= 0;
	
	 int coc=39, mod=39, spr=39, thu=39, sum = 0;
		
        do {
        	System.out.println("\t\t"+" "+" "+"COLD DRINKS");
		System.out.println("==================================================");
		System.out.println("Items"+"\t\t\t\t\tMRP");
    	System.out.println("1. Coca Cola"+"\t\t\t\t"+"39Rs");
        System.out.println("2. Mountain Dew"+"\t\t\t\t"+"39Rs");
        System.out.println("3. Sprite"+"\t\t\t\t"+"39Rs");
        System.out.println("4. Thumbs Up"+"\t\t\t\t"+"39Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+ordercd);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{ 
            		sumcd=sumcd+coc;
            		ordercd=ordercd.concat("Coca Cola"+"\n");
            		break;
            		}
            
            case 2:{
                	sumcd=sumcd+mod;
                	ordercd=ordercd.concat("Mountain Dew"+"\n");
                	break;
                	}
            
            case 3:{ 
            		sumcd=sumcd+spr;
            		ordercd=ordercd.concat("Sprite"+"\n");
            		break;
            		}
            
            case 4:{
            		sumcd=sumcd+thu;
            		ordercd=ordercd.concat("Thumbs Up"+"\n");
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
        System.out.println("Your Order is:\n"+ordercd);

        }

	}


