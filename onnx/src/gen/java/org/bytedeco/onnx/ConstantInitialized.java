// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Tag type used to invoke the constinit constructor overload of some classes.
// Such constructors are internal implementation details of the library.
@Namespace("google::protobuf::internal") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ConstantInitialized extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantInitialized(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConstantInitialized(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConstantInitialized position(long position) {
        return (ConstantInitialized)super.position(position);
    }
    @Override public ConstantInitialized getPointer(long i) {
        return new ConstantInitialized((Pointer)this).offsetAddress(i);
    }

  public ConstantInitialized() { super((Pointer)null); allocate(); }
  private native void allocate();
}