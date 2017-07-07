// { autofold
package com.yourself;

public class Pitfalls {


public static void immutable() {
// }
String s = "abc";
s.toUpperCase();

System.out.println(s); // What does it print?
//{ autofold
}
}
//}