package Sales; 
import java.time.LocalDate;
import java.util.ArrayList;

import Costumers.Costumers;
import Products.Products; 

public class Sale{
    private int SaleID;   
    private Status status; 
    private LocalDate date;  
    private Costumers WhoBuy; 
    private ArrayList<Products> ListProducts = new ArrayList<Products>(); 
   
    public int getSaleID() {
        return SaleID;
    }
    public Costumers getWhoBuy() {
        return WhoBuy;
    }
    public void setWhoBuy(Costumers whoBuy) {
        this.WhoBuy = whoBuy;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setSaleID(int saleID) {
        this.SaleID = saleID;
    }  
    public void init_sale(Costumers C, int id){ 
        // costumers 
            // include address 
        setWhoBuy(C); 
        // sale id   
        setSaleID(id); 
        // date  
        setDate(LocalDate.now()); 
        // init status 
        setStatus(Status.Pending);

    } 

    public void fill_products_in_sale(Products P){ 
        ListProducts.add(P); 
    }   

    private void show_products_in_sale(){ 
        System.out.println("Lista de produtos na venda " + this.SaleID);
        for(Products i: ListProducts){ 
            i.ShowProduct();
        }  
    } 
    public void showSale(){   

        System.out.println("----Venda "+this.SaleID +"-----");
        System.out.println("----------Comprador------------"); 
        this.WhoBuy.ShowCostumer(); 
        show_products_in_sale(); 

    }  
    
     

 

}
