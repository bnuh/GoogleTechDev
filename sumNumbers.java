public class sumNumbers {  
    public static void main(String[] args) {
        String str = "aa11b33";
        String temp = "";
        int flag = 0;
        int x = 0;
        str = str.replaceAll("[^\\d.]", " ").trim();
        for (int i = 0; i < str.length(); i++){
            if (Character.isWhitespace(str.charAt(i))){
                x += Integer.valueOf(temp);
                temp = "";
                flag = 1;
            }
            else {
                temp += Character.toString(str.charAt(i));
            }
        }
    }
}
// String.trim()
// aa11b33
// 7 11
