import java.util.Scanner;

public class FindLargestSmallestNumber {
 
        public static void main(String[] args) {
           
        	 Scanner in = new Scanner(System.in);
             System.out.print("Enter no. of elements you want in array:");
             int n = in.nextInt();
             int numbers[] = new int[n];
             System.out.println("Enter all the elements:");
             for(int i = 0; i < n; i++)
             {
            	 numbers[i] = in.nextInt();
                 
             }
               
                //assign first element of an array to largest and smallest
                int smallest = numbers[0];
                int largetst = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > largetst)
                                largetst = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + largetst);
                System.out.println("Smallest Number is : " + smallest);
        }
}