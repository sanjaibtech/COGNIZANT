public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect("StudentsDB");
        db2.connect("EmployeesDB");

        if (db1 == db2) {
            System.out.println("Both db1 and db2 are the same instance (Singleton works).");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
