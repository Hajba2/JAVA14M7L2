public class ConcatExample {

    public static void main(String[] args) {

//        String res = "";
//        long start = System.currentTimeMillis();
//        for (int i = 0; i< 500000; i++) {
//            res = res + i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("+ takes " + (end - start));

//        long start2 = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i< 500000; i++) {
//            sb.append(i);
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println("String Builder takes " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i< 500000; i++) {
            stringBuffer.append(i).append(", ");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("String Buffer takes " + (end3 - start3));
        System.out.println("stringBuffer.toString() = " + stringBuffer.toString());
    }
}
