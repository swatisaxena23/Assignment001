package gravity;

import java.util.Scanner;

public class Gravity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextInt();
        double grav = 9.8;
        double speed = 0.0;
        double distance = 0.0;
        speed = grav * 9.8;
        distance = 0.5 * grav * time * time;

    }
}
