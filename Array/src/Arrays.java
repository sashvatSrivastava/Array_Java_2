import java.util.*;

public class Arrays {
    public static void main(String args[]){
        System.out.println("Tell the computer how many values you want to enter");
        Scanner val = new Scanner(System.in);
        int value = val.nextInt();
        
        int arr[]= new int[value];
        
        for (int i = 0; i < (value); i++)
        {
            System.out.println("Enter value number " + (i+1));
            int inp = val.nextInt();
            arr[i] = inp;
        }
        for (int j = 0; j < value; j++)
        {
        	System.out.println(arr[j]);
        }
        val.close();
    }
}