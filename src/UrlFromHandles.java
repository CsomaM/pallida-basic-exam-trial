import java.util.*;

public class UrlFromHandles{

    public static void main(String[] args){
        // Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
        // GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

        // example:
        // input: ["ghhandle1", "ghhandle2"]
        // output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]
        //System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));
        String s = input();
        printInput(s);
    }

    static String input () {
        System.out.println("Give me github handles separated by commas and I'll turn them into GitHub handles. ");
        Scanner sc = new Scanner(System.in);
        String handles = sc.nextLine();
        return handles;
    }

    static void printInput (String handles) {
        String [] handlesArray = handles.trim().split(",\\s");
        for (int i = 0; i < handlesArray.length; i++) {
            System.out.print("https://github.com/greenfox-academy/"+ handlesArray[i] + " ");
        }
    }
}