
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
public class Quantile
    extends RecordTemplate
{

    private final static Quantile.Fields _fields = new Quantile.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record Quantile{quantile:string,value:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Quantile = SCHEMA.getField("quantile");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");

    public Quantile() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public Quantile(DataMap data) {
        super(data, SCHEMA);
    }

    public static Quantile.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public boolean hasQuantile() {
        return contains(FIELD_Quantile);
    }

    /**
     * Remover for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public void removeQuantile() {
        remove(FIELD_Quantile);
    }

    /**
     * Getter for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public String getQuantile(GetMode mode) {
        return obtainDirect(FIELD_Quantile, String.class, mode);
    }

    /**
     * Getter for quantile
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Quantile.Fields#quantile
     */
    @Nonnull
    public String getQuantile() {
        return obtainDirect(FIELD_Quantile, String.class, GetMode.STRICT);
    }

    /**
     * Setter for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public Quantile setQuantile(String value, SetMode mode) {
        putDirect(FIELD_Quantile, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for quantile
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Quantile.Fields#quantile
     */
    public Quantile setQuantile(
        @Nonnull
        String value) {
        putDirect(FIELD_Quantile, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see Quantile.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see Quantile.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see Quantile.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Quantile.Fields#value
     */
    @Nonnull
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see Quantile.Fields#value
     */
    public Quantile setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Quantile.Fields#value
     */
    public Quantile setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Quantile clone()
        throws CloneNotSupportedException
    {
        return ((Quantile) super.clone());
    }

    @Override
    public Quantile copy()
        throws CloneNotSupportedException
    {
        return ((Quantile) super.copy());
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

        public PathSpec quantile() {
            return new PathSpec(getPathComponents(), "quantile");
        }

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

    }

}
