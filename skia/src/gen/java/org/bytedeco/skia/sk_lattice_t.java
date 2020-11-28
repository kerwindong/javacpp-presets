// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_lattice_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_lattice_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_lattice_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_lattice_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_lattice_t position(long position) {
        return (sk_lattice_t)super.position(position);
    }
    @Override public sk_lattice_t getPointer(long i) {
        return new sk_lattice_t(this).position(position + i);
    }

    public native @Const IntPointer fXDivs(); public native sk_lattice_t fXDivs(IntPointer setter);
    public native @Const IntPointer fYDivs(); public native sk_lattice_t fYDivs(IntPointer setter);
    public native @Cast("const sk_lattice_recttype_t*") IntPointer fRectTypes(); public native sk_lattice_t fRectTypes(IntPointer setter);
    public native int fXCount(); public native sk_lattice_t fXCount(int setter);
    public native int fYCount(); public native sk_lattice_t fYCount(int setter);
    public native @Const sk_irect_t fBounds(); public native sk_lattice_t fBounds(sk_irect_t setter);
    public native @Cast("const sk_color_t*") IntPointer fColors(); public native sk_lattice_t fColors(IntPointer setter);
}
