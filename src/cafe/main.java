package cafe;
import java.util.Scanner;
import java.io.FileWriter; 
import java.io.IOException;

public class main {
	static String name="";
	static char[] nameArray;
	 public static void main(String[] args) throws InterruptedException{
     	
        Scanner sc = new Scanner(System.in);
	   	System.out.println("Welcome To Cafe Management System\nPlease enter your name:\n");
	   	name = sc.nextLine();
	   	nameArray = name.toCharArray();
	   	try
        {
            FileWriter fw=new FileWriter("name.txt"); 
            for (int i = 0; i < nameArray.length; i++)
            {
                fw.write(nameArray[i]); 
            } 
            fw.close();
        }
        catch(Exception e)
        {
        }
	   	Thread.sleep(1500);
		System.out.println("==================================================");
     	System.out.println("\tCAFE\tMANAGEMENT\tSYSTEM");
     	
     	cafe ob = new cafe();
     	ob.displayMain();
}
}
