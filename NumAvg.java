import java.util.Scanner;
import java.util.TreeSet;

public class NumAvg {
    private TreeSet<Integer> numSet;

    public NumAvg() {
        numSet = new TreeSet<>();
    }

    public void addNum(int num) {
        if (num % 5 != 0 && num % 6 != 0) {
            numSet.add(num);
        }
    }

    public double calAvg() {
        if (numSet.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int num : numSet) {
            sum += num;
        }
        return (double) sum / numSet.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();

        while (true) {
            System.out.println("1.Add number\n2.Find average\n3.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the number");
                    int number = scanner.nextInt();
                    numAvg.addNum(number);
                    break;
                case 2:
                    double average = numAvg.calAvg();
                    if (average == 0.0) {
                        System.out.println("The set is empty");
                    } else {
                        System.out.println(average);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}