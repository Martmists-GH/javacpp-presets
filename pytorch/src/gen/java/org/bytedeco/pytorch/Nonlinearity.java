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

@NoOffset @Name("std::variant<torch::enumtype::kLinear,torch::enumtype::kConv1D,torch::enumtype::kConv2D,torch::enumtype::kConv3D,torch::enumtype::kConvTranspose1D,torch::enumtype::kConvTranspose2D,torch::enumtype::kConvTranspose3D,torch::enumtype::kSigmoid,torch::enumtype::kTanh,torch::enumtype::kReLU,torch::enumtype::kLeakyReLU>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Nonlinearity extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Nonlinearity(Pointer p) { super(p); }
    public Nonlinearity(kLinear value) { this(); put(value); }
    public Nonlinearity(kConv1D value) { this(); put(value); }
    public Nonlinearity(kConv2D value) { this(); put(value); }
    public Nonlinearity(kConv3D value) { this(); put(value); }
    public Nonlinearity(kConvTranspose1D value) { this(); put(value); }
    public Nonlinearity(kConvTranspose2D value) { this(); put(value); }
    public Nonlinearity(kConvTranspose3D value) { this(); put(value); }
    public Nonlinearity(kSigmoid value) { this(); put(value); }
    public Nonlinearity(kTanh value) { this(); put(value); }
    public Nonlinearity(kReLU value) { this(); put(value); }
    public Nonlinearity(kLeakyReLU value) { this(); put(value); }
    public Nonlinearity()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef Nonlinearity put(@ByRef Nonlinearity x);

    public @ByRef kLinear get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef kLinear get0(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kLinear value);
    public @ByRef kConv1D get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kConv1D get1(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConv1D value);
    public @ByRef kConv2D get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef kConv2D get2(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConv2D value);
    public @ByRef kConv3D get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @ByRef kConv3D get3(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConv3D value);
    public @ByRef kConvTranspose1D get4() { return get4(this); }
    @Namespace @Name("std::get<4>") public static native @ByRef kConvTranspose1D get4(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConvTranspose1D value);
    public @ByRef kConvTranspose2D get5() { return get5(this); }
    @Namespace @Name("std::get<5>") public static native @ByRef kConvTranspose2D get5(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConvTranspose2D value);
    public @ByRef kConvTranspose3D get6() { return get6(this); }
    @Namespace @Name("std::get<6>") public static native @ByRef kConvTranspose3D get6(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kConvTranspose3D value);
    public @ByRef kSigmoid get7() { return get7(this); }
    @Namespace @Name("std::get<7>") public static native @ByRef kSigmoid get7(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kSigmoid value);
    public @ByRef kTanh get8() { return get8(this); }
    @Namespace @Name("std::get<8>") public static native @ByRef kTanh get8(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kTanh value);
    public @ByRef kReLU get9() { return get9(this); }
    @Namespace @Name("std::get<9>") public static native @ByRef kReLU get9(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kReLU value);
    public @ByRef kLeakyReLU get10() { return get10(this); }
    @Namespace @Name("std::get<10>") public static native @ByRef kLeakyReLU get10(@ByRef Nonlinearity container);
    @ValueSetter public native Nonlinearity put(@ByRef kLeakyReLU value);
}
