package school.lesson7;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void getInfo() {
        System.out.println(Arrays.toString(header));
        for (int[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
