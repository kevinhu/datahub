
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResult.pdl.")
public class BrowseResultGroup
    extends RecordTemplate
{

    private final static BrowseResultGroup.Fields _fields = new BrowseResultGroup.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse,record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public BrowseResultGroup() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public BrowseResultGroup(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowseResultGroup.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see BrowseResultGroup.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see BrowseResultGroup.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see BrowseResultGroup.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultGroup.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see BrowseResultGroup.Fields#name
     */
    public BrowseResultGroup setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultGroup.Fields#name
     */
    public BrowseResultGroup setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public Long getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Long.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultGroup.Fields#count
     */
    @Nonnull
    public Long getCount() {
        return obtainDirect(FIELD_Count, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(Long value, SetMode mode) {
        putDirect(FIELD_Count, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_Count, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(long value) {
        putDirect(FIELD_Count, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowseResultGroup clone()
        throws CloneNotSupportedException
    {
        return ((BrowseResultGroup) super.clone());
    }

    @Override
    public BrowseResultGroup copy()
        throws CloneNotSupportedException
    {
        return ((BrowseResultGroup) super.copy());
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
         * Name of the group
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Number of entities that can be reached from this path
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

}
