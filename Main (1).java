import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String genieArt =
            "               __    __   \n"
          + "             /     \"     \\ \n"
          + "           |  o      o   | \n"
          + "           |     ||      | \n"
          + "           |     ()      | \n"
          + "           |    ____     | \n"
          + "            \\  `----'   /  \n"
          + "             `---------'   \n"
          + "           MAGICAL GENIE   \n";

        String celebrationGenie =
            "               __    __   \n"
          + "             /  *    *  \\ \n"
          + "           |            | \n"
          + "           |     ^^     | \n"
          + "           |    \\__/    | \n"
          + "           |    ----    | \n"
          + "            \\   '\\/    /  \n"
          + "             `---------'   \n"
          + "          CONGRATULATIONS! \n";

        System.out.println("Welcome to the Teacher Guesser Game!");
        System.out.println("Think of a teacher and answer the following questions with 'yes' or 'no'.\n");
        System.out.println(genieArt);

       
        askQuestion(scanner, "Is the teacher male?");

        if (getInput(scanner)) {
           
            askQuestion(scanner, "Does the teacher have black hair?");
            if (getInput(scanner)) {
                celebrate("David Jamero Betia", celebrationGenie);
            } else {
                askQuestion(scanner, "Does the teacher teach Chemistry?");
                if (getInput(scanner)) {
                    celebrate("Anthony Moro", celebrationGenie);
                } else {
                    askQuestion(scanner, "Is the teacher very funny?");
                    if (getInput(scanner)) {
                        celebrate("David Platt", celebrationGenie);
                    } else {
                        celebrate("Ethan Rink", celebrationGenie);
                    }
                }
            }
        } else {
            
            askQuestion(scanner, "Does the teacher teach Biology?");
            if (getInput(scanner)) {
                askQuestion(scanner, "Does the teacher have blonde hair?");
                if (getInput(scanner)) {
                    askQuestion(scanner, "Does the teacher have short hair?");
                    if (getInput(scanner)) {
                        celebrate("Dawn Frank", celebrationGenie);
                    } else {
                        askQuestion(scanner, "Does the teacher wear glasses?");
                        if (getInput(scanner)) {
                            celebrate("Susan Smith", celebrationGenie);
                        } else {
                            celebrate("Adrineh Ghazarian", celebrationGenie);
                        }
                    }
                } else {
                    askQuestion(scanner, "Does the teacher have long brown hair?");
                    if (getInput(scanner)) {
                        celebrate("Christina Engen", celebrationGenie);
                    } else {
                        celebrate("Orenda Tuason", celebrationGenie);
                    }
                }
            } else {
                askQuestion(scanner, "Does the teacher have short black hair and wear glasses?");
                if (getInput(scanner)) {
                    celebrate("Mimi Lim", celebrationGenie);
                } else {
                    askQuestion(scanner, "Does the teacher have shoulder-length blonde hair and wear glasses?");
                    if (getInput(scanner)) {
                        celebrate("Julie Patton", celebrationGenie);
                    } else {
                        celebrate("Cassandra Fishback", celebrationGenie);
                    }
                }
            }
        }

        scanner.close();
    }

    private static void askQuestion(Scanner scanner, String question) {
        System.out.println("\nGenie asks: " + question);
    }

    private static boolean getInput(Scanner scanner) {
        String response = scanner.nextLine();
        return response.equals("yes");
    }

    private static void celebrate(String teacherName, String celebrationGenie) {
        System.out.println("\nThe teacher you are thinking of is " + teacherName + ".");
        System.out.println(celebrationGenie);
    }
}
