import java.util.Scanner;

public class Shop{
    private String shopName;
    private String shopAddress;
    private String[] products;
    
    public Shop(String shopName, String shopAddress, String[] products){
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = products;
    }
    
    public String getShopName(){
        return shopName;
    }
    
    public String getShopAddress(){
        return shopAddress;
    }
    
    public String[] getProducts(){
        return products;
    }
    
    public void setShopName(String shopName){
        this.shopName = shopName;
    }
    
    public void setShopAddress(String shopAddress){
        this.shopAddress = shopAddress;
    }
    
    public void setProducts(String[] products){
        this.products = products;
    }
    
    public boolean checkProductAvailability(String productname){
        for(String x : products){
            if(x.toLowerCase().equals(productname.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the shopname:");
        String shopName = sc.nextLine();
        
        System.out.println("Enter the address:");
        String shopAddress = sc.nextLine();
        
        System.out.println("Enter number of products:");
        int nop = sc.nextInt();
        sc.nextLine();
        
        if (nop > 0){
            String[] products = new String[nop];
            
            for(int i = 0; i < nop; i++){
                products[i] = sc.nextLine();
            }
            
            Shop shop = new Shop(shopName, shopAddress, products);
            
            System.out.println("Enter the product to be searched:");
            
            if(shop.checkProductAvailability(sc.nextLine())){
                System.out.println("Product is available at " + shop.getShopName() + ", " + shop.getShopAddress() + ".");
            } else {
                System.out.println("Product is not available at " + shop.getShopName() + ", " + shop.getShopAddress() + ".");
            }
        }
    }
}