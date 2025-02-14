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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GeneratorImpl extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneratorImpl(Pointer p) { super(p); }

  // Constructors

  // Delete all copy and move assignment in favor of clone()
  // method
  
  
  
  public native @ByVal @Name("clone") GeneratorImplPtr clonePtr();

  // Common methods for all generators
  public native void set_current_seed(@Cast("uint64_t") long seed);
  public native void set_offset(@Cast("uint64_t") long offset);
  public native @Cast("uint64_t") long get_offset();
  public native @Cast("uint64_t") long current_seed();
  public native @Cast("uint64_t") long seed();
  public native void set_state(@Const @ByRef TensorImpl new_state);
  public native @ByVal TensorImplPtr get_state();
  public native @ByVal Device device();

  // See Note [Acquire lock when using random generators]

  public native @ByVal DispatchKeySet key_set();

  public native @NoException(true) void set_pyobj(@Cast("PyObject*") Pointer pyobj);

  public native @Cast("PyObject*") @NoException(true) Pointer pyobj();
}
