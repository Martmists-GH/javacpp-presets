// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

@Name("btAlignedObjectArray<btVector3>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btVector3Array extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVector3Array(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVector3Array(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btVector3Array position(long position) {
        return (btVector3Array)super.position(position);
    }
    @Override public btVector3Array getPointer(long i) {
        return new btVector3Array((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") btVector3Array put(@Const @ByRef btVector3Array other);
	public btVector3Array() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an btAlignedObjectArray, and use a (const) reference to the array instead. */
	public btVector3Array(@Const @ByRef btVector3Array otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef btVector3Array otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByRef btVector3 at(int n);

	public native @ByRef @Name("operator []") btVector3 get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @Const @ByRef(nullValue = "btVector3()") btVector3 fillData);
	public native void resize(int newsize);
	public native @ByRef btVector3 expandNonInitializing();

	public native @ByRef btVector3 expand(@Const @ByRef(nullValue = "btVector3()") btVector3 fillValue);
	public native @ByRef btVector3 expand();

	public native void push_back(@Const @ByRef btVector3 _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	public native int findBinarySearch(@Const @ByRef btVector3 key);

	public native int findLinearSearch(@Const @ByRef btVector3 key);

	// If the key is not in the array, return -1 instead of 0,
	// since 0 also means the first element in the array.
	public native int findLinearSearch2(@Const @ByRef btVector3 key);

	public native void removeAtIndex(int index);
	public native void remove(@Const @ByRef btVector3 key);

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef btVector3Array otherArray);
}