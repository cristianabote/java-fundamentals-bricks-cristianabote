import java.util.Scanner;

public class Bricks {
    public static void main(String[] args)
    {
        //Patlu and Motu want to build a house and they have to put some number of bricks n from one place to another.
        // They decided , that the one who puts the last brick would win a dinner.
        //They have to follow a simple rule: in the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.
        //There are only n bricks, who put the last brick.
        //Input:
        //number of bricks 
        //Output:
        //Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.
        int i,numberOfBricks;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul de caramizi: " );
        numberOfBricks=scan.nextInt();
        for(i=1;numberOfBricks-3*i>0;i++)
            numberOfBricks=numberOfBricks-3*i;
        if(numberOfBricks-i<=0)
            System.out.println("Patlu wins");
        else
            System.out.println("Motu wins");

    }
}
