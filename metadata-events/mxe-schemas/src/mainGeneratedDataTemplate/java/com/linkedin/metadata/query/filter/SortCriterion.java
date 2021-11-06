
package com.linkedin.metadata.query.filter;

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
 * Sort order along with the field to sort it on, to be applied to the results.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/SortCriterion.pdl.")
public class SortCriterion
    extends RecordTemplate
{

    private final static SortCriterion.Fields _fields = new SortCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**Sort order along with the field to sort it on, to be applied to the results.*/record SortCriterion{/**The name of the field that sorting has to be applied to*/field:string/**The order to sort the results i.e. ASCENDING or DESCENDING*/order:/**The order used to sort the results*/enum SortOrder{/**If results need to be sorted in ascending order*/ASCENDING/**If results need to be sorted in descending order*/DESCENDING}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Order = SCHEMA.getField("order");

    public SortCriterion() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public SortCriterion(DataMap data) {
        super(data, SCHEMA);
    }

    public static SortCriterion.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for field
     * 
     * @see SortCriterion.Fields#field
     */
    public boolean hasField() {
        return contains(FIELD_Field);
    }

    /**
     * Remover for field
     * 
     * @see SortCriterion.Fields#field
     */
    public void removeField() {
        remove(FIELD_Field);
    }

    /**
     * Getter for field
     * 
     * @see SortCriterion.Fields#field
     */
    public String getField(GetMode mode) {
        return obtainDirect(FIELD_Field, String.class, mode);
    }

    /**
     * Getter for field
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SortCriterion.Fields#field
     */
    @Nonnull
    public String getField() {
        return obtainDirect(FIELD_Field, String.class, GetMode.STRICT);
    }

    /**
     * Setter for field
     * 
     * @see SortCriterion.Fields#field
     */
    public SortCriterion setField(String value, SetMode mode) {
        putDirect(FIELD_Field, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SortCriterion.Fields#field
     */
    public SortCriterion setField(
        @Nonnull
        String value) {
        putDirect(FIELD_Field, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for order
     * 
     * @see SortCriterion.Fields#order
     */
    public boolean hasOrder() {
        return contains(FIELD_Order);
    }

    /**
     * Remover for order
     * 
     * @see SortCriterion.Fields#order
     */
    public void removeOrder() {
        remove(FIELD_Order);
    }

    /**
     * Getter for order
     * 
     * @see SortCriterion.Fields#order
     */
    public SortOrder getOrder(GetMode mode) {
        return obtainDirect(FIELD_Order, SortOrder.class, mode);
    }

    /**
     * Getter for order
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SortCriterion.Fields#order
     */
    @Nonnull
    public SortOrder getOrder() {
        return obtainDirect(FIELD_Order, SortOrder.class, GetMode.STRICT);
    }

    /**
     * Setter for order
     * 
     * @see SortCriterion.Fields#order
     */
    public SortCriterion setOrder(SortOrder value, SetMode mode) {
        putDirect(FIELD_Order, SortOrder.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for order
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SortCriterion.Fields#order
     */
    public SortCriterion setOrder(
        @Nonnull
        SortOrder value) {
        putDirect(FIELD_Order, SortOrder.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SortCriterion clone()
        throws CloneNotSupportedException
    {
        return ((SortCriterion) super.clone());
    }

    @Override
    public SortCriterion copy()
        throws CloneNotSupportedException
    {
        return ((SortCriterion) super.copy());
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
         * The name of the field that sorting has to be applied to
         * 
         */
        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        /**
         * The order to sort the results i.e. ASCENDING or DESCENDING
         * 
         */
        public PathSpec order() {
            return new PathSpec(getPathComponents(), "order");
        }

    }

}
