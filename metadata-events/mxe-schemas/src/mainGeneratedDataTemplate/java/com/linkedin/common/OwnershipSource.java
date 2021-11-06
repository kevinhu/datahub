
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
 * Source/provider of the ownership information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OwnershipSource.pdl.")
public class OwnershipSource
    extends RecordTemplate
{

    private final static OwnershipSource.Fields _fields = new OwnershipSource.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Url = SCHEMA.getField("url");

    public OwnershipSource() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public OwnershipSource(DataMap data) {
        super(data, SCHEMA);
    }

    public static OwnershipSource.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for type
     * 
     * @see OwnershipSource.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see OwnershipSource.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see OwnershipSource.Fields#type
     */
    public OwnershipSourceType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, OwnershipSourceType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnershipSource.Fields#type
     */
    @Nonnull
    public OwnershipSourceType getType() {
        return obtainDirect(FIELD_Type, OwnershipSourceType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see OwnershipSource.Fields#type
     */
    public OwnershipSource setType(OwnershipSourceType value, SetMode mode) {
        putDirect(FIELD_Type, OwnershipSourceType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnershipSource.Fields#type
     */
    public OwnershipSource setType(
        @Nonnull
        OwnershipSourceType value) {
        putDirect(FIELD_Type, OwnershipSourceType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public boolean hasUrl() {
        return contains(FIELD_Url);
    }

    /**
     * Remover for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public void removeUrl() {
        remove(FIELD_Url);
    }

    /**
     * Getter for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public String getUrl(GetMode mode) {
        return obtainDirect(FIELD_Url, String.class, mode);
    }

    /**
     * Getter for url
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OwnershipSource.Fields#url
     */
    @Nullable
    public String getUrl() {
        return obtainDirect(FIELD_Url, String.class, GetMode.STRICT);
    }

    /**
     * Setter for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public OwnershipSource setUrl(String value, SetMode mode) {
        putDirect(FIELD_Url, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnershipSource.Fields#url
     */
    public OwnershipSource setUrl(
        @Nonnull
        String value) {
        putDirect(FIELD_Url, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public OwnershipSource clone()
        throws CloneNotSupportedException
    {
        return ((OwnershipSource) super.clone());
    }

    @Override
    public OwnershipSource copy()
        throws CloneNotSupportedException
    {
        return ((OwnershipSource) super.copy());
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
         * The type of the source
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A reference URL for the source
         * 
         */
        public PathSpec url() {
            return new PathSpec(getPathComponents(), "url");
        }

    }

}
