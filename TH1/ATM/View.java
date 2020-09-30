import java.util.Scanner;

public class View {

  Scanner scan;

  void start() {
    scan = new Scanner(System.in);
    System.out.println("===== Welcome to ATM Application =====");
  }

  // Menu input
  int menu() {
    System.out.println();
    System.out.println("-------- ATM Application --------");
    System.out.println("1 - Login");
    System.out.println("---------------------------------");
    System.out.print("Select your action: ");
    int action = scan.nextInt();
    return action;
  }

  // Nhap Username va Password
  String[] loginForm() {

    System.out.print("Enter Username: ");
    String user = scan.next();
    System.out.print("Enter Password: ");
    String pass = scan.next();
    String[] data = { user, pass };
    return data;
  }

  // Nhap Username va Password
  boolean display(String message) {

    System.out.println();
    System.out.println("Result: " + message);
    System.out.println();
    // Yes-No question
    System.out.print("Continue? (y/n): ");
    String choice = scan.next();
    System.out.println();

    if (choice.equalsIgnoreCase("y"))
      return true;

    System.out.println("See you again~");
    return false;
  }
}