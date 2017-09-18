import java.util.*;

public class OddFilter {

    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list
        //System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
        // should print [1, 3, 5]
        print(sortOdd(fill()));
    }

    static ArrayList<Integer> fill (){
        System.out.println ("I'm gonna read number until you write *.");
        ArrayList numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String scan ="";
        int n = 0;
        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                numbers.add(n);
            }
        } while (!scan.equals("*"));
        return (numbers);
    }

    static ArrayList<Integer> sortOdd (ArrayList list){
        ArrayList oddList = new ArrayList();
        String element;
        int number;
        for (int i = 0; i < list.size(); i++) {
            element = list.get(i).toString();
            number = Integer.parseInt(element);
            if (number % 2 != 0) {
                oddList.add(list.get(i));
            }
        }
        return (oddList);
    }

    static void print (ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "," );
        }
    }
}
