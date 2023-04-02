import java.util.Scanner;

class Event {
    
    //They are private because they can only be accessed within the class itself
    //Each variable stores information about the event, such as the event type, date, time, 
    //venue, description, contact number, and contact email.
    private String eventType;
    private String date;
    private String time;
    private String venue;
    private String description;
    private String contactNumber;
    private String contactEmail;

    //This code defines a constructor for the "Event" class that takes seven parameters:
    //eventType, date, time, venue, description, contactNumber, and contactEmail.
    //The constructor initializes the private instance variables 
    //with the values of these parameters.
    public Event(String eventType, String date, String time, String venue, String description, String contactNumber, String contactEmail) {
        this.eventType = eventType;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.description = description;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
    }
    
    
    //These lines define public methods for the "Event" 
    // class that can be used to access the private instance variables. 
    
    //These methods are called "getters" and 
    //they return the values of the private instance variables.
    
    //They allow other parts of the program to access the information about the event without directly 
    //accessing the private instance variables themselves, which would violate encapsulation.
    public String getEventType() {
        return eventType;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    public String getDescription() {
        return description;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
