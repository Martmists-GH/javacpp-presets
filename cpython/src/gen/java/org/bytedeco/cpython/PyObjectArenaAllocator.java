// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


/* This example code implements an object constructor with a custom
   allocator, where PyObject_New is inlined, and shows the important
   distinction between two steps (at least):
       1) the actual allocation of the object storage;
       2) the initialization of the Python specific fields
      in this storage with PyObject_{Init, InitVar}.

   PyObject *
   YourObject_New(...)
   {
       PyObject *op;

       op = (PyObject *) Your_Allocator(_PyObject_SIZE(YourTypeStruct));
       if (op == NULL)
       return PyErr_NoMemory();

       PyObject_Init(op, &YourTypeStruct);

       op->ob_field = value;
       ...
       return op;
   }

   Note that in C++, the use of the new operator usually implies that
   the 1st step is performed automatically for you, so in a C++ class
   constructor you would start directly with PyObject_Init/InitVar
*/

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyObjectArenaAllocator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyObjectArenaAllocator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyObjectArenaAllocator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyObjectArenaAllocator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyObjectArenaAllocator position(long position) {
        return (PyObjectArenaAllocator)super.position(position);
    }

    /* user context passed as the first argument to the 2 functions */
    public native Pointer ctx(); public native PyObjectArenaAllocator ctx(Pointer ctx);

    /* allocate an arena of size bytes */
    public static class Alloc_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Alloc_Pointer_long(Pointer p) { super(p); }
        protected Alloc_Pointer_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, @Cast("size_t") long size);
    }
    public native Alloc_Pointer_long alloc(); public native PyObjectArenaAllocator alloc(Alloc_Pointer_long alloc);

    /* free an arena */
    public static class Free_Pointer_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_Pointer_Pointer_long(Pointer p) { super(p); }
        protected Free_Pointer_Pointer_long() { allocate(); }
        private native void allocate();
        public native void call(Pointer ctx, Pointer ptr, @Cast("size_t") long size);
    }
    public native Free_Pointer_Pointer_long free(); public native PyObjectArenaAllocator free(Free_Pointer_Pointer_long free);
}