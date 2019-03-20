// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class HEAPENTRY32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HEAPENTRY32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HEAPENTRY32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HEAPENTRY32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HEAPENTRY32 position(long position) {
        return (HEAPENTRY32)super.position(position);
    }

    public native @Cast("SIZE_T") long dwSize(); public native HEAPENTRY32 dwSize(long dwSize);
    public native @Cast("HANDLE") Pointer hHandle(); public native HEAPENTRY32 hHandle(Pointer hHandle);     // Handle of this heap block
    public native @Cast("ULONG_PTR") long dwAddress(); public native HEAPENTRY32 dwAddress(long dwAddress);   // Linear address of start of block
    public native @Cast("SIZE_T") long dwBlockSize(); public native HEAPENTRY32 dwBlockSize(long dwBlockSize); // Size of block in bytes
    public native @Cast("DWORD") int dwFlags(); public native HEAPENTRY32 dwFlags(int dwFlags);
    public native @Cast("DWORD") int dwLockCount(); public native HEAPENTRY32 dwLockCount(int dwLockCount);
    public native @Cast("DWORD") int dwResvd(); public native HEAPENTRY32 dwResvd(int dwResvd);
    public native @Cast("DWORD") int th32ProcessID(); public native HEAPENTRY32 th32ProcessID(int th32ProcessID);   // owning process
    public native @Cast("ULONG_PTR") long th32HeapID(); public native HEAPENTRY32 th32HeapID(long th32HeapID);      // heap block is in
}