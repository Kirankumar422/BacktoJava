public class StringSplitStudy {

    public static void main(String[] args) {
        String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = strMain.split(",");
        for (String s : arrSplit) {

            System.out.println(s);
        }
    }
}
