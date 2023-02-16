public class Main {
    public static void main(String args[]) {
        String country = "Pakistan";

        Currency currency = CurrencyFactory.createCurrency(country);

        System.out.println(currency.getSymbol());

    }
}