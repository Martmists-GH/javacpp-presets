// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3ConvexUtility extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ConvexUtility(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ConvexUtility(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3ConvexUtility position(long position) {
        return (b3ConvexUtility)super.position(position);
    }
    @Override public b3ConvexUtility getPointer(long i) {
        return new b3ConvexUtility((Pointer)this).offsetAddress(i);
    }


	public native @ByRef b3Vector3 m_localCenter(); public native b3ConvexUtility m_localCenter(b3Vector3 setter);
	public native @ByRef b3Vector3 m_extents(); public native b3ConvexUtility m_extents(b3Vector3 setter);
	public native @ByRef b3Vector3 mC(); public native b3ConvexUtility mC(b3Vector3 setter);
	public native @ByRef b3Vector3 mE(); public native b3ConvexUtility mE(b3Vector3 setter);
	public native @Cast("b3Scalar") float m_radius(); public native b3ConvexUtility m_radius(float setter);

	public native @ByRef b3Vector3Array m_vertices(); public native b3ConvexUtility m_vertices(b3Vector3Array setter);
	public native @ByRef b3MyFaceArray m_faces(); public native b3ConvexUtility m_faces(b3MyFaceArray setter);
	public native @ByRef b3Vector3Array m_uniqueEdges(); public native b3ConvexUtility m_uniqueEdges(b3Vector3Array setter);

	public b3ConvexUtility() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean initializePolyhedralFeatures(@Const b3Vector3 orgVertices, int numVertices, @Cast("bool") boolean mergeCoplanarTriangles/*=true*/);
	public native @Cast("bool") boolean initializePolyhedralFeatures(@Const b3Vector3 orgVertices, int numVertices);

	public native void initialize();
	
}