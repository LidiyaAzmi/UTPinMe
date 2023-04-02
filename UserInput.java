import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);
    
    public Event getEvent() {
        //This code defines a public method called "getEvent" that returns an "Event" object. 
        //The method prompts the user for input and creates a new "Event" object with the user's input.
        
        int eventNum;
        //The "eventNum" variable will store the user's choice of event type, 
        //the "eventType" variable will store the string representation of the event type
        String eventType = "";
        String eventDetails;
        // the "eventDetails" variable is not used,
        //and the "eventDescription" variable will store the description of the event.
        String eventDescription;
        
        //These lines print a message to the console asking the user 
        //to choose between a formal event and an informal event.

        System.out.println("----> Event choice type <----\n");
        System.out.println("1: Formal Event");
        System.out.println("2: Informal Event\n");

        System.out.print("Enter Event Type: ");
        eventNum = this.scanner.nextInt();
        this.scanner.nextLine(); // consume leftover newline character

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
        String date = this.scanner.nextLine();
        System.out.print("Enter Time: ");
        String time = this.scanner.nextLine();
        System.out.print("Enter Venue: ");
        String venue = this.scanner.nextLine();

        System.out.println("\n----> User Input for Event Description <----\n");

        System.out.println("Enter Description of Event: ");
        String description = this.scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = this.scanner.nextLine();
        System.out.print("Contact Email: ");
        String contactEmail = this.scanner.nextLine();

        return new Event(eventType, date, time, venue, description, contactNumber, contactEmail);
    }
}
