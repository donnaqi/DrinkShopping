package users;

import drink.Drink;
import order.Order;

import java.util.ArrayList;

public class Seller extends User {

    private String storeName;
    public ArrayList<Order> allOrders;
    public ArrayList<Drink> items;

    /**
     * Construct an instance of the entity Seller.
     * @param accountName The account name of the seller.
     * @param phoneNumber The phone number of the seller.
     * @param passWord The password of the seller.
     * @param address The address of the seller.
     * @param storeName The store name.
     * @param allOrders The list of orders for the seller.
     * @param items The list of drink that the seller sell.
     */
    public Seller(String accountName, String phoneNumber, String passWord, String address, String storeName, ArrayList<Order> allOrders, ArrayList<Drink> items) {
        super(accountName, phoneNumber, passWord, address);
        this.storeName = storeName;
        this.allOrders = allOrders;
        this.items = items;
    }

    /**
     * The setter methods of the new instance values.
     */

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setAllOrders(ArrayList<Order> allOrders) {
        this.allOrders = allOrders;
    }

    public void setItems(ArrayList<Drink> items) {
        this.items = items;
    }

    /**
     * The getter methods for the new instance values.
     */
    public String getStoreName(){
        return this.storeName;
    }

    public ArrayList<Order> getAllOrders() {
        return this.allOrders;
    }

    public ArrayList<Drink> getItems() {
        return this.items;
    }
}
