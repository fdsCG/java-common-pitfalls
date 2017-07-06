// { autofold
package com.yourself;

import java.util.Arrays;

public class StringMistakes {


public static void immutable() {
// }
String s = "abc";
s.toUpperCase();

System.out.println(s); // "ABC"?
//{ autofold
}
}
//}