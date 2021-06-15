package model.cart;

import java.util.List;

public class Cart {

    private List<CartItem> items;

    public Cart(List<CartItem> items){
        this.items = items;
    }
    public double total(){
       double total = 0.0;
       for(CartItem item: items){
           total += item.total();
       }
       return total;
    }
    //return items.stream().mapToDouble(ct -> ct.total()).reduce(0.0, Double::sum);

}
