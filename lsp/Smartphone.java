package lsp;

import java.util.Date;

public class Smartphone extends Product{
    @Override
    String getName(){
        return "Samsung s22 Ultra";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
}
