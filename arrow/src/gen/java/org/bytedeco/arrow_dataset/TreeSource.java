// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A recursive Source with child Sources. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class TreeSource extends Source {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeSource(Pointer p) { super(p); }

  public TreeSource(@SharedPtr @ByVal Schema schema, @SharedPtr @ByVal Source children) { super((Pointer)null); allocate(schema, children); }
  private native void allocate(@SharedPtr @ByVal Schema schema, @SharedPtr @ByVal Source children);

  public native @ByVal @Cast("arrow::dataset::FragmentIterator*") ScanTaskIterator GetFragmentsImpl(@SharedPtr ScanOptions options);

  public native @StdString String type_name();
}