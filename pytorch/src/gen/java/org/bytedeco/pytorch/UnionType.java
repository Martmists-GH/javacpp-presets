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

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UnionType extends SharedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionType(Pointer p) { super(p); }


  @MemberGetter public static native TypeKind Kind();

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs_, @Cast("std::ostream*") Pointer why_not);

  public native @StdString BytePointer str();

  public static native @SharedPtr UnionType create(@ByVal TypeVector reference);

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @Cast("bool") boolean isUnionType();

  public native @ByVal TypeArrayRef containedTypes();

  // For testing purposes only
  public native @ByVal TypeArrayRef getTypes();

  public native @ByVal Type.TypePtr createWithContained(@ByVal TypeVector contained_types);

  public native @Cast("bool") boolean canHoldType(@Const @ByRef Type type);

  public native @Cast("bool") boolean hasFreeVariables();

  public native @ByVal TypePtrOptional toOptional();

  public native @ByVal TypePtrOptional subtractTypeSet(@ByRef TypeVector to_subtract);

}