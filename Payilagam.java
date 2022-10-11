class Payilagam
{
int idnumber;
String name;
String course;
String duration;
public Payilagam(int idnumber,String name,String course,String duration)
{

System.out.println(idnumber+"       "+name+"            "+course+"          "+duration);
idnumber=idnumber;
name=name;
course=course;
duration=duration;
}
public static void main(String[]args)
{
System.out.println("Idnumber"+"     "+"Name"+"       "+"Course"+"      "+"Duration");
Payilagam s1=new Payilagam(101,"madhavi","java","3month");
Payilagam s2=new Payilagam(102,"janani","java","3month");
Payilagam s3=new Payilagam(103,"Ramya","css","2month");
Payilagam s4=new Payilagam(104,"Sobhika","java","2month");
Payilagam s5=new Payilagam(105,"sasi",".net","4month");
Payilagam s6=new Payilagam(106,"Haja","php","6month");
Payilagam s7=new Payilagam(107,"Dinakar","html","3month");
Payilagam s8=new Payilagam(108,"Dinesh","css","2month");
}
}
