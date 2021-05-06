import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the TODO CLI!");
    mainMenu();
  }

  public static void mainMenu(){    
    System.out.println("\nMain Menu:");
    System.out.println("------------------------");
    System.out.println("1. View Lists");
    System.out.println("2. Create a List");
    System.out.println("3. Exit");

    Scanner mainInput = new Scanner(System.in); 
    
    System.out.println("\nPlease enter your choice:");
    String mainChoice = mainInput.nextLine();

    switch(mainChoice) {
      case "1":
        System.out.println("Viewing All Lists:");
        mainMenu(); 
        break;    
      case "2":
        System.out.println("Create a List:");
        mainMenu(); 
        break;    
      case "3":
        System.out.println("Exiting. Goodbye!");
        break;    
    }
  }
}
