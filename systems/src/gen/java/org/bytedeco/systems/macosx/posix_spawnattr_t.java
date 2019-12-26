// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * Opaque types for use with posix_spawn() family functions.  Internals are
 * not defined, and should not be accessed directly.  Types are defined as
 * mandated by POSIX.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class posix_spawnattr_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public posix_spawnattr_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public posix_spawnattr_t(Pointer p) { super(p); }
}