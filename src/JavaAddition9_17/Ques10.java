/*
    Demonstrate the use of repeat, strip, isBlank,
    indent, transform, stripIndent, translateEscapes, formatted String methods.
 */
package JavaAddition9_17;

public class Ques10 {
    public static void main(String[] args) {

        //REPEAT
        String str = "Hello Everyone!!";
        System.out.println(str.repeat(3));


        //STRIP
        String s1="   \n Mansi    Aggarwal  ";
        System.out.println(s1);
        System.out.println(s1.strip());
        System.out.println(s1.trim());


        //BLANK
        /*String str1 ="Object class is a super class of all classes";
        System.out.println(str1.isBlank()); return false */
        String blankStr=" ";
        System.out.println(blankStr.isBlank());


        //INDENT
        String indentStr = "          Hey!! Where are you from??    ";
        System.out.println(indentStr.indent(10));


        //TRANSFORM
        String transfromStr = "Java is a Platform independent language";
        String res= transfromStr.transform(sb -> new StringBuilder(sb)
                .reverse().toString());
        System.out.println(res);


        //STRIPINDENT
        String str2 = "  this \nstring is used \n\tas a strip indent \t\texample";
        System.out.println(str2.stripIndent());


        //TRANSLATE ESCAPES
        String translate = "this \\n string is used for \\t translate escapes example";
        System.out.println(translate);


        //FORMATTED STRING METHODS
        System.out.println(String.format("This is a line %s","5" ));
        String formattedStr = """
                This is a formatted %s String
                """;
        System.out.println(formattedStr.formatted(4));

    }
}
