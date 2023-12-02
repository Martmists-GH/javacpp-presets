// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


// We use forward declaration here instead of #include <ATen/dlpack.h> to avoid
// leaking DLPack implementation detail to every project that includes `ATen/Context.h`, which in turn
// would lead to a conflict when linked with another project using DLPack (for example TVM)
@Opaque @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DLDevice_ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public DLDevice_() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLDevice_(Pointer p) { super(p); }
}