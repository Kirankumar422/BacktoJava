public class StringSplitRegex {

    public static void main(String[] args) {
        String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = strMain.split(",",3);
        for (String s : arrSplit) {
            System.out.println(s);
        }
    }
}
