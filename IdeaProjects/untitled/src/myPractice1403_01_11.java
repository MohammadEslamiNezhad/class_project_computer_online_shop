import java.util.Arrays;
import java.util.Scanner;

public class myPractice1403_01_11 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) continue;
            System.out.println("Abbas Bouazar");
            System.out.println("Yedoone 'r' dare !");
            System.out.println("Yedoone \"boo\" dare !");
            System.out.println("I read there poems for : " + i);
        }

        String[] names = {"Ali", "Abbas", "Mohammad", "Javad"};
        for (String name : names) {
            name = name.trim().toLowerCase();
            System.out.println("Hi " + name);
        }

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toLowerCase().trim();
        }

        Scanner nameScan = new Scanner(System.in);
        System.out.print("What's your name ? ");
        String name = nameScan.nextLine().trim().toLowerCase();
        boolean nameInNamesArray = Arrays.asList(names).contains(name);
        while (!nameInNamesArray) {
            System.out.println("I don't have your name in my list . ");
            Scanner newNameScan = new Scanner(System.in);
            System.out.print("please say another name to me : ");
            name = newNameScan.nextLine().trim().toLowerCase();
            nameInNamesArray = Arrays.asList(names).contains(name);
        }
        System.out.println("OK ! I found your name in my list : " + name);
        System.out.println("Goodbye " + name);

        float[] heights = {1.9f, 1.6f, 1.7f, 1.8f, 1.5f, 2.0f , 2.5f};
        float BMI;
        // forever loop
        for (float height : heights) {
            BMI = 75f / (float) (Math.pow(height, 2));
            if (BMI > 18 && BMI < 24) System.out.println("Normal");
            else if (BMI > 24) System.out.println("Fat");
            else System.out.println("Thin");
        }
    }
}