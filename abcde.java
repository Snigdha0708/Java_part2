import java.util.*; 
class Product{
    Integer id;
    String name;
    Float price;
    Integer orderQuantity;   
    public Product() {
    }
    public Product(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getOrderQuantity() {
        return orderQuantity;
    }
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }    
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        Product p=(Product) obj;
        return id==p.id;
    }    
}
class Cart
{
    private List<Product> items=new ArrayList();
    public void addToCart(Product p){
        items.add(p);
    }
    public void removeFromCart(Product p){        
        items.remove(p);
    }   
    public void emptyCart(){        
        items.clear();
    }
    public List<Product> getItems() {
        return items;
    } 
}

    enum PaymentStatus{
        DONE, DUE, PARTIAL
    };
    
    private PaymentStatus status;
    private String paymentMode;
    private Float paymentAmount=0F;
    private Date paymentDate;    
    private Float totalAmount=0F;
    private Float paymentDue=0F;
    public void checkout(){
        handlePayment();    
        confirmOrder();
        printPaymentSummary();
        emptyCart();
    }
    public void handlePayment(){
        paymentMode=JOptionPane.showInputDialog("Enter Payment Mode(Cash/Cheque): ");
        paymentDate=new Date();
        paymentAmount=new Float(JOptionPane.showInputDialog("Enter Amount, Total Due is: "+totalAmount));  
        paymentDue=totalAmount-paymentAmount;            
    }
    public void confirmOrder(){
        if(paymentDue==0.0){
            status=PaymentStatus.DONE;
        }else if(paymentDue>0.0 && paymentDue<totalAmount){
            status=PaymentStatus.PARTIAL;
        }else if(paymentAmount==0.0){
            status=PaymentStatus.DUE;
        }  
        if(status==PaymentStatus.DONE || status==PaymentStatus.PARTIAL){
           System.out.println("SUCCESS: Your order is confirmed and will be processed soon."); 
        }else if(status==PaymentStatus.DUE){
            System.out.println("FAILED: Your order is failed. No payment done."); 
        }
    }
    class cartExtension extends Cart
{
    public void printCart(){        
        System.out.println("==================================");
        System.out.println("CART ITEMS:");        
        System.out.println("==================================");
        for (Product p : getItems()) {
            System.out.println("PRODUCT ID: "+p.getId());
            System.out.println("PRODUCT NAME: "+p.getName());
            System.out.println("PRODUCT PRICE: "+p.getPrice());
            System.out.println("PRODUCT ORDER QTY: "+p.getOrderQuantity());
            Float total=p.getOrderQuantity()* p.getPrice();
            System.out.println("TOTAL: "+total);
            totalAmount=totalAmount+total;
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Net Total : "+totalAmount);
        System.out.println("==================================");        
    }   
    void printPaymentSummary(){
        System.out.println();
        System.out.println("PAYMENT SUMMARY: ");   
        System.out.println("==================================");
        System.out.println("TOTAL AMOUNT: "+totalAmount);
        System.out.println("PAYMENT AMOUNT: "+paymentAmount);
        System.out.println("PAYMENT DUE: "+paymentDue);
        System.out.println("PAYMENT MODE: "+paymentMode);
        System.out.println("PAYMENT DATE: "+paymentDate);        
        System.out.println("PAYMENT STATUS: "+status);
    }
}
public class TestCart {
    public static void main(String[] args) {
        
        CartExtension cart=new CartExtension();
        Product p1=new Product();
        p1.setId(1);
        p1.setName("Keyboard");
        p1.setPrice(1500.0F);
        p1.setOrderQuantity(2);
        cart.addToCart(p1);
        Product p2=new Product();
        p2.setId(2);
        p2.setName("Mouse");
        p2.setPrice(500.0F);
        p2.setOrderQuantity(4);
        cart.addToCart(p2);  
        Product p3=new Product();
        p3.setId(3);
        p3.setName("Monitor");
        p3.setPrice(8000.0F);
        p3.setOrderQuantity(2);
        cart.addToCart(p3);
        Product p=new Product(2);
        cart.removeFromCart(p);
        cart.printCart();
        cart.checkout();
    }    
}