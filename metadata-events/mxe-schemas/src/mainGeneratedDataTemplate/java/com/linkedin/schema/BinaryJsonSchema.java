
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
 * Schema text of binary JSON schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/BinaryJsonSchema.pdl.")
public class BinaryJsonSchema
    extends RecordTemplate
{

    private final static BinaryJsonSchema.Fields _fields = new BinaryJsonSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");

    public BinaryJsonSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public BinaryJsonSchema(DataMap data) {
        super(data, SCHEMA);
    }

    public static BinaryJsonSchema.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
     */
    public boolean hasSchema() {
        return contains(FIELD_Schema);
    }

    /**
     * Remover for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
     */
    public void removeSchema() {
        remove(FIELD_Schema);
    }

    /**
     * Getter for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
     */
    public String getSchema(GetMode mode) {
        return obtainDirect(FIELD_Schema, String.class, mode);
    }

    /**
     * Getter for schema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BinaryJsonSchema.Fields#schema
     */
    @Nonnull
    public String getSchema() {
        return obtainDirect(FIELD_Schema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
     */
    public BinaryJsonSchema setSchema(String value, SetMode mode) {
        putDirect(FIELD_Schema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for schema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BinaryJsonSchema.Fields#schema
     */
    public BinaryJsonSchema setSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_Schema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BinaryJsonSchema clone()
        throws CloneNotSupportedException
    {
        return ((BinaryJsonSchema) super.clone());
    }

    @Override
    public BinaryJsonSchema copy()
        throws CloneNotSupportedException
    {
        return ((BinaryJsonSchema) super.copy());
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
         * The native schema text for binary JSON file format.
         * 
         */
        public PathSpec schema() {
            return new PathSpec(getPathComponents(), "schema");
        }

    }

}
