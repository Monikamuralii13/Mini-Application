import java.util.*;

public class Railway {
    static Scanner sc = new Scanner(System.in);
    static String admin_user = "Admin";
    static String admin_password = "1234";
    public static int[] berth = new int[13];
    static int current_user = 0;
    static int State = 1;
    static int Admin_attempt = 1;
    public String User_Name, User_Pin;
    public int User_attempt;
    public ArrayList<String> Old_user;
    static int[] seats = new int[200];
    static Railway[] user;

    Railway(String Name, String Pin) {
        this.User_Name = Name;
        this.User_Pin = Pin;
        this.User_attempt = 1;
    }

    public static void Admin_login() {
        while (Admin_attempt <= 2) {
            System.out.print("\033[H\033[2J");
            System.out.print("\t Welcome Admin \n Enter the Admin User Id : ");
            String User_Id = sc.next();
            sc.nextLine();
            System.out.print("\n Enter the Admin Password : ");
            String User_Password = sc.next();
            sc.nextLine();
            if (admin_user.equals(User_Id) && admin_password.equals(User_Password)) {
                Admin();
            } else {
                Admin_attempt += 1;
            }
        }
        if (Admin_attempt == 3) {
            System.out.print("\033[H\033[2J");
            System.out.println("This is your Final Attempt,Please Enter Valid Password:");
            System.out.print("\nEnter the Admin User Id : ");
            String User_Id = sc.next();
            sc.nextLine();
            System.out.print("\nEnter the Admin Password : ");
            String User_Password = sc.next();
            sc.nextLine();
            if (admin_user.equals(User_Id) && admin_password.equals(User_Password)) {
                Admin();
            } else {
                Admin_attempt += 1;
            }
