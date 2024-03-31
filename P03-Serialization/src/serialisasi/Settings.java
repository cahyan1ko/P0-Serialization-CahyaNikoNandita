package serialisasi;

import java.io.Serializable;

public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String theme;
    private transient String password;
    private static int version = 1;
    private final String appName = "MyApp";
    
    public Settings() {
        
    }
    
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getVersion() {
        return version;
    }

    public String getAppName() {
        return appName;
    }

}