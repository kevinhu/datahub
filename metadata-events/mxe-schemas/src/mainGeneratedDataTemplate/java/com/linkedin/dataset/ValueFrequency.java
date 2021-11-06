
package com.linkedin.dataset;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class ValueFrequency
    extends RecordTemplate
{

    private final static ValueFrequency.Fields _fields = new ValueFrequency.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record ValueFrequency{value:string,frequency:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Frequency = SCHEMA.getField("frequency");

    public ValueFrequency() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public ValueFrequency(DataMap data) {
        super(data, SCHEMA);
    }

    public static ValueFrequency.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for value
     * 
     * @see ValueFrequency.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see ValueFrequency.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see ValueFrequency.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ValueFrequency.Fields#value
     */
    @Nonnull
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see ValueFrequency.Fields#value
     */
    public ValueFrequency setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ValueFrequency.Fields#value
     */
    public ValueFrequency setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public boolean hasFrequency() {
        return contains(FIELD_Frequency);
    }

    /**
     * Remover for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public void removeFrequency() {
        remove(FIELD_Frequency);
    }

    /**
     * Getter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public Long getFrequency(GetMode mode) {
        return obtainDirect(FIELD_Frequency, Long.class, mode);
    }

    /**
     * Getter for frequency
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ValueFrequency.Fields#frequency
     */
    @Nonnull
    public Long getFrequency() {
        return obtainDirect(FIELD_Frequency, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(Long value, SetMode mode) {
        putDirect(FIELD_Frequency, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(
        @Nonnull
        Long value) {
        putDirect(FIELD_Frequency, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(long value) {
        putDirect(FIELD_Frequency, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ValueFrequency clone()
        throws CloneNotSupportedException
    {
        return ((ValueFrequency) super.clone());
    }

    @Override
    public ValueFrequency copy()
        throws CloneNotSupportedException
    {
        return ((ValueFrequency) super.copy());
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

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        public PathSpec frequency() {
            return new PathSpec(getPathComponents(), "frequency");
        }

    }

}
