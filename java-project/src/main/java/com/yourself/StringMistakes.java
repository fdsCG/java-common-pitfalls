// { autofold
package com.yourself;

import java.util.Arrays;

public class StringMistakes {


public static void immutable() {
// }
String s = "Hello World!";
s.toUpperCase();

System.out.println(s); // "HELLO WORLD!"?
//{ autofold
}
}
//}