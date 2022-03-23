package school.lesson7;

import java.io.File;

public class SeventhHomeWorkApp {
    public static void main(String[] args) {
        String path = "adnersen.lab.com\\src\\main\\java\\school\\lesson7\\";
        File file = new File(path + "file.csv");

        AppData data1 = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});
        System.out.println("data1 info:");
        data1.getInfo();

        FileProcessing.createFile(file);
        FileProcessing.saveFile(data1, file);

        AppData data2 = new AppData();
        FileProcessing.readFile(data2, file);
        System.out.println("data2 info:");
        data2.getInfo();

//        FileProcessing.deleteFile(file);
    }
}
