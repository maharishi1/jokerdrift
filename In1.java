import java.util.Scanner;
class In1
{
public static void main(String agf[])
{
int i,j;
int a[]=new int[10];
Scanner in=new Scanner(System.in);
System.out.println("Enter the range");
int b=in.nextInt();
System.out.println("Enter the value");
for(i=0;i<b;i++)
{
a[i]=in.nextInt();
}
for(j=1;j<b;j++)
{
int key=a[j];
i=j-1;
while(i>=0&&a[i]>key)
{
a[i+1]=a[i];
i=i-1;
a[i+1]=key;
}

}
System.out.println("Here is the output");
for(i=0;i<b;i++)
{
System.out.println(a[i]);
}
}
}