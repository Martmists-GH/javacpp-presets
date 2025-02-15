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

@NoOffset @Name("std::tuple<torch::Tensor,std::vector<torch::Tensor>,std::vector<torch::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TensorTensorVectorTensorVector_T extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TensorTensorVectorTensorVector_T(Pointer p) { super(p); }
    public T_TensorTensorVectorTensorVector_T(@ByRef Tensor value0, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value1, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value2) { allocate(value0, value1, value2); }
    private native void allocate(@ByRef Tensor value0, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value1, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value2);
    public T_TensorTensorVectorTensorVector_T()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TensorTensorVectorTensorVector_T put(@ByRef T_TensorTensorVectorTensorVector_T x);

    public @ByRef Tensor get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Tensor get0(@ByRef T_TensorTensorVectorTensorVector_T container);
    public @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get1(@ByRef T_TensorTensorVectorTensorVector_T container);
    public @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get2(@ByRef T_TensorTensorVectorTensorVector_T container);
}

