package com.company.stacks;

import java.util.Stack;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class DelimeterMatcher {

    public static void main(String[] args) {
        String s = "(is as )";
        String body = "<body><h1>Testing HTML Delimiter</h1><p>Testing tthis bullshit</p></body>";
        System.out.println(isMatched(s));
    }

    public static boolean isMatched(String expresion) {
        final String opening = "({[";
        final String closing = ")}]";

        Stack<Character> buffer = new LInkedStack<>();
        for (char c : expresion.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty())
                    return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
                    return false;
            }
        }
        return buffer.isEmpty();
    }

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new LInkedStack<>();
        int j = html.indexOf('<');
        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if (k == -1)
                return false;
            String tag = html.substring(j+1, k);
            if(!tag.startsWith("/"))
                buffer.push(tag);
            else {
                if (buffer.isEmpty())
                    return false;
                if (!tag.substring(1).equals(buffer.pop()))
                    return false;
            }
            j = html.indexOf('<', k+1);
        }

        return buffer.isEmpty();
    }
}
