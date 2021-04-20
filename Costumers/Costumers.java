package Costumers;
import java.util.Scanner; 

public class Costumers {
    private String Name; 
    private String CPF;  
    private int ID;
    private String email; 
    private String password; 
    private Address CostumerAddress;  
    private boolean UserRegist;  

    Scanner Get = new Scanner(System.in); 
    public String getName() {
        return Name;
    }
    public boolean isUserRegist() {
        return UserRegist;
    }
    public void setUserRegist(boolean userRegist) {
        this.UserRegist = userRegist;
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
        // verify email
        this.email = email;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public String  getCPF() { 
        // verify cpf 
        return CPF;
    }
    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    public void setName(String name) {
        this.Name = name;
    } 
    
    public void createNewAccount(int ID){ 
        CostumerAddress = new Address(); 
        setID(ID); 
        System.out.println("Nome:");   
        setName(Get.nextLine()); 
        System.out.println("CPF (apenas numeros):");   
        setCPF(Get.nextLine());  
        System.out.println("Entre com seu email");  
        setEmail(Get.nextLine());  
        System.out.println("Digite uma nova senha:"); 
        setPassword(Get.nextLine()); 
        CostumerAddress.fill_address();

    } 
    public void ShowCostumer(){ 
        System.out.println("--------------------------------------");
        System.out.println(" - Nome: "+getName()); 
        System.out.println(" - CPF: "+getCPF()); 
        System.out.println(" - E-mail: "+getEmail());  
        System.out.println(" - ID cliente: "+getID());  
        CostumerAddress.ShowAddress();  

    }
    public boolean compare_password(String pass){ 
        
        if(this.password.equals(pass)) return true ;  
        else return false ; 
    }      
}
