/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * Unique identifier for each job
 */
public class ThriftJobID implements TBase<ThriftJobID, ThriftJobID._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ThriftJobID");

  private static final TField JOB_TRACKER_ID_FIELD_DESC = new TField("jobTrackerID", TType.STRING, (short)1);
  private static final TField JOB_ID_FIELD_DESC = new TField("jobID", TType.I32, (short)2);
  private static final TField AS_STRING_FIELD_DESC = new TField("asString", TType.STRING, (short)3);

  /**
   * Unique id of jobtracker
   */
  public String jobTrackerID;
  /**
   * Unique (to JT) job id
   */
  public int jobID;
  /**
   * Flattened as a string
   */
  public String asString;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * Unique id of jobtracker
     */
    JOB_TRACKER_ID((short)1, "jobTrackerID"),
    /**
     * Unique (to JT) job id
     */
    JOB_ID((short)2, "jobID"),
    /**
     * Flattened as a string
     */
    AS_STRING((short)3, "asString");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_TRACKER_ID
          return JOB_TRACKER_ID;
        case 2: // JOB_ID
          return JOB_ID;
        case 3: // AS_STRING
          return AS_STRING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JOBID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_TRACKER_ID, new FieldMetaData("jobTrackerID", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.JOB_ID, new FieldMetaData("jobID", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.AS_STRING, new FieldMetaData("asString", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ThriftJobID.class, metaDataMap);
  }

  public ThriftJobID() {
  }

  public ThriftJobID(
    String jobTrackerID,
    int jobID,
    String asString)
  {
    this();
    this.jobTrackerID = jobTrackerID;
    this.jobID = jobID;
    setJobIDIsSet(true);
    this.asString = asString;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobID(ThriftJobID other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetJobTrackerID()) {
      this.jobTrackerID = other.jobTrackerID;
    }
    this.jobID = other.jobID;
    if (other.isSetAsString()) {
      this.asString = other.asString;
    }
  }

  public ThriftJobID deepCopy() {
    return new ThriftJobID(this);
  }

  @Override
  public void clear() {
    this.jobTrackerID = null;
    setJobIDIsSet(false);
    this.jobID = 0;
    this.asString = null;
  }

  /**
   * Unique id of jobtracker
   */
  public String getJobTrackerID() {
    return this.jobTrackerID;
  }

  /**
   * Unique id of jobtracker
   */
  public ThriftJobID setJobTrackerID(String jobTrackerID) {
    this.jobTrackerID = jobTrackerID;
    return this;
  }

  public void unsetJobTrackerID() {
    this.jobTrackerID = null;
  }

  /** Returns true if field jobTrackerID is set (has been asigned a value) and false otherwise */
  public boolean isSetJobTrackerID() {
    return this.jobTrackerID != null;
  }

  public void setJobTrackerIDIsSet(boolean value) {
    if (!value) {
      this.jobTrackerID = null;
    }
  }

  /**
   * Unique (to JT) job id
   */
  public int getJobID() {
    return this.jobID;
  }

  /**
   * Unique (to JT) job id
   */
  public ThriftJobID setJobID(int jobID) {
    this.jobID = jobID;
    setJobIDIsSet(true);
    return this;
  }

  public void unsetJobID() {
    __isset_bit_vector.clear(__JOBID_ISSET_ID);
  }

  /** Returns true if field jobID is set (has been asigned a value) and false otherwise */
  public boolean isSetJobID() {
    return __isset_bit_vector.get(__JOBID_ISSET_ID);
  }

  public void setJobIDIsSet(boolean value) {
    __isset_bit_vector.set(__JOBID_ISSET_ID, value);
  }

  /**
   * Flattened as a string
   */
  public String getAsString() {
    return this.asString;
  }

  /**
   * Flattened as a string
   */
  public ThriftJobID setAsString(String asString) {
    this.asString = asString;
    return this;
  }

  public void unsetAsString() {
    this.asString = null;
  }

  /** Returns true if field asString is set (has been asigned a value) and false otherwise */
  public boolean isSetAsString() {
    return this.asString != null;
  }

  public void setAsStringIsSet(boolean value) {
    if (!value) {
      this.asString = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_TRACKER_ID:
      if (value == null) {
        unsetJobTrackerID();
      } else {
        setJobTrackerID((String)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobID();
      } else {
        setJobID((Integer)value);
      }
      break;

    case AS_STRING:
      if (value == null) {
        unsetAsString();
      } else {
        setAsString((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_TRACKER_ID:
      return getJobTrackerID();

    case JOB_ID:
      return new Integer(getJobID());

    case AS_STRING:
      return getAsString();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_TRACKER_ID:
      return isSetJobTrackerID();
    case JOB_ID:
      return isSetJobID();
    case AS_STRING:
      return isSetAsString();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftJobID)
      return this.equals((ThriftJobID)that);
    return false;
  }

  public boolean equals(ThriftJobID that) {
    if (that == null)
      return false;

    boolean this_present_jobTrackerID = true && this.isSetJobTrackerID();
    boolean that_present_jobTrackerID = true && that.isSetJobTrackerID();
    if (this_present_jobTrackerID || that_present_jobTrackerID) {
      if (!(this_present_jobTrackerID && that_present_jobTrackerID))
        return false;
      if (!this.jobTrackerID.equals(that.jobTrackerID))
        return false;
    }

    boolean this_present_jobID = true;
    boolean that_present_jobID = true;
    if (this_present_jobID || that_present_jobID) {
      if (!(this_present_jobID && that_present_jobID))
        return false;
      if (this.jobID != that.jobID)
        return false;
    }

    boolean this_present_asString = true && this.isSetAsString();
    boolean that_present_asString = true && that.isSetAsString();
    if (this_present_asString || that_present_asString) {
      if (!(this_present_asString && that_present_asString))
        return false;
      if (!this.asString.equals(that.asString))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_jobTrackerID = true && (isSetJobTrackerID());
    builder.append(present_jobTrackerID);
    if (present_jobTrackerID)
      builder.append(jobTrackerID);

    boolean present_jobID = true;
    builder.append(present_jobID);
    if (present_jobID)
      builder.append(jobID);

    boolean present_asString = true && (isSetAsString());
    builder.append(present_asString);
    if (present_asString)
      builder.append(asString);

    return builder.toHashCode();
  }

  public int compareTo(ThriftJobID other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobID typedOther = (ThriftJobID)other;

    lastComparison = Boolean.valueOf(isSetJobTrackerID()).compareTo(typedOther.isSetJobTrackerID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobTrackerID()) {
      lastComparison = TBaseHelper.compareTo(this.jobTrackerID, typedOther.jobTrackerID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobID()).compareTo(typedOther.isSetJobID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobID()) {
      lastComparison = TBaseHelper.compareTo(this.jobID, typedOther.jobID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsString()).compareTo(typedOther.isSetAsString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsString()) {
      lastComparison = TBaseHelper.compareTo(this.asString, typedOther.asString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // JOB_TRACKER_ID
          if (field.type == TType.STRING) {
            this.jobTrackerID = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // JOB_ID
          if (field.type == TType.I32) {
            this.jobID = iprot.readI32();
            setJobIDIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // AS_STRING
          if (field.type == TType.STRING) {
            this.asString = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.jobTrackerID != null) {
      oprot.writeFieldBegin(JOB_TRACKER_ID_FIELD_DESC);
      oprot.writeString(this.jobTrackerID);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
    oprot.writeI32(this.jobID);
    oprot.writeFieldEnd();
    if (this.asString != null) {
      oprot.writeFieldBegin(AS_STRING_FIELD_DESC);
      oprot.writeString(this.asString);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobID(");
    boolean first = true;

    sb.append("jobTrackerID:");
    if (this.jobTrackerID == null) {
      sb.append("null");
    } else {
      sb.append(this.jobTrackerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobID:");
    sb.append(this.jobID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("asString:");
    if (this.asString == null) {
      sb.append("null");
    } else {
      sb.append(this.asString);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
