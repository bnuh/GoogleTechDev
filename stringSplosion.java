// Given a non-empty string like "Code" return a string like "CCoCodCode".

// stringSplosion("Code") → "CCoCodCode"
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"

public String stringSplosion(String str) {
  String s = "";
  int max = 0;
  if (str.length() > 0) {
    for (int i = 0; i < str.length(); i++){
      for (int j = 0; j <= max; j++) {
        s = s + (str.charAt(j));
      }
      max += 1;
    }
    return s;
  }
  return null;
}
