// Practical-31: Write a Java Program to Print Numbers from 1 to 20, skipping numbers divisible by 5 using While Loop.
public class SkipMultiplesOfFive {
    public static void main(String args[]) {
        int l = 1;
        System.out.println("Numbers from 1 to 20 (skipping multiples of 5):");
        while (l <= 20) {
            if (l % 5 == 0) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }
    }
}

/* Output:
Numbers from 1 to 20 (skipping multiples of 5):
1 2 3 4 6 7 8 9 11 12 13 14 16 17 18 19
*/
