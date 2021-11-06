
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/CostValue.pdl.")
public class CostValue
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[costId:double,costCode:string]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_CostId = SCHEMA.getTypeByMemberKey("costId");
    private final static DataSchema MEMBER_CostCode = SCHEMA.getTypeByMemberKey("costCode");
    private final static TyperefInfo TYPEREFINFO = new CostValue.UnionTyperefInfo();

    public CostValue() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public CostValue(Object data) {
        super(data, SCHEMA);
    }

    public static CostValue createWithCostId(Double value) {
        CostValue newUnion = new CostValue();
        newUnion.setCostId(value);
        return newUnion;
    }

    public boolean isCostId() {
        return memberIs("costId");
    }

    public Double getCostId() {
        return obtainDirect(MEMBER_CostId, Double.class, "costId");
    }

    public void setCostId(Double value) {
        selectDirect(MEMBER_CostId, Double.class, Double.class, "costId", value);
    }

    public static CostValue createWithCostCode(String value) {
        CostValue newUnion = new CostValue();
        newUnion.setCostCode(value);
        return newUnion;
    }

    public boolean isCostCode() {
        return memberIs("costCode");
    }

    public String getCostCode() {
        return obtainDirect(MEMBER_CostCode, String.class, "costCode");
    }

    public void setCostCode(String value) {
        selectDirect(MEMBER_CostCode, String.class, String.class, "costCode", value);
    }

    @Override
    public CostValue clone()
        throws CloneNotSupportedException
    {
        return ((CostValue) super.clone());
    }

    @Override
    public CostValue copy()
        throws CloneNotSupportedException
    {
        return ((CostValue) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
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

        public PathSpec CostId() {
            return new PathSpec(getPathComponents(), "costId");
        }

        public PathSpec CostCode() {
            return new PathSpec(getPathComponents(), "costCode");
        }

    }


    /**
     * A union of all supported Cost Value types
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
