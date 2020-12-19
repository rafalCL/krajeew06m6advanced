package pl.coderslab.advanced.designpatterns.zad1;

public class AppConfigTest {
    private AppConfig appConfig = AppConfig.getInstance();
    private AppConfig appConfig2 = AppConfig.getInstance();

    public void methodUsingAppconfig(){
        int maxUsers = this.appConfig.getMaxUsers();
        this.appConfig.setMaxUsers(500);
    }

    public static void main(String[] args) {

    }
}
