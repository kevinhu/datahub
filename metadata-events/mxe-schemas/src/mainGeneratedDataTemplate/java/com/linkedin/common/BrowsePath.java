
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BrowsePath.pdl.")
public class BrowsePath
    extends RecordTemplate
{

    private final static BrowsePath.Fields _fields = new BrowsePath.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common,record BrowsePath{/**An array of strings comprising the path*/path:array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");

    public BrowsePath() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public BrowsePath(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowsePath.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for path
     * 
     * @see BrowsePath.Fields#path
     */
    public boolean hasPath() {
        return contains(FIELD_Path);
    }

    /**
     * Remover for path
     * 
     * @see BrowsePath.Fields#path
     */
    public void removePath() {
        remove(FIELD_Path);
    }

    /**
     * Getter for path
     * 
     * @see BrowsePath.Fields#path
     */
    public StringArray getPath(GetMode mode) {
        return obtainWrapped(FIELD_Path, StringArray.class, mode);
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowsePath.Fields#path
     */
    @Nonnull
    public StringArray getPath() {
        return obtainWrapped(FIELD_Path, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for path
     * 
     * @see BrowsePath.Fields#path
     */
    public BrowsePath setPath(StringArray value, SetMode mode) {
        putWrapped(FIELD_Path, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowsePath.Fields#path
     */
    public BrowsePath setPath(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Path, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowsePath clone()
        throws CloneNotSupportedException
    {
        return ((BrowsePath) super.clone());
    }

    @Override
    public BrowsePath copy()
        throws CloneNotSupportedException
    {
        return ((BrowsePath) super.copy());
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
         * An array of strings comprising the path
         * 
         */
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * An array of strings comprising the path
         * 
         */
        public PathSpec path(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "path");
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
