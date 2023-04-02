import java.util.Scanner;

public class Profile{
    public static void main(String[] args){
    
        //user input 
        Scanner Prof = new Scanner(System.in);
        
        System.out.println("PROFILE");
        System.out.println(" ");
        System.out.println("Enter Name: ");
        String name = Prof.nextLine();
        System.out.println("Enter email: ");
        String email = Prof.nextLine();
        System.out.println("Enter password: ");
        String password = Prof.nextLine();
        System.out.println("Enter mobile: ");
        String mobile = Prof.nextLine();
        System.out.println("Enter course: ");
        String course = Prof.nextLine();
        System.out.println("Enter intake: ");
        String intake = Prof.nextLine();
        
        Display profileDisplay = new Display();
        profileDisplay.displayProfile(name, email, password, mobile, course, intake);
        
        while (true){
            clearScreen();
            
            System.out.println(" ");
            System.out.println("MAIN MENU");
            System.out.println("1. View Profile");
            System.out.println("2. Edit Profile");
            System.out.println("3. Exit");
            
            System.out.println(" ");
            System.out.print("Enter choice: ");
            int choice = Prof.nextInt();
            Prof.nextLine();
            
            switch(choice){
                case 1:
                    //display profile details
                    profileDisplay.displayProfile(name, email, password,mobile, course, intake);
                    break;
                
                case 2:
                    //edit profile details
                    editProfile(Prof, profileDisplay);
                    break;
                
                case 3:
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            
        }

    }
    
    /*public static class Display{
        public void displayProfile(String name, String email, String password, String mobile, String course, String intake){
            clearScreen();
            System.out.println(" ");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Mobile: " + mobile);
            System.out.println("Course: " + course);
            System.out.println("Intake: " + intake);
            System.out.println(" ");
            System.out.print("Press Enter to continue...");
            new Scanner(System.in).nextLine();
        }
        
    }*/
    
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    
    public static class Display {
        private String name;
        private String email;
        private String password;
        private String mobile;
        private String course;
        private String intake;
        
        public void displayProfile(String name, String email, String password, String mobile, String course, String intake) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.mobile = mobile;
            this.course = course;
            this.intake = intake;
            clearScreen();
            System.out.println(" ");
            System.out.println("Name: " + this.name);
            System.out.println("Email: " + this.email);
            System.out.println("Password: " + this.password);
            System.out.println("Mobile: " + this.mobile);
            System.out.println("Course: " + this.course);
            System.out.println("Intake: " + this.intake);
            System.out.println(" ");
            System.out.print("Press Enter to continue...");
            new Scanner(System.in).nextLine();
        }
    
        public String getName() {
            return name;
        }
        
        public String getEmail() {
            return email;
        }
        
        public String getPassword() {
            return password;
        }
        
        public String getMobile() {
            return mobile;
        }
        
        public String getCourse() {
            return course;
        }
        
        public String getIntake() {
            return intake;
        }
    }

    
    /*public static void editProfile(Scanner Prof, Display profileDisplay) {
        // prompt the user to enter new values for each profile detail
        System.out.println("Enter new Name: ");
        String name = Prof.nextLine();
        System.out.println("Enter new email: ");
        String email = Prof.nextLine();
        System.out.println("Enter new password: ");
        String password = Prof.nextLine();
        System.out.println("Enter new mobile: ");
        String mobile = Prof.nextLine();
        System.out.println("Enter new course: ");
        String course = Prof.nextLine();
        System.out.println("Enter new intake: ");
        String intake = Prof.nextLine();

        // update profile details and display updated profile
        profileDisplay.displayProfile(name, email, password, mobile, course, intake);
    }*/
    
    public static void editProfile(Scanner Prof, Display profileDisplay) {
        // prompt the user to enter new values for each profile detail
        System.out.println("Enter new Name (press enter to keep current value): ");
        String name = Prof.nextLine();
        if (name.equals("")) {
            name = profileDisplay.getName();
        }
        
        System.out.println("Enter new email (press enter to keep current value): ");
        String email = Prof.nextLine();
        if (email.equals("")) {
            email = profileDisplay.getEmail();
        }
        
        System.out.println("Enter new password (press enter to keep current value): ");
        String password = Prof.nextLine();
        if (password.equals("")) {
            password = profileDisplay.getPassword();
        }
        
        System.out.println("Enter new mobile (press enter to keep current value): ");
        String mobile = Prof.nextLine();
        if (mobile.equals("")) {
            mobile = profileDisplay.getMobile();
        }
        
        System.out.println("Enter new course (press enter to keep current value): ");
        String course = Prof.nextLine();
        if (course.equals("")) {
            course = profileDisplay.getCourse();
        }
        
        System.out.println("Enter new intake (press enter to keep current value): ");
        String intake = Prof.nextLine();
        if (intake.equals("")) {
            intake = profileDisplay.getIntake();
        }
    
        // update profile details and display updated profile
        profileDisplay.displayProfile(name, email, password, mobile, course, intake);
    }

   
}
