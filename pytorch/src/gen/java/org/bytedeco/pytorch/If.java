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


////////////////////////////////////////////////////////////////////////////////
// Statements
////////////////////////////////////////////////////////////////////////////////

@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class If extends Stmt {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public If(Pointer p) { super(p); }

  public If(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  public native @ByVal Expr cond();
  public native @ByVal StmtList trueBranch();
  public native @ByVal StmtList falseBranch();
  public native @ByVal If withNewBranches(
        @Const @ByRef StmtList true_branch,
        @Const @ByRef StmtList false_branch);
  public static native @ByVal If create(
        @Const @ByRef SourceRange range,
        @Const @ByRef Expr cond,
        @Const @ByRef StmtList true_branch,
        @Const @ByRef StmtList false_branch);
}