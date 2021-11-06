
package com.linkedin.usage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageQueryResult.pdl.")
public class UsageAggregationArray
    extends WrappingArrayTemplate<UsageAggregation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.usage/**Usage data for a given resource, rolled up into a bucket.*/record UsageAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Metrics associated with this bucket */metrics:/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional com.linkedin.common.Urn,count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}}}]", SchemaFormatType.PDL));

    public UsageAggregationArray() {
        this(new DataList());
    }

    public UsageAggregationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UsageAggregationArray(Collection<UsageAggregation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UsageAggregationArray(DataList data) {
        super(data, SCHEMA, UsageAggregation.class);
    }

    public UsageAggregationArray(UsageAggregation first, UsageAggregation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public UsageAggregationArray clone()
        throws CloneNotSupportedException
    {
        return ((UsageAggregationArray) super.clone());
    }

    @Override
    public UsageAggregationArray copy()
        throws CloneNotSupportedException
    {
        return ((UsageAggregationArray) super.copy());
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

        public com.linkedin.usage.UsageAggregation.Fields items() {
            return new com.linkedin.usage.UsageAggregation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
