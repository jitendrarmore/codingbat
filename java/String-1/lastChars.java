/*

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

*/

public String lastChars(String a, String b) {
  if (a.length() < 2 || b.length() < 2) {
    return (a.length() < 1 ? a + "@"  : a.substring(0,1)) + (b.length() < 1 ?  b + "@"  : b.substring(b.length()-1));
  }
  return a.substring(0,1) + b.substring(b.length()-1);
}

