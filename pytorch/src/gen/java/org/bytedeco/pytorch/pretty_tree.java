// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// tree pretty printer
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class pretty_tree extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public pretty_tree(Pointer p) { super(p); }

  public pretty_tree(@Const @ByRef TreeRef tree, @Cast("size_t") long col/*=40*/) { super((Pointer)null); allocate(tree, col); }
  private native void allocate(@Const @ByRef TreeRef tree, @Cast("size_t") long col/*=40*/);
  public pretty_tree(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  @MemberGetter public native @Const @ByRef TreeRef tree();
  public native @Cast("size_t") long col(); public native pretty_tree col(long setter);
  public native @ByRef TreeRefStringMap flat_strings(); public native pretty_tree flat_strings(TreeRefStringMap setter);
  public native @StdString BytePointer get_flat(@Const @ByRef TreeRef t);
  public native void print(@Cast("std::ostream*") @ByRef Pointer out, @Const @ByRef TreeRef t, int indent);
}