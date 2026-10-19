package palg.Cviko04.Uloha03;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // TODO: Tato metoda zajišťuje opakované generování 6-místných kódů zvoleným způsobem.
    //       Návrh na refaktorizaci:
    //       1) Založte složku Uloha03/Generators
    //       2) Ve složce Generators založte rozhraní Generator s metodou newCode
    //       3) Ve složce Generators založte vhodným způsobem čtyři potomky tohoto typu:
    //            RandomDigitsGenerator, FromTimestampGenerator, RandomNumberApiGenerator, FixedForTestingGenerator
    //       4) Metodu newCode přepracujte na metodu generatorFactory s výstupním typem Generator, switch-case zde zůstane
    //       5) Upravte metodu main tak, aby využívala metodu newGenerator
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        var strategy = props.getProperty("strategy");
        System.out.println("Systém je nastaven na způsob generování kódů: "+strategy);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Pro vygenerování 6-místného kódu stiskněte ENTER:");
            scanner.nextLine();
            System.out.println(newCode(strategy));
        }
    }

    public static String newCode(String strategy){
        switch (strategy) {
            case "RANDOM_DIGITS":
                var r = new Random();
                var s = "";
                for (int i = 1; i < 6; i++)
                    s += Integer.toString(r.nextInt(10));
                return s;
            case "FROM_TIMESTAMP":
                var s1 = Long.toString(Instant.now().toEpochMilli() % 1000000);
                return s1;
            case "RANDOM_NUMBER_API":
                try (HttpClient client = HttpClient.newHttpClient()) {
                    String responseBody;
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create("https://www.randomnumberapi.com/api/v1.0/random?min=100000&max=999999&count=1"))
                            .build();
                    responseBody = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
                    return responseBody.replace("[", "").replace("]", "").trim();
                } catch (Exception e) {

                }
            case "FIXED_FOR_TESTING":
                return  "334455";
            default:
                return "";
        }
    }
}
