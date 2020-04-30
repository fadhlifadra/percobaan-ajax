package coreservlets;

import java.util.*;

/** A small table of banking customers for testing. */

public class CustomerSimpleMap 
       implements CustomerLookupService {
  private Map<String,Customer> customers;

  public CustomerSimpleMap() {
    customers = new HashMap<>();
    addCustomer(new Customer("id001", "Joko", 
                             "Pramono", 67952771.57));
    addCustomer(new Customer("id002", "Indi",
                             "Riani", 14273070.20));
    addCustomer(new Customer("id003", "Sadin",
                             "Kovasco", 59744848.42));
  }

  /** Finds the customer with the given ID.
   *  Returns null if there is no match.
   */
  
  @Override
  public Customer findCustomer(String id) {
    if (id!=null) {
      return(customers.get(id.toLowerCase()));
    } else {
      return(null);
    }
  }

  private void addCustomer(Customer customer) {
    customers.put(customer.getId(), customer);
  }
}
