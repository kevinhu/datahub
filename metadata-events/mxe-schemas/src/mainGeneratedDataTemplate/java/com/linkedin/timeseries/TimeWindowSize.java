
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
 * Defines the size of a time window.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeWindowSize.pdl.")
public class TimeWindowSize
    extends RecordTemplate
{

    private final static TimeWindowSize.Fields _fields = new TimeWindowSize.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Unit = SCHEMA.getField("unit");
    private final static RecordDataSchema.Field FIELD_Multiple = SCHEMA.getField("multiple");

    public TimeWindowSize() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public TimeWindowSize(DataMap data) {
        super(data, SCHEMA);
    }

    public static TimeWindowSize.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for unit
     * 
     * @see TimeWindowSize.Fields#unit
     */
    public boolean hasUnit() {
        return contains(FIELD_Unit);
    }

    /**
     * Remover for unit
     * 
     * @see TimeWindowSize.Fields#unit
     */
    public void removeUnit() {
        remove(FIELD_Unit);
    }

    /**
     * Getter for unit
     * 
     * @see TimeWindowSize.Fields#unit
     */
    public CalendarInterval getUnit(GetMode mode) {
        return obtainDirect(FIELD_Unit, CalendarInterval.class, mode);
    }

    /**
     * Getter for unit
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindowSize.Fields#unit
     */
    @Nonnull
    public CalendarInterval getUnit() {
        return obtainDirect(FIELD_Unit, CalendarInterval.class, GetMode.STRICT);
    }

    /**
     * Setter for unit
     * 
     * @see TimeWindowSize.Fields#unit
     */
    public TimeWindowSize setUnit(CalendarInterval value, SetMode mode) {
        putDirect(FIELD_Unit, CalendarInterval.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for unit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindowSize.Fields#unit
     */
    public TimeWindowSize setUnit(
        @Nonnull
        CalendarInterval value) {
        putDirect(FIELD_Unit, CalendarInterval.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public boolean hasMultiple() {
        return contains(FIELD_Multiple);
    }

    /**
     * Remover for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public void removeMultiple() {
        remove(FIELD_Multiple);
    }

    /**
     * Getter for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public Integer getMultiple(GetMode mode) {
        return obtainDirect(FIELD_Multiple, Integer.class, mode);
    }

    /**
     * Getter for multiple
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindowSize.Fields#multiple
     */
    @Nonnull
    public Integer getMultiple() {
        return obtainDirect(FIELD_Multiple, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(Integer value, SetMode mode) {
        putDirect(FIELD_Multiple, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for multiple
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Multiple, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(int value) {
        putDirect(FIELD_Multiple, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TimeWindowSize clone()
        throws CloneNotSupportedException
    {
        return ((TimeWindowSize) super.clone());
    }

    @Override
    public TimeWindowSize copy()
        throws CloneNotSupportedException
    {
        return ((TimeWindowSize) super.copy());
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
         * Interval unit such as minute/hour/day etc.
         * 
         */
        public PathSpec unit() {
            return new PathSpec(getPathComponents(), "unit");
        }

        /**
         * How many units. Defaults to 1.
         * 
         */
        public PathSpec multiple() {
            return new PathSpec(getPathComponents(), "multiple");
        }

    }

}
