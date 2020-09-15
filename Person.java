import java.util.*;

class Person 
{
String name;
int age;
int height;

public void read()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name=");
name=sc.next();
System.out.print("Enter age=");
age=sc.nextInt();
System.out.print("Enter height=");
height=sc.nextInt();
}

public void disp()
{
System.out.println("Name="+this.name);
System.out.println("Age="+this.age);
System.out.println("Height="+this.height);
}
}