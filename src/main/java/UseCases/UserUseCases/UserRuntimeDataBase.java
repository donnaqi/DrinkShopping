package UseCases.UserUseCases;

import Entities.Users.*;

import java.util.HashMap;

// Use Cases Layer

public class UserRuntimeDataBase {
    protected static HashMap<String, User> sellers = new HashMap<>();
    protected static HashMap<String, User> customers = new HashMap<>();

    public static Seller currentSeller;

    public static Customer currentCustomer;

    public static void constructCurrentSeller(String phoneNum){
        currentSeller = (Seller) sellers.get(phoneNum);
    }

    public static void constructCurrentCustomer(String phoneNum){
        currentCustomer = (Customer) customers.get(phoneNum);
    }

}
