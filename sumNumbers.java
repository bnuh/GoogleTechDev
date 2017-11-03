
public class sumNumbers {  
    public static void main(String[] args) {
        String str = "abc123xyz";
        int x = 0;
        str = str.replaceAll("[^\\d.]", "");
        for (int i = 0; i < str.length(); i++){
            String temp = "";
            if (Character.toString(str.charAt(i)) == "[\\s]"){
                x += Integer.valueOf(temp);
                System.out.println(x);
            }
            else {
                temp += Character.toString(str.charAt(i));
            }
            
        }
    }
}

  // aa11b33
  // 7 11