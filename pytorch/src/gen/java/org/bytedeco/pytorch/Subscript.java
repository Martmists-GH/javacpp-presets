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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Subscript extends Expr {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Subscript(Pointer p) { super(p); }

  public Subscript(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  public native @ByVal Expr value();
  public native @ByVal ExprList subscript_exprs();
  public static native @ByVal Subscript create(
        @Const @ByRef SourceRange range,
        @Const @ByRef Expr value,
        @Const @ByRef ExprList subscript_exprs);
}