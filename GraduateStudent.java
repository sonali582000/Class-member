import java.util.*;

class GraduateStudent extends Student
{
String progname;
int noofsub;
String classteaname;

public void read()
{
super.read();
Scanner sc2=new Scanner(System.in);
System.out.print("Enter the Program Name=");
progname=sc2.nextLine();

System.out.print("Enter the No of Subject=");
noofsub=sc2.nextInt();

System.out.print("Enter the class Teacher Name=");
classteaname=sc2.next();
}

public void disp()
{
super.disp();
System.out.println("Program Name="+this.progname);
System.out.println("No of Subject="+this.noofsub);
System.out.println("class Teacher Name="+this.classteaname);
}

public static void main(String arg[])
{
    GraduateStudent gs1[]= new GraduateStudent[3];
    gs1[0]=new GraduateStudent();
    gs1[0].read();
    
    gs1[1]=new GraduateStudent();
    gs1[1].read();
    
    gs1[2]=new GraduateStudent();
    gs1[2].read();


for (int i=0;i<gs1.length;i++)
{
if (gs1[i].height>150 && gs1[i].progname.equals("BCA"))
{
System.out.println("********************\n");
gs1[i].disp();
}
}
}
}
