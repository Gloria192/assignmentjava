public class Number {
    public static void main(String[] args) {
        int secretNumber = 42; 
        int guess = 50; 
        int attempts = 0; 
        int maxAttempts = 10; 

        while (guess != secretNumber && attempts < maxAttempts) {
            attempts++; 

            if (guess > secretNumber) {
                System.out.println("Guess " + guess + ": Too high");
                guess -= 10; // Decrease guess value
            } else if (guess < secretNumber) {
                System.out.println("Guess " + guess + ": Too low");
                guess += 10; // Increase guess value
            }
        }

        // Check if the correct number was guessed
        if (guess == secretNumber) {
            System.out.println("Guess " + guess + ": Correct!");
            System.out.println("You won in " + attempts + " attempts!");
        } else {
            System.out.println("Game Over! Secret was " + secretNumber);
        }
    }
}

    
   
// attemps ++;
// System.out.println("guess" +guess+ ":correct");
// System.out.println("you won in"+attemps +"attempts !");
// }
// }
