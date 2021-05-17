public class StringSplitbySpace {

    public static void main(String[] args) {
        String strMain = "Welcome Kiran";
        String[] arrSplit = strMain.split("\\s");
        for (String s : arrSplit) {
            System.out.println(s);
        }
    }
}
