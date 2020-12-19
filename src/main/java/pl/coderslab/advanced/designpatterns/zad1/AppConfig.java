package pl.coderslab.advanced.designpatterns.zad1;

public class AppConfig {
    private int maxUsers;
    // app config functionality
    public int getTimeout(){
        return 42;
    }

    public int getMaxUsers(){
        return this.maxUsers;
    }

    public void setMaxUsers(int newMaxUsers){
        this.maxUsers = newMaxUsers;
    }

    // singleton traits
    private AppConfig() {}
    private static AppConfig INSTANCE;
    public static synchronized AppConfig getInstance(){
        if (INSTANCE==null){
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }
}
