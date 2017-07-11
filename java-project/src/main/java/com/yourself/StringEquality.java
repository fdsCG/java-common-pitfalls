// { autofold
package com.yourself;

public class StringEquality {


public static void exec() {
// }

String s1 = "text";
String s2 = "text";
System.out.println(s1 == s2); // true or false?

String s3 = "t" + "ext";
String s4 = "tex" + "t";
System.out.println(s3 == s4); // true or false?

System.out.println(s2 == s3); // true or false?

//{ autofold
}
}
//}