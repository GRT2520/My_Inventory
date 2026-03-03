package PROJECTBEG;

import java.util.Scanner;

public class BMI {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur weight (in kilogram)");
        float objectWeight = in.nextFloat();
        System.out.println("Enter ur height (in centimeter)");
        float objectHeightCm = in.nextFloat();


        float objectHeightM = objectHeightCm / 100;
        float objectBMI = objectWeight / (objectHeightM*objectHeightM);


        String category;
        if (objectBMI < 20){
            category = "Underweight";
        }
        else if ((objectBMI >= 20 && objectBMI < 25)) {
            category = "Normal";
        }
        else if (objectBMI >= 25 && objectBMI < 30) {
            category = "Overweight";
        }
        else{
            category = "Obese";
        }
        System.out.println("Tell me the BMI of this person" + objectBMI);
        System.out.println("Category" + category);
    }
}
//I FAILED AGAIN IN LOOP PART
