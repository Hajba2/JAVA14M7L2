public class StrTest {

    public static void main(String[] args) {
        String a = "hello      From       Happy    NEW    YEAR   ";

        String[] splited = a.split(" ");

        //зробити трім до кожного слова, перше слово з великої летери, інші з маленької
        StringBuilder sb = new StringBuilder();
        sb.append(splited[0].substring(0, 1).toUpperCase() + splited[0].substring(1).toLowerCase() + " ");
        for (int i = 1; i < splited.length; i++) {
            if (!splited[i].isEmpty()) {
                sb.append(splited[i].toLowerCase() + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
