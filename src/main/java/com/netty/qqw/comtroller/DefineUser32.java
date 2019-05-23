package com.netty.qqw.comtroller;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.win32.StdCallLibrary;

public interface DefineUser32 extends StdCallLibrary {
      DefineUser32 INSTANCE = (DefineUser32) Native.loadLibrary("user32", DefineUser32.class);
      boolean EnumWindows(WinUser.WNDENUMPROC lpEnumFunc, Pointer arg);
      int GetWindowTextA(WinDef.HWND hWnd, byte[] lpString, int nMaxCount);
}