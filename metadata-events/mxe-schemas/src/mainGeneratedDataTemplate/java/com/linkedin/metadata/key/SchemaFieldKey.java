
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Key for a SchemaField
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/SchemaFieldKey.pdl.")
public class SchemaFieldKey
    extends RecordTemplate
{

    private final static SchemaFieldKey.Fields _fields = new SchemaFieldKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Parent = SCHEMA.getField("parent");
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SchemaFieldKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public SchemaFieldKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaFieldKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public boolean hasParent() {
        return contains(FIELD_Parent);
    }

    /**
     * Remover for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public void removeParent() {
        remove(FIELD_Parent);
    }

    /**
     * Getter for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public com.linkedin.common.urn.Urn getParent(GetMode mode) {
        return obtainCustomType(FIELD_Parent, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for parent
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldKey.Fields#parent
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getParent() {
        return obtainCustomType(FIELD_Parent, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public SchemaFieldKey setParent(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Parent, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for parent
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldKey.Fields#parent
     */
    public SchemaFieldKey setParent(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Parent, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldKey.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public SchemaFieldKey setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public SchemaFieldKey setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaFieldKey clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldKey) super.clone());
    }

    @Override
    public SchemaFieldKey copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldKey) super.copy());
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
         * Parent associated with the schema field
         * 
         */
        public PathSpec parent() {
            return new PathSpec(getPathComponents(), "parent");
        }

        /**
         * fieldPath identifying the schema field
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

    }

}
