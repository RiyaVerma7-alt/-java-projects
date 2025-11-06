class Studentobject {
    String name;
    int age;
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Riya Verma";
        s1.age = 20;
        s1.displayDetails();
    }
}
