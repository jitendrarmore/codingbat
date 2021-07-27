/*

Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi

*/

public String stringTimes(String str, int n) {
  String newStr = "";
  for (int i = 0 ; i <  n ; i++ ){
    newStr = newStr + str;
  }
  return newStr;
}

