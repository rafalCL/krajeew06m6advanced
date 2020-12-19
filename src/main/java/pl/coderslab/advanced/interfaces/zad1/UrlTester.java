package pl.coderslab.advanced.interfaces.zad1;

public class UrlTester {
    public static void main(String[] args) {
        final String standardExampleUrl = "url_example?param1=99&param2=string";
        final Url standard = new StandardUrl();

        final String param1Value = standard.getParam("param1", standardExampleUrl);
        final String param2Value = standard.getParam("param2", standardExampleUrl);

        System.out.println(param1Value);
        System.out.println(param2Value);

        System.out.println("zad2");
        final String extendedExampleUrl = "url_example/param1.55/param2.byte";
        final Url extended = new ExtendedUrl();
        String extendedParam1Val = extended.getParam("param1", extendedExampleUrl);
        String extendedParam2Val = extended.getParam("param2", extendedExampleUrl);
        System.out.println(extendedParam1Val);
        System.out.println(extendedParam2Val);
    }
}
