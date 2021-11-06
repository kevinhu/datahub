
package com.linkedin.dataset;

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
 * Records field-level usage counts for a given dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldUsageCounts.pdl.")
public class DatasetFieldUsageCounts
    extends RecordTemplate
{

    private final static DatasetFieldUsageCounts.Fields _fields = new DatasetFieldUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Records field-level usage counts for a given dataset*/record DatasetFieldUsageCounts{/**The name of the field.*/fieldPath:string/**Number of times the field has been used.*/@TimeseriesField={}count:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public DatasetFieldUsageCounts() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public DatasetFieldUsageCounts(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetFieldUsageCounts.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public DatasetFieldUsageCounts setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public DatasetFieldUsageCounts setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public Integer getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Integer.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldUsageCounts.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        return obtainDirect(FIELD_Count, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(Integer value, SetMode mode) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(int value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetFieldUsageCounts clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUsageCounts) super.clone());
    }

    @Override
    public DatasetFieldUsageCounts copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUsageCounts) super.copy());
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
         * The name of the field.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Number of times the field has been used.
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

}
