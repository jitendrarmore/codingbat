/*

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

*/

public String front3(String str) {
        List<String> list = new ArrayList<String>();
        if (str.length() < 3) {
            for (int i = 0; i < 3; i++) {
                list.add(new String(str));
            }
        } else {
            String str1 = str.substring(0, 3);
            for (int i = 0; i < 3; i++) {
                list.add(new String(str1));
            }
            
        }
        String newstr = String.join("",list);
        return newstr;
}

