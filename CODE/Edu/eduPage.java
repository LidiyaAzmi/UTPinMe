public class eduPage{
	
	private int max=5;
	private Subject subjects[]= new Subject[max];
	private int currnum=0;
	private Subject time;
	private Subject venue;
	
	//Add subject
	public boolean addSubject(Subject sub){
	
		if(currnum < max){
			subjects[currnum] = sub;
			currnum++;
			return true;	
		} else {
			return false;
		}	
}
	//remove the subject
	public boolean removeSubject(Subject sub){
		if(currnum > 0){
			for(int i = 0; i < currnum; i++){
				if(subjects[i].equals(sub)){
					subjects[i] = subjects[currnum-1];
					subjects[currnum-1] = null;
					currnum--;
					return true;
				}
			}
			return false;
		} else {
			return false;
		}	
	}
	// Checks if the subject is availabe
	public boolean getSubject(String sub,String array[]){
		
		for(String str : array){
			if(str!=null && str.equals(sub)){
				return true;
			}
		}
		return false;
	}
	
	//Display all the subjects added
	public void displaySubjects(){
		
		for(i=0;i<subjects.length;i++){
			
			System.out.print(subjects[i]+ "");
		}
		System.out.println();
		
	}
	//gives the location and venue of the subject
	public void notifyClass(Subject sub){
	
		String venue = sub.getVenue();
		String time= sub.getTime();
		
		System.out.println("The Subject Time is :"+ time);
		System.out.println("The Subject venue will be at :"+ venue);
	}
	
	public static void main(String[] args){
		
		// Create an instance of eduPage
        eduPage page = new eduPage();
        
        // Create some Subject objects
        Subject math = new Subject("Math", 4);
        math.setVenue("Room A");
        math.setTime("10:00 AM");
        Subject science = new Subject("Science", 3);
        science.setVenue("Room B");
        science.setTime("1:00 PM");
        
        // Add the subjects to the eduPage instance
        page.addSubject(math);
        page.addSubject(science);
        
        // Display the subjects
        page.displaySubjects();
        
        // Notify the class for the math subject
        page.notifyClass(math);
		
	}



}
