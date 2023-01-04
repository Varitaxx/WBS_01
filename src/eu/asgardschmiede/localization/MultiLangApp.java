package eu.asgardschmiede.localization;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class MultiLangApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Sprache [DE, EN, FR]:");
        String langStr = s.nextLine();

        Map<String, Locale> languages = new HashMap<>();
        languages.put("DE", Locale.GERMANY);
        languages.put("FR", Locale.FRANCE);
        languages.put("EN", Locale.US);

        //Locale.setDefault(Locale.JAPAN);
        //Locale lang = Locale.GERMANY;

        Locale lang = languages.getOrDefault(langStr.trim().toUpperCase(), Locale.US);
        Locale.setDefault(lang);

        // Reihenfolge
        // _de_DE
        // _de
        // standard auf diesem Rechner
        // Sprachdatei ohne Endung
        // Exception
        ResourceBundle bundle = ResourceBundle.getBundle("eu.asgardschmiede.localization.labels", lang);

        //final NumberFormat NUM_FMT = NumberFormat.getInstance(lang);
        final NumberFormat NUM_FMT = NumberFormat.getInstance(lang);

        Locale.setDefault(lang);
        DecimalFormat DEC_FMT = new DecimalFormat("###,###.##");

        System.out.println(bundle.getString("start"));

        System.out.println(bundle.getString("name.question"));
        System.out.print(bundle.getString("name.label"));
        String name = s.nextLine();
        System.out.println(bundle.getString("welcome.hi") + " " + name + ". " + bundle.getString("welcome"));

        System.out.print(bundle.getString("price.label"));
        String priceStr = s.nextLine();

        double price = 0;

        try {
            price = NUM_FMT.parse(priceStr).doubleValue();
            System.out.println(NUM_FMT.format(price));
            System.out.println("Inkl. MwSt " + DEC_FMT.format(price * 1.19));


//			price = DEC_FMT.parse(priceStr).doubleValue();
//			System.out.println(DEC_FMT.format(price));
//			System.out.println("Inkl. MwSt " + DEC_FMT.format(price * 1.19));
        }
        catch (ParseException e) {
            System.out.println("Ungültige Zahl!");
        }

        System.out.println(bundle.getString("end"));
        System.out.println(bundle.getString("txt"));


        System.out.println();

        LocalDateTime zeitpunkt = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter fmt2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter fmt3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter fmt4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        System.out.println(fmt1.format(zeitpunkt));
        System.out.println(zeitpunkt.format(fmt2));
        //System.out.println(zeitpunkt.format(fmt3));
        //System.out.println(zeitpunkt.format(fmt4));

        System.out.println();



    }
}

