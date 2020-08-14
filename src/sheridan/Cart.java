/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  jimmy
 */
public class Cart {
    
    private List <Product> products = new ArrayList<>( );
    private PaymentService service;
    private int CartSize; 
    public void setPaymentService( PaymentService service ) {
        this.service  = service;
    }
    
    
    public void addProduct( Product product ) {
        products.add( product );
    }
    
    
    public int getCartSize() {
	    CartSize=products.size();
	    
        return CartSize;
    }
   //We added a CartSize class.  We also call into the CartSize using products.Size and then we return the CartSize 
    
   
    
    public void payCart( ) {
        double total = 0;
        
       for ( Product product : products ) {
           total += product.getPrice( );
       }
        service.processPayment( total );
    }
}
