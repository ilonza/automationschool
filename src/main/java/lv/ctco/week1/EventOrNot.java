package lv.ctco.week1;

public class EventOrNot {

    public static void main(String[] args) {
        int number = Integer.valueOf(args[0]);

        String result = number % 2 == 0 ? String.format("Entered number is not even %d", number) : String.format("Entered number is even %d", number);

        System.out.println(result);
    }
}
