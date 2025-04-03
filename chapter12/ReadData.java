package chapter12.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File file1 = new File("score5.txt");
    try
    {
      Scanner input = new Scanner(file1);
      while (input.hasNext())
      {
        String firstName = input.next();
        String lastName = input.next();
        String iq = input.next();
        System.out.println(firstName + " " + lastName + " " + iq);
      }

    }
    catch (FileNotFoundException e)
    {
      System.out.print("you bloody moron THE FILE'S SUPPOSED TO BE RIGHT HERE");
    }
  }
}
