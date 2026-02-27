public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Coba compare langsung
        int hasil = staff[0].compare(staff[1]);
        System.out.println("Hasil compare: " + hasil);

        // Sorting
        Sortable.shell_sort(staff);

        System.out.println("Setelah diurutkan:");
        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }
    }
}
