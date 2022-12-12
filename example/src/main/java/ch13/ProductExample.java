package ch13;

public class ProductExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<TV, String>();
        product1.setKind(new TV());
        product1.setModel("스마트TV");
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("diesel");
        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println(tv + " " + tvModel);
        System.out.println(car + " " + carModel);
    }
}
