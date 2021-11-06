
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
 * Defines how the data is partitioned
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/PartitionSpec.pdl.")
public class PartitionSpec
    extends RecordTemplate
{

    private final static PartitionSpec.Fields _fields = new PartitionSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines how the data is partitioned*/record PartitionSpec{/**String representation of the partition*/partition:string/**Time window of the partition if applicable*/timePartition:optional record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Partition = SCHEMA.getField("partition");
    private final static RecordDataSchema.Field FIELD_TimePartition = SCHEMA.getField("timePartition");

    public PartitionSpec() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public PartitionSpec(DataMap data) {
        super(data, SCHEMA);
    }

    public static PartitionSpec.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for partition
     * 
     * @see PartitionSpec.Fields#partition
     */
    public boolean hasPartition() {
        return contains(FIELD_Partition);
    }

    /**
     * Remover for partition
     * 
     * @see PartitionSpec.Fields#partition
     */
    public void removePartition() {
        remove(FIELD_Partition);
    }

    /**
     * Getter for partition
     * 
     * @see PartitionSpec.Fields#partition
     */
    public String getPartition(GetMode mode) {
        return obtainDirect(FIELD_Partition, String.class, mode);
    }

    /**
     * Getter for partition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PartitionSpec.Fields#partition
     */
    @Nonnull
    public String getPartition() {
        return obtainDirect(FIELD_Partition, String.class, GetMode.STRICT);
    }

    /**
     * Setter for partition
     * 
     * @see PartitionSpec.Fields#partition
     */
    public PartitionSpec setPartition(String value, SetMode mode) {
        putDirect(FIELD_Partition, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for partition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PartitionSpec.Fields#partition
     */
    public PartitionSpec setPartition(
        @Nonnull
        String value) {
        putDirect(FIELD_Partition, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for timePartition
     * 
     * @see PartitionSpec.Fields#timePartition
     */
    public boolean hasTimePartition() {
        return contains(FIELD_TimePartition);
    }

    /**
     * Remover for timePartition
     * 
     * @see PartitionSpec.Fields#timePartition
     */
    public void removeTimePartition() {
        remove(FIELD_TimePartition);
    }

    /**
     * Getter for timePartition
     * 
     * @see PartitionSpec.Fields#timePartition
     */
    public TimeWindow getTimePartition(GetMode mode) {
        return obtainWrapped(FIELD_TimePartition, TimeWindow.class, mode);
    }

    /**
     * Getter for timePartition
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PartitionSpec.Fields#timePartition
     */
    @Nullable
    public TimeWindow getTimePartition() {
        return obtainWrapped(FIELD_TimePartition, TimeWindow.class, GetMode.STRICT);
    }

    /**
     * Setter for timePartition
     * 
     * @see PartitionSpec.Fields#timePartition
     */
    public PartitionSpec setTimePartition(TimeWindow value, SetMode mode) {
        putWrapped(FIELD_TimePartition, TimeWindow.class, value, mode);
        return this;
    }

    /**
     * Setter for timePartition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PartitionSpec.Fields#timePartition
     */
    public PartitionSpec setTimePartition(
        @Nonnull
        TimeWindow value) {
        putWrapped(FIELD_TimePartition, TimeWindow.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public PartitionSpec clone()
        throws CloneNotSupportedException
    {
        return ((PartitionSpec) super.clone());
    }

    @Override
    public PartitionSpec copy()
        throws CloneNotSupportedException
    {
        return ((PartitionSpec) super.copy());
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
         * String representation of the partition
         * 
         */
        public PathSpec partition() {
            return new PathSpec(getPathComponents(), "partition");
        }

        /**
         * Time window of the partition if applicable
         * 
         */
        public com.linkedin.timeseries.TimeWindow.Fields timePartition() {
            return new com.linkedin.timeseries.TimeWindow.Fields(getPathComponents(), "timePartition");
        }

    }

}
