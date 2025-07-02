import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        selectionSort(a,n);
        bubbleSort(a,n);
        insertionSort(a,n);

    }
    public static void selectionSort(int[] a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
        }
        System.out.println("Selection Sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] a,int n)
    {
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;
            while (j>0 && a[j-1]>a[j])
            {
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        System.out.println("InsertionSort");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
