import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("What number do you want to begin counting from?");
    int counter = sc.nextInt();
    
    System.out.println("What number do you want to end counting at?");
    int numberA = sc.nextInt();

    
    for (int i=counter; i<=numberA; i=i+2){
      if (i%2 == 1){
        i++;
      }
      System.out.println(i);
    }
      
    }
    
  }
