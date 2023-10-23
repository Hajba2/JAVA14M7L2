public class Main {
    public static void main(String[] args) {
        String a = "intabc";
        String b = "intabc";

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a == b = " + (a == b));
    }

    public static void one() {
        String url = "http://google.com/search";
        url = url.replace("https://", "");
        url = url.replace("http://", "");
        url = url.replace("www.", "");
        String[] splited = url.split("/");
        String domain = splited[0];

        String s = url.replace("https://", "")
                .replace("http://", "")
                .replace("www.", "")
                .split("/")[0];

        System.out.println("domain = " + domain);
    }
}