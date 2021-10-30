package sept22;

import java.util.Scanner;
public class Calculator
{
//Build Calculator class with methods and fields listed above
  private static double value;
  {
    value = 0.0;
  }
  public void add (int n)
  {
    value = value + n;
  }
  public void subtract (int n)
  {
    value = value - n;
  }
  public void multiply (int n)
  {
    value = value * n;
  }
  public void divide (int n)
  {
    value = value = n;
  }
  public void clear ()
  {
    value = 0.0;
  }
  public double getValue ()
  {
    return value;
  }

}
