package Products;  
public class Products{ 
    private String Name; 
    private int ID;  
    private int Description;  
    private int quantity;  
    private float price; 
    private String Category; 
   
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
    public int getDescription() {
        return Description;
    }
    public void setDescription(int description) {
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


}