// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;

// #endif

/** Internal Kinect registration parameters.
 *  Structure matches that of the line protocol
 *  of the Kinect. */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_reg_info extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_reg_info() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_reg_info(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_reg_info(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_reg_info position(long position) {
        return (freenect_reg_info)super.position(position);
    }

	public native int dx_center(); public native freenect_reg_info dx_center(int setter); // not used by mapping algorithm

	public native int ax(); public native freenect_reg_info ax(int setter);
	public native int bx(); public native freenect_reg_info bx(int setter);
	public native int cx(); public native freenect_reg_info cx(int setter);
	public native int dx(); public native freenect_reg_info dx(int setter);

	public native int dx_start(); public native freenect_reg_info dx_start(int setter);

	public native int ay(); public native freenect_reg_info ay(int setter);
	public native int by(); public native freenect_reg_info by(int setter);
	public native int cy(); public native freenect_reg_info cy(int setter);
	public native int dy(); public native freenect_reg_info dy(int setter);

	public native int dy_start(); public native freenect_reg_info dy_start(int setter);

	public native int dx_beta_start(); public native freenect_reg_info dx_beta_start(int setter);
	public native int dy_beta_start(); public native freenect_reg_info dy_beta_start(int setter);

	public native int rollout_blank(); public native freenect_reg_info rollout_blank(int setter); // not used by mapping algorithm
	public native int rollout_size(); public native freenect_reg_info rollout_size(int setter);  // not used by mapping algorithm

	public native int dx_beta_inc(); public native freenect_reg_info dx_beta_inc(int setter);
	public native int dy_beta_inc(); public native freenect_reg_info dy_beta_inc(int setter);

	public native int dxdx_start(); public native freenect_reg_info dxdx_start(int setter);
	public native int dxdy_start(); public native freenect_reg_info dxdy_start(int setter);
	public native int dydx_start(); public native freenect_reg_info dydx_start(int setter);
	public native int dydy_start(); public native freenect_reg_info dydy_start(int setter);

	public native int dxdxdx_start(); public native freenect_reg_info dxdxdx_start(int setter);
	public native int dydxdx_start(); public native freenect_reg_info dydxdx_start(int setter);
	public native int dxdxdy_start(); public native freenect_reg_info dxdxdy_start(int setter);
	public native int dydxdy_start(); public native freenect_reg_info dydxdy_start(int setter);

	public native int back_comp1(); public native freenect_reg_info back_comp1(int setter); // not used by mapping algorithm

	public native int dydydx_start(); public native freenect_reg_info dydydx_start(int setter);

	public native int back_comp2(); public native freenect_reg_info back_comp2(int setter); // not used by mapping algorithm

	public native int dydydy_start(); public native freenect_reg_info dydydy_start(int setter);
}