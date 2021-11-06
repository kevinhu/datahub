
package com.linkedin.dataset;

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
import com.linkedin.data.template.StringArray;
import com.linkedin.timeseries.PartitionSpec;
import com.linkedin.timeseries.TimeWindowSize;


/**
 * Stats corresponding to dataset's usage.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUsageStatistics.pdl.")
public class DatasetUsageStatistics
    extends RecordTemplate
{

    private final static DatasetUsageStatistics.Fields _fields = new DatasetUsageStatistics.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Stats corresponding to dataset's usage.*/@Aspect={\"name\":\"datasetUsageStatistics\",\"type\":\"timeseries\"}record DatasetUsageStatistics includes{namespace com.linkedin.timeseries,record TimeseriesAspectBase{/**The event timestamp field as epoch at UTC in milli seconds.*/timestampMillis:long/**Granularity of the event if applicable*/eventGranularity:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**The optional partition specification.*/partitionSpec:optional/**Defines how the data is partitioned*/record PartitionSpec{/**String representation of the partition*/partition:string/**Time window of the partition if applicable*/timePartition:optional record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:TimeWindowSize}}}}{/**Unique user count*/@TimeseriesField={}uniqueUserCount:optional int/**Total SQL query count*/@TimeseriesField={}totalSqlQueries:optional int/**Frequent SQL queries; mostly makes sense for datasets in SQL databases*/@TimeseriesField={}topSqlQueries:optional array[string]/**Users within this bucket, with frequency counts*/@TimeseriesFieldCollection.key=\"user\"userCounts:optional array[/**Records a single user's usage counts for a given resource*/record DatasetUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of times the dataset has been used by the user.*/@TimeseriesField={}count:int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}]/**Field-level usage stats*/@TimeseriesFieldCollection.key=\"fieldPath\"fieldCounts:optional array[/**Records field-level usage counts for a given dataset*/record DatasetFieldUsageCounts{/**The name of the field.*/fieldPath:string/**Number of times the field has been used.*/@TimeseriesField={}count:int}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TimestampMillis = SCHEMA.getField("timestampMillis");
    private final static RecordDataSchema.Field FIELD_EventGranularity = SCHEMA.getField("eventGranularity");
    private final static RecordDataSchema.Field FIELD_PartitionSpec = SCHEMA.getField("partitionSpec");
    private final static RecordDataSchema.Field FIELD_UniqueUserCount = SCHEMA.getField("uniqueUserCount");
    private final static RecordDataSchema.Field FIELD_TotalSqlQueries = SCHEMA.getField("totalSqlQueries");
    private final static RecordDataSchema.Field FIELD_TopSqlQueries = SCHEMA.getField("topSqlQueries");
    private final static RecordDataSchema.Field FIELD_UserCounts = SCHEMA.getField("userCounts");
    private final static RecordDataSchema.Field FIELD_FieldCounts = SCHEMA.getField("fieldCounts");

    public DatasetUsageStatistics() {
        super(new DataMap(11, 0.75F), SCHEMA, 7);
    }

    public DatasetUsageStatistics(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetUsageStatistics.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for timestampMillis
     * 
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public boolean hasTimestampMillis() {
        return contains(FIELD_TimestampMillis);
    }

    /**
     * Remover for timestampMillis
     * 
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public void removeTimestampMillis() {
        remove(FIELD_TimestampMillis);
    }

    /**
     * Getter for timestampMillis
     * 
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public Long getTimestampMillis(GetMode mode) {
        return obtainDirect(FIELD_TimestampMillis, Long.class, mode);
    }

    /**
     * Getter for timestampMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    @Nonnull
    public Long getTimestampMillis() {
        return obtainDirect(FIELD_TimestampMillis, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for timestampMillis
     * 
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public DatasetUsageStatistics setTimestampMillis(Long value, SetMode mode) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public DatasetUsageStatistics setTimestampMillis(
        @Nonnull
        Long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @see DatasetUsageStatistics.Fields#timestampMillis
     */
    public DatasetUsageStatistics setTimestampMillis(long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for eventGranularity
     * 
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    public boolean hasEventGranularity() {
        return contains(FIELD_EventGranularity);
    }

    /**
     * Remover for eventGranularity
     * 
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    public void removeEventGranularity() {
        remove(FIELD_EventGranularity);
    }

    /**
     * Getter for eventGranularity
     * 
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    public TimeWindowSize getEventGranularity(GetMode mode) {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, mode);
    }

    /**
     * Getter for eventGranularity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    @Nullable
    public TimeWindowSize getEventGranularity() {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, GetMode.STRICT);
    }

    /**
     * Setter for eventGranularity
     * 
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    public DatasetUsageStatistics setEventGranularity(TimeWindowSize value, SetMode mode) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, mode);
        return this;
    }

    /**
     * Setter for eventGranularity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#eventGranularity
     */
    public DatasetUsageStatistics setEventGranularity(
        @Nonnull
        TimeWindowSize value) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for partitionSpec
     * 
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    public boolean hasPartitionSpec() {
        return contains(FIELD_PartitionSpec);
    }

    /**
     * Remover for partitionSpec
     * 
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    public void removePartitionSpec() {
        remove(FIELD_PartitionSpec);
    }

    /**
     * Getter for partitionSpec
     * 
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    public PartitionSpec getPartitionSpec(GetMode mode) {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, mode);
    }

    /**
     * Getter for partitionSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    @Nullable
    public PartitionSpec getPartitionSpec() {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, GetMode.STRICT);
    }

    /**
     * Setter for partitionSpec
     * 
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    public DatasetUsageStatistics setPartitionSpec(PartitionSpec value, SetMode mode) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, mode);
        return this;
    }

    /**
     * Setter for partitionSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#partitionSpec
     */
    public DatasetUsageStatistics setPartitionSpec(
        @Nonnull
        PartitionSpec value) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for uniqueUserCount
     * 
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public boolean hasUniqueUserCount() {
        return contains(FIELD_UniqueUserCount);
    }

    /**
     * Remover for uniqueUserCount
     * 
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public void removeUniqueUserCount() {
        remove(FIELD_UniqueUserCount);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public Integer getUniqueUserCount(GetMode mode) {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, mode);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    @Nullable
    public Integer getUniqueUserCount() {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public DatasetUsageStatistics setUniqueUserCount(Integer value, SetMode mode) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public DatasetUsageStatistics setUniqueUserCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see DatasetUsageStatistics.Fields#uniqueUserCount
     */
    public DatasetUsageStatistics setUniqueUserCount(int value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for totalSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public boolean hasTotalSqlQueries() {
        return contains(FIELD_TotalSqlQueries);
    }

    /**
     * Remover for totalSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public void removeTotalSqlQueries() {
        remove(FIELD_TotalSqlQueries);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public Integer getTotalSqlQueries(GetMode mode) {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, mode);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    @Nullable
    public Integer getTotalSqlQueries() {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public DatasetUsageStatistics setTotalSqlQueries(Integer value, SetMode mode) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public DatasetUsageStatistics setTotalSqlQueries(
        @Nonnull
        Integer value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#totalSqlQueries
     */
    public DatasetUsageStatistics setTotalSqlQueries(int value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for topSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    public boolean hasTopSqlQueries() {
        return contains(FIELD_TopSqlQueries);
    }

    /**
     * Remover for topSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    public void removeTopSqlQueries() {
        remove(FIELD_TopSqlQueries);
    }

    /**
     * Getter for topSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    public StringArray getTopSqlQueries(GetMode mode) {
        return obtainWrapped(FIELD_TopSqlQueries, StringArray.class, mode);
    }

    /**
     * Getter for topSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    @Nullable
    public StringArray getTopSqlQueries() {
        return obtainWrapped(FIELD_TopSqlQueries, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for topSqlQueries
     * 
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    public DatasetUsageStatistics setTopSqlQueries(StringArray value, SetMode mode) {
        putWrapped(FIELD_TopSqlQueries, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for topSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#topSqlQueries
     */
    public DatasetUsageStatistics setTopSqlQueries(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_TopSqlQueries, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for userCounts
     * 
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    public boolean hasUserCounts() {
        return contains(FIELD_UserCounts);
    }

    /**
     * Remover for userCounts
     * 
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    public void removeUserCounts() {
        remove(FIELD_UserCounts);
    }

    /**
     * Getter for userCounts
     * 
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    public DatasetUserUsageCountsArray getUserCounts(GetMode mode) {
        return obtainWrapped(FIELD_UserCounts, DatasetUserUsageCountsArray.class, mode);
    }

    /**
     * Getter for userCounts
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    @Nullable
    public DatasetUserUsageCountsArray getUserCounts() {
        return obtainWrapped(FIELD_UserCounts, DatasetUserUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for userCounts
     * 
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    public DatasetUsageStatistics setUserCounts(DatasetUserUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_UserCounts, DatasetUserUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for userCounts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#userCounts
     */
    public DatasetUsageStatistics setUserCounts(
        @Nonnull
        DatasetUserUsageCountsArray value) {
        putWrapped(FIELD_UserCounts, DatasetUserUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldCounts
     * 
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    public boolean hasFieldCounts() {
        return contains(FIELD_FieldCounts);
    }

    /**
     * Remover for fieldCounts
     * 
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    public void removeFieldCounts() {
        remove(FIELD_FieldCounts);
    }

    /**
     * Getter for fieldCounts
     * 
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    public DatasetFieldUsageCountsArray getFieldCounts(GetMode mode) {
        return obtainWrapped(FIELD_FieldCounts, DatasetFieldUsageCountsArray.class, mode);
    }

    /**
     * Getter for fieldCounts
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    @Nullable
    public DatasetFieldUsageCountsArray getFieldCounts() {
        return obtainWrapped(FIELD_FieldCounts, DatasetFieldUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldCounts
     * 
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    public DatasetUsageStatistics setFieldCounts(DatasetFieldUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_FieldCounts, DatasetFieldUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldCounts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUsageStatistics.Fields#fieldCounts
     */
    public DatasetUsageStatistics setFieldCounts(
        @Nonnull
        DatasetFieldUsageCountsArray value) {
        putWrapped(FIELD_FieldCounts, DatasetFieldUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetUsageStatistics clone()
        throws CloneNotSupportedException
    {
        return ((DatasetUsageStatistics) super.clone());
    }

    @Override
    public DatasetUsageStatistics copy()
        throws CloneNotSupportedException
    {
        return ((DatasetUsageStatistics) super.copy());
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
         * The event timestamp field as epoch at UTC in milli seconds.
         * 
         */
        public PathSpec timestampMillis() {
            return new PathSpec(getPathComponents(), "timestampMillis");
        }

        /**
         * Granularity of the event if applicable
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields eventGranularity() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "eventGranularity");
        }

        /**
         * The optional partition specification.
         * 
         */
        public com.linkedin.timeseries.PartitionSpec.Fields partitionSpec() {
            return new com.linkedin.timeseries.PartitionSpec.Fields(getPathComponents(), "partitionSpec");
        }

        /**
         * Unique user count
         * 
         */
        public PathSpec uniqueUserCount() {
            return new PathSpec(getPathComponents(), "uniqueUserCount");
        }

        /**
         * Total SQL query count
         * 
         */
        public PathSpec totalSqlQueries() {
            return new PathSpec(getPathComponents(), "totalSqlQueries");
        }

        /**
         * Frequent SQL queries; mostly makes sense for datasets in SQL databases
         * 
         */
        public PathSpec topSqlQueries() {
            return new PathSpec(getPathComponents(), "topSqlQueries");
        }

        /**
         * Frequent SQL queries; mostly makes sense for datasets in SQL databases
         * 
         */
        public PathSpec topSqlQueries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "topSqlQueries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Users within this bucket, with frequency counts
         * 
         */
        public com.linkedin.dataset.DatasetUserUsageCountsArray.Fields userCounts() {
            return new com.linkedin.dataset.DatasetUserUsageCountsArray.Fields(getPathComponents(), "userCounts");
        }

        /**
         * Users within this bucket, with frequency counts
         * 
         */
        public PathSpec userCounts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "userCounts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Field-level usage stats
         * 
         */
        public com.linkedin.dataset.DatasetFieldUsageCountsArray.Fields fieldCounts() {
            return new com.linkedin.dataset.DatasetFieldUsageCountsArray.Fields(getPathComponents(), "fieldCounts");
        }

        /**
         * Field-level usage stats
         * 
         */
        public PathSpec fieldCounts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldCounts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
