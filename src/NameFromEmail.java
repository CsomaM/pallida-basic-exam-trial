import java.util.*;

public class NameFromEmail{

    public static void main(String[] args){
        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter
        //System.out.println(nameFromEmail("elek.viz@exam.com"));
        String email = input();
        String [] username = sortInput(email);
        System.out.print(username[1] + " " + username[0]);
    }

    static String input () {
        System.out.println("Give me an e-mail address and I'll give you a user name. Format it: firstName.lastName@example.com ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        return email;
    }

    static String[] sortInput (String email) {
        String [] userName = email.split("\\.|@");
        return (userName);
    }
}
