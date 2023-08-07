import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        float height;
        float weight;
        float bmi;
        System.out.println("Input your height :");
        Scanner inHeight = new Scanner(System.in);
        height = inHeight.nextFloat();
        System.out.println("Input your weight :");
        Scanner inWeight = new Scanner(System.in);
        weight = inWeight.nextFloat();
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}
