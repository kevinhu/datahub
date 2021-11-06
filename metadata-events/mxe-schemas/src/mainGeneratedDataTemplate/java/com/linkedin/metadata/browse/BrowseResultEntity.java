
package com.linkedin.metadata.browse;

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
 * Data model for an entity returned as part of a browse query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultEntity.pdl.")
public class BrowseResultEntity
    extends RecordTemplate
{

    private final static BrowseResultEntity.Fields _fields = new BrowseResultEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**Data model for an entity returned as part of a browse query*/record BrowseResultEntity{/**Name of the entity*/name:optional string/**URN of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public BrowseResultEntity() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public BrowseResultEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowseResultEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see BrowseResultEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see BrowseResultEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see BrowseResultEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BrowseResultEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see BrowseResultEntity.Fields#name
     */
    public BrowseResultEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultEntity.Fields#name
     */
    public BrowseResultEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see BrowseResultEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see BrowseResultEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see BrowseResultEntity.Fields#urn
     */
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see BrowseResultEntity.Fields#urn
     */
    public BrowseResultEntity setUrn(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultEntity.Fields#urn
     */
    public BrowseResultEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowseResultEntity clone()
        throws CloneNotSupportedException
    {
        return ((BrowseResultEntity) super.clone());
    }

    @Override
    public BrowseResultEntity copy()
        throws CloneNotSupportedException
    {
        return ((BrowseResultEntity) super.copy());
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
         * Name of the entity
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * URN of the entity
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

    }

}
