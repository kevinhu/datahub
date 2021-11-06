
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
 * Schema text of an espresso table schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EspressoSchema.pdl.")
public class EspressoSchema
    extends RecordTemplate
{

    private final static EspressoSchema.Fields _fields = new EspressoSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DocumentSchema = SCHEMA.getField("documentSchema");
    private final static RecordDataSchema.Field FIELD_TableSchema = SCHEMA.getField("tableSchema");

    public EspressoSchema() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public EspressoSchema(DataMap data) {
        super(data, SCHEMA);
    }

    public static EspressoSchema.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public boolean hasDocumentSchema() {
        return contains(FIELD_DocumentSchema);
    }

    /**
     * Remover for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public void removeDocumentSchema() {
        remove(FIELD_DocumentSchema);
    }

    /**
     * Getter for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public String getDocumentSchema(GetMode mode) {
        return obtainDirect(FIELD_DocumentSchema, String.class, mode);
    }

    /**
     * Getter for documentSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EspressoSchema.Fields#documentSchema
     */
    @Nonnull
    public String getDocumentSchema() {
        return obtainDirect(FIELD_DocumentSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public EspressoSchema setDocumentSchema(String value, SetMode mode) {
        putDirect(FIELD_DocumentSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for documentSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EspressoSchema.Fields#documentSchema
     */
    public EspressoSchema setDocumentSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_DocumentSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public boolean hasTableSchema() {
        return contains(FIELD_TableSchema);
    }

    /**
     * Remover for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public void removeTableSchema() {
        remove(FIELD_TableSchema);
    }

    /**
     * Getter for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public String getTableSchema(GetMode mode) {
        return obtainDirect(FIELD_TableSchema, String.class, mode);
    }

    /**
     * Getter for tableSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EspressoSchema.Fields#tableSchema
     */
    @Nonnull
    public String getTableSchema() {
        return obtainDirect(FIELD_TableSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public EspressoSchema setTableSchema(String value, SetMode mode) {
        putDirect(FIELD_TableSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for tableSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EspressoSchema.Fields#tableSchema
     */
    public EspressoSchema setTableSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_TableSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EspressoSchema clone()
        throws CloneNotSupportedException
    {
        return ((EspressoSchema) super.clone());
    }

    @Override
    public EspressoSchema copy()
        throws CloneNotSupportedException
    {
        return ((EspressoSchema) super.copy());
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
         * The native espresso document schema.
         * 
         */
        public PathSpec documentSchema() {
            return new PathSpec(getPathComponents(), "documentSchema");
        }

        /**
         * The espresso table schema definition.
         * 
         */
        public PathSpec tableSchema() {
            return new PathSpec(getPathComponents(), "tableSchema");
        }

    }

}
