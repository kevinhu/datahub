
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
 * Schema text for Parquet schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ParquetSchema.pdl.")
public class ParquetSchema
    extends RecordTemplate
{

    private final static ParquetSchema.Fields _fields = new ParquetSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text for Parquet schema.*/record ParquetSchema{/**The native Parquet schema text.*/schema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");

    public ParquetSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ParquetSchema(DataMap data) {
        super(data, SCHEMA);
    }

    public static ParquetSchema.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public boolean hasSchema() {
        return contains(FIELD_Schema);
    }

    /**
     * Remover for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public void removeSchema() {
        remove(FIELD_Schema);
    }

    /**
     * Getter for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public String getSchema(GetMode mode) {
        return obtainDirect(FIELD_Schema, String.class, mode);
    }

    /**
     * Getter for schema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ParquetSchema.Fields#schema
     */
    @Nonnull
    public String getSchema() {
        return obtainDirect(FIELD_Schema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public ParquetSchema setSchema(String value, SetMode mode) {
        putDirect(FIELD_Schema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for schema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ParquetSchema.Fields#schema
     */
    public ParquetSchema setSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_Schema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ParquetSchema clone()
        throws CloneNotSupportedException
    {
        return ((ParquetSchema) super.clone());
    }

    @Override
    public ParquetSchema copy()
        throws CloneNotSupportedException
    {
        return ((ParquetSchema) super.copy());
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
         * The native Parquet schema text.
         * 
         */
        public PathSpec schema() {
            return new PathSpec(getPathComponents(), "schema");
        }

    }

}
