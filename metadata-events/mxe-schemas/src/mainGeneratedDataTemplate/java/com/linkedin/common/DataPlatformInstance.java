
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Tag aspect used for applying tags to an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/DataPlatformInstance.pdl.")
public class DataPlatformInstance
    extends RecordTemplate
{

    private final static DataPlatformInstance.Fields _fields = new DataPlatformInstance.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Instance of the data platform (e.g. db instance)*/instance:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Instance = SCHEMA.getField("instance");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataPlatformInstance() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public DataPlatformInstance(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataPlatformInstance.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for platform
     * 
     * @see DataPlatformInstance.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see DataPlatformInstance.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see DataPlatformInstance.Fields#platform
     */
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInstance.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see DataPlatformInstance.Fields#platform
     */
    public DataPlatformInstance setPlatform(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInstance.Fields#platform
     */
    public DataPlatformInstance setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    public boolean hasInstance() {
        return contains(FIELD_Instance);
    }

    /**
     * Remover for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    public void removeInstance() {
        remove(FIELD_Instance);
    }

    /**
     * Getter for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    public String getInstance(GetMode mode) {
        return obtainDirect(FIELD_Instance, String.class, mode);
    }

    /**
     * Getter for instance
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInstance.Fields#instance
     */
    @Nullable
    public String getInstance() {
        return obtainDirect(FIELD_Instance, String.class, GetMode.STRICT);
    }

    /**
     * Setter for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    public DataPlatformInstance setInstance(String value, SetMode mode) {
        putDirect(FIELD_Instance, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for instance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInstance.Fields#instance
     */
    public DataPlatformInstance setInstance(
        @Nonnull
        String value) {
        putDirect(FIELD_Instance, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataPlatformInstance clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformInstance) super.clone());
    }

    @Override
    public DataPlatformInstance copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformInstance) super.copy());
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
         * Data Platform
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Instance of the data platform (e.g. db instance)
         * 
         */
        public PathSpec instance() {
            return new PathSpec(getPathComponents(), "instance");
        }

    }

}
