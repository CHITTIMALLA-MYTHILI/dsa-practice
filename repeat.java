public class repeat {
    public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        while (T-- > 0) {
            int N = sc.nextInt(); 
            int result = 0;

            for (int i = 0; i < N; i++) {
                int doll = sc.nextInt();
                result ^= doll; 
            }

            System.out.println(result); 
        }

	}
}
