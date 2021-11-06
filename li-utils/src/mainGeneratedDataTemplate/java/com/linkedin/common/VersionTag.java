
package com.linkedin.common;

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
 * A resource-defined string representing the resource state for the purpose of concurrency control
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/VersionTag.pdl.")
public class VersionTag
    extends RecordTemplate
{

    private final static VersionTag.Fields _fields = new VersionTag.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_VersionTag = SCHEMA.getField("versionTag");

    public VersionTag() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public VersionTag(DataMap data) {
        super(data, SCHEMA);
    }

    public static VersionTag.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public boolean hasVersionTag() {
        return contains(FIELD_VersionTag);
    }

    /**
     * Remover for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public void removeVersionTag() {
        remove(FIELD_VersionTag);
    }

    /**
     * Getter for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public String getVersionTag(GetMode mode) {
        return obtainDirect(FIELD_VersionTag, String.class, mode);
    }

    /**
     * Getter for versionTag
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VersionTag.Fields#versionTag
     */
    @Nullable
    public String getVersionTag() {
        return obtainDirect(FIELD_VersionTag, String.class, GetMode.STRICT);
    }

    /**
     * Setter for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public VersionTag setVersionTag(String value, SetMode mode) {
        putDirect(FIELD_VersionTag, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for versionTag
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionTag.Fields#versionTag
     */
    public VersionTag setVersionTag(
        @Nonnull
        String value) {
        putDirect(FIELD_VersionTag, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public VersionTag clone()
        throws CloneNotSupportedException
    {
        return ((VersionTag) super.clone());
    }

    @Override
    public VersionTag copy()
        throws CloneNotSupportedException
    {
        return ((VersionTag) super.copy());
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

        public PathSpec versionTag() {
            return new PathSpec(getPathComponents(), "versionTag");
        }

    }

}
