public class AshishChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            int end = i * 2 - 1;
            for (int j = 0; j < end; j++) {
                int count = 1;
                if (j == 0)
                    System.out.print(j + 1);
                System.out.print("#");
                if (j == end - 1)
                    System.out.print(i);
                if (i == 5 && j % 2 == 0) {
                    System.out.print(count++);
                }
            }
            System.out.println();
        }
    }
}
