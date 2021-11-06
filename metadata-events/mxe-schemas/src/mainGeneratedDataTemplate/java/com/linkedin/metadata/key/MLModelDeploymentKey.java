
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.FabricType;
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
 * Key for an ML model deployment
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/MLModelDeploymentKey.pdl.")
public class MLModelDeploymentKey
    extends RecordTemplate
{

    private final static MLModelDeploymentKey.Fields _fields = new MLModelDeploymentKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an ML model deployment*/@Aspect.name=\"mlModelDeploymentKey\"record MLModelDeploymentKey{/**Standardized platform urn for the model Deployment*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModelDeployment*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model Deployment belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MLModelDeploymentKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public MLModelDeploymentKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelDeploymentKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for platform
     * 
     * @see MLModelDeploymentKey.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see MLModelDeploymentKey.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see MLModelDeploymentKey.Fields#platform
     */
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDeploymentKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see MLModelDeploymentKey.Fields#platform
     */
    public MLModelDeploymentKey setPlatform(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentKey.Fields#platform
     */
    public MLModelDeploymentKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLModelDeploymentKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLModelDeploymentKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLModelDeploymentKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDeploymentKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLModelDeploymentKey.Fields#name
     */
    public MLModelDeploymentKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentKey.Fields#name
     */
    public MLModelDeploymentKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see MLModelDeploymentKey.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see MLModelDeploymentKey.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see MLModelDeploymentKey.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDeploymentKey.Fields#origin
     */
    @Nonnull
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see MLModelDeploymentKey.Fields#origin
     */
    public MLModelDeploymentKey setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentKey.Fields#origin
     */
    public MLModelDeploymentKey setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelDeploymentKey clone()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentKey) super.clone());
    }

    @Override
    public MLModelDeploymentKey copy()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentKey) super.copy());
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
         * Standardized platform urn for the model Deployment
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Name of the MLModelDeployment
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fabric type where model Deployment belongs to or where it was generated
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

    }

}
