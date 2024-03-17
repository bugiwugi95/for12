public class Task8 {
    public static void main(String[] args) {
        for (char i = 945; i <= 969; i++) {
            String str1 = String.valueOf(i).replaceFirst("",",");
            String str2 = str1.replace(",α", "α");
            System.out.print(str2);
        }
    }
}