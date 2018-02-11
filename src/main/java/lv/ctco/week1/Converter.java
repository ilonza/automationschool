package lv.ctco.week1;

public class Converter {

    private static final double BITCOIN_PRICE = 7871.19;

    public static void main(String[] args) {
        String ccyFrom = args[0];
        String ccyTo = args[1];
        int amount = Integer.valueOf(args[2]);

        if (ccyFrom.equals("BTC") && ccyTo.equals("EUR")) {
            System.out.printf("Converted amount: %f", amount * BITCOIN_PRICE);
        } else if (ccyFrom.equals("EUR") && ccyTo.equals("BTC")) {
            System.out.printf("Converted amount: %f", amount / BITCOIN_PRICE);
        } else {
            System.out.printf("Enter correct ccy and amount");
        }
    }
}
