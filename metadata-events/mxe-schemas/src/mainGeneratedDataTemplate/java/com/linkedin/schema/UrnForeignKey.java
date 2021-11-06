
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
 * If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/UrnForeignKey.pdl.")
public class UrnForeignKey
    extends RecordTemplate
{

    private final static UrnForeignKey.Fields _fields = new UrnForeignKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CurrentFieldPath = SCHEMA.getField("currentFieldPath");

    public UrnForeignKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public UrnForeignKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static UrnForeignKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public boolean hasCurrentFieldPath() {
        return contains(FIELD_CurrentFieldPath);
    }

    /**
     * Remover for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public void removeCurrentFieldPath() {
        remove(FIELD_CurrentFieldPath);
    }

    /**
     * Getter for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public String getCurrentFieldPath(GetMode mode) {
        return obtainDirect(FIELD_CurrentFieldPath, String.class, mode);
    }

    /**
     * Getter for currentFieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    @Nonnull
    public String getCurrentFieldPath() {
        return obtainDirect(FIELD_CurrentFieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public UrnForeignKey setCurrentFieldPath(String value, SetMode mode) {
        putDirect(FIELD_CurrentFieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for currentFieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public UrnForeignKey setCurrentFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_CurrentFieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UrnForeignKey clone()
        throws CloneNotSupportedException
    {
        return ((UrnForeignKey) super.clone());
    }

    @Override
    public UrnForeignKey copy()
        throws CloneNotSupportedException
    {
        return ((UrnForeignKey) super.copy());
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
         * Field in hosting(current) SchemaMetadata.
         * 
         */
        public PathSpec currentFieldPath() {
            return new PathSpec(getPathComponents(), "currentFieldPath");
        }

    }

}
