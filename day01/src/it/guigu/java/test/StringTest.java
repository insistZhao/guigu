package it.guigu.java.test;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class StringTest {

        String str = new String("good");
        char[] ch = { 't', 'e', 's', 't' };
        public void change(String str, char ch[]) {
            System.out.println(str);
            str = "test ok";
            System.out.println(str);
            ch[0] = 'b';
        }
        public static void main(String[] args) {
            StringTest ex = new StringTest();
            ex.change(ex.str, ex.ch);
            System.out.println(ex.str); // good
            System.out.println(ex.ch); // best
            int i = Integer.valueOf("1");
            System.out.println(i);
            char[] m = new char[1];
            System.out.println(Arrays.toString(m));
        }

}
