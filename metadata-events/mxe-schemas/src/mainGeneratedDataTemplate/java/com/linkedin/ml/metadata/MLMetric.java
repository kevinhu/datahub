
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Properties associated with an ML Metric
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLMetric.pdl.")
public class MLMetric
    extends RecordTemplate
{

    private final static MLMetric.Fields _fields = new MLMetric.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");

    public MLMetric() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public MLMetric(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLMetric.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see MLMetric.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLMetric.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLMetric.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLMetric.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLMetric.Fields#name
     */
    public MLMetric setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLMetric.Fields#name
     */
    public MLMetric setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLMetric.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLMetric.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLMetric.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLMetric.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLMetric.Fields#description
     */
    public MLMetric setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLMetric.Fields#description
     */
    public MLMetric setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see MLMetric.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see MLMetric.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see MLMetric.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLMetric.Fields#value
     */
    @Nullable
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see MLMetric.Fields#value
     */
    public MLMetric setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLMetric.Fields#value
     */
    public MLMetric setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see MLMetric.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        return contains(FIELD_CreatedAt);
    }

    /**
     * Remover for createdAt
     * 
     * @see MLMetric.Fields#createdAt
     */
    public void removeCreatedAt() {
        remove(FIELD_CreatedAt);
    }

    /**
     * Getter for createdAt
     * 
     * @see MLMetric.Fields#createdAt
     */
    public Long getCreatedAt(GetMode mode) {
        return obtainDirect(FIELD_CreatedAt, Long.class, mode);
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLMetric.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt() {
        return obtainDirect(FIELD_CreatedAt, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for createdAt
     * 
     * @see MLMetric.Fields#createdAt
     */
    public MLMetric setCreatedAt(Long value, SetMode mode) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLMetric.Fields#createdAt
     */
    public MLMetric setCreatedAt(
        @Nonnull
        Long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see MLMetric.Fields#createdAt
     */
    public MLMetric setCreatedAt(long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLMetric clone()
        throws CloneNotSupportedException
    {
        return ((MLMetric) super.clone());
    }

    @Override
    public MLMetric copy()
        throws CloneNotSupportedException
    {
        return ((MLMetric) super.copy());
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
         * Name of the mlMetric
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Documentation of the mlMetric
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The value of the mlMetric
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Date when the mlMetric was developed
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

    }

}
