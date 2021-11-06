
package com.linkedin.timeseries;

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
 * Provides the aggregation specification on a member/field.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/AggregationSpec.pdl.")
public class AggregationSpec
    extends RecordTemplate
{

    private final static AggregationSpec.Fields _fields = new AggregationSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Provides the aggregation specification on a member/field.*/record AggregationSpec{/**Name of the member/field.*/fieldPath:string/**Aggregation type for the metric.*/aggregationType:enum AggregationType{LATEST,SUM,CARDINALITY}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_AggregationType = SCHEMA.getField("aggregationType");

    public AggregationSpec() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public AggregationSpec(DataMap data) {
        super(data, SCHEMA);
    }

    public static AggregationSpec.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationSpec.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public AggregationSpec setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationSpec.Fields#fieldPath
     */
    public AggregationSpec setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public boolean hasAggregationType() {
        return contains(FIELD_AggregationType);
    }

    /**
     * Remover for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public void removeAggregationType() {
        remove(FIELD_AggregationType);
    }

    /**
     * Getter for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public AggregationType getAggregationType(GetMode mode) {
        return obtainDirect(FIELD_AggregationType, AggregationType.class, mode);
    }

    /**
     * Getter for aggregationType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationSpec.Fields#aggregationType
     */
    @Nonnull
    public AggregationType getAggregationType() {
        return obtainDirect(FIELD_AggregationType, AggregationType.class, GetMode.STRICT);
    }

    /**
     * Setter for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public AggregationSpec setAggregationType(AggregationType value, SetMode mode) {
        putDirect(FIELD_AggregationType, AggregationType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for aggregationType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationSpec.Fields#aggregationType
     */
    public AggregationSpec setAggregationType(
        @Nonnull
        AggregationType value) {
        putDirect(FIELD_AggregationType, AggregationType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public AggregationSpec clone()
        throws CloneNotSupportedException
    {
        return ((AggregationSpec) super.clone());
    }

    @Override
    public AggregationSpec copy()
        throws CloneNotSupportedException
    {
        return ((AggregationSpec) super.copy());
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
         * Name of the member/field.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Aggregation type for the metric.
         * 
         */
        public PathSpec aggregationType() {
            return new PathSpec(getPathComponents(), "aggregationType");
        }

    }

}
