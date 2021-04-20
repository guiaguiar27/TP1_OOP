package Costumers;
import java.util.Scanner; 

public class Address {
    private String Street;  
    private String City;  
    private String number;
    private String PostalCode; 
    Scanner Get = new Scanner(System.in); 

    public String getStreet() {
        return Street;
    }
    public String getPostalCode() {
        return PostalCode;
    }
    public void setPostalCode(String postalCode) {
        this.PostalCode = postalCode;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        this.City = city;
    }
    public void setStreet(String street) {
        this.Street = street;
    } 
    public void fill_address(){ 
        System.out.println("Digite sua rua:"); 
        setStreet(Get.nextLine()); 
        System.out.println("Digite a cidade:"); 
        setCity(Get.nextLine()); 
        System.out.println("Digite o numero da residencia:"); 
        setNumber(Get.nextLine()); 
        System.out.println("Digite o codigo postal"); 
        setPostalCode(Get.nextLine()); 

    }   
    public void ShowAddress(){ 
        System.out.println("Endereco");
        System.out.println(" - Cidade: "+getCity()); 
        System.out.println(" - Rua: "+getStreet()); 
        System.out.println(" - Numero: "+getNumber());  
        System.out.println(" - Codigo postal: "+getPostalCode());  
        
    }

}
