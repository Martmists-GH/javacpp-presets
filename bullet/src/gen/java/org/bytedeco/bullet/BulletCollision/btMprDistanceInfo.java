// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMprDistanceInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMprDistanceInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMprDistanceInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMprDistanceInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMprDistanceInfo position(long position) {
        return (btMprDistanceInfo)super.position(position);
    }
    @Override public btMprDistanceInfo getPointer(long i) {
        return new btMprDistanceInfo((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_pointOnA(); public native btMprDistanceInfo m_pointOnA(btVector3 setter);
	public native @ByRef btVector3 m_pointOnB(); public native btMprDistanceInfo m_pointOnB(btVector3 setter);
	public native @ByRef btVector3 m_normalBtoA(); public native btMprDistanceInfo m_normalBtoA(btVector3 setter);
	public native @Cast("btScalar") double m_distance(); public native btMprDistanceInfo m_distance(double setter);
}