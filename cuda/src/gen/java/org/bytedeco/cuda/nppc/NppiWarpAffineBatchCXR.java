// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Data structure for batched nppiWarpAffineBatch.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiWarpAffineBatchCXR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiWarpAffineBatchCXR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiWarpAffineBatchCXR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiWarpAffineBatchCXR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiWarpAffineBatchCXR position(long position) {
        return (NppiWarpAffineBatchCXR)super.position(position);
    }
    @Override public NppiWarpAffineBatchCXR getPointer(long i) {
        return new NppiWarpAffineBatchCXR((Pointer)this).offsetAddress(i);
    }

    /** source image device memory pointer. */
    public native @Const Pointer pSrc(); public native NppiWarpAffineBatchCXR pSrc(Pointer setter);
    /** source image byte count per row. */
    public native int nSrcStep(); public native NppiWarpAffineBatchCXR nSrcStep(int setter);
    /** destination image device memory pointer. */
    public native Pointer pDst(); public native NppiWarpAffineBatchCXR pDst(Pointer setter);
    /** device image byte count per row. */
    public native int nDstStep(); public native NppiWarpAffineBatchCXR nDstStep(int setter);
    /** device memory pointer to the tranformation matrix with double precision floating-point coefficient values to be used for this image. */
    public native @Cast("Npp64f*") DoublePointer pCoeffs(); public native NppiWarpAffineBatchCXR pCoeffs(DoublePointer setter);
    /** FOR INTERNAL USE, DO NOT INITIALIZE.  */
    public native @Cast("Npp64f") double aTransformedCoeffs(int i, int j); public native NppiWarpAffineBatchCXR aTransformedCoeffs(int i, int j, double setter);
    @MemberGetter public native @Cast("Npp64f(* /*[2]*/ )[3]") DoublePointer aTransformedCoeffs();
}