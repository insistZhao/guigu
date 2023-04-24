package it.guigu.java.test;

import org.junit.Test;

public class StringBufferTest {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);

    }
}
