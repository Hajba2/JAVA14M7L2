import java.util.Arrays;
import java.util.StringJoiner;

public class SecondStrTest {

    public static void main(String[] args) {
        String toRemove = "java";
        String a = "hello Java From Happy NEW YEAR jaVA";

        String[] splited = a.split(" ");

        int toRemoveAmount = 0;
        for (String s : splited) {
            if (s.equalsIgnoreCase(toRemove)) {
                toRemoveAmount++;
            }
        }

        String[] res = new String[splited.length - toRemoveAmount];
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (String s : splited) {
            if (!s.equalsIgnoreCase(toRemove)) {
                res[i] = s.toLowerCase();
                sb.append(s.toLowerCase()).append(" ");
                i++;
            }
        }

        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        System.out.println("sb.toString() = " + sb.toString());

        System.out.println("String.join(\" \", res) = " + String.join(" ", res));

    }
}
