
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
 * Key for a Data Platform
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataPlatformKey.pdl.")
public class DataPlatformKey
    extends RecordTemplate
{

    private final static DataPlatformKey.Fields _fields = new DataPlatformKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_PlatformName = SCHEMA.getField("platformName");

    public DataPlatformKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DataPlatformKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataPlatformKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public boolean hasPlatformName() {
        return contains(FIELD_PlatformName);
    }

    /**
     * Remover for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public void removePlatformName() {
        remove(FIELD_PlatformName);
    }

    /**
     * Getter for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public String getPlatformName(GetMode mode) {
        return obtainDirect(FIELD_PlatformName, String.class, mode);
    }

    /**
     * Getter for platformName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformKey.Fields#platformName
     */
    @Nonnull
    public String getPlatformName() {
        return obtainDirect(FIELD_PlatformName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public DataPlatformKey setPlatformName(String value, SetMode mode) {
        putDirect(FIELD_PlatformName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platformName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformKey.Fields#platformName
     */
    public DataPlatformKey setPlatformName(
        @Nonnull
        String value) {
        putDirect(FIELD_PlatformName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataPlatformKey clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformKey) super.clone());
    }

    @Override
    public DataPlatformKey copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformKey) super.copy());
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
         * Data platform name i.e. hdfs, oracle, espresso
         * 
         */
        public PathSpec platformName() {
            return new PathSpec(getPathComponents(), "platformName");
        }

    }

}
