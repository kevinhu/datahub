
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeWindow.pdl.")
public class TimeWindow
    extends RecordTemplate
{

    private final static TimeWindow.Fields _fields = new TimeWindow.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries,record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_StartTimeMillis = SCHEMA.getField("startTimeMillis");
    private final static RecordDataSchema.Field FIELD_Length = SCHEMA.getField("length");

    public TimeWindow() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public TimeWindow(DataMap data) {
        super(data, SCHEMA);
    }

    public static TimeWindow.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public boolean hasStartTimeMillis() {
        return contains(FIELD_StartTimeMillis);
    }

    /**
     * Remover for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public void removeStartTimeMillis() {
        remove(FIELD_StartTimeMillis);
    }

    /**
     * Getter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public Long getStartTimeMillis(GetMode mode) {
        return obtainDirect(FIELD_StartTimeMillis, Long.class, mode);
    }

    /**
     * Getter for startTimeMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindow.Fields#startTimeMillis
     */
    @Nonnull
    public Long getStartTimeMillis() {
        return obtainDirect(FIELD_StartTimeMillis, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(Long value, SetMode mode) {
        putDirect(FIELD_StartTimeMillis, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(
        @Nonnull
        Long value) {
        putDirect(FIELD_StartTimeMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(long value) {
        putDirect(FIELD_StartTimeMillis, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for length
     * 
     * @see TimeWindow.Fields#length
     */
    public boolean hasLength() {
        return contains(FIELD_Length);
    }

    /**
     * Remover for length
     * 
     * @see TimeWindow.Fields#length
     */
    public void removeLength() {
        remove(FIELD_Length);
    }

    /**
     * Getter for length
     * 
     * @see TimeWindow.Fields#length
     */
    public TimeWindowSize getLength(GetMode mode) {
        return obtainWrapped(FIELD_Length, TimeWindowSize.class, mode);
    }

    /**
     * Getter for length
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindow.Fields#length
     */
    @Nonnull
    public TimeWindowSize getLength() {
        return obtainWrapped(FIELD_Length, TimeWindowSize.class, GetMode.STRICT);
    }

    /**
     * Setter for length
     * 
     * @see TimeWindow.Fields#length
     */
    public TimeWindow setLength(TimeWindowSize value, SetMode mode) {
        putWrapped(FIELD_Length, TimeWindowSize.class, value, mode);
        return this;
    }

    /**
     * Setter for length
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindow.Fields#length
     */
    public TimeWindow setLength(
        @Nonnull
        TimeWindowSize value) {
        putWrapped(FIELD_Length, TimeWindowSize.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TimeWindow clone()
        throws CloneNotSupportedException
    {
        return ((TimeWindow) super.clone());
    }

    @Override
    public TimeWindow copy()
        throws CloneNotSupportedException
    {
        return ((TimeWindow) super.copy());
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
         * Start time as epoch at UTC.
         * 
         */
        public PathSpec startTimeMillis() {
            return new PathSpec(getPathComponents(), "startTimeMillis");
        }

        /**
         * The length of the window.
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields length() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "length");
        }

    }

}
