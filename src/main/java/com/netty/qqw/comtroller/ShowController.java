package com.netty.qqw.comtroller;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;

import org.junit.Test;


public class ShowController {
    @Test
    public void show(){
        final DefineUser32 defineUser32 = DefineUser32.INSTANCE;
        defineUser32.EnumWindows(new WinUser.WNDENUMPROC() {
            int count = 0;
            @Override
            public boolean callback(WinDef.HWND hWnd, Pointer arg1) {
                byte[] windowText = new byte[512];
                defineUser32.GetWindowTextA(hWnd, windowText, 512);
                //String property = System.getProperty("jna.encoding", Charset.defaultCharset().name());
                String wText = Native.toString(windowText,"GBK");
                // get rid of this if block if you want all windows regardless of whether
                // or not they have text
                if (wText.isEmpty()) {
                    return true;
                }
                try {
                    //wText = new String(wText.getBytes("UTF-8"),"GBK");
                    //wText = new String(wText.getBytes("GBK"),"UTF-8");
                    //wText = new String(wText.getBytes("ISO8859-1"),"GBK");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Found window with text " + hWnd + ", total " + ++count
                        + " Text: " + wText);
                //OpenController.open(wText);
                /*try {
                    Thread.sleep(1200l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                return true;
            }
        }, null);

    }
}
