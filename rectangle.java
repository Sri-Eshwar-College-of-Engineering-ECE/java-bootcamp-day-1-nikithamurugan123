class Rectangle {
    int length = 10;
    int breadth = 5;
    
    public void findArea() {
        int area = length * breadth;
        
        System.out.println("Length : " + length);
        System.out.println("Breadth :"+ breadth);
        System.out.println("Area :"+ area);
    }
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
       rectangle.findArea();
        
    }
}