
package com.linkedin.usage;

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
 *  Records field-level usage counts for a given resource 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/FieldUsageCounts.pdl.")
public class FieldUsageCounts
    extends RecordTemplate
{

    private final static FieldUsageCounts.Fields _fields = new FieldUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldName = SCHEMA.getField("fieldName");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public FieldUsageCounts() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public FieldUsageCounts(DataMap data) {
        super(data, SCHEMA);
    }

    public static FieldUsageCounts.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public boolean hasFieldName() {
        return contains(FIELD_FieldName);
    }

    /**
     * Remover for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public void removeFieldName() {
        remove(FIELD_FieldName);
    }

    /**
     * Getter for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public String getFieldName(GetMode mode) {
        return obtainDirect(FIELD_FieldName, String.class, mode);
    }

    /**
     * Getter for fieldName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldUsageCounts.Fields#fieldName
     */
    @Nonnull
    public String getFieldName() {
        return obtainDirect(FIELD_FieldName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public FieldUsageCounts setFieldName(String value, SetMode mode) {
        putDirect(FIELD_FieldName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldUsageCounts.Fields#fieldName
     */
    public FieldUsageCounts setFieldName(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public Integer getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Integer.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldUsageCounts.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        return obtainDirect(FIELD_Count, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(Integer value, SetMode mode) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(int value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public FieldUsageCounts clone()
        throws CloneNotSupportedException
    {
        return ((FieldUsageCounts) super.clone());
    }

    @Override
    public FieldUsageCounts copy()
        throws CloneNotSupportedException
    {
        return ((FieldUsageCounts) super.copy());
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

        public PathSpec fieldName() {
            return new PathSpec(getPathComponents(), "fieldName");
        }

        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

}
