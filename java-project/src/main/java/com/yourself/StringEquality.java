// { autofold
package com.yourself;

public class StringEquality {


public static void exec() {
// }
String s1 = "text";
String s2 = "text";
System.out.println(s1 == s2); // true or false?

String s3 = new String("text");
String s4 = new String("text");
System.out.println(s3 == s4); // true or false?

String s5 = "t" + "ext";
String s6 = "tex" + "t";
System.out.println(s5 == s6); // true or false?
//{ autofold
}
}
//}