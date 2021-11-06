
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/HyperParameterValueType.pdl.")
public class HyperParameterValueType
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string,int,float,double,boolean]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
    private final static DataSchema MEMBER_Int = SCHEMA.getTypeByMemberKey("int");
    private final static DataSchema MEMBER_Float = SCHEMA.getTypeByMemberKey("float");
    private final static DataSchema MEMBER_Double = SCHEMA.getTypeByMemberKey("double");
    private final static DataSchema MEMBER_Boolean = SCHEMA.getTypeByMemberKey("boolean");
    private final static TyperefInfo TYPEREFINFO = new HyperParameterValueType.UnionTyperefInfo();

    public HyperParameterValueType() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public HyperParameterValueType(Object data) {
        super(data, SCHEMA);
    }

    public static HyperParameterValueType create(java.lang.String value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setString(value);
        return newUnion;
    }

    public boolean isString() {
        return memberIs("string");
    }

    public java.lang.String getString() {
        return obtainDirect(MEMBER_String, java.lang.String.class, "string");
    }

    public void setString(java.lang.String value) {
        selectDirect(MEMBER_String, java.lang.String.class, java.lang.String.class, "string", value);
    }

    public static HyperParameterValueType create(Integer value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setInt(value);
        return newUnion;
    }

    public boolean isInt() {
        return memberIs("int");
    }

    public Integer getInt() {
        return obtainDirect(MEMBER_Int, Integer.class, "int");
    }

    public void setInt(Integer value) {
        selectDirect(MEMBER_Int, Integer.class, Integer.class, "int", value);
    }

    public static HyperParameterValueType create(java.lang.Float value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setFloat(value);
        return newUnion;
    }

    public boolean isFloat() {
        return memberIs("float");
    }

    public java.lang.Float getFloat() {
        return obtainDirect(MEMBER_Float, java.lang.Float.class, "float");
    }

    public void setFloat(java.lang.Float value) {
        selectDirect(MEMBER_Float, java.lang.Float.class, java.lang.Float.class, "float", value);
    }

    public static HyperParameterValueType create(java.lang.Double value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setDouble(value);
        return newUnion;
    }

    public boolean isDouble() {
        return memberIs("double");
    }

    public java.lang.Double getDouble() {
        return obtainDirect(MEMBER_Double, java.lang.Double.class, "double");
    }

    public void setDouble(java.lang.Double value) {
        selectDirect(MEMBER_Double, java.lang.Double.class, java.lang.Double.class, "double", value);
    }

    public static HyperParameterValueType create(java.lang.Boolean value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setBoolean(value);
        return newUnion;
    }

    public boolean isBoolean() {
        return memberIs("boolean");
    }

    public java.lang.Boolean getBoolean() {
        return obtainDirect(MEMBER_Boolean, java.lang.Boolean.class, "boolean");
    }

    public void setBoolean(java.lang.Boolean value) {
        selectDirect(MEMBER_Boolean, java.lang.Boolean.class, java.lang.Boolean.class, "boolean", value);
    }

    @Override
    public HyperParameterValueType clone()
        throws CloneNotSupportedException
    {
        return ((HyperParameterValueType) super.clone());
    }

    @Override
    public HyperParameterValueType copy()
        throws CloneNotSupportedException
    {
        return ((HyperParameterValueType) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<java.lang.String> path, java.lang.String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public PathSpec String() {
            return new PathSpec(getPathComponents(), "string");
        }

        public PathSpec Int() {
            return new PathSpec(getPathComponents(), "int");
        }

        public PathSpec Float() {
            return new PathSpec(getPathComponents(), "float");
        }

        public PathSpec Double() {
            return new PathSpec(getPathComponents(), "double");
        }

        public PathSpec Boolean() {
            return new PathSpec(getPathComponents(), "boolean");
        }

    }


    /**
     * A union of all supported metadata aspects for HyperParameter Value
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
