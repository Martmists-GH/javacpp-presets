// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Control Mode kernel behavior
 * 
 *  Returns top-n common values and counts.
 *  By default, returns the most common value and count. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ModeOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModeOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ModeOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ModeOptions position(long position) {
        return (ModeOptions)super.position(position);
    }
    @Override public ModeOptions getPointer(long i) {
        return new ModeOptions((Pointer)this).offsetAddress(i);
    }

  public ModeOptions(@Cast("int64_t") long n/*=1*/, @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(n, skip_nulls, min_count); }
  private native void allocate(@Cast("int64_t") long n/*=1*/, @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public ModeOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal ModeOptions Defaults();

  public native @Cast("int64_t") long n(); public native ModeOptions n(long setter);
  /** If true (the default), null values are ignored. Otherwise, if any value is null,
   *  emit null. */
  public native @Cast("bool") boolean skip_nulls(); public native ModeOptions skip_nulls(boolean setter);
  /** If less than this many non-null values are observed, emit null. */
  public native @Cast("uint32_t") int min_count(); public native ModeOptions min_count(int setter);
}