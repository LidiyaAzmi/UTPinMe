import java.util.Scanner;
import java.io.IOException;

class DisplayEvent {
    public void displayEvent(Event event) {
        clearConsole();
        String eventType = event.getEventType();
        System.out.print("----------------------------------------------------\n");
        if (eventType.equals("Formal Event")) {
            System.out.println("\n Event Type: Formal Event");
        } else if (eventType.equals("Informal Event")) {
            System.out.println("\n Event Type: Informal Event");
        } else {
            System.out.println("\nInvalid input");
            System.exit(0); // terminate program if input is invalid
        }

        System.out.println("\n");
        System.out.println("---- Event Details ----");
        System.out.println("Date: " + event.getDate());
        System.out.println("Time: " + event.getTime());
        System.out.println("Venue: " + event.getVenue());
        System.out.println("\n");
        System.out.println("---- Event Description ----");
        System.out.println("Description: " + event.getDescription());
        System.out.println("Contact Number: " + event.getContactNumber());
        System.out.println("Email: " + event.getContactEmail());
    }
    
    private void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
