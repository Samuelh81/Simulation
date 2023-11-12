public class Util {

    public static boolean randomChance(double percentChance) {
        return  (Math.random() * 100) < percentChance;
    }

    public static String randomString(int length) {
        String str = "";
        for (int i=0;i<length;i++) {
            str += "" + (char) ((Math.random()*26)+97);
        }
        return str;
    }
}
