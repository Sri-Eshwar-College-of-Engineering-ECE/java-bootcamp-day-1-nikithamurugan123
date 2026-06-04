class Product {
    int proId;
    String proName;

    static int totalPro = 0;

    Product(int id, String name) {
        proId = id;
        proName = name;
       
    }

    void display() {
        System.out.println("Product ID: " + proId);
        System.out.println("Product Name: " + proName);
    }

    public static void main(String[] args) {
        Product pro1 = new Product(101, "Laptop");
        Product pro2 = new Product(102, "Mobile");
      
        pro1.display();
        pro2.display();

       
    }
}