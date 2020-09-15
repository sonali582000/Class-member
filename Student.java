import java.util.*;
import java.math.BigInteger;

class Student extends Person 
{
int stuid;
String insname;
BigInteger phoneno;

public void read()
{
super.read();
Scanner sc1=new Scanner(System.in);
Random rndm=new Random();
stuid=rndm.nextInt(500);

System.out.print("Enter the Institute Name=");
insname=sc1.next();

System.out.print("Enter the Phone no=");
phoneno=sc1.nextBigInteger();
}

public void disp()
{
super.disp();
System.out.println("Student id="+this.stuid);
System.out.println("Institute Name="+this.insname);
System.out.println("Phone no="+this.phoneno);
}

}