import java.util.Scanner;
import java.io.File;

public class Board {
  public Board() {
    changePhrase();
  }

  // returns a random phrase from the text document
  private String loadPhrase() {
    String tempPhrase = "";

    int numOfLines = 0;
    tempPhrase = "how are you";
    try {

      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/Rekahp/Hangman/phrases.txt"));
      while (sc.hasNextLine()) {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try {
      int count = 0;
      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/Rekahp/Hangman/phrases.txt"));
      while (sc.hasNextLine()) {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }
    return tempPhrase;

  }
private String changePhrase;
  public String changePhrase() {
    changePhrase = loadPhrase();
    return changePhrase;
  }

  public String getChangePhrase(){
    return changePhrase;
  }


  //
  private int turns = 0;

  public int turnValue() {
    if (turns == 0) {
      turns = 1;
    } else if (turns == 1) {
      turns = 0;
    }
    return turns;
  }
  

  // code
  public String getPhrase() {
    return answer;
  }

  private String blanks;

  //public void setBlanks() {
    //blanks = mystery(phrase);
 //}

  //public String getBlanks() {
   // return mystery(phrase);
 //}
  public int getTurns(){
    return turns;
  }
  //hidden phrase-makes phrase hidden
  public String mystery(String loadPhrase) {
    String phrase = loadPhrase;
    blanks = "";
    for (int i = 0; i < phrase.length(); i++) {
      String letter = phrase.substring(i, i + 1);
      if (letter.equals(" ")) {
        blanks += " ";
      } else {
        blanks += "_";
      }
    }
    return blanks;
  }

  public boolean game = true;

  public void setGame(boolean x) {
    game = x;
  }

  public String prevGuesses = "";

  public void changeGuesses(String guess) {
    prevGuesses += guess;
  }
  private String answer;
  private String letters = "";

  public String guessLetter(){
    Scanner sc = new Scanner(System.in);
    answer = getChangePhrase();
    String blank = mystery(answer); 
    String newBlanks = "";
//sets the underscore to the letter
    while(!(newBlanks.equals(answer))){
      System.out.println("You have guessed " + letters +"\n");
      System.out.println("What letter would you like to guess");
      String guess = sc.nextLine();
      letters += guess + ", ";
      newBlanks = "";
      
      if(answer.contains(guess)){
        for(int i = 0; i < blank.length(); i++){
          if(answer.substring(i,i+1).contains(guess)){
            newBlanks += blank.substring(i,i+1).replace("_",guess);
            
          }
          else if(letters.contains(answer.substring(i,i+1)))
          {
            newBlanks += blank.substring(i,i+1).replace("_",answer.substring(i,i+1));

          }
          else{
            newBlanks += "_";
          }
        }
      }
      else{
        System.out.println("That letter is not in the phrase");
        return(newBlanks);
      }
      System.out.println(newBlanks);
    }
  
    return(newBlanks);
  }

  private String wordGuess;
  public String guessWord() {
    Scanner scin = new Scanner(System.in);
    wordGuess = scin.nextLine();
    if (wordGuess.equals(getChangePhrase())) {
      System.out.print("Good Game! You win!");
      System.exit(0);
    }
      else {
        System.out.println("Incorrect guess");

      }
      return wordGuess;
    }
  }

