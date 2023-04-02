import java.util.Scanner;

public class HomeUser {
    public static void main(String[] args) {

        // user input
        Scanner HU = new Scanner(System.in);
        int eventNum;
        String eventType = "";
        String eventDetails;
        String eventDescription;

        System.out.println("----> Event choice type <----\n");
        System.out.println("1: Formal Event");
        System.out.println("2: Informal Event\n");

        System.out.print("Enter Event Type: ");
        eventNum = HU.nextInt();
        HU.nextLine(); // consume leftover newline character

        if (eventNum == 1) {
            eventType = "Formal Event";
        } else if (eventNum == 2) {
            eventType = "Informal Event";
        } else {
            System.out.println("\nInvalid input");
            System.exit(0); // terminate program if input is invalid
        }

        System.out.println("\n----> User Input for Event Details <----\n");

        System.out.print("Enter Date: ");
        String date = HU.nextLine();
        System.out.print("Enter Time: ");
        String time = HU.nextLine();
        System.out.print("Enter Venue: ");
        String venue = HU.nextLine();

        System.out.println("\n----> User Input for Event Description <----\n");

        System.out.println("Enter Description of Event: ");
        String description = HU.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = HU.nextLine();
        System.out.print("Contact Email: ");
        String contactEmail = HU.nextLine();

        display eventDisplay = new display();
        eventDisplay.displayEvent(eventNum, date, time, venue, description, contactNumber, contactEmail);
    }

    public static class display {
        public void displayEvent(int eventNum, String date, String time, String venue, String description, String contactNumber, String contactEmail) {
            
            String eventType="";
            System.out.print("----------------------------------------------------\n");
            if (eventNum == 1) {
            eventType = "Formal Event";
            } else if (eventNum == 2) {
                eventType = "Informal Event";
            } else {
                System.out.println("\nInvalid input");
                System.exit(0); // terminate program if input is invalid
            }
            
            System.out.println("\n Event Type: " + eventType);
            System.out.println("\n");
            System.out.println("---- Event Details ----" );
            System.out.println("Date: " + date);
            System.out.println("Time: " + time);
            System.out.println("Venue: " + venue);
            System.out.println("\n");
            System.out.println("---- Event Description ----" );
            System.out.println("Description: " + description);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("Email: " + contactEmail);
        }
    }
}
