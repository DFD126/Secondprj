package iuh.fit.oop;
import java.util.Scanner;
/**
 * @description: Something something related to Rectangle
 * @author: Pham Nguyen Huy Hoang
 * @version: 1.0
 * @created: 25-Aug-2025 09:33:44 AM
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            Rectangle rect = new Rectangle(length, width);
            System.out.println(rect.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
