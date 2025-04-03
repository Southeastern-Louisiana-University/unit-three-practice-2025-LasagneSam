package chapter12.chapter12;

import java.io.File;
import java.io.PrintWriter;

public class WriteData
{
  public static void main(String[] args) throws java.io.IOException
  {
    File file0 = new File("scores5.txt");
    if (file0.exists())
    {
      System.out.println(file0.getPath() + " already exists!!");
      System.exit(1);
    }
    PrintWriter output = new PrintWriter(file0);
    output.print("Robert Yates ");
    output.println("89");
    output.print("Alexander Hamilton ");
    output.println("109");
    output.close();
  }
}
