package Entities;

import UseCases.DrinkUseCases.DrinkRuntimeDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SaleBoard {

    public ArrayList<Drink> onSale() {
        ArrayList onSaleDrinks = new ArrayList<>();
        for (Map.Entry<String, HashMap<String, Drink>> drinkSet : DrinkRuntimeDataBase.getDrinks().entrySet()) {
            for (Map.Entry<String, Drink> drink : drinkSet.getValue().entrySet()) {
                if (drink.getValue().getDiscount() != 1) {
                    onSaleDrinks.add(drink);
                }
            }
        }
        return onSaleDrinks;
    }
}