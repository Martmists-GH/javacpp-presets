// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


// TODO C++20 char8_t
// TODO test if caller works when replace "dai::Path" -> "std::filesystem::path"
// TODO test if can `using dai::Path = std::filesystem::path` on C++17 to completely use STL

/**
 * \brief Represents paths on a filesystem; accepts utf-8, Windows utf-16 wchar_t, or
 *        std::filesystem::path.
 *
 *        It is suitable for direct use with OS APIs.
 *        Features are limited to character-set conversion of paths. It is not
 *        intended as a full replacement for std::filesystem::path
 *
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Path extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Path(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Path position(long position) {
        return (Path)super.position(position);
    }
    @Override public Path getPointer(long i) {
        return new Path((Pointer)this).offsetAddress(i);
    }

// #if defined(_WIN32) && defined(_MSC_VER)
    /** character used by native-encoding of filesystem */
// #else
    /** character used by native-encoding of filesystem */
// #endif

    public Path() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Path(@Const @ByRef Path arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef Path arg0);
    public native @ByRef @Name("operator =") Path put(@Const @ByRef Path arg0);

    /**
     * \brief Construct Path object from source.
     *
     * @param source native-encoding character sequence; no conversion
     */
    public Path(@Cast("dai::Path::string_type*") @ByRef(true) Pointer source) { super((Pointer)null); allocate(source); }
    @NoException private native void allocate(@Cast("dai::Path::string_type*") @ByRef(true) Pointer source);

    /**
     * \brief Construct Path object from source.
     *
     * @param source native-encoding character sequence; no conversion
     */

    /**
     * \brief Construct Path object from source.
     *
     * @param source pointer to null-terminated native-encoding character sequence; no conversion
     */
    public Path(@Cast("const dai::Path::value_type*") CharPointer source) { super((Pointer)null); allocate(source); }
    private native void allocate(@Cast("const dai::Path::value_type*") CharPointer source);
    public Path(@Cast("const dai::Path::value_type*") IntPointer source) { super((Pointer)null); allocate(source); }
    private native void allocate(@Cast("const dai::Path::value_type*") IntPointer source);
    /**
     * \brief Construct Path object from source.
     *
     * @param source utf-8 character sequence; converts to Windows utf-16
     */
    public Path(@StdString BytePointer source) { super((Pointer)null); allocate(source); }
    private native void allocate(@StdString BytePointer source);
    public Path(@StdString ByteBuffer source) { super((Pointer)null); allocate(source); }
    private native void allocate(@StdString ByteBuffer source);
    public Path(@StdString String source) { super((Pointer)null); allocate(source); }
    private native void allocate(@StdString String source);

    /**
     * \brief Construct Path object from source.
     *
     * @param source pointer to null-terminated utf-8 character sequence; converts to Windows utf-16
     */

    /**
     * \brief Get path in narrow multibyte representation in the current C locale.
     *
     *        Will throw exception if there is no valid conversion.
     *        Could be used to get the narrow ascii representation.
     *
     * @return std::string in narrow multibyte representation
     */
    public native @StdString BytePointer string();

//     #if defined(__cpp_lib_char8_t)
//     #else
    /**
     * \brief Get path in utf-8.
     *
     *        Will throw exception if there is no valid conversion.
     *
     * @return std::string in utf-8
     */
    public native @StdString BytePointer u8string();
//     #endif
// #else
    /**
     * \brief Get path in native-encoding string; no conversion.
     *
     * @return std::string
     */

//     #if defined(__cpp_lib_char8_t)
//     #else
    /**
     * \brief Get path in utf-8.
     *
     * @return std::string in utf-8
     */
//     #endif
// #endif

    /**
     * \brief Implicitly convert to native-encoding string, suitable for use with OS APIs
     *
     * @return std::string of utf-8 on most OSs, std::wstring of utf-16 on Windows
     */
    public native @ByVal @Cast("dai::Path::string_type*") @Name("operator dai::Path::string_type") @NoException Pointer asPointer();

    /**
     * \brief Returns native-encoding string by const reference, suitable for use with OS APIs
     *
     * @return const std::string& of utf-8 on most OSs, const std::wstring& of utf-16 on Windows
     */
    public native @Cast("const dai::Path::string_type*") @ByRef @Name("native") @NoException Pointer _native();

    /**
     * \brief Observes if path is empty (contains no string/folders/filename)
     *
     * @return bool true if the path is empty, false otherwise
     */
    // TODO add back DEPTHAI_NODISCARD once sphinx fixes are in place
    public native @Cast("bool") @NoException boolean empty();
}