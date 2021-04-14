package Consumers;
import java.util.Scanner; 

public class Consumers {
    private String Name; 
    private String CPF;  
    private int ID;
    private String email; 
    private String password; 
    private Address CostumerAddress; 
    Scanner Get = new Scanner(System.in); 
    public String getName() {
        return Name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public String  getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    public void setName(String name) {
        this.Name = name;
    } 
    
    public void createNewAccount(){ 
        
        System.out.println("Nome:");   
        setName(Get.nextLine()); 
        System.out.println("CPF (apenas numeros):");   


    } 
    public int verify_cpf(String CPF){ 


    } 
    public int verify_email(String email){ 

    }
      
}
