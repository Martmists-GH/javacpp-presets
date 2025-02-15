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


@Namespace("c10::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ForceDispatchKeyGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ForceDispatchKeyGuard(Pointer p) { super(p); }

  public ForceDispatchKeyGuard(@ByVal LocalDispatchKeySet key_set) { super((Pointer)null); allocate(key_set); }
  private native void allocate(@ByVal LocalDispatchKeySet key_set);
}
