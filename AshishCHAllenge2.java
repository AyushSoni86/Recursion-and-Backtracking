public class AshishCHAllenge2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i < 4){  // spaces
                for (int j = 5 - 1; j >= i; j--) {
                    System.out.print(" ");
                }

                // left triangle
                for (int j = i; j >= 0; j--) {
                    if (j == i) System.out.print("1");
                    else System.out.print("#");
                }

                // right triangle
                for (int j = 1; j <= i; j++) {
                    if (j == i) System.out.print(i + 1);
                    else System.out.print("#");
                }
            }

            // last line
            if (i==4){
                int count = 1;
                System.out.print(" ");
                for (int j = 0; j <= 2*i; j++) {
                    if (j%2==0)
                    System.out.print(count++);
                    else System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
