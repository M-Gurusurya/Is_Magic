import java.util.Scanner;

public class IsMagic {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(findMagicNumber(number));
    }
    public static int findMagicNumber(int number)
    {
        if(number==1)
        {
            return 1;
        }
        if(number<10)
        {
            return 0;
        }
        else{
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return findMagicNumber(sum);
        }
    }
}
