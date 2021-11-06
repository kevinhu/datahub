
package com.linkedin.timeseries;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeseriesAspectBase.pdl.")
public class TimeseriesAspectBase
    extends RecordTemplate
{

    private final static TimeseriesAspectBase.Fields _fields = new TimeseriesAspectBase.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries,record TimeseriesAspectBase{/**The event timestamp field as epoch at UTC in milli seconds.*/timestampMillis:long/**Granularity of the event if applicable*/eventGranularity:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**The optional partition specification.*/partitionSpec:optional/**Defines how the data is partitioned*/record PartitionSpec{/**String representation of the partition*/partition:string/**Time window of the partition if applicable*/timePartition:optional record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:TimeWindowSize}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TimestampMillis = SCHEMA.getField("timestampMillis");
    private final static RecordDataSchema.Field FIELD_EventGranularity = SCHEMA.getField("eventGranularity");
    private final static RecordDataSchema.Field FIELD_PartitionSpec = SCHEMA.getField("partitionSpec");

    public TimeseriesAspectBase() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public TimeseriesAspectBase(DataMap data) {
        super(data, SCHEMA);
    }

    public static TimeseriesAspectBase.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for timestampMillis
     * 
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public boolean hasTimestampMillis() {
        return contains(FIELD_TimestampMillis);
    }

    /**
     * Remover for timestampMillis
     * 
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public void removeTimestampMillis() {
        remove(FIELD_TimestampMillis);
    }

    /**
     * Getter for timestampMillis
     * 
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public Long getTimestampMillis(GetMode mode) {
        return obtainDirect(FIELD_TimestampMillis, Long.class, mode);
    }

    /**
     * Getter for timestampMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    @Nonnull
    public Long getTimestampMillis() {
        return obtainDirect(FIELD_TimestampMillis, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for timestampMillis
     * 
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public TimeseriesAspectBase setTimestampMillis(Long value, SetMode mode) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public TimeseriesAspectBase setTimestampMillis(
        @Nonnull
        Long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @see TimeseriesAspectBase.Fields#timestampMillis
     */
    public TimeseriesAspectBase setTimestampMillis(long value) {
        putDirect(FIELD_TimestampMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for eventGranularity
     * 
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    public boolean hasEventGranularity() {
        return contains(FIELD_EventGranularity);
    }

    /**
     * Remover for eventGranularity
     * 
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    public void removeEventGranularity() {
        remove(FIELD_EventGranularity);
    }

    /**
     * Getter for eventGranularity
     * 
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    public TimeWindowSize getEventGranularity(GetMode mode) {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, mode);
    }

    /**
     * Getter for eventGranularity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    @Nullable
    public TimeWindowSize getEventGranularity() {
        return obtainWrapped(FIELD_EventGranularity, TimeWindowSize.class, GetMode.STRICT);
    }

    /**
     * Setter for eventGranularity
     * 
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    public TimeseriesAspectBase setEventGranularity(TimeWindowSize value, SetMode mode) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, mode);
        return this;
    }

    /**
     * Setter for eventGranularity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesAspectBase.Fields#eventGranularity
     */
    public TimeseriesAspectBase setEventGranularity(
        @Nonnull
        TimeWindowSize value) {
        putWrapped(FIELD_EventGranularity, TimeWindowSize.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for partitionSpec
     * 
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    public boolean hasPartitionSpec() {
        return contains(FIELD_PartitionSpec);
    }

    /**
     * Remover for partitionSpec
     * 
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    public void removePartitionSpec() {
        remove(FIELD_PartitionSpec);
    }

    /**
     * Getter for partitionSpec
     * 
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    public PartitionSpec getPartitionSpec(GetMode mode) {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, mode);
    }

    /**
     * Getter for partitionSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    @Nullable
    public PartitionSpec getPartitionSpec() {
        return obtainWrapped(FIELD_PartitionSpec, PartitionSpec.class, GetMode.STRICT);
    }

    /**
     * Setter for partitionSpec
     * 
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    public TimeseriesAspectBase setPartitionSpec(PartitionSpec value, SetMode mode) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, mode);
        return this;
    }

    /**
     * Setter for partitionSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesAspectBase.Fields#partitionSpec
     */
    public TimeseriesAspectBase setPartitionSpec(
        @Nonnull
        PartitionSpec value) {
        putWrapped(FIELD_PartitionSpec, PartitionSpec.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TimeseriesAspectBase clone()
        throws CloneNotSupportedException
    {
        return ((TimeseriesAspectBase) super.clone());
    }

    @Override
    public TimeseriesAspectBase copy()
        throws CloneNotSupportedException
    {
        return ((TimeseriesAspectBase) super.copy());
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

    }

}
