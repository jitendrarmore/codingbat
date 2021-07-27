/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

*/

public String startOz(String str) {
  if (str.equals("")) {return "";}
  if (str.length() < 2) { 
    if (str.substring(0,1).equals("o")) {return "o";} 
    return "";}
  if(str.substring(0,2).equals("oz")) {
    return "oz";
  }
  if(str.substring(0,1).equals("o")) {
    return "o";
  }
  if(str.substring(1,2).equals("z")) {
    return "z";
  }
 return "";
}

