import java.util.Scanner;

public class HomeUser {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Event event = userInput.getEvent();
        DisplayEvent display = new DisplayEvent();
        display.displayEvent(event);
    }
}
