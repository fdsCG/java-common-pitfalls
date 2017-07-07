// { autofold
package com.yourself;

import java.util.Arrays;

public class Pitfalls {


public static void immutable() {
// }
String s = "abc";
s.toUpperCase();

System.out.println(s); // What does this print?
//{ autofold
}
}
//}