import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

import java.io.FileWriter;
import java.util.ArrayList;

public class IO {
    public final static String link = "D:\\Module 2\\bt\\src\\listSinhVien.txt";


    public static ArrayList<SinhVien> readToFile() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try (FileReader fr = new FileReader(link);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                list.add(new SinhVien(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4], Double.parseDouble(array[5])));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeToFile(ArrayList<SinhVien> list) {
        try (FileWriter fw = new FileWriter(link);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (SinhVien sinhVien : list) {
                bw.write(sinhVien.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
