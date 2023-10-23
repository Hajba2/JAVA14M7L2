import java.util.Arrays;

public class ThirdStrTest {

    public static void main(String[] args) {
        String[] toRemoveArr = {"java", "hello"};
        String[] enterArr = {"one", "hello", "Java", "From", "Happy", "NEW", "YEAR", "jaVA"};


        int toRemoveAmount = 0;
        for (String word : enterArr) {
            for (String toRemoveWord : toRemoveArr) {
                if (word.equalsIgnoreCase(toRemoveWord)) {
                    toRemoveAmount++;
                }
            }
        }

        String[] res = new String[enterArr.length - toRemoveAmount];
        int i = 0;
        for (String word : enterArr) {
            boolean isTooRemove = false;

            for (String toRemoveWord : toRemoveArr) {
                if (word.equalsIgnoreCase(toRemoveWord)) {
                    isTooRemove = true;
                }
            }
            if (!isTooRemove) {
                res[i] = word;
                i++;
            }
        }

        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }
}
