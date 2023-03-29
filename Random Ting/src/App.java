import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter in array of ints in syntax ('int0','int1','int2',...): ");
        String inputtedInts = userInput.nextLine();
        System.out.println("Please enter in target int: ");
        int targetInt = userInput.nextInt(10);
        String[] strInts = inputtedInts.split(",");
        boolean foundCombo = false;
        int indiceA = 0;
        int indiceB = 0;

        for (String a: strInts) {
            int IntA = Integer.valueOf(a);

            for (String b: strInts) {
                int IntB = Integer.valueOf(b);
                if (IntA == IntB) {
                    indiceB ++;
                    continue;
                } else if (foundCombo) {
                break;
                } else {
                    int sum = IntA + IntB;
                    if (sum == targetInt) {
                        System.out.println("Array indices: " + indiceA + " and " + indiceB);
                        System.out.println(IntA + " + " + IntB + " = " + targetInt);
                        foundCombo = true;
                    } else {
                        indiceB ++;
                    }
                }
            }

            if (foundCombo) {
                break;
            } else {
                indiceA ++;
                indiceB = 0;
            }
        }
        if (!foundCombo) {
            System.out.println("No combination found");
            main(null);
        }
        userInput.close();
    }
}
