
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
 * Key for an MLFeatureTable
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/MLFeatureTableKey.pdl.")
public class MLFeatureTableKey
    extends RecordTemplate
{

    private final static MLFeatureTableKey.Fields _fields = new MLFeatureTableKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an MLFeatureTable*/@Aspect.name=\"mlFeatureTableKey\"record MLFeatureTableKey{/**Data platform urn associated with the feature table*/@Relationship={\"name\":\"SourcePlatform\",\"entityTypes\":[\"dataPlatform\"]}platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the feature table*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MLFeatureTableKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public MLFeatureTableKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLFeatureTableKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureTableKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    public MLFeatureTableKey setPlatform(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableKey.Fields#platform
     */
    public MLFeatureTableKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureTableKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public MLFeatureTableKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableKey.Fields#name
     */
    public MLFeatureTableKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLFeatureTableKey clone()
        throws CloneNotSupportedException
    {
        return ((MLFeatureTableKey) super.clone());
    }

    @Override
    public MLFeatureTableKey copy()
        throws CloneNotSupportedException
    {
        return ((MLFeatureTableKey) super.copy());
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
         * Data platform urn associated with the feature table
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Name of the feature table
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
