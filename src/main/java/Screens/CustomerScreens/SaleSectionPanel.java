package Screens.CustomerScreens;

import Entities.Drink;
import UseCases.GetOnSaleDrinks;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;

public class SaleSectionPanel {
    JScrollPane scrollPane;
    public SaleSectionPanel() {
        Vector headers = new Vector();
        Vector data = new Vector();
        Vector line = new Vector();
        ArrayList<Drink> onSaleDrinks = new GetOnSaleDrinks().onSale();
        DecimalFormat df = new DecimalFormat("0.00");

        headers.add("Drink name");
        headers.add("Original Price");
        headers.add("Discount");
        headers.add("Current Price");
        headers.add("Add to Shopping Cart");

        JTable orderTable = new JTable(data, headers);

        for (Drink drink: onSaleDrinks) {
            line.add(drink.getName());
            line.add(drink.getPrice());
            line.add(drink.getDiscount());
            line.add(df.format(drink.getPrice() * drink.getDiscount()));
            data.add(line);
        }

        for (int i = 0; i < 30; i ++) {
            Vector line1 = new Vector();
            line1.add("Strawberry Coconut");
            line1.add("18.00");
            line1.add("1");
            line1.add("1");
            line1.add("0");
            data.add(line1);
        }

        scrollPane = new JScrollPane(orderTable);
    }
    public JScrollPane getPanel() {
        return scrollPane;
    }
}
