package Store;
import Products.Products;
import Sales.Sale;
import Costumers.Costumers; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Store {
    private String Name;   
    List <Products> listProducts = new ArrayList<Products>();  
    List <Costumers> listCostumers = new ArrayList<Costumers>(); 
    List <Sale> listSales = new ArrayList<Sale>();

    Scanner get = new Scanner(System.in); 
    
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    
    // ----------------------------------------------------------------------Sales area ----------------------------------------------------
    
    private void list_sales(){ 
        for(Sale S: listSales){ 
            S.showSale();  
        }
    } 
    private  int getQuantitySales(){    
        return listSales.size(); 
    }  
    

    //--------------------------------------------------------------- stoke area -----------------------------------------------------------
    
    private  int getQuantityProducts(){    
        return listProducts.size(); 
    } 

    private void list_products(){   
        for(Products i: listProducts){ 
            i.ShowProduct();
        } 
    }    
    
    private  void fill_stoke(){   
        int ansFlag = 1;  
        int ID = getQuantityProducts() + 1  ;
        while(ansFlag == 1){  
            Products pr = new Products(); 
            if(pr.createProducts(ID) == 1){  
                 listProducts.add(pr);       
            System.out.println("Digite 1 para continuar preenchendo o estoque, caso contrario, 0"); 
            ansFlag = get.nextInt(); 
            if(ansFlag == 0) break; 
            else 
                ID = ID + 1; 
        
            } 
    
        }
    }  
    private void remove_stock(){  
        System.out.println("Ainda nao implementado!");
    }
    private void change_stoke(){
        int ans = 0 ; 
        System.out.println("Digite:\n1 - Adcionar item\n2 - Remover item "); 
        get.nextLine(); 
        ans =  get.nextInt();  
        switch(ans){ 
            case 1:  
                fill_stoke();
                break; 
            case 2:  
                remove_stock();
                break; 
            default: 
                break;  
        }
        
    }  
    //----------------------------------------------------------------costumer area -------------------------------------------------------
    private void list_costumers(){   
        for(Costumers i: listCostumers){ 
            i.ShowCostumer();
        } 
    } 

    private int countCostumers(){ 
        return listCostumers.size(); 
    } 
    private boolean verify_email(String email){ 
        for(Costumers c : listCostumers){ 
            if(c.getEmail().equals(email)) return true; 
        } 
        return false ; 
    }
    private boolean verify_cpf(String cpf){ 
        for(Costumers c : listCostumers){ 
            if(c.getCPF().equals(cpf)) return true; 
        } 
        return false;
    }
    private boolean login(){   
        int count = 0;  
        int Try = 5;  
        int ans = 0 ; 
        String inputEmail, inputPassword;  
        System.out.println("Bem vindo a pagina de login"); 
        System.out.println("Digite o seu email:");   
        get.nextLine();
        inputEmail = get.nextLine(); 
        if (verify_email(inputEmail)== true){ 
            for(Costumers c : listCostumers){ 
                if(c.getEmail().equals(inputEmail)){  
                    System.out.println("Entre com a sua senha:"); 
                    inputPassword = get.nextLine(); 
                      
                    while(count <= Try){ 
                        if(c.compare_password(inputPassword) == true){ 
                            System.out.println("Ola, "+c.getName()); 
                            return true;   
                        } 
                        else{ 
                            System.out.println("Senha Incorreta"); 
                        }  
                        count++; 
                        if(count == Try){ 
                            System.out.println("Numero de tentativa excedido, lamentamos!");  
                            return false; 
                        }
                    }   
                } 
            } 
        } 
        else{ 
            System.out.println("Usuario nao cadastrado!"); 
            System.out.println("Deseja cria uma nova conta ?(1-sim) (2-nao)"); 
            ans = get.nextInt();  
            if(ans == 1) create_account(); 
            else return false; 
        }
        return false; 
    }
    
    
    
    private void create_account(){ 
        Costumers Cnew = new Costumers();  
        int ID =  countCostumers() + 1 ; 
        Cnew.createNewAccount(ID); 
        if(verify_cpf(Cnew.getCPF()) == false && verify_email(Cnew.getEmail()) == false){              
            Cnew.setUserRegist(true);            
            listCostumers.add(Cnew);  
            System.out.println("Conta cadastrada com sucesso"); 
        } 
        else{ 
            System.out.println("Usuário já existe");  
            login();
        }
        
    }
   


    // ---------------------------------------------------------------MENU ----------------------------------------------------------------------
    public void menu(){  
        int ans =  1;  
        while(ans != 0){  
        clearScreen();
        System.out.println("=========================MENU INICIAL====================");
                
        System.out.println("Digite 1 para cliente --- 2 para funcionario --- 0 para sair");  
        ans = get.nextInt(); 
        if(ans == 1 ){ 
            // cliente 
            ClientMenu(); 
        } 
        else if(ans == 2 ){ 
            // funcionario  
            EmployedMenu();
        } 
        if(ans == 0 ) break;
        }
        
        
    }  
    
    
    
    private void ClientMenu(){ 
        int ans = 0 ; 
        boolean stop = false;  
        while(stop == false){ 
        //clearScreen(); 
        System.out.println("----------------------- MENU CLIENTE ------------------------");
        System.out.println("Digite o que deseja fazer na loja");  
        System.out.println("* 1 - Criar nova conta ");
        System.out.println("* 2 - visualizar todos os produtos da loja"); 
        System.out.println("* 3 - Entrar na sua conta"); 
        System.out.println("* 4 - Visualizar suas compras");  
        System.out.println("* 5 - Realizar compras");  
        System.out.println("* 0 - Sair");    

        get.nextLine(); 
        ans = get.nextInt();
        switch(ans){ 
            case 0:  
                stop = true;
                break; 
            case 1:  
                //clearScreen(); 
                System.out.println("Cadastro de novo usuario"); 
                create_account();
                break; 
            case 2:
                //clearScreen(); 
                System.out.println("Explorar loja"); 
                if(listProducts.isEmpty()) System.out.println(" A loja esta temporariamente vazia!");
                list_products();
                break;  
            case 3: 
                //clearScreen();   
                System.out.println("Login");  
                login();  
                break; 
            case 4: 
                //clearScreen(); 
                System.out.println("Pedidos");
                break;    
            case 5:  
                System.out.println("Compras"); 

            default:   
                System.out.println("Opcao invalida!");
                break; 

        } 
        
    }

    } 
    private void EmployedMenu(){ 
        int ans = 0 ; 
        boolean stop = false;   

        while(stop == false){
        System.out.println("----------------------- MENU FUNCIONARIO ---------------------");

        System.out.println("Digite o que deseja fazer na loja");  
        System.out.println("* 1 - Alterar esoque  ");
        System.out.println("* 2 - listagem de vendas"); 
        System.out.println("* 3 - Listagem de produtos"); 
        System.out.println("* 4 - Listagem de clientes"); 
        System.out.println("* 0 - Sair");    

        get.nextLine();
        ans = get.nextInt();
        switch(ans){ 
            case 0:  
                stop = true;
                break; 
            case 1:   
                System.out.println("Alterar Estoque");  
                change_stoke();
                break; 
            case 2: 
                System.out.println("Listagem de vendas"); 
                list_sales();
                break;  
            case 3:    
                System.out.println("Listagem de produtos");  
                list_products();
                break; 
            case 4:    
                System.out.println("Listagem de clientes"); 
                list_costumers(); 
                break; 
            default:      
                System.out.println("Opcao invalida!"); 
                break; 

        } 
        
    }

    }
      
} 

