/*
 * This source file was generated by the Gradle 'init' task
 */
package ticket.booking;

import ticket.booking.entities.User;
import ticket.booking.services.UserBookingService;
import ticket.booking.util.UserServiceUtil;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public String getGreeting() {
        return "Running Train Booking System.\n Welcome to IRCTC.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Scanner scanner = new Scanner(System.in);

        int option = 0;

        UserBookingService userBookingService;

        try {
            userBookingService = new UserBookingService();
        }catch (IOException e) {
            System.out.println(e);
            return;
        }

        while(option!=7) {
            System.out.println("Choose Option");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Bookings");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a seat");
            System.out.println("6. Cancel My Booking");
            System.out.println("7. Exit the App");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the username to signup");
                    String nameToSignUp = scanner.next();
                    System.out.println("Enter the password to signup");
                    String passwordToSignUp = scanner.next();
                    User userToSignup = new User(nameToSignUp, passwordToSignUp,
                        UserServiceUtil.hashPassword(passwordToSignUp),
                        new ArrayList<>(), UUID.randomUUID().toString());
                    userBookingService.signUp(userToSignup);
                    break;
                case 2:

            }
        }

        while(option!=7) {
            System.out.println("Choose Option");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Bookings");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a seat");
            System.out.println("6. Cancel My Booking");
            System.out.println("7. Exit the App");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the username to signup");
                    String nameToSignUp = scanner.next();
                    System.out.println("Enter the password to signup");
                    String passwordToSignUp = scanner.next();
                    User userToSignup = new User(nameToSignUp, passwordToSignUp,
                            UserServiceUtil.hashPassword(passwordToSignUp),
                            new ArrayList<>(), UUID.randomUUID().toString());
                    userBookingService.signUp(userToSignup);
                    break;
                case 2:
                    System.out.println("Enter username to login");
                    String nameToLogin = scanner.next();
                    System.out.println("Enter password to login");
                    String passwordToLogin = scanner.next();
                    User userToLogin = new User(nameToLogin, passwordToLogin, UserServiceUtil.hashPassword(passwordToLogin), new ArrayList<>(), UUID.randomUUID().toString());
                    try{
                        userBookingService = new UserBookingService(userToLogin);
                    }catch (IOException e) {
                        System.out.println(e.toString());
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Fetching your bookings");
                    userBookingService.fetchBooking();
                    break;
                case 4:
                    System.out.println("Search Trains functionality is not implemented yet.");
                    break;
                case 5:
                    System.out.println("Book a seat functionality is not implemented yet.");
                    break;
                case 6:
                    System.out.println("Enter Ticket ID to cancel");
                    String ticketIdToCancel = scanner.next();
                    userBookingService.cancelBooking(ticketIdToCancel);
                    System.out.println("Booking cancelled successfully!");
                    break;
                case 7:
                    System.out.println("Exiting the App...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }







//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        List<Integer> evenList = list.stream().filter(num -> num%2==0).collect(Collectors.toList());
//        list.stream().map(e -> e*2).collect(Collectors.toList());
    }
}
