// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief VideoReader initialization parameters
@param udpSource Remove validation which can cause VideoReader() to throw exceptions when reading from a UDP source.
@param allowFrameDrop Allow frames to be dropped when ingesting from a live capture source to prevent delay and eventual disconnection
when calls to nextFrame()/grab() cannot keep up with the source's fps.  Only use if delay and disconnection are a problem, i.e. not when decoding from
video files where setting this flag will cause frames to be unnecessarily discarded.
@param minNumDecodeSurfaces Minimum number of internal decode surfaces used by the hardware decoder.  NVDEC will automatically determine the minimum number of
surfaces it requires for correct functionality and optimal video memory usage but not necessarily for best performance, which depends on the design of the
overall application. The optimal number of decode surfaces (in terms of performance and memory utilization) should be decided by experimentation for each application,
but it cannot go below the number determined by NVDEC.
@param rawMode Allow the raw encoded data which has been read up until the last call to grab() to be retrieved by calling retrieve(rawData,RAW_DATA_IDX).
@param targetSz Post-processed size (width/height should be multiples of 2) of the output frame, defaults to the size of the encoded video source.
@param srcRoi Region of interest (x/width should be multiples of 4 and y/height multiples of 2) decoded from video source, defaults to the full frame.
@param targetRoi Region of interest (x/width should be multiples of 4 and y/height multiples of 2) within the output frame to copy and resize the decoded frame to,
defaults to the full frame.
@param enableHistogram Request output of decoded luma histogram \a hist from VideoReader::nextFrame(GpuMat& frame, GpuMat& hist, Stream& stream), if hardware supported.
@param firstFrameIdx Index of the first frame to seek to on initialization of the VideoReader.
*/
@Namespace("cv::cudacodec") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class VideoReaderInitParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoReaderInitParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VideoReaderInitParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VideoReaderInitParams position(long position) {
        return (VideoReaderInitParams)super.position(position);
    }
    @Override public VideoReaderInitParams getPointer(long i) {
        return new VideoReaderInitParams((Pointer)this).offsetAddress(i);
    }

    public VideoReaderInitParams() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean udpSource(); public native VideoReaderInitParams udpSource(boolean setter);
    public native @Cast("bool") boolean allowFrameDrop(); public native VideoReaderInitParams allowFrameDrop(boolean setter);
    public native int minNumDecodeSurfaces(); public native VideoReaderInitParams minNumDecodeSurfaces(int setter);
    public native @Cast("bool") boolean rawMode(); public native VideoReaderInitParams rawMode(boolean setter);
    public native @ByRef Size targetSz(); public native VideoReaderInitParams targetSz(Size setter);
    public native @ByRef Rect srcRoi(); public native VideoReaderInitParams srcRoi(Rect setter);
    public native @ByRef Rect targetRoi(); public native VideoReaderInitParams targetRoi(Rect setter);
    public native @Cast("bool") boolean enableHistogram(); public native VideoReaderInitParams enableHistogram(boolean setter);
    public native int firstFrameIdx(); public native VideoReaderInitParams firstFrameIdx(int setter);
}