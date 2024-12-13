/* 
    Lecture note example - Methods
*/

class LectureMethod{
    private static double raise(double salary, int percent){
        double amount = salary + (salary * (percent/100.0));
        return amount;
    }
    public static void main(String args[]) {
        printAnimal();
        greeting(" Matthew");       
        greeting(" Amberdingus");
        greeting(" Taqquirias#"); 
        double newSalary = raise(100000.62,3);
       
        
        newSalary = raise(newSalary,6);
        newSalary = raise(newSalary,6);
        newSalary = raise(newSalary,6);
        newSalary = raise(newSalary,6);
        System.out.print(newSalary);
        // Your Code Goes here!
	}
	public static void greeting(String name){
	    System.out.println("Hello" + name);
	}
	
	public static void printAnimal(){
        System.out.println("      .");
        System.out.println("\\_____)\\_____");
        System.out.println("/--v____ __`<");
        System.out.println("        )/   ");
    
	}
}

