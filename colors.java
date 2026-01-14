import java.util.Scanner;

public class colors {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // number of dolls
            int maxBoxes = 0;

            for (int i = 0; i < N; i++) {
                int balls = sc.nextInt();
                maxBoxes = Math.max(maxBoxes, balls);
            }

            System.out.println(maxBoxes);
}
	}
}
