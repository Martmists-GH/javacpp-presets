// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@NoOffset @Name("arrow::util::optional<int64_t>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LongOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongOptional(Pointer p) { super(p); }
    public LongOptional(long value) { this(); put(value); }
    public LongOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef LongOptional put(@ByRef LongOptional x);


    @Name("value") public native @Cast("int64_t") long get();
    @ValueSetter public native LongOptional put(@Cast("int64_t") long value);
}
