
package com.linkedin.common;

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
import com.linkedin.data.template.StringArray;


/**
 * Shared aspect containing Browse Paths to be indexed for an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BrowsePaths.pdl.")
public class BrowsePaths
    extends RecordTemplate
{

    private final static BrowsePaths.Fields _fields = new BrowsePaths.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Paths = SCHEMA.getField("paths");

    public BrowsePaths() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public BrowsePaths(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowsePaths.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public boolean hasPaths() {
        return contains(FIELD_Paths);
    }

    /**
     * Remover for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public void removePaths() {
        remove(FIELD_Paths);
    }

    /**
     * Getter for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public StringArray getPaths(GetMode mode) {
        return obtainWrapped(FIELD_Paths, StringArray.class, mode);
    }

    /**
     * Getter for paths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowsePaths.Fields#paths
     */
    @Nonnull
    public StringArray getPaths() {
        return obtainWrapped(FIELD_Paths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public BrowsePaths setPaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_Paths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for paths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowsePaths.Fields#paths
     */
    public BrowsePaths setPaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Paths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowsePaths clone()
        throws CloneNotSupportedException
    {
        return ((BrowsePaths) super.clone());
    }

    @Override
    public BrowsePaths copy()
        throws CloneNotSupportedException
    {
        return ((BrowsePaths) super.copy());
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
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public PathSpec paths() {
            return new PathSpec(getPathComponents(), "paths");
        }

        /**
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public PathSpec paths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "paths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
