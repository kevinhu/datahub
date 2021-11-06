
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/ResultsType.pdl.")
public class ResultsType
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
    private final static TyperefInfo TYPEREFINFO = new ResultsType.UnionTyperefInfo();

    public ResultsType() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ResultsType(Object data) {
        super(data, SCHEMA);
    }

    public static ResultsType create(java.lang.String value) {
        ResultsType newUnion = new ResultsType();
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

    @Override
    public ResultsType clone()
        throws CloneNotSupportedException
    {
        return ((ResultsType) super.clone());
    }

    @Override
    public ResultsType copy()
        throws CloneNotSupportedException
    {
        return ((ResultsType) super.copy());
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

    }


    /**
     * A union of all supported metadata aspects for ResultsType
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
