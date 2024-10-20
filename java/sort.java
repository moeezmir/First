import java.util.Scanner;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        int i;
        System.out.print("Enter your limit : ");
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
            }
        }   
        for(i=0;i<n;i++)
        System.out.print(" "+a[i]);
}
}