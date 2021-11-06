
package com.linkedin.metadata.key;

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
 * Key for an MLPrimaryKey
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/MLPrimaryKeyKey.pdl.")
public class MLPrimaryKeyKey
    extends RecordTemplate
{

    private final static MLPrimaryKeyKey.Fields _fields = new MLPrimaryKeyKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyKey\"record MLPrimaryKeyKey{/**Namespace for the primary key*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the primary key*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FeatureNamespace = SCHEMA.getField("featureNamespace");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    public MLPrimaryKeyKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public MLPrimaryKeyKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLPrimaryKeyKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for featureNamespace
     * 
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    public boolean hasFeatureNamespace() {
        return contains(FIELD_FeatureNamespace);
    }

    /**
     * Remover for featureNamespace
     * 
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    public void removeFeatureNamespace() {
        remove(FIELD_FeatureNamespace);
    }

    /**
     * Getter for featureNamespace
     * 
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    public String getFeatureNamespace(GetMode mode) {
        return obtainDirect(FIELD_FeatureNamespace, String.class, mode);
    }

    /**
     * Getter for featureNamespace
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    @Nonnull
    public String getFeatureNamespace() {
        return obtainDirect(FIELD_FeatureNamespace, String.class, GetMode.STRICT);
    }

    /**
     * Setter for featureNamespace
     * 
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    public MLPrimaryKeyKey setFeatureNamespace(String value, SetMode mode) {
        putDirect(FIELD_FeatureNamespace, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for featureNamespace
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLPrimaryKeyKey.Fields#featureNamespace
     */
    public MLPrimaryKeyKey setFeatureNamespace(
        @Nonnull
        String value) {
        putDirect(FIELD_FeatureNamespace, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLPrimaryKeyKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLPrimaryKeyKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLPrimaryKeyKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLPrimaryKeyKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLPrimaryKeyKey.Fields#name
     */
    public MLPrimaryKeyKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLPrimaryKeyKey.Fields#name
     */
    public MLPrimaryKeyKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLPrimaryKeyKey clone()
        throws CloneNotSupportedException
    {
        return ((MLPrimaryKeyKey) super.clone());
    }

    @Override
    public MLPrimaryKeyKey copy()
        throws CloneNotSupportedException
    {
        return ((MLPrimaryKeyKey) super.copy());
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
         * Namespace for the primary key
         * 
         */
        public PathSpec featureNamespace() {
            return new PathSpec(getPathComponents(), "featureNamespace");
        }

        /**
         * Name of the primary key
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
