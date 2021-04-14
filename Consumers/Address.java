package Consumers;

public class Address {
    private String Street;  
    private String City;  
    private String number;
    public String getStreet() {
        return Street;
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

}
