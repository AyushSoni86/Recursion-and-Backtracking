package Recursion_By_Striver.Lecture2;

public class DS_01_print_name_five_times {
    public static void main(String[] args) {
        printName(5);
    }

    static void printName(int i) {
        if (i == 0)
            return;
        System.out.println("Ayush");
        printName(i - 1);
    }
}
