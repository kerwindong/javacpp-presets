// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief An object representing string. It's POD type. */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class StringObj extends TVMObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public StringObj() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringObj(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringObj(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StringObj position(long position) {
        return (StringObj)super.position(position);
    }
    @Override public StringObj getPointer(long i) {
        return new StringObj(this).position(position + i);
    }

  /** \brief The pointer to string data. */
  public native @Cast("const char*") BytePointer data(); public native StringObj data(BytePointer setter);

  /** \brief The length of the string object. */
  public native @Cast("uint64_t") long size(); public native StringObj size(long setter);

  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
