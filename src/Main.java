// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age= scan.nextInt();
        Election election=new Election();
        System.out.println(election.eligible_vote(age));


    }
}
class Election
{
    String eligible_vote(int age)
    {
        if (age>=18)
        {
            return "Eligible For Vote";
        }
        else
        {
            return "Not Eligible For Vote";
        }
    }
}