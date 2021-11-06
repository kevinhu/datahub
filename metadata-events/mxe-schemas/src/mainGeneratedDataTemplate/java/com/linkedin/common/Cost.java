
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Cost.pdl.")
public class Cost
    extends RecordTemplate
{

    private final static Cost.Fields _fields = new Cost.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CostType = SCHEMA.getField("costType");
    private final static RecordDataSchema.Field FIELD_Cost = SCHEMA.getField("cost");

    public Cost() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public Cost(DataMap data) {
        super(data, SCHEMA);
    }

    public static Cost.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for costType
     * 
     * @see Cost.Fields#costType
     */
    public boolean hasCostType() {
        return contains(FIELD_CostType);
    }

    /**
     * Remover for costType
     * 
     * @see Cost.Fields#costType
     */
    public void removeCostType() {
        remove(FIELD_CostType);
    }

    /**
     * Getter for costType
     * 
     * @see Cost.Fields#costType
     */
    public CostType getCostType(GetMode mode) {
        return obtainDirect(FIELD_CostType, CostType.class, mode);
    }

    /**
     * Getter for costType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Cost.Fields#costType
     */
    @Nonnull
    public CostType getCostType() {
        return obtainDirect(FIELD_CostType, CostType.class, GetMode.STRICT);
    }

    /**
     * Setter for costType
     * 
     * @see Cost.Fields#costType
     */
    public Cost setCostType(CostType value, SetMode mode) {
        putDirect(FIELD_CostType, CostType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for costType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Cost.Fields#costType
     */
    public Cost setCostType(
        @Nonnull
        CostType value) {
        putDirect(FIELD_CostType, CostType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for cost
     * 
     * @see Cost.Fields#cost
     */
    public boolean hasCost() {
        return contains(FIELD_Cost);
    }

    /**
     * Remover for cost
     * 
     * @see Cost.Fields#cost
     */
    public void removeCost() {
        remove(FIELD_Cost);
    }

    /**
     * Getter for cost
     * 
     * @see Cost.Fields#cost
     */
    public CostValue getCost(GetMode mode) {
        return obtainWrapped(FIELD_Cost, CostValue.class, mode);
    }

    /**
     * Getter for cost
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Cost.Fields#cost
     */
    @Nonnull
    public CostValue getCost() {
        return obtainWrapped(FIELD_Cost, CostValue.class, GetMode.STRICT);
    }

    /**
     * Setter for cost
     * 
     * @see Cost.Fields#cost
     */
    public Cost setCost(CostValue value, SetMode mode) {
        putWrapped(FIELD_Cost, CostValue.class, value, mode);
        return this;
    }

    /**
     * Setter for cost
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Cost.Fields#cost
     */
    public Cost setCost(
        @Nonnull
        CostValue value) {
        putWrapped(FIELD_Cost, CostValue.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Cost clone()
        throws CloneNotSupportedException
    {
        return ((Cost) super.clone());
    }

    @Override
    public Cost copy()
        throws CloneNotSupportedException
    {
        return ((Cost) super.copy());
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

        public PathSpec costType() {
            return new PathSpec(getPathComponents(), "costType");
        }

        public com.linkedin.common.CostValue.Fields cost() {
            return new com.linkedin.common.CostValue.Fields(getPathComponents(), "cost");
        }

    }

}
