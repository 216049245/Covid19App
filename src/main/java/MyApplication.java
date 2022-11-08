/*
* MyApplication.java
* This is the main entry point into the application
* @author Brandon Kruger (216049245)
* 31 January 2022
*/

import com.brandonkruger.Domain.Person;
import java.util.Arrays;

public class MyApplication {

    public static int initialise(Person[] p, int size) {
        p[0] = new Person("Shaun", "Wells", "male", 178, 90.4f);
        p[1] = new Person("Susan", "Buys", "female", 148, 63.2f);
        p[2] = new Person("Bob", "Denel", "male", 192, 87.1f);
        p[3] = new Person("Charlene", "Boat", "female", 162, 113.1f);
        p[4] = new Person("Mark", "William", "male", 155, 67.1f);
        size = 5;
        return size;
    }
    public static void sort(Person[] p, int size) {
        Arrays.sort(p);
    }

    public static void display(Person []p, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(p[i].toString());
        }
    }
    public static void main(String[] args) {
                Person[] p = new Person[5];
                int size = 0;

                size = initialise(p, size);

                sort(p, size);

                display(p, size);
        }
    }

