import java.util.Scanner;

public class Placement {
	public static void main(String args[])
    {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = src.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ECE = src.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = src.nextInt();
        
        if(CSE==ECE && ECE==MECH && CSE==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE>=0 && ECE>=0 && MECH>=0)
        {
        
            if (MECH>ECE && MECH>CSE)
            {
                System.out.println("Highest placement \nMECH");
            }
            else if(CSE>MECH && CSE>ECE)
            {
                System.out.println("Highest placement \nCSE");
            }
            else if(ECE>MECH && ECE>CSE)
            {
                System.out.println("Highest placement \nECE");
            }
            else if(ECE==MECH)
            {
                System.out.println("Highest Placement \nECE \nMECH");
            }
            else if(CSE==ECE)
            {
                System.out.println("Highest Placement \nCSE \nECE");
            }
            else if(CSE==MECH)
            {
                System.out.println("Highest Placement \nCSE \nMECH");
            }
        }  
        else
        {
            System.out.println("Input is invalid");
        }
    
}

}



