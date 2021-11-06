
package com.linkedin.schema;

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
 * Schema holder for kafka schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/KafkaSchema.pdl.")
public class KafkaSchema
    extends RecordTemplate
{

    private final static KafkaSchema.Fields _fields = new KafkaSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DocumentSchema = SCHEMA.getField("documentSchema");
    private final static RecordDataSchema.Field FIELD_KeySchema = SCHEMA.getField("keySchema");

    public KafkaSchema() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public KafkaSchema(DataMap data) {
        super(data, SCHEMA);
    }

    public static KafkaSchema.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
     */
    public boolean hasDocumentSchema() {
        return contains(FIELD_DocumentSchema);
    }

    /**
     * Remover for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
     */
    public void removeDocumentSchema() {
        remove(FIELD_DocumentSchema);
    }

    /**
     * Getter for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
     */
    public String getDocumentSchema(GetMode mode) {
        return obtainDirect(FIELD_DocumentSchema, String.class, mode);
    }

    /**
     * Getter for documentSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KafkaSchema.Fields#documentSchema
     */
    @Nonnull
    public String getDocumentSchema() {
        return obtainDirect(FIELD_DocumentSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
     */
    public KafkaSchema setDocumentSchema(String value, SetMode mode) {
        putDirect(FIELD_DocumentSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for documentSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaSchema.Fields#documentSchema
     */
    public KafkaSchema setDocumentSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_DocumentSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public boolean hasKeySchema() {
        return contains(FIELD_KeySchema);
    }

    /**
     * Remover for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public void removeKeySchema() {
        remove(FIELD_KeySchema);
    }

    /**
     * Getter for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public String getKeySchema(GetMode mode) {
        return obtainDirect(FIELD_KeySchema, String.class, mode);
    }

    /**
     * Getter for keySchema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaSchema.Fields#keySchema
     */
    @Nullable
    public String getKeySchema() {
        return obtainDirect(FIELD_KeySchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public KafkaSchema setKeySchema(String value, SetMode mode) {
        putDirect(FIELD_KeySchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for keySchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaSchema.Fields#keySchema
     */
    public KafkaSchema setKeySchema(
        @Nonnull
        String value) {
        putDirect(FIELD_KeySchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public KafkaSchema clone()
        throws CloneNotSupportedException
    {
        return ((KafkaSchema) super.clone());
    }

    @Override
    public KafkaSchema copy()
        throws CloneNotSupportedException
    {
        return ((KafkaSchema) super.copy());
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
         * The native kafka document schema. This is a human readable avro document schema.
         * 
         */
        public PathSpec documentSchema() {
            return new PathSpec(getPathComponents(), "documentSchema");
        }

        /**
         * The native kafka key schema as retrieved from Schema Registry
         * 
         */
        public PathSpec keySchema() {
            return new PathSpec(getPathComponents(), "keySchema");
        }

    }

}
