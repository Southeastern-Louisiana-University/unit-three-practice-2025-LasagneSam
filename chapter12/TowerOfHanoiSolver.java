package chapter12.chapter12;
import java.util.Scanner;

public class TowerOfHanoiSolver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many disks would you like to start with on stack A? ");
        int numD = input.nextInt();
        System.out.println("\nPicture, if you will, three spots designated for stacks of disks, labelled respectively from left to right, 'A', 'B', and 'C'.");
        System.out.println("Your " + numD + " disks start on the leftmost one, stack A. You need to get them all to stack C, without ever putting a disk not in a stack,");
        System.out.print("taking a disk from anywhere other than the top of the stack, or putting a disk on top of a smaller disk. This is how you would go about it. (Press enter to continue...)");
        input.nextLine();
        input.nextLine();
        System.out.print("\n");
        solveTowerOfHanoi(numD, 'A', 'B', 'C');
    }

    public static void solveTowerOfHanoi(int numD, char src, char aux, char dest)
    {
        if (numD == 1)
        {
            System.out.println("Move disk from " + src + " to " + dest + ".");
        }
        if (numD > 1)
        {
            solveTowerOfHanoi(numD - 1, src, dest, aux);
            solveTowerOfHanoi(1, src, aux, dest);
            solveTowerOfHanoi(numD - 1, aux, src, dest);
        }
    }
}
