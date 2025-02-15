// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
public class SliceExpr extends Expr {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SliceExpr(Pointer p) { super(p); }

  public SliceExpr(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  public native @ByVal ExprMaybe start();
  public native @ByVal ExprMaybe end();
  public native @ByVal ExprMaybe step();
  public native @ByVal Expr startOr(@Cast("int64_t") long alternative);
  public native @ByVal Expr endOr(@Cast("int64_t") long alternative);
  public native @ByVal Expr stepOr(@Cast("int64_t") long alternative);
  public static native @ByVal SliceExpr create(
        @Const @ByRef SourceRange range,
        @Const @ByRef ExprMaybe start,
        @Const @ByRef ExprMaybe end,
        @Const @ByRef ExprMaybe step);
}
