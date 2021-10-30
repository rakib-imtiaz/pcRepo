package car;

public class PrintDemo
{
	  public static void main (String[]args)
  {


String_printer("ishika");
String_printer("ishika",2000);
String_printer("ishika",20000,"basabo");


  }

  static void  String_printer (String Str)
  {
    System.out.println ("This is"+Str);
  } 
  
  static void  String_printer (String Str,int tk,String addr)
  {
        System.out.println ("This is"+Str+"i have tk :  "+tk+"and i live in "+addr);

  }


 

  static void  String_printer (String Str, int tk)
  {
    System.out.println ("This is"+Str+"i have tk :  "+tk);
  }



}