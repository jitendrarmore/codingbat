/*


Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"


*/

public String delDel(String str) {
 if (str.length() < 4){
   return str;
 }
 
  String Delfound = str.substring(1, 4);
  if (Delfound.equals("del")) {
    
    String newstr1 = str.substring(0, 1);
    String newstr2 = str.substring(4, str.length());
    String newstr = newstr1 + newstr2;
    return newstr;
  } 
  return str;
  
  
  
  
}

