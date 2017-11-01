
public class withoutString {  
    public static void main(String[] args) {
        int[] arr = new int [remove.length()];
        for (int i = 0; i < base.length(); i++){
            if (base.toLowerCase().charAt(i) == remove.toLowerCase().charAt(0)) {
                for (int j = 0; j < remove.length(); j++){
                    if (remove.toLowerCase().charAt(j) == base.toLowerCase().charAt(i+j)) {
                        arr[j] = i+j;
                        if (j == remove.length() - 1){
                            base = base.substring(0, arr[0]) + base.substring(arr[arr.length-1]+1,base.length());
                        }
                    }
                }
            }
        }
        return base;
    }
