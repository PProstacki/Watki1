package wątki1;

public class Wątki1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new FileThread("File" + i + ".bin")).start();
        }
    }
}
