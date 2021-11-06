
package com.linkedin.usage;

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
 * Results of a query for usage data.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageQueryResult.pdl.")
public class UsageQueryResult
    extends RecordTemplate
{

    private final static UsageQueryResult.Fields _fields = new UsageQueryResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Results of a query for usage data.*/record UsageQueryResult{/** Raw buckets */buckets:optional array[/**Usage data for a given resource, rolled up into a bucket.*/record UsageAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Metrics associated with this bucket */metrics:/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional com.linkedin.common.Urn,count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}}]/**Aggregated metrics. All fields are optional here, since they will be populated\nonly if the underlying buckets contain the data required to generate that aggregation.*/aggregations:record UsageQueryResultAggregations{uniqueUserCount:optional int,totalSqlQueries:optional int,users:optional array[UserUsageCounts]fields:optional array[FieldUsageCounts]}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Buckets = SCHEMA.getField("buckets");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");

    public UsageQueryResult() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public UsageQueryResult(DataMap data) {
        super(data, SCHEMA);
    }

    public static UsageQueryResult.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public boolean hasBuckets() {
        return contains(FIELD_Buckets);
    }

    /**
     * Remover for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public void removeBuckets() {
        remove(FIELD_Buckets);
    }

    /**
     * Getter for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public UsageAggregationArray getBuckets(GetMode mode) {
        return obtainWrapped(FIELD_Buckets, UsageAggregationArray.class, mode);
    }

    /**
     * Getter for buckets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResult.Fields#buckets
     */
    @Nullable
    public UsageAggregationArray getBuckets() {
        return obtainWrapped(FIELD_Buckets, UsageAggregationArray.class, GetMode.STRICT);
    }

    /**
     * Setter for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public UsageQueryResult setBuckets(UsageAggregationArray value, SetMode mode) {
        putWrapped(FIELD_Buckets, UsageAggregationArray.class, value, mode);
        return this;
    }

    /**
     * Setter for buckets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResult.Fields#buckets
     */
    public UsageQueryResult setBuckets(
        @Nonnull
        UsageAggregationArray value) {
        putWrapped(FIELD_Buckets, UsageAggregationArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public boolean hasAggregations() {
        return contains(FIELD_Aggregations);
    }

    /**
     * Remover for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public void removeAggregations() {
        remove(FIELD_Aggregations);
    }

    /**
     * Getter for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public UsageQueryResultAggregations getAggregations(GetMode mode) {
        return obtainWrapped(FIELD_Aggregations, UsageQueryResultAggregations.class, mode);
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageQueryResult.Fields#aggregations
     */
    @Nonnull
    public UsageQueryResultAggregations getAggregations() {
        return obtainWrapped(FIELD_Aggregations, UsageQueryResultAggregations.class, GetMode.STRICT);
    }

    /**
     * Setter for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public UsageQueryResult setAggregations(UsageQueryResultAggregations value, SetMode mode) {
        putWrapped(FIELD_Aggregations, UsageQueryResultAggregations.class, value, mode);
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResult.Fields#aggregations
     */
    public UsageQueryResult setAggregations(
        @Nonnull
        UsageQueryResultAggregations value) {
        putWrapped(FIELD_Aggregations, UsageQueryResultAggregations.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UsageQueryResult clone()
        throws CloneNotSupportedException
    {
        return ((UsageQueryResult) super.clone());
    }

    @Override
    public UsageQueryResult copy()
        throws CloneNotSupportedException
    {
        return ((UsageQueryResult) super.copy());
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
         *  Raw buckets 
         * 
         */
        public com.linkedin.usage.UsageAggregationArray.Fields buckets() {
            return new com.linkedin.usage.UsageAggregationArray.Fields(getPathComponents(), "buckets");
        }

        /**
         *  Raw buckets 
         * 
         */
        public PathSpec buckets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "buckets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Aggregated metrics. All fields are optional here, since they will be populated
         * only if the underlying buckets contain the data required to generate that aggregation.
         * 
         */
        public com.linkedin.usage.UsageQueryResultAggregations.Fields aggregations() {
            return new com.linkedin.usage.UsageQueryResultAggregations.Fields(getPathComponents(), "aggregations");
        }

    }

}
