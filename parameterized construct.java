class Car {
    String company;
    String model;
    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }
    void displayDetails() {
        System.out.println("Company Name: " + company);
        System.out.println("Model: " + model);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner");
        car1.displayDetails();
    }
}
