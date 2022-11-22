
public class Main {
    public static void main(String args[]) {
        Admin admin = new Admin();
        Board board = new Board(); 
        /*System.out.println(board.getPhrase());*/
        //accesses Spinner constructor
        Spinner spinner = new Spinner();
        System.out.println("Welcome to Phrase Solver!");
        System.out.println();
        System.out.print("Player One, ");
        //constructs player 1
        Player player1 = new Player();
        System.out.println("Player Two, ");
        //constructs player 2
        Player player2 = new Player();
        //flips value
        board.turnValue();
        //loops code till player 1 or player 2 runs out of money
        while (player1.getScore() > 0 && player2.getScore() > 0) {
            //player 1 turn
            if (board.getTurns() == 0) {
                System.out.println("It is currently "  + player1.getName() + "'s turn." );
                System.out.println("What would you like to do?");
                System.out.println("1 - Spin the wheel");
                System.out.println("2 - Guess a letter");
                System.out.println("3 - Guess the word");
                admin.setChoice();
                boolean repeat = true;
                while (repeat) {
                repeat = false;
                switch (admin.getChoice()) {
                    case 1:
                        player1.addScore(spinner);
                        board.turnValue();
                        break;
                    case 2:
                        board.guessLetter();
                        board.turnValue();
                        break;
                    case 3:
                    board.guessWord();
                    board.turnValue();
                        break;
                    default:
                        repeat = true;
                        break;
                       

                } //end switch
            break;
            } // end repeat
                
                
            } // end if 
            else if (board.getTurns() == 1) {
                System.out.println("It is currently "  + player2.getName() + "'s turn." );
                System.out.println("What would you like to do?");
                System.out.println("1 - Spin the wheel");
                System.out.println("2 - Guess a letter");
                System.out.println("3 - Guess the word");
                admin.setChoice();
                boolean repeat = true;
                while (repeat) {
                repeat = false;
                switch (admin.getChoice()) {
                    case 1:
                        player2.addScore(spinner);
                        board.turnValue();
                            break;
                    case 2:
                    board.guessLetter();
                    board.turnValue();
                        break;
                    case 3:
                    board.guessWord();
                    board.turnValue();
                        break;
                    default:
                        repeat = true;
                        break;
                       

                } //end switch
            
            } // end repeat
            //break;
            } else {
                System.out.println("Error");
            
            }
        }
        System.out.println("Game over");
        
        
    }
}