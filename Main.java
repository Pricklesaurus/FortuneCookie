import java.util.Random;
import java.lang.String;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]){
    Random rand = new Random(); // Enables the use of Random

    int color = rand.nextInt(7); // Randomize lucky color
    int fortune = rand.nextInt(5); // Randomize fortune
    int number = rand.nextInt(100); // Randomize lucky number
    
    // Activate luckycol and fortuneout by leaving
    // blank for switch statements
    String luckycol = "";
    String fortuneout = "";

    // Uses the number color was randomized to
    // to determine luckycol
    switch(color){
      case 0:
        luckycol = "Red\n";
        break;
      case 1:
        luckycol = "Yellow\n";
        break;
      case 2:
        luckycol = "Orange\n";
        break;
      case 3:
        luckycol = "Green\n";
        break;
      case 4:
        luckycol = "Blue\n";
        break;
      case 5:
        luckycol = "Purple\n";
        break;
      case 6:
        luckycol = "Pink\n";
        break;
    }
    // Uses the number fortune was randomized to
    // to determine fortuneout
    switch(fortune){
      case 0:
        fortuneout = "All your hard work will soon pay off.\n";
        break;
      case 1:
        fortuneout = "Your seemingly lofty dreams will come true.\n";
        break;
      case 2:
        fortuneout = "Be wary of over-complimenters; they may be planning your downfall.\n";
        break;
      case 3:
        fortuneout = "Trying something new may bring more prosperity and joy than if you never tried it.\n";
        break;
      case 4:
        fortuneout = "A good meal and a full night's rest may help keep bad luck away.\n";
        break;
    }

    // Creates a new file called Cookie
    File newFile = new File("Cookie.txt");
    try{
      if(newFile.createNewFile()){
        System.out.println("Fortune Cookie Made!");
        }
      else{
        System.out.println("Fortune Cookie Failed.");
        }
      // Writes luckycol, fortuneout, and number to file
      FileWriter writer = new FileWriter("Cookie.txt");
      writer.write("Your Luck Color is: " +luckycol);
      writer.write("Your Fortune is: " +fortuneout);
      writer.write("Your Lucky number is: " +number);
      writer.close();
      System.out.println("Fortune Made!");
      }
    catch(IOException e){ // Catches any errors
      System.out.println("ERROR OCCURRED.");
      e.printStackTrace();
    }
    }
  }