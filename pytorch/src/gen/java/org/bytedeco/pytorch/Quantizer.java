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


/**
 * Quantizer is the class for storing all the information
 * that's necessary to perform quantize and dequantize
 * operation.
 *
 * We might have different types of quantization schemes and this is
 * the base class for all quantizers.
 *
 * QTensorImpl will hold a pointer to Quantizer so that we can support
 * different quantization schemes on Tensor.
 *
 * For example, the most common quantization scheme, Affine Quantization,
 * requires scale and zero_point as parameters, we'll store scale and zero_point
 * inside the instance and we can use it to quantize a float Tensor or
 * dequantize a quantized Tensor.
 *
 * When you add new types of leaf Quantizer class, please also
 * make sure to add a corresponding QScheme enum since
 * they should have one to one mapping.
 *
 * Note about intrusive_ptr:
 * Quantized Tensor holds an intrusive_ptr to Quantizer, and multiple Tensor can
 * share the same Quantizer. Quantizer should be immutable.
 */
@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Quantizer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Quantizer(Pointer p) { super(p); }

  @MemberGetter public native ScalarType scalar_type_();

  // Copied from torch/csrc/jit/ir/scope.h
  public native @ByVal QuantizerPtr intrusive_from_this();

  /**
   * Each concrete Quantizer type should have a unique QScheme type.
   */
  public native QScheme qscheme();

  public native ScalarType scalar_type();

  /**
   * quantize a float Tensor into a quantized Tensor.
   */
  public native @ByVal Tensor quantize(@Const @ByRef Tensor t);

  /**
   * dequantize a quantized Tensor into a float Tensor.
   */
  public native @ByVal Tensor dequantize(@Const @ByRef Tensor t);

  /**
   * dequantize a quantized Tensor into a float Tensor, out= variant
   */
  public native @ByRef Tensor dequantize_out(@ByRef Tensor out, @Const @ByRef Tensor t);

  /**
   * Compare against {@code other} for equality.
   */
  public native @Cast("bool") boolean equalTo(@ByVal QuantizerPtr other);
}