import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    validateRex rex = new validateRex();

    public void setListSinhVien(ArrayList<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    public ArrayList<SinhVien> getListSinhVien() {
        return listSinhVien;
    }


    public Manage() {
        this.listSinhVien = IO.readToFile();
    }

    public String menu() {
        return "---- CHƯƠNG TRÌNH  QUẢN LÝ SINH VIÊN ----\n" +
                "Chọn  chức năng theo số ( để tiếp tục)\n" +
                "1. Xem danh sách sinh viên\n" +
                "2. Thêm mới \n" +
                "3. Cập nhật \n" +
                "4. Xóa \n" +
                "5. Sắp xếp \n" +
                "6. Đọc Ghi File \n" +
                "7. Ghi vào File \n" +
                "8. Thoát \n";
    }

    public String sort() {
        return "---- Sắp xếp sinh viên theo điểm trung bình ----\nChọn chức năng theo số (để tiếp tục)\n" +
                "1. Sắp xếp  điểm trung bình tăng dần \n2.Sắp xếp  điểm  trung bình giảm dần \n3.Thoát\n";
    }

    public void menuExcute() {
        while (true) {
            System.out.println(menu());
            switch (rex.choisenumber()) {
                case 1:
                    show5time();
                    break;
                case 2:
                    listSinhVien.add(cretea());
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    del();
                    break;
                case 5:
                    System.out.println(sort());
                    sort1();
                    break;
                case 6:
                    setListSinhVien(IO.readToFile());
                    break;
                case 7:
                    IO.writeToFile(getListSinhVien());
                    break;
                case 8:
                    return;
                default:
                    System.out.println(" Magic Happen ");
            }
        }

    }

    public SinhVien cretea() {
        String name = rex.inputName();
        int age = rex.inputAge();
        String sex = rex.inputSex();
        String adder;
        do {
            System.out.print("Địa chỉ : ");
            adder = scanner.nextLine();
        } while (!check(adder));
        double point = rex.inputPoint();
        return new SinhVien(listSinhVien.size(), name, age, sex, adder, point);
    }

    public void del() {
        while (true) {
            try {
                System.out.println("Tìm bằng ID");
                String id = scanner.nextLine();
                if (id.equals("")) {
                    return;
                } else {
                    int numberid = Integer.parseInt(id);
                    for (SinhVien sinhVien : listSinhVien) {
                        if (numberid == sinhVien.getId()) {
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                listSinhVien.remove(sinhVien);
                            } else return;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void edit() {
        while (true) {
            try {
                System.out.print(" Nhập ID sinh viên : ");

                int id = Integer.parseInt(scanner.nextLine());
                for (SinhVien sinhVien : listSinhVien) {
                    if (sinhVien.getId() == id) {
                        sinhVien = cretea();
                        return;
                    }
                }
                System.out.println("Không tìm được sinh viên với mã sinh viên trên");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void sort1() {
        switch (rex.choisenumber()) {
            case 1:
                listSinhVien.sort((st1, st2) -> (int) (st1.getAvangePoint() - st2.getAvangePoint()));
                for (SinhVien sinhVien : listSinhVien) {
                    System.out.println(sinhVien.toString());
                }
                break;
            case 2:
                listSinhVien.sort((st1, st2) -> (int) (st2.getAvangePoint() - st1.getAvangePoint()));
                for (SinhVien sinhVien : listSinhVien) {
                    System.out.println(sinhVien.toString());
                }
                break;
            case 3:
                return;
            default:
                System.out.println("chọn lại");
        }
    }

    public boolean check(String adder) {
        if (listSinhVien == null) {
            for (SinhVien sinhVien : listSinhVien) {
                if (sinhVien.equals(adder)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }


    public void show5time() {
        for (SinhVien sinhVien : listSinhVien) {
            if (scanner.nextLine() != null) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(sinhVien.toString());
                }
            }
        }
    }

}