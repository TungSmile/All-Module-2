import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagmentEmployee {
    public ArrayList<Employee> list = new ArrayList<>();
    public ArrayList<AdministrativeEmployee> listhc = new ArrayList<>();
    public ArrayList<SalesEmployee> listsale = new ArrayList<>();
    public ArrayList<TechnicalEmployee> listtech = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("--------MENU---------");
        System.out.println("1.Danh sách nhân viên");
        System.out.println("2.Thêm nhân viên");
        System.out.println("3.Sửa thông tin nhân viên");
        System.out.println("4.Xóa thông tin nhân viên");
        System.out.println("5.Tính lương nhân viên");
        System.out.println("6.Đọc file");
        System.out.println("7.Ghi file");
        System.out.println("8.Điểm Danh");
        System.out.println("9.Exit");
        int choise = 0;
        try {
            choise = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return choise;
    }

    public int inputId() {
        int id = 0;
        try {
            System.out.print("Nhập Id :");
            id = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public String inputName() {
        String name = "";
        try {
            System.out.print("Họ và tên : ");
            name = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

    public int inputAge() {
        int age = 0;
        try {
            System.out.print("Tuổi :");
            age = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return age;
    }

    public int inputDayWork() {
        int dayWork = 0;
        try {
            System.out.print("Số ngày đi làm :");
            dayWork = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dayWork;
    }

    public int inputDayOff() {
        int dayOff = 0;
        try {
            System.out.print("Số ngày Off : ");
            dayOff = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dayOff;
    }

    public int inputProject() {
        int project = 0;
        try {
            System.out.print("Số dự án hoàn thành : ");
            project = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return project;
    }

    public int inputContract() {
        int contract = 0;
        try {
            System.out.print("Số hợp đồng ký được : ");
            contract = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contract;
    }


    private int inputTypeEmployee() {
        int choise = 0;
        try {
            System.out.println("Chọn vị trí nhân viên ");
            System.out.println("1.Nhân viên Hành chính");
            System.out.println("2.Nhân viên Kỹ thuật");
            System.out.println("3.Nhân viên Kinh doanh");
            System.out.print("Vị trí nhân viên :");
            choise = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
           e.printStackTrace();
        }
        return choise;
    }

    public void addEmployee() {
        try {
            String name = inputName();
            int age = inputAge();
            int dayWork = inputDayWork();
            switch (inputTypeEmployee()) {
                case 1:
                    int dayOff = inputDayOff();
                    listhc.add(new AdministrativeEmployee(name, age, 0, dayWork, dayOff));
                    break;
                case 2:
                    int project = inputProject();
                    listtech.add(new TechnicalEmployee(name, age, 0, dayWork, project));
                    break;
                case 3:
                    int contract = inputContract();
                    listsale.add(new SalesEmployee(name, age, 0, dayWork, contract));
                    break;
                default:
                    System.out.println("Chỉ có 3 loại nhân viên này thôi");
            }
        } catch (Exception e) {
            System.out.println("Méo hiểu sao lỗi");
            e.printStackTrace();
        }
    }

    public void show() {
        int choise;
        while (true) {
            try {
                System.out.println("1.Hiển thị toàn bộ nhân viên : đang lỗi đợi fix");
                System.out.println("2.Hiện 1 phần nhân viên");
                choise = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        switch (choise) {
            case 1:
                for (Employee x : list) {
                    System.out.println(x.toString());
                }
                break;
            case 2:
                switch (inputTypeEmployee()) {
                    case 1:
                        System.out.println("-------List Administrative Employee----------");
                        System.out.printf("%-15s%-18s%-18s%-23s%s", "ID", "Name", "Day Work", "Day Off", "\n");
                        for (AdministrativeEmployee x : listhc) {
                            x.getInfo();
                        }
                        break;
                    case 2:
                        System.out.println("-----------List  Technical Employee------------");
                        System.out.printf("%-15s%-18s%-18s%-23s%s", "ID", "Name", "Day Work", "Day Off", "\n");
                        for (TechnicalEmployee x : listtech) {
                            x.getInfo();
                        }
                        break;
                    case 3:
                        System.out.println("--------------List  Sales Employee-------------");
                        System.out.printf("%-15s%-18s%-18s%-23s%s", "ID", "Name", "Day Work", "Day Off", "\n");
                        for (SalesEmployee x : listsale) {
                            x.getInfo();
                        }
                        break;
                    default:
                        System.out.println("Ng dùng phải có tư duy chứ");
                }
                break;
            default:
                System.out.println("Bạn phải có tư duy chứ"); // đang méo hiểu chạy xong lại nhảy vào cái này
        }
    }

    public void edit() {
        switch (inputTypeEmployee()) {
            case 1:
                int id1 = inputId();
                for (AdministrativeEmployee x : listhc) {
                    if (x.getId() == id1) {
                        x.setName(inputName());
                        x.setAge(inputAge());
                        x.setDayWork(inputDayWork());
                        x.setDayOff(inputDayOff());
                        break;
                    }
                }
                break;
            case 2:
                int id2 = inputId();
                for (TechnicalEmployee x : listtech) {
                    if (x.getId() == id2) {
                        x.setName(inputName());
                        x.setAge(inputAge());
                        x.setDayWork(inputDayWork());
                        x.setProject(inputProject());
                        break;
                    }
                }
                break;
            case 3:
                int id3 = inputId();
                for (SalesEmployee x : listsale) {
                    if (x.getId() == id3) {
                        x.setName(inputName());
                        x.setAge(inputAge());
                        x.setDayWork(inputDayWork());
                        x.setSale(inputContract());
                        break;
                    }
                }
                break;
            default:
                System.out.println("Móa Ng dùng phải có tư duy chứ");
        }
    }

    public void del() {
        switch (inputTypeEmployee()) {
            case 1:
                int id1 = inputId();
                for (AdministrativeEmployee x : listhc) {
                    if (x.getId() == id1) {
                        listhc.remove(x);
                        break;
                    }
                }
                break;
            case 2:
                int id2 = inputId();
                for (TechnicalEmployee x : listtech) {
                    if (x.getId() == id2) {
                        listtech.remove(x);
                        break;
                    }
                }
                break;
            case 3:
                int id3 = inputId();
                for (SalesEmployee x : listsale) {
                    if (x.getId() == id3) {
                        listsale.remove(x);
                        break;
                    }
                }
                break;
            default:
                System.out.println("Ko  có tư duy ak");
        }
    }

    public void calculatorSalary() {
        switch (inputTypeEmployee()) {
            case 1:
                for (AdministrativeEmployee x : listhc) {
                    x.calculateMonthlySalary();
                }
                break;
            case 2:

                for (TechnicalEmployee x : listtech) {
                    x.calculateMonthlySalary();
                }
                break;
            case 3:

                for (SalesEmployee x : listsale) {
                    x.calculateMonthlySalary();
                }
                break;
            default:
                System.out.println("lớn rồi phải có tư duy chứ");
        }
    }

    public void readFile() throws IOException {
        String line;
        switch (inputTypeEmployee()) {
            case 1:
                FileReader reader1 = new FileReader("D:\\file\\280523hc.txt");
                BufferedReader reader2 = new BufferedReader(reader1);
                while ((line = reader2.readLine()) != null) {
                    String[] temp = line.split(",");
                    listhc.add(new AdministrativeEmployee(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2])
                            , Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5])));
                }
                reader1.close();
                reader2.close();
                break;
            case 2:
                FileReader reader3 = new FileReader("D:\\file\\280523tech.txt");
                BufferedReader reader4 = new BufferedReader(reader3);
                while ((line = reader4.readLine()) != null) {
                    String[] temp = line.split(",");
                    listtech.add(new TechnicalEmployee(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2])
                            , Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5])));
                }
                reader3.close();
                reader4.close();
                break;
            case 3:
                FileReader reader5 = new FileReader("D:\\file\\280523sale.txt");
                BufferedReader reader6 = new BufferedReader(reader5);
                while ((line = reader6.readLine()) != null) {
                    String[] temp = line.split(",");
                    listsale.add(new SalesEmployee(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2])
                            , Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5])));
                }
                reader5.close();
                reader6.close();
                break;
            default:
                System.out.println("tư duy đâu");

        }
    }

    public void wirteFile() {
        switch (inputTypeEmployee()) {
            case 1:
                try (FileWriter writer1 = new FileWriter("D:\\file\\280523hc.txt", true);
                     BufferedWriter writer2 = new BufferedWriter(writer1)) {
                    for (AdministrativeEmployee x : listhc) {
                        writer2.write(x.toString());
                        writer2.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try (FileWriter writer1 = new FileWriter("D:\\file\\280523tech.txt", true);
                     BufferedWriter writer2 = new BufferedWriter(writer1)) {
                    for (TechnicalEmployee x : listtech) {
                        writer2.write(x.toString());
                        writer2.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try (FileWriter writer1 = new FileWriter("D:\\file\\280523sale.txt", true);
                     BufferedWriter writer2 = new BufferedWriter(writer1)) {
                    for (SalesEmployee x : listsale) {
                        writer2.write(x.toString());
                        writer2.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("chịu rồi đấy");

        }
    }

    public void attendanceEmployee() {
        try {
            switch (inputTypeEmployee()) {
                case 1:
                    int temp = inputId();
                    for (AdministrativeEmployee x : listhc) {
                        if (x.getId() == temp) {
                            x.attendance();
                            break;
                        }
                    }
                    break;
                case 2:
                    int temp1 = inputId();
                    for (TechnicalEmployee x : listtech) {
                        if (x.getId() == temp1) {
                            x.attendance();
                            break;
                        }
                    }
                    break;
                case 3:
                    int temp2 = inputId();
                    for (SalesEmployee x : listsale) {
                        if (x.getId() == temp2) {
                            x.attendance();
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Ko có tư duy ak?");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
