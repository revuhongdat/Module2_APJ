import java.util.Scanner;



class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ClassesManage classesManage = new ClassesManage();
    private StudentManage studentManage = new StudentManage();

    public void displayMainMenu() {
        while (true) {
            System.out.println("\nMenu Student manager :");
            System.out.println("1. Classes Manage");
            System.out.println("2. Student Manage");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    this.displayClassesMenu();
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    private void displayClassesMenu() {
        while (true) {
            System.out.println("\nClasses Management:");
            System.out.println("1. Create New Class");
            System.out.println("2. Edit Class");
            System.out.println("3. Display All Classes");
            System.out.println("4. Back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Class Name: ");
                    String className = scanner.nextLine();
                    classesManage.createClass(className);
                    System.out.println("CREATE CLASS DONE!");
                    break;
                case 2:
                    System.out.print("Enter Class ID to Edit: ");
                    int classId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Class Name: ");
                    String newClassName = scanner.nextLine();
                    classesManage.editClass(classId, newClassName);
                    System.out.println("EDIT DONE!");
                    break;
                case 3:
                    classesManage.displayClasses();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
//    private void displayClassesMenu() {
//        dmm nam;
//    }
}
