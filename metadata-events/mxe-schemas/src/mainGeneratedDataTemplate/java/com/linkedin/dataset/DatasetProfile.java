
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
import com.linkedin.timeseries.PartitionSpec;
import com.linkedin.timeseries.TimeWindowSize;


/**
 * Stats corresponding to datasets
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetProfile.pdl.")
public class DatasetProfile
    extends RecordTemplate
{

    private final static DatasetProfile.Fields _fields = new DatasetProfile.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Stats corresponding to datasets*/@Aspect={\"name\":\"datasetProfile\",\"type\":\"timeseries\"}record DatasetProfile includes{namespace com.linkedin.timeseries,record TimeseriesAspectBase{/**The event timestamp field as epoch at UTC in milli seconds.*/timestampMillis:long/**Granularity of the event if applicable*/eventGranularity:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**The optional partition specification.*/partitionSpec:optional/**Defines how the data is partitioned*/record PartitionSpec{/**String representation of the partition*/partition:string/**Time window of the partition if applicable*/timePartition:optional record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:TimeWindowSize}}}}{rowCount:optional long,columnCount:optional long,fieldProfiles:optional array[/**Stats corresponding to fields in a dataset*/record DatasetFieldProfile{fieldPath:string,uniqueCount:optional long,uniqueProportion:optional float,nullCount:optional long,nullProportion:optional float,min:optional string,max:optional string,mean:optional string,median:optional string,stdev:optional string,quantiles:optional array[record Quantile{quantile:string,value:string}]distinctValueFrequencies:optional array[record ValueFrequency{value:string,frequency:long}]histogram:optional record Histogram{boundaries:array[string]heights:array[float]}sampleValues:optional array[string]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TimestampMillis = SCHEMA.getField("timestampMillis");
    private final static RecordDataSchema.Field FIELD_EventGranularity = SCHEMA.getField("eventGranularity");
    private final static RecordDataSchema.Field FIELD_PartitionSpec = SCHEMA.getField("partitionSpec");
    private final static RecordDataSchema.Field FIELD_RowCount = SCHEMA.getField("rowCount");
    private final static RecordDataSchema.Field FIELD_ColumnCount = SCHEMA.getField("columnCount");
    private final static RecordDataSchema.Field FIELD_FieldProfiles = SCHEMA.getField("fieldProfiles");

    public DatasetProfile() {
        super(new DataMap(8, 0.75F), SCHEMA, 4);
    }

    public DatasetProfile(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetProfile.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for timestampMillis
     * 
     * @see DatasetProfile.Fields#timestampMillis
     */
    public boolean hasTimestampMillis() {
        return contains(FIELD_TimestampMillis);
    }

    /**
     * Remover for timestampMillis
     * 
     * @see DatasetProfile.Fields#timestampMillis
     */
    public void removeTimestampMillis() {
        remove(FIELD_TimestampMillis);
    }

    /**
     * Getter for timestampMillis
     * 
     * @see DatasetProfile.Fields#timestampMillis
     */
    public Long getTimestampMillis(GetMode mode) {
        return obtainDirect(FIELD_TimestampMillis, Long.class, mode);
    }

    /**
     * Getter for timestampMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetProfile.Fields#timestampMillis
     */
    @Nonnull
    public Long getTimestampMillis() {
        return obtainDirect(FIELD_TimestampMillis, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for timestampMillis
     * 
     * @see DatasetProfile.Fields#timestampMillis
     */
    public DatasetProfile setTimestampMillis(Long value, SetMode mode) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#timestampMillis
     */
    public DatasetProfile setTimestampMillis(
        @Nonnull
        Long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @see DatasetProfile.Fields#timestampMillis
     */
    public DatasetProfile setTimestampMillis(long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for eventGranularity
     * 
     * @see DatasetProfile.Fields#eventGranularity
     */
    public boolean hasEventGranularity() {
        return contains(FIELD_EventGranularity);
    }

    /**
     * Remover for eventGranularity
     * 
     * @see DatasetProfile.Fields#eventGranularity
     */
    public void removeEventGranularity() {
        remove(FIELD_EventGranularity);
    }

    /**
     * Getter for eventGranularity
     * 
     * @see DatasetProfile.Fields#eventGranularity
     */
    public TimeWindowSize getEventGranularity(GetMode mode) {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, mode);
    }

    /**
     * Getter for eventGranularity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProfile.Fields#eventGranularity
     */
    @Nullable
    public TimeWindowSize getEventGranularity() {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, GetMode.STRICT);
    }

    /**
     * Setter for eventGranularity
     * 
     * @see DatasetProfile.Fields#eventGranularity
     */
    public DatasetProfile setEventGranularity(TimeWindowSize value, SetMode mode) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, mode);
        return this;
    }

    /**
     * Setter for eventGranularity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#eventGranularity
     */
    public DatasetProfile setEventGranularity(
        @Nonnull
        TimeWindowSize value) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for partitionSpec
     * 
     * @see DatasetProfile.Fields#partitionSpec
     */
    public boolean hasPartitionSpec() {
        return contains(FIELD_PartitionSpec);
    }

    /**
     * Remover for partitionSpec
     * 
     * @see DatasetProfile.Fields#partitionSpec
     */
    public void removePartitionSpec() {
        remove(FIELD_PartitionSpec);
    }

    /**
     * Getter for partitionSpec
     * 
     * @see DatasetProfile.Fields#partitionSpec
     */
    public PartitionSpec getPartitionSpec(GetMode mode) {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, mode);
    }

    /**
     * Getter for partitionSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProfile.Fields#partitionSpec
     */
    @Nullable
    public PartitionSpec getPartitionSpec() {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, GetMode.STRICT);
    }

    /**
     * Setter for partitionSpec
     * 
     * @see DatasetProfile.Fields#partitionSpec
     */
    public DatasetProfile setPartitionSpec(PartitionSpec value, SetMode mode) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, mode);
        return this;
    }

    /**
     * Setter for partitionSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#partitionSpec
     */
    public DatasetProfile setPartitionSpec(
        @Nonnull
        PartitionSpec value) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for rowCount
     * 
     * @see DatasetProfile.Fields#rowCount
     */
    public boolean hasRowCount() {
        return contains(FIELD_RowCount);
    }

    /**
     * Remover for rowCount
     * 
     * @see DatasetProfile.Fields#rowCount
     */
    public void removeRowCount() {
        remove(FIELD_RowCount);
    }

    /**
     * Getter for rowCount
     * 
     * @see DatasetProfile.Fields#rowCount
     */
    public Long getRowCount(GetMode mode) {
        return obtainDirect(FIELD_RowCount, Long.class, mode);
    }

    /**
     * Getter for rowCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProfile.Fields#rowCount
     */
    @Nullable
    public Long getRowCount() {
        return obtainDirect(FIELD_RowCount, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for rowCount
     * 
     * @see DatasetProfile.Fields#rowCount
     */
    public DatasetProfile setRowCount(Long value, SetMode mode) {
        putDirect(FIELD_RowCount, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for rowCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#rowCount
     */
    public DatasetProfile setRowCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_RowCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for rowCount
     * 
     * @see DatasetProfile.Fields#rowCount
     */
    public DatasetProfile setRowCount(long value) {
        putDirect(FIELD_RowCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for columnCount
     * 
     * @see DatasetProfile.Fields#columnCount
     */
    public boolean hasColumnCount() {
        return contains(FIELD_ColumnCount);
    }

    /**
     * Remover for columnCount
     * 
     * @see DatasetProfile.Fields#columnCount
     */
    public void removeColumnCount() {
        remove(FIELD_ColumnCount);
    }

    /**
     * Getter for columnCount
     * 
     * @see DatasetProfile.Fields#columnCount
     */
    public Long getColumnCount(GetMode mode) {
        return obtainDirect(FIELD_ColumnCount, Long.class, mode);
    }

    /**
     * Getter for columnCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProfile.Fields#columnCount
     */
    @Nullable
    public Long getColumnCount() {
        return obtainDirect(FIELD_ColumnCount, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for columnCount
     * 
     * @see DatasetProfile.Fields#columnCount
     */
    public DatasetProfile setColumnCount(Long value, SetMode mode) {
        putDirect(FIELD_ColumnCount, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for columnCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#columnCount
     */
    public DatasetProfile setColumnCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_ColumnCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for columnCount
     * 
     * @see DatasetProfile.Fields#columnCount
     */
    public DatasetProfile setColumnCount(long value) {
        putDirect(FIELD_ColumnCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldProfiles
     * 
     * @see DatasetProfile.Fields#fieldProfiles
     */
    public boolean hasFieldProfiles() {
        return contains(FIELD_FieldProfiles);
    }

    /**
     * Remover for fieldProfiles
     * 
     * @see DatasetProfile.Fields#fieldProfiles
     */
    public void removeFieldProfiles() {
        remove(FIELD_FieldProfiles);
    }

    /**
     * Getter for fieldProfiles
     * 
     * @see DatasetProfile.Fields#fieldProfiles
     */
    public DatasetFieldProfileArray getFieldProfiles(GetMode mode) {
        return obtainWrapped(FIELD_FieldProfiles, DatasetFieldProfileArray.class, mode);
    }

    /**
     * Getter for fieldProfiles
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProfile.Fields#fieldProfiles
     */
    @Nullable
    public DatasetFieldProfileArray getFieldProfiles() {
        return obtainWrapped(FIELD_FieldProfiles, DatasetFieldProfileArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldProfiles
     * 
     * @see DatasetProfile.Fields#fieldProfiles
     */
    public DatasetProfile setFieldProfiles(DatasetFieldProfileArray value, SetMode mode) {
        putWrapped(FIELD_FieldProfiles, DatasetFieldProfileArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldProfiles
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProfile.Fields#fieldProfiles
     */
    public DatasetProfile setFieldProfiles(
        @Nonnull
        DatasetFieldProfileArray value) {
        putWrapped(FIELD_FieldProfiles, DatasetFieldProfileArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetProfile clone()
        throws CloneNotSupportedException
    {
        return ((DatasetProfile) super.clone());
    }

    @Override
    public DatasetProfile copy()
        throws CloneNotSupportedException
    {
        return ((DatasetProfile) super.copy());
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

        public PathSpec rowCount() {
            return new PathSpec(getPathComponents(), "rowCount");
        }

        public PathSpec columnCount() {
            return new PathSpec(getPathComponents(), "columnCount");
        }

        public com.linkedin.dataset.DatasetFieldProfileArray.Fields fieldProfiles() {
            return new com.linkedin.dataset.DatasetFieldProfileArray.Fields(getPathComponents(), "fieldProfiles");
        }

        public PathSpec fieldProfiles(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldProfiles");
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
