package moneycalculator.persistence.files;

import moneycalculator.model.Currency;
import moneycalculator.persistence.CurrencyListLoader;

public class FileCurrencyListLoader implements CurrencyListLoader{

    private final String fileName;

    public FileCurrencyListLoader(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public Currency[] currencies() {
        
    }
    
}
