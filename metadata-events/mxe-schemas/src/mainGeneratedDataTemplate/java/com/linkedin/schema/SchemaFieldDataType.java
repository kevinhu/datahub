
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.UnionTemplate;


/**
 * Schema field data types
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaFieldDataType.pdl.")
public class SchemaFieldDataType
    extends RecordTemplate
{

    private final static SchemaFieldDataType.Fields _fields = new SchemaFieldDataType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public SchemaFieldDataType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public SchemaFieldDataType(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaFieldDataType.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public SchemaFieldDataType.Type getType(GetMode mode) {
        return obtainWrapped(FIELD_Type, SchemaFieldDataType.Type.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldDataType.Fields#type
     */
    @Nonnull
    public SchemaFieldDataType.Type getType() {
        return obtainWrapped(FIELD_Type, SchemaFieldDataType.Type.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public SchemaFieldDataType setType(SchemaFieldDataType.Type value, SetMode mode) {
        putWrapped(FIELD_Type, SchemaFieldDataType.Type.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldDataType.Fields#type
     */
    public SchemaFieldDataType setType(
        @Nonnull
        SchemaFieldDataType.Type value) {
        putWrapped(FIELD_Type, SchemaFieldDataType.Type.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaFieldDataType clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldDataType) super.clone());
    }

    @Override
    public SchemaFieldDataType copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldDataType) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Data platform specific types
         * 
         */
        public com.linkedin.schema.SchemaFieldDataType.Type.Fields type() {
            return new com.linkedin.schema.SchemaFieldDataType.Type.Fields(getPathComponents(), "type");
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaFieldDataType.pdl.")
    public final static class Type
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**Boolean field type.*/record BooleanType{}}{namespace com.linkedin.schema/**Fixed field type.*/record FixedType{}}{namespace com.linkedin.schema/**String field type.*/record StringType{}}{namespace com.linkedin.schema/**Bytes field type.*/record BytesType{}}{namespace com.linkedin.schema/**Number data type: long, integer, short, etc..*/record NumberType{}}{namespace com.linkedin.schema/**Date field type.*/record DateType{}}{namespace com.linkedin.schema/**Time field type. This should also be used for datetimes.*/record TimeType{}}{namespace com.linkedin.schema/**Enum field type.*/record EnumType{}}{namespace com.linkedin.schema/**Null field type.*/record NullType{}}{namespace com.linkedin.schema/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}}{namespace com.linkedin.schema/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}}{namespace com.linkedin.schema/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}}{namespace com.linkedin.schema/**Record field type.*/record RecordType{}}]", SchemaFormatType.PDL));
        private final static DataSchema MEMBER_BooleanType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BooleanType");
        private final static DataSchema MEMBER_FixedType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.FixedType");
        private final static DataSchema MEMBER_StringType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.StringType");
        private final static DataSchema MEMBER_BytesType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BytesType");
        private final static DataSchema MEMBER_NumberType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.NumberType");
        private final static DataSchema MEMBER_DateType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.DateType");
        private final static DataSchema MEMBER_TimeType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.TimeType");
        private final static DataSchema MEMBER_EnumType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EnumType");
        private final static DataSchema MEMBER_NullType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.NullType");
        private final static DataSchema MEMBER_MapType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.MapType");
        private final static DataSchema MEMBER_ArrayType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.ArrayType");
        private final static DataSchema MEMBER_UnionType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.UnionType");
        private final static DataSchema MEMBER_RecordType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.RecordType");

        public Type() {
            super(new DataMap(2, 0.75F), SCHEMA);
        }

        public Type(Object data) {
            super(data, SCHEMA);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.BooleanType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setBooleanType(value);
            return newUnion;
        }

        public boolean isBooleanType() {
            return memberIs("com.linkedin.schema.BooleanType");
        }

        public com.linkedin.schema.BooleanType getBooleanType() {
            return obtainWrapped(MEMBER_BooleanType, com.linkedin.schema.BooleanType.class, "com.linkedin.schema.BooleanType");
        }

        public void setBooleanType(com.linkedin.schema.BooleanType value) {
            selectWrapped(MEMBER_BooleanType, com.linkedin.schema.BooleanType.class, "com.linkedin.schema.BooleanType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.FixedType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setFixedType(value);
            return newUnion;
        }

        public boolean isFixedType() {
            return memberIs("com.linkedin.schema.FixedType");
        }

        public com.linkedin.schema.FixedType getFixedType() {
            return obtainWrapped(MEMBER_FixedType, com.linkedin.schema.FixedType.class, "com.linkedin.schema.FixedType");
        }

        public void setFixedType(com.linkedin.schema.FixedType value) {
            selectWrapped(MEMBER_FixedType, com.linkedin.schema.FixedType.class, "com.linkedin.schema.FixedType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.StringType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setStringType(value);
            return newUnion;
        }

        public boolean isStringType() {
            return memberIs("com.linkedin.schema.StringType");
        }

        public com.linkedin.schema.StringType getStringType() {
            return obtainWrapped(MEMBER_StringType, com.linkedin.schema.StringType.class, "com.linkedin.schema.StringType");
        }

        public void setStringType(com.linkedin.schema.StringType value) {
            selectWrapped(MEMBER_StringType, com.linkedin.schema.StringType.class, "com.linkedin.schema.StringType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.BytesType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setBytesType(value);
            return newUnion;
        }

        public boolean isBytesType() {
            return memberIs("com.linkedin.schema.BytesType");
        }

        public com.linkedin.schema.BytesType getBytesType() {
            return obtainWrapped(MEMBER_BytesType, com.linkedin.schema.BytesType.class, "com.linkedin.schema.BytesType");
        }

        public void setBytesType(com.linkedin.schema.BytesType value) {
            selectWrapped(MEMBER_BytesType, com.linkedin.schema.BytesType.class, "com.linkedin.schema.BytesType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.NumberType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setNumberType(value);
            return newUnion;
        }

        public boolean isNumberType() {
            return memberIs("com.linkedin.schema.NumberType");
        }

        public com.linkedin.schema.NumberType getNumberType() {
            return obtainWrapped(MEMBER_NumberType, com.linkedin.schema.NumberType.class, "com.linkedin.schema.NumberType");
        }

        public void setNumberType(com.linkedin.schema.NumberType value) {
            selectWrapped(MEMBER_NumberType, com.linkedin.schema.NumberType.class, "com.linkedin.schema.NumberType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.DateType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setDateType(value);
            return newUnion;
        }

        public boolean isDateType() {
            return memberIs("com.linkedin.schema.DateType");
        }

        public com.linkedin.schema.DateType getDateType() {
            return obtainWrapped(MEMBER_DateType, com.linkedin.schema.DateType.class, "com.linkedin.schema.DateType");
        }

        public void setDateType(com.linkedin.schema.DateType value) {
            selectWrapped(MEMBER_DateType, com.linkedin.schema.DateType.class, "com.linkedin.schema.DateType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.TimeType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setTimeType(value);
            return newUnion;
        }

        public boolean isTimeType() {
            return memberIs("com.linkedin.schema.TimeType");
        }

        public com.linkedin.schema.TimeType getTimeType() {
            return obtainWrapped(MEMBER_TimeType, com.linkedin.schema.TimeType.class, "com.linkedin.schema.TimeType");
        }

        public void setTimeType(com.linkedin.schema.TimeType value) {
            selectWrapped(MEMBER_TimeType, com.linkedin.schema.TimeType.class, "com.linkedin.schema.TimeType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.EnumType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setEnumType(value);
            return newUnion;
        }

        public boolean isEnumType() {
            return memberIs("com.linkedin.schema.EnumType");
        }

        public com.linkedin.schema.EnumType getEnumType() {
            return obtainWrapped(MEMBER_EnumType, com.linkedin.schema.EnumType.class, "com.linkedin.schema.EnumType");
        }

        public void setEnumType(com.linkedin.schema.EnumType value) {
            selectWrapped(MEMBER_EnumType, com.linkedin.schema.EnumType.class, "com.linkedin.schema.EnumType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.NullType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setNullType(value);
            return newUnion;
        }

        public boolean isNullType() {
            return memberIs("com.linkedin.schema.NullType");
        }

        public com.linkedin.schema.NullType getNullType() {
            return obtainWrapped(MEMBER_NullType, com.linkedin.schema.NullType.class, "com.linkedin.schema.NullType");
        }

        public void setNullType(com.linkedin.schema.NullType value) {
            selectWrapped(MEMBER_NullType, com.linkedin.schema.NullType.class, "com.linkedin.schema.NullType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.MapType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setMapType(value);
            return newUnion;
        }

        public boolean isMapType() {
            return memberIs("com.linkedin.schema.MapType");
        }

        public com.linkedin.schema.MapType getMapType() {
            return obtainWrapped(MEMBER_MapType, com.linkedin.schema.MapType.class, "com.linkedin.schema.MapType");
        }

        public void setMapType(com.linkedin.schema.MapType value) {
            selectWrapped(MEMBER_MapType, com.linkedin.schema.MapType.class, "com.linkedin.schema.MapType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.ArrayType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setArrayType(value);
            return newUnion;
        }

        public boolean isArrayType() {
            return memberIs("com.linkedin.schema.ArrayType");
        }

        public com.linkedin.schema.ArrayType getArrayType() {
            return obtainWrapped(MEMBER_ArrayType, com.linkedin.schema.ArrayType.class, "com.linkedin.schema.ArrayType");
        }

        public void setArrayType(com.linkedin.schema.ArrayType value) {
            selectWrapped(MEMBER_ArrayType, com.linkedin.schema.ArrayType.class, "com.linkedin.schema.ArrayType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.UnionType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setUnionType(value);
            return newUnion;
        }

        public boolean isUnionType() {
            return memberIs("com.linkedin.schema.UnionType");
        }

        public com.linkedin.schema.UnionType getUnionType() {
            return obtainWrapped(MEMBER_UnionType, com.linkedin.schema.UnionType.class, "com.linkedin.schema.UnionType");
        }

        public void setUnionType(com.linkedin.schema.UnionType value) {
            selectWrapped(MEMBER_UnionType, com.linkedin.schema.UnionType.class, "com.linkedin.schema.UnionType", value);
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.RecordType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setRecordType(value);
            return newUnion;
        }

        public boolean isRecordType() {
            return memberIs("com.linkedin.schema.RecordType");
        }

        public com.linkedin.schema.RecordType getRecordType() {
            return obtainWrapped(MEMBER_RecordType, com.linkedin.schema.RecordType.class, "com.linkedin.schema.RecordType");
        }

        public void setRecordType(com.linkedin.schema.RecordType value) {
            selectWrapped(MEMBER_RecordType, com.linkedin.schema.RecordType.class, "com.linkedin.schema.RecordType", value);
        }

        @Override
        public SchemaFieldDataType.Type clone()
            throws CloneNotSupportedException
        {
            return ((SchemaFieldDataType.Type) super.clone());
        }

        @Override
        public SchemaFieldDataType.Type copy()
            throws CloneNotSupportedException
        {
            return ((SchemaFieldDataType.Type) super.copy());
        }

        public static class Fields
            extends PathSpec
        {


            public Fields(List<String> path, String name) {
                super(path, name);
            }

            public Fields() {
                super();
            }

            public com.linkedin.schema.BooleanType.Fields BooleanType() {
                return new com.linkedin.schema.BooleanType.Fields(getPathComponents(), "com.linkedin.schema.BooleanType");
            }

            public com.linkedin.schema.FixedType.Fields FixedType() {
                return new com.linkedin.schema.FixedType.Fields(getPathComponents(), "com.linkedin.schema.FixedType");
            }

            public com.linkedin.schema.StringType.Fields StringType() {
                return new com.linkedin.schema.StringType.Fields(getPathComponents(), "com.linkedin.schema.StringType");
            }

            public com.linkedin.schema.BytesType.Fields BytesType() {
                return new com.linkedin.schema.BytesType.Fields(getPathComponents(), "com.linkedin.schema.BytesType");
            }

            public com.linkedin.schema.NumberType.Fields NumberType() {
                return new com.linkedin.schema.NumberType.Fields(getPathComponents(), "com.linkedin.schema.NumberType");
            }

            public com.linkedin.schema.DateType.Fields DateType() {
                return new com.linkedin.schema.DateType.Fields(getPathComponents(), "com.linkedin.schema.DateType");
            }

            public com.linkedin.schema.TimeType.Fields TimeType() {
                return new com.linkedin.schema.TimeType.Fields(getPathComponents(), "com.linkedin.schema.TimeType");
            }

            public com.linkedin.schema.EnumType.Fields EnumType() {
                return new com.linkedin.schema.EnumType.Fields(getPathComponents(), "com.linkedin.schema.EnumType");
            }

            public com.linkedin.schema.NullType.Fields NullType() {
                return new com.linkedin.schema.NullType.Fields(getPathComponents(), "com.linkedin.schema.NullType");
            }

            public com.linkedin.schema.MapType.Fields MapType() {
                return new com.linkedin.schema.MapType.Fields(getPathComponents(), "com.linkedin.schema.MapType");
            }

            public com.linkedin.schema.ArrayType.Fields ArrayType() {
                return new com.linkedin.schema.ArrayType.Fields(getPathComponents(), "com.linkedin.schema.ArrayType");
            }

            public com.linkedin.schema.UnionType.Fields UnionType() {
                return new com.linkedin.schema.UnionType.Fields(getPathComponents(), "com.linkedin.schema.UnionType");
            }

            public com.linkedin.schema.RecordType.Fields RecordType() {
                return new com.linkedin.schema.RecordType.Fields(getPathComponents(), "com.linkedin.schema.RecordType");
            }

        }

    }

}
