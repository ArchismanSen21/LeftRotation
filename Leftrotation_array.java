import java.util.Scanner;

public class Leftrotation_array
{
    public static void rotateLeft(int ar[],int x,int n)
    {
        int t[]=new int[x];
        for(int i=0;i<x;i++)
            t[i]=ar[i];
        for(int i=x;i<n;i++)
            ar[i-x]=ar[i];
        for(int i=0;i<x;i++)
            ar[i+n-x]=t[i];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
            System.out.println("Print the array before modification : ");
            for(int i=0;i<n;i++)
                System.out.print(ar[i]+" ");
            System.out.println();
            System.out.println("Enter the inder around which the array will rotate : ");
            int x = sc.nextInt();
            rotateLeft(ar,x,n);
            System.out.println("Print the array after modification : ");
            for(int i=0;i<n;i++)
                System.out.print(ar[i]+" ");
            System.out.println();
    }
}