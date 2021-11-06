
package com.linkedin.metadata.recommendation;

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
 * Params about the recommended content
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/ContentParams.pdl.")
public class ContentParams
    extends RecordTemplate
{

    private final static ContentParams.Fields _fields = new ContentParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public ContentParams() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ContentParams(DataMap data) {
        super(data, SCHEMA);
    }

    public static ContentParams.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for count
     * 
     * @see ContentParams.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see ContentParams.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see ContentParams.Fields#count
     */
    public Long getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Long.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ContentParams.Fields#count
     */
    @Nonnull
    public Long getCount() {
        return obtainDirect(FIELD_Count, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(Long value, SetMode mode) {
        putDirect(FIELD_Count, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_Count, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(long value) {
        putDirect(FIELD_Count, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ContentParams clone()
        throws CloneNotSupportedException
    {
        return ((ContentParams) super.clone());
    }

    @Override
    public ContentParams copy()
        throws CloneNotSupportedException
    {
        return ((ContentParams) super.copy());
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
         * Number of entities corresponding to the recommended content
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

}
