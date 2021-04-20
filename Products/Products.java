package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import java.util.Scanner;

public class Products{ 
    private String Name; 
    private int ID;  
    private String Description;  
    private int quantity;  
    private float price; 
    private String Category;     
    private String category = "CDs DVDs Livros Jogos Roupa";
  
    Scanner  Get = new Scanner(System.in); 
    public String getName() {
        return Name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        this.Category = category;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public void setName(String name) {
        this.Name = name;
    }  

    public int  createProducts(int ID){ 
        System.out.println("Categoria do produto"); 
        String Cat = Get.nextLine(); 
        if( category.contains(Cat)){ 
            setCategory(Cat);
            System.out.println("Produto valido! Nome do produto");   
            setName(Get.nextLine()); 
            System.out.println("Entre com a descrição"); 
            setDescription(Get.nextLine());  
            System.out.println("Entre com a quantidade de produtos"); 
            setQuantity(Get.nextInt()); 
            System.out.println("Entre com o preco do produto"); 
            setPrice(Get.nextFloat()); 
            setID(ID);  

        } 
        else {
            System.out.println("Produto invalido"); 
            return 0; 
            } 
        return 1;   
    } 
    public void ShowProduct(){    
        System.out.println("----Produto:"+this.ID +"-------");
        System.out.println("Nome: " + getName()); 
        System.out.println("Quantidade: "+ getQuantity()); 
        System.out.println("Preco: "+ getPrice()); 
        System.out.println("Descricao: "+ getDescription());  
        
    }


}