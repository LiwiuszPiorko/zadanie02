public class Calculator {
    public static Double[] convertToW(String kg, String g, String mg) {

        Double kilograms = 0.0;
        Double grams = 0.0;
        Double miligrams = 0.0;

        int check = 0;
        if (!kg.isEmpty()) {
            kilograms = Double.valueOf(kg);
            grams = kilograms * 1000;
            miligrams = kilograms * 1000000;
            check = check + 1;
        }
        if (!g.isEmpty()) {
            grams = Double.valueOf(g);
            kilograms = grams * 0.001;
            miligrams = grams * 1000;
            check = check + 1;
        }
        if (!mg.isEmpty()) {
            miligrams = Double.valueOf(mg);
            grams = miligrams * 0.001;
            kilograms = miligrams * 0.000001;
            check = check + 1;
        }
        if (check == 1) {
            Double[] result = new Double[]{kilograms, grams, miligrams};
            return result;
        } else {
            return null;
        }
    }

    public static Double[] convertToM(String m, String cm, String mm) {

        Double meters = 0.0;
        Double centimeters = 0.0;
        Double milimeters = 0.0;

        int check = 0;
        if (!m.isEmpty()) {
            meters = Double.valueOf(m);
            centimeters = meters * 100;
            milimeters = meters * 1000;
            check = check + 1;
        }
        if (!cm.isEmpty()) {
            centimeters = Double.valueOf(cm);
            meters = centimeters * 0.01;
            milimeters = centimeters * 10;
            check = check + 1;
        }
        if (!mm.isEmpty()) {
            milimeters = Double.valueOf(mm);
            meters = milimeters * 0.001;
            centimeters = milimeters * 0.01;
            check = check + 1;
        }
        if (check == 1) {
            Double[] result = new Double[]{meters, centimeters, milimeters};
            return result;
        } else {
            return null;
        }
    }
}
