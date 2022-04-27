public class Person {

    // Thuoc tinh
    protected int id;
    protected String name;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Person() {

    }

    // Ham khoi tao co doi so
    public Person(int id, String name/* , int age, String address */) {
        this.id = id;
        this.name = name;
    }

    // Cac ham getter va setter cho cac thuoc tinh
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Ham hien thi thong tin
    public void display() {
        System.out.println("\tId: " + id);
        System.out.println("\tHo ten: " + name);

    }

    // Ham nhap thong tin
    public void enter(Scanner sc) {
        System.out.print("\tNhap id: ");
        id = sc.nextInt();
        System.out.print("\tNhap ho ten: ");
        sc.nextLine();
        name = sc.nextLine();

    }
}
