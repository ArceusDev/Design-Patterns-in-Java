public class CurrencyFactory {
    public static Currency createCurrency (String country)
    {
        if (country.equalsIgnoreCase("Pakistan"))
            return new Rupee();
        else if(country.equalsIgnoreCase("Singapore"))
            return new SGDDollar();
        else if(country.equalsIgnoreCase("US"))
            return new USDollar();
        throw new IllegalArgumentException("No such currency");
    }
}
