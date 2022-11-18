package sale_board;

import drink.Drink;
import helpers.Deserializer;

import java.io.IOException;
import java.util.ArrayList;

public class SaleBoard {
    protected static ArrayList<Drink> drinks = new ArrayList<>();
    private static final Deserializer searchDeserializer = new Deserializer();
    public static void constructDrinkDataBase() throws IOException, ClassNotFoundException {
        searchDeserializer.deserialize("./data/drinks");
        drinks = (ArrayList<Drink>) searchDeserializer.getObject();
    }

    public ArrayList<Drink> onSale(){
        ArrayList onSaleDrinks = new ArrayList<>();
        for (Drink drink : drinks){
            if (drink.getDiscount() != 1) {
                onSaleDrinks.add(drink);
            }
        }
        return onSaleDrinks;
    }

}
