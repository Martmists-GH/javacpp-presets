// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #if defined(MIDL_PASS)
// #else // MIDL_PASS
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LARGE_INTEGER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LARGE_INTEGER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LARGE_INTEGER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LARGE_INTEGER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LARGE_INTEGER position(long position) {
        return (LARGE_INTEGER)super.position(position);
    }

        public native @Cast("DWORD") int LowPart(); public native LARGE_INTEGER LowPart(int setter);
        public native @Cast("LONG") int HighPart(); public native LARGE_INTEGER HighPart(int setter); 
        @Name("u.LowPart") public native @Cast("DWORD") int u_LowPart(); public native LARGE_INTEGER u_LowPart(int setter);
        @Name("u.HighPart") public native @Cast("LONG") int u_HighPart(); public native LARGE_INTEGER u_HighPart(int setter);
// #endif //MIDL_PASS
    public native @Cast("LONGLONG") long QuadPart(); public native LARGE_INTEGER QuadPart(long setter);
}