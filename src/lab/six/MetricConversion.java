package lab.six;

import java.util.Scanner;

class ConVolume {
    public double litreToQuart(double l, String unit) {
        double q;
        if (unit.equalsIgnoreCase("liter")) {
            q = l / 1.137f;
        } else {
            q = l / 1137;
        }
        return q;
    }

    public double quartzToLitre(double q) {
        return q * 1.137f;
    }
}

class ConLength extends ConVolume {
    public double meterToInch(double meter) {
        return meter * 39.37;
    }

    public double inchToMeter(double inch) {
        return inch / 39.37;
    }
}

class ConMass extends ConLength {
    public double gramToPound(double gram) {
        return gram / 454;
    }

    public double poundToGram(double pound) {
        return pound * 454;
    }
}

class Conversion extends ConMass {
    public Scanner scanObj = new Scanner(System.in);
    public String units, outUnit;
    double value;

    void run() {
        inputGet();
    }

    void inputGet() {
        System.out.print("Enter the Input for Metric Conversion\nEnter the " +
                "value: ");
        value = scanObj.nextDouble();
        scanObj.nextLine();
        System.out.print("Unit for Input: ");
        units = scanObj.nextLine();

        System.out.print("Unit for Output: ");
        outUnit = scanObj.nextLine();
        process();
    }

    void process() {
        if (units.contains("meter")) {
            if (outUnit.equalsIgnoreCase("inch")) {
                if (units.equalsIgnoreCase("centimeter")) {
                    System.out.println("Conversion of " + value + " " + units + " = " + meterToInch(value / 100) + " inch");
                } else {
                    System.out.println("Conversion of " + value + " " + units + " = " + meterToInch(value) + " inch");
                }
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else if (units.contains("inch")) {
            if (outUnit.equalsIgnoreCase("meter")) {
                if (outUnit.equalsIgnoreCase("centimeter")) {
                    System.out.println("Conversion of " + value + " " + units + " = " + (inchToMeter(value) * 100) + " centimeter");
                } else {
                    System.out.println("Conversion of " + value + " " + units + " = " + inchToMeter(value) + " meter");
                }
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else if (units.contains("liter")) {
            if (outUnit.equalsIgnoreCase("quart")) {
                System.out.println("Conversion of " + value + " " + units +
                        " = " + litreToQuart(value, units) + " quart");
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else if (units.contains("quart")) {
            if (outUnit.equalsIgnoreCase("liter")) {
                System.out.println("Conversion of " + value + " " + units +
                        " = " + quartzToLitre(value) + " liter");
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else if (units.contains("gram")) {
            if (outUnit.equalsIgnoreCase("pound")) {
                System.out.println("Conversion of " + value + " " + units +
                        " = " + gramToPound(value) + " pound");
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else if (units.contains("pound")) {
            if (outUnit.equalsIgnoreCase("gram")) {
                System.out.println("Conversion of " + value + " " + units +
                        " = " + poundToGram(value) + " gram");
            } else {
                System.out.println(units + " Cannot convert into " + outUnit);
            }
        } else {
            System.out.println(units + " Cannot convert into " + outUnit);
        }

    }
}


public class MetricConversion {

    public static void main(String[] args) {

        new Conversion().run();

    }

}
