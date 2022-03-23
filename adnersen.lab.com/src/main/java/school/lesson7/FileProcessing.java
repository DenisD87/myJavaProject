package school.lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileProcessing {
    public static void createFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File exists");
        }
    }

    public static void saveFile(AppData data, File file) {
        StringBuilder stringForFile = new StringBuilder();

        for (int i = 0; i < data.getHeader().length; i++) {
            stringForFile.append(data.getHeader()[i]);
            if (i != data.getHeader().length - 1) {
                stringForFile.append(";");
            } else {
                stringForFile.append("\n");
            }
        }

        for (int[] row : data.getData()) {
            for (int i = 0; i < row.length; i++) {
                stringForFile.append(row[i]);
                if (i != row.length - 1) {
                    stringForFile.append(";");
                } else {
                    stringForFile.append("\n");
                }
            }
        }

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(stringForFile.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(AppData data, File file) {
        byte[] byteArray = new byte[0];

        try (FileInputStream fis = new FileInputStream(file)) {
            byteArray = fis.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] stringArray = new String(byteArray).split("\\n");

        data.setHeader(stringArray[0].split(";"));

        String[] stringRowsArray = Arrays.copyOfRange(stringArray, 1, stringArray.length);

        int[][] dataArray = new int[stringRowsArray.length][];
        for (int i = 0; i < stringRowsArray.length; i++) {
            String[] stringElementsArray = stringRowsArray[i].split(";");
            int[] intElementsArray = new int[stringElementsArray.length];
            for (int j = 0; j < stringElementsArray.length; j++) {
                intElementsArray[j] = Integer.parseInt(stringElementsArray[j]);
            }
            dataArray[i] = intElementsArray;
        }
        data.setData(dataArray);
    }

    public static void deleteFile(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
