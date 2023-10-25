package lsp;

import java.util.Date;

public class Vegetable extends FoodProduct{
    @Override
    String getName(){
        return "Brocolli";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
    
}
