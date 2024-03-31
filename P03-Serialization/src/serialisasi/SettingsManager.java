package serialisasi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SettingsManager {
    
    private static final String SETTINGS_FILE = "settings.ser";

    public void saveSettings(Settings settings) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(SETTINGS_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(settings);
            System.out.println("Pengaturan telah disimpan di " + SETTINGS_FILE);
        }
    }

    // Metode untuk memuat pengaturan dari file
    public Settings loadSettings() throws IOException, ClassNotFoundException {
        Settings settings;
        try (FileInputStream fis = new FileInputStream(SETTINGS_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            settings = (Settings) ois.readObject();
            System.out.println("Pengaturan telah dimuat dari " + SETTINGS_FILE);
        }
        return settings;
    }
}