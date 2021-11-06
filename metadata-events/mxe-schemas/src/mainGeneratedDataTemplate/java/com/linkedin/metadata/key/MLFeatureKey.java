
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
 * Key for an MLFeature
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/MLFeatureKey.pdl.")
public class MLFeatureKey
    extends RecordTemplate
{

    private final static MLFeatureKey.Fields _fields = new MLFeatureKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FeatureNamespace = SCHEMA.getField("featureNamespace");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    public MLFeatureKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public MLFeatureKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLFeatureKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public boolean hasFeatureNamespace() {
        return contains(FIELD_FeatureNamespace);
    }

    /**
     * Remover for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public void removeFeatureNamespace() {
        remove(FIELD_FeatureNamespace);
    }

    /**
     * Getter for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public String getFeatureNamespace(GetMode mode) {
        return obtainDirect(FIELD_FeatureNamespace, String.class, mode);
    }

    /**
     * Getter for featureNamespace
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureKey.Fields#featureNamespace
     */
    @Nonnull
    public String getFeatureNamespace() {
        return obtainDirect(FIELD_FeatureNamespace, String.class, GetMode.STRICT);
    }

    /**
     * Setter for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public MLFeatureKey setFeatureNamespace(String value, SetMode mode) {
        putDirect(FIELD_FeatureNamespace, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for featureNamespace
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public MLFeatureKey setFeatureNamespace(
        @Nonnull
        String value) {
        putDirect(FIELD_FeatureNamespace, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLFeatureKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLFeatureKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLFeatureKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLFeatureKey.Fields#name
     */
    public MLFeatureKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureKey.Fields#name
     */
    public MLFeatureKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLFeatureKey clone()
        throws CloneNotSupportedException
    {
        return ((MLFeatureKey) super.clone());
    }

    @Override
    public MLFeatureKey copy()
        throws CloneNotSupportedException
    {
        return ((MLFeatureKey) super.copy());
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
         * Namespace for the feature
         * 
         */
        public PathSpec featureNamespace() {
            return new PathSpec(getPathComponents(), "featureNamespace");
        }

        /**
         * Name of the feature
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
