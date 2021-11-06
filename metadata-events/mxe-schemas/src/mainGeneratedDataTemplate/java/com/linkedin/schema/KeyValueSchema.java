
package com.linkedin.schema;

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
 * Schema text of a key-value store schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/KeyValueSchema.pdl.")
public class KeyValueSchema
    extends RecordTemplate
{

    private final static KeyValueSchema.Fields _fields = new KeyValueSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_KeySchema = SCHEMA.getField("keySchema");
    private final static RecordDataSchema.Field FIELD_ValueSchema = SCHEMA.getField("valueSchema");

    public KeyValueSchema() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public KeyValueSchema(DataMap data) {
        super(data, SCHEMA);
    }

    public static KeyValueSchema.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public boolean hasKeySchema() {
        return contains(FIELD_KeySchema);
    }

    /**
     * Remover for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public void removeKeySchema() {
        remove(FIELD_KeySchema);
    }

    /**
     * Getter for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public String getKeySchema(GetMode mode) {
        return obtainDirect(FIELD_KeySchema, String.class, mode);
    }

    /**
     * Getter for keySchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KeyValueSchema.Fields#keySchema
     */
    @Nonnull
    public String getKeySchema() {
        return obtainDirect(FIELD_KeySchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public KeyValueSchema setKeySchema(String value, SetMode mode) {
        putDirect(FIELD_KeySchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for keySchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KeyValueSchema.Fields#keySchema
     */
    public KeyValueSchema setKeySchema(
        @Nonnull
        String value) {
        putDirect(FIELD_KeySchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public boolean hasValueSchema() {
        return contains(FIELD_ValueSchema);
    }

    /**
     * Remover for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public void removeValueSchema() {
        remove(FIELD_ValueSchema);
    }

    /**
     * Getter for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public String getValueSchema(GetMode mode) {
        return obtainDirect(FIELD_ValueSchema, String.class, mode);
    }

    /**
     * Getter for valueSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KeyValueSchema.Fields#valueSchema
     */
    @Nonnull
    public String getValueSchema() {
        return obtainDirect(FIELD_ValueSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public KeyValueSchema setValueSchema(String value, SetMode mode) {
        putDirect(FIELD_ValueSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for valueSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KeyValueSchema.Fields#valueSchema
     */
    public KeyValueSchema setValueSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_ValueSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public KeyValueSchema clone()
        throws CloneNotSupportedException
    {
        return ((KeyValueSchema) super.clone());
    }

    @Override
    public KeyValueSchema copy()
        throws CloneNotSupportedException
    {
        return ((KeyValueSchema) super.copy());
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
         * The raw schema for the key in the key-value store.
         * 
         */
        public PathSpec keySchema() {
            return new PathSpec(getPathComponents(), "keySchema");
        }

        /**
         * The raw schema for the value in the key-value store.
         * 
         */
        public PathSpec valueSchema() {
            return new PathSpec(getPathComponents(), "valueSchema");
        }

    }

}
