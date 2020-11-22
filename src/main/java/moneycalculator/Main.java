package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.model.Currency;
import moneycalculator.persistence.CurrencyListLoader;

public class Main {

    public static void main(String[] args) {        
        
        CurrencyListLoader loader = currencyListLoader();
        MainFrame mainFrame = new MainFrame(currencies());  
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay()));
         
        // I ended up watching 27:33 of the video so far.
        
    }

    private static CurrencyListLoader currencyListLoader() {
        return new CurrencyListLoader(){
            @Override
            public Currency[] currencies(){
                return new Currency[]{
                    new Currency("USD", "Dólar USA", "$"),
                    new Currency("USD", "Dólar Canada", "$"),
                    new Currency("USD", "Libra esterlina", "£")
                }; 
            }
        };
    }

}
