import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("username mo boss?  ");

        Scanner loginScanner = new Scanner(System.in);

        String username_from_input = loginScanner.nextLine();

        System.out.println("password mo boss:");

        String password_from_input = loginScanner.nextLine();

        User me = new User(username_from_input, password_from_input);

        File myFile = new File ("accounts.text");
        if (myFile.exists()) {
            System.out.println("File exists");  
        }
         Scanner fileScanner = new Scanner(myFile);

         Boolean accountexist = false;
         while (fileScanner.hasNextLine()) {
            String filedata = fileScanner.nextLine();

            String username_from_file = filedata.split(",")[0];
            String password_from_file = filedata.split(",")[1];
            if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
                accountexist = true;
                break;
            }
         }

         if (accountexist){
            System.out.println("Logged in kana boss, Kamusta " + me.getUsername());
         } else {
            System.out.println("Walang ganyang account wag moko emehin");
         loginScanner.close();
         fileScanner.close();
     }
 }
}
