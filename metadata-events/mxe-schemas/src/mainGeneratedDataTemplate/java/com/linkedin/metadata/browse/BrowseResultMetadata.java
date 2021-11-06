
package com.linkedin.metadata.browse;

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
 * The model for browse result metadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultMetadata.pdl.")
public class BrowseResultMetadata
    extends RecordTemplate
{

    private final static BrowseResultMetadata.Fields _fields = new BrowseResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**Total number of entities we can reach from path*/totalNumEntities:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static RecordDataSchema.Field FIELD_TotalNumEntities = SCHEMA.getField("totalNumEntities");

    public BrowseResultMetadata() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public BrowseResultMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowseResultMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public boolean hasPath() {
        return contains(FIELD_Path);
    }

    /**
     * Remover for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public void removePath() {
        remove(FIELD_Path);
    }

    /**
     * Getter for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public String getPath(GetMode mode) {
        return obtainDirect(FIELD_Path, String.class, mode);
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultMetadata.Fields#path
     */
    @Nonnull
    public String getPath() {
        return obtainDirect(FIELD_Path, String.class, GetMode.STRICT);
    }

    /**
     * Setter for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public BrowseResultMetadata setPath(String value, SetMode mode) {
        putDirect(FIELD_Path, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultMetadata.Fields#path
     */
    public BrowseResultMetadata setPath(
        @Nonnull
        String value) {
        putDirect(FIELD_Path, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public boolean hasTotalNumEntities() {
        return contains(FIELD_TotalNumEntities);
    }

    /**
     * Remover for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public void removeTotalNumEntities() {
        remove(FIELD_TotalNumEntities);
    }

    /**
     * Getter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public Long getTotalNumEntities(GetMode mode) {
        return obtainDirect(FIELD_TotalNumEntities, Long.class, mode);
    }

    /**
     * Getter for totalNumEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    @Nonnull
    public Long getTotalNumEntities() {
        return obtainDirect(FIELD_TotalNumEntities, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(Long value, SetMode mode) {
        putDirect(FIELD_TotalNumEntities, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for totalNumEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(
        @Nonnull
        Long value) {
        putDirect(FIELD_TotalNumEntities, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(long value) {
        putDirect(FIELD_TotalNumEntities, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowseResultMetadata clone()
        throws CloneNotSupportedException
    {
        return ((BrowseResultMetadata) super.clone());
    }

    @Override
    public BrowseResultMetadata copy()
        throws CloneNotSupportedException
    {
        return ((BrowseResultMetadata) super.copy());
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
         * Path that is being browsed
         * 
         */
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * Total number of entities we can reach from path
         * 
         */
        public PathSpec totalNumEntities() {
            return new PathSpec(getPathComponents(), "totalNumEntities");
        }

    }

}
