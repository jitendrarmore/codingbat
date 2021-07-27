/*

Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

*/

public String stringYak(String str) {
        String yakRemove = "";
        for (int i = 0 ; i < str.length() ; i ++) {
            if ((i+3 < str.length()) && (str.substring(i, i+3).equals("yak"))) {
              yakRemove = yakRemove + "";
              i = i + 3;
            }
            yakRemove = yakRemove + str.charAt(i);
        }
        if(yakRemove.equals("yak")){
          return "";
        }
        if(yakRemove.substring(yakRemove.length() -3, yakRemove.length()).equals("yak")) {
          return yakRemove.substring(0, yakRemove.length() -3);
        }
        return yakRemove;
}



