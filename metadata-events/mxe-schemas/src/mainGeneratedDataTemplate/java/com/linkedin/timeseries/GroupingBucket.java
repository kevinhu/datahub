
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
 * Defines the group by bucket definitions for time series requests.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/GroupingBucket.pdl.")
public class GroupingBucket
    extends RecordTemplate
{

    private final static GroupingBucket.Fields _fields = new GroupingBucket.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines the group by bucket definitions for time series requests.*/record GroupingBucket{/**Type of the grouping bucket.*/type:/**Defines a grouping bucket type.*/enum GroupingBucketType{DATE_GROUPING_BUCKET,STRING_GROUPING_BUCKET}/**Key that specifies the column name to be used as the timestamp field for bucketing.*/key:string/**Bucket size (like a day/hour etc) for the date grouping buckets.*/timeWindowSize:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Key = SCHEMA.getField("key");
    private final static RecordDataSchema.Field FIELD_TimeWindowSize = SCHEMA.getField("timeWindowSize");

    public GroupingBucket() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public GroupingBucket(DataMap data) {
        super(data, SCHEMA);
    }

    public static GroupingBucket.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for type
     * 
     * @see GroupingBucket.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see GroupingBucket.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see GroupingBucket.Fields#type
     */
    public GroupingBucketType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, GroupingBucketType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupingBucket.Fields#type
     */
    @Nonnull
    public GroupingBucketType getType() {
        return obtainDirect(FIELD_Type, GroupingBucketType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see GroupingBucket.Fields#type
     */
    public GroupingBucket setType(GroupingBucketType value, SetMode mode) {
        putDirect(FIELD_Type, GroupingBucketType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#type
     */
    public GroupingBucket setType(
        @Nonnull
        GroupingBucketType value) {
        putDirect(FIELD_Type, GroupingBucketType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public boolean hasKey() {
        return contains(FIELD_Key);
    }

    /**
     * Remover for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public void removeKey() {
        remove(FIELD_Key);
    }

    /**
     * Getter for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public String getKey(GetMode mode) {
        return obtainDirect(FIELD_Key, String.class, mode);
    }

    /**
     * Getter for key
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupingBucket.Fields#key
     */
    @Nonnull
    public String getKey() {
        return obtainDirect(FIELD_Key, String.class, GetMode.STRICT);
    }

    /**
     * Setter for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public GroupingBucket setKey(String value, SetMode mode) {
        putDirect(FIELD_Key, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for key
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#key
     */
    public GroupingBucket setKey(
        @Nonnull
        String value) {
        putDirect(FIELD_Key, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public boolean hasTimeWindowSize() {
        return contains(FIELD_TimeWindowSize);
    }

    /**
     * Remover for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public void removeTimeWindowSize() {
        remove(FIELD_TimeWindowSize);
    }

    /**
     * Getter for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public TimeWindowSize getTimeWindowSize(GetMode mode) {
        return obtainWrapped(FIELD_TimeWindowSize, TimeWindowSize.class, mode);
    }

    /**
     * Getter for timeWindowSize
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GroupingBucket.Fields#timeWindowSize
     */
    @Nullable
    public TimeWindowSize getTimeWindowSize() {
        return obtainWrapped(FIELD_TimeWindowSize, TimeWindowSize.class, GetMode.STRICT);
    }

    /**
     * Setter for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public GroupingBucket setTimeWindowSize(TimeWindowSize value, SetMode mode) {
        putWrapped(FIELD_TimeWindowSize, TimeWindowSize.class, value, mode);
        return this;
    }

    /**
     * Setter for timeWindowSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public GroupingBucket setTimeWindowSize(
        @Nonnull
        TimeWindowSize value) {
        putWrapped(FIELD_TimeWindowSize, TimeWindowSize.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GroupingBucket clone()
        throws CloneNotSupportedException
    {
        return ((GroupingBucket) super.clone());
    }

    @Override
    public GroupingBucket copy()
        throws CloneNotSupportedException
    {
        return ((GroupingBucket) super.copy());
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
         * Type of the grouping bucket.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Key that specifies the column name to be used as the timestamp field for bucketing.
         * 
         */
        public PathSpec key() {
            return new PathSpec(getPathComponents(), "key");
        }

        /**
         * Bucket size (like a day/hour etc) for the date grouping buckets.
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields timeWindowSize() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "timeWindowSize");
        }

    }

}
