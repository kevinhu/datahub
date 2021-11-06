
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
 * A criterion for matching a field with given value
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/Criterion.pdl.")
public class Criterion
    extends RecordTemplate
{

    private final static Criterion.Fields _fields = new Criterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Condition = SCHEMA.getField("condition");

    public Criterion() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public Criterion(DataMap data) {
        super(data, SCHEMA);
    }

    public static Criterion.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for field
     * 
     * @see Criterion.Fields#field
     */
    public boolean hasField() {
        return contains(FIELD_Field);
    }

    /**
     * Remover for field
     * 
     * @see Criterion.Fields#field
     */
    public void removeField() {
        remove(FIELD_Field);
    }

    /**
     * Getter for field
     * 
     * @see Criterion.Fields#field
     */
    public String getField(GetMode mode) {
        return obtainDirect(FIELD_Field, String.class, mode);
    }

    /**
     * Getter for field
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#field
     */
    @Nonnull
    public String getField() {
        return obtainDirect(FIELD_Field, String.class, GetMode.STRICT);
    }

    /**
     * Setter for field
     * 
     * @see Criterion.Fields#field
     */
    public Criterion setField(String value, SetMode mode) {
        putDirect(FIELD_Field, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#field
     */
    public Criterion setField(
        @Nonnull
        String value) {
        putDirect(FIELD_Field, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see Criterion.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see Criterion.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see Criterion.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#value
     */
    @Nonnull
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see Criterion.Fields#value
     */
    public Criterion setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#value
     */
    public Criterion setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for condition
     * 
     * @see Criterion.Fields#condition
     */
    public boolean hasCondition() {
        return contains(FIELD_Condition);
    }

    /**
     * Remover for condition
     * 
     * @see Criterion.Fields#condition
     */
    public void removeCondition() {
        remove(FIELD_Condition);
    }

    /**
     * Getter for condition
     * 
     * @see Criterion.Fields#condition
     */
    public Condition getCondition(GetMode mode) {
        return obtainDirect(FIELD_Condition, Condition.class, mode);
    }

    /**
     * Getter for condition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#condition
     */
    @Nonnull
    public Condition getCondition() {
        return obtainDirect(FIELD_Condition, Condition.class, GetMode.STRICT);
    }

    /**
     * Setter for condition
     * 
     * @see Criterion.Fields#condition
     */
    public Criterion setCondition(Condition value, SetMode mode) {
        putDirect(FIELD_Condition, Condition.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for condition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#condition
     */
    public Criterion setCondition(
        @Nonnull
        Condition value) {
        putDirect(FIELD_Condition, Condition.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Criterion clone()
        throws CloneNotSupportedException
    {
        return ((Criterion) super.clone());
    }

    @Override
    public Criterion copy()
        throws CloneNotSupportedException
    {
        return ((Criterion) super.copy());
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
         * The name of the field that the criterion refers to
         * 
         */
        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        /**
         * The value of the intended field
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * The condition for the criterion, e.g. EQUAL, START_WITH
         * 
         */
        public PathSpec condition() {
            return new PathSpec(getPathComponents(), "condition");
        }

    }

}
