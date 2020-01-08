import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        display(3);
    }
    public static void display(int number)
    {
        if(number < 1)
            System.out.println('B');
        else
        {

            System.out.println('R');
            display(number-1);
        }
    }
}
