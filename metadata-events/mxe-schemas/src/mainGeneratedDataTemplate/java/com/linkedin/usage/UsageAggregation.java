
package com.linkedin.usage;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.WindowDuration;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Usage data for a given resource, rolled up into a bucket.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregation.pdl.")
public class UsageAggregation
    extends RecordTemplate
{

    private final static UsageAggregation.Fields _fields = new UsageAggregation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Usage data for a given resource, rolled up into a bucket.*/record UsageAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Metrics associated with this bucket */metrics:/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional com.linkedin.common.Urn,count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Bucket = SCHEMA.getField("bucket");
    private final static RecordDataSchema.Field FIELD_Duration = SCHEMA.getField("duration");
    private final static RecordDataSchema.Field FIELD_Resource = SCHEMA.getField("resource");
    private final static RecordDataSchema.Field FIELD_Metrics = SCHEMA.getField("metrics");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public UsageAggregation() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
    }

    public UsageAggregation(DataMap data) {
        super(data, SCHEMA);
    }

    public static UsageAggregation.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public boolean hasBucket() {
        return contains(FIELD_Bucket);
    }

    /**
     * Remover for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public void removeBucket() {
        remove(FIELD_Bucket);
    }

    /**
     * Getter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public Long getBucket(GetMode mode) {
        return obtainDirect(FIELD_Bucket, Long.class, mode);
    }

    /**
     * Getter for bucket
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#bucket
     */
    @Nonnull
    public Long getBucket() {
        return obtainDirect(FIELD_Bucket, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(Long value, SetMode mode) {
        putDirect(FIELD_Bucket, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(
        @Nonnull
        Long value) {
        putDirect(FIELD_Bucket, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(long value) {
        putDirect(FIELD_Bucket, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public boolean hasDuration() {
        return contains(FIELD_Duration);
    }

    /**
     * Remover for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public void removeDuration() {
        remove(FIELD_Duration);
    }

    /**
     * Getter for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public WindowDuration getDuration(GetMode mode) {
        return obtainDirect(FIELD_Duration, WindowDuration.class, mode);
    }

    /**
     * Getter for duration
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#duration
     */
    @Nonnull
    public WindowDuration getDuration() {
        return obtainDirect(FIELD_Duration, WindowDuration.class, GetMode.STRICT);
    }

    /**
     * Setter for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public UsageAggregation setDuration(WindowDuration value, SetMode mode) {
        putDirect(FIELD_Duration, WindowDuration.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for duration
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#duration
     */
    public UsageAggregation setDuration(
        @Nonnull
        WindowDuration value) {
        putDirect(FIELD_Duration, WindowDuration.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public boolean hasResource() {
        return contains(FIELD_Resource);
    }

    /**
     * Remover for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public void removeResource() {
        remove(FIELD_Resource);
    }

    /**
     * Getter for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public com.linkedin.common.urn.Urn getResource(GetMode mode) {
        return obtainCustomType(FIELD_Resource, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for resource
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#resource
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getResource() {
        return obtainCustomType(FIELD_Resource, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public UsageAggregation setResource(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Resource, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for resource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#resource
     */
    public UsageAggregation setResource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Resource, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public boolean hasMetrics() {
        return contains(FIELD_Metrics);
    }

    /**
     * Remover for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public void removeMetrics() {
        remove(FIELD_Metrics);
    }

    /**
     * Getter for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public UsageAggregationMetrics getMetrics(GetMode mode) {
        return obtainWrapped(FIELD_Metrics, UsageAggregationMetrics.class, mode);
    }

    /**
     * Getter for metrics
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#metrics
     */
    @Nonnull
    public UsageAggregationMetrics getMetrics() {
        return obtainWrapped(FIELD_Metrics, UsageAggregationMetrics.class, GetMode.STRICT);
    }

    /**
     * Setter for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public UsageAggregation setMetrics(UsageAggregationMetrics value, SetMode mode) {
        putWrapped(FIELD_Metrics, UsageAggregationMetrics.class, value, mode);
        return this;
    }

    /**
     * Setter for metrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#metrics
     */
    public UsageAggregation setMetrics(
        @Nonnull
        UsageAggregationMetrics value) {
        putWrapped(FIELD_Metrics, UsageAggregationMetrics.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UsageAggregation clone()
        throws CloneNotSupportedException
    {
        return ((UsageAggregation) super.clone());
    }

    @Override
    public UsageAggregation copy()
        throws CloneNotSupportedException
    {
        return ((UsageAggregation) super.copy());
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
         *  Bucket start time in milliseconds 
         * 
         */
        public PathSpec bucket() {
            return new PathSpec(getPathComponents(), "bucket");
        }

        /**
         *  Bucket duration 
         * 
         */
        public PathSpec duration() {
            return new PathSpec(getPathComponents(), "duration");
        }

        /**
         *  Resource associated with these usage stats 
         * 
         */
        public PathSpec resource() {
            return new PathSpec(getPathComponents(), "resource");
        }

        /**
         *  Metrics associated with this bucket 
         * 
         */
        public com.linkedin.usage.UsageAggregationMetrics.Fields metrics() {
            return new com.linkedin.usage.UsageAggregationMetrics.Fields(getPathComponents(), "metrics");
        }

    }

}
