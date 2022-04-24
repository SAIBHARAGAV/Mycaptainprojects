import java.util.Scanner;
class Prime{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please insert any number..");
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else{
            System.out.println(n+" is a prime number");
        }
    }
}
