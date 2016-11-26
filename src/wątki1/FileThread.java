package wątki1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class FileThread implements Runnable {

    String name;

    public FileThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            DataOutputStream dataStream = new DataOutputStream(new FileOutputStream(name));
            Random random = new Random();

            for (int i = 0; i < 1000000; i++) {
                dataStream.writeByte(random.nextInt(256));
            }

            dataStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
