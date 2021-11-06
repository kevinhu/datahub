
package com.linkedin.metadata.search;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class FilterValue
    extends RecordTemplate
{

    private final static FilterValue.Fields _fields = new FilterValue.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search,record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_FacetCount = SCHEMA.getField("facetCount");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FilterValue() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public FilterValue(DataMap data) {
        super(data, SCHEMA);
    }

    public static FilterValue.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for value
     * 
     * @see FilterValue.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see FilterValue.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see FilterValue.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FilterValue.Fields#value
     */
    @Nonnull
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see FilterValue.Fields#value
     */
    public FilterValue setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#value
     */
    public FilterValue setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public boolean hasEntity() {
        return contains(FIELD_Entity);
    }

    /**
     * Remover for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public void removeEntity() {
        remove(FIELD_Entity);
    }

    /**
     * Getter for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FilterValue.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity() {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public FilterValue setEntity(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#entity
     */
    public FilterValue setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public boolean hasFacetCount() {
        return contains(FIELD_FacetCount);
    }

    /**
     * Remover for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public void removeFacetCount() {
        remove(FIELD_FacetCount);
    }

    /**
     * Getter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public Long getFacetCount(GetMode mode) {
        return obtainDirect(FIELD_FacetCount, Long.class, mode);
    }

    /**
     * Getter for facetCount
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FilterValue.Fields#facetCount
     */
    @Nonnull
    public Long getFacetCount() {
        return obtainDirect(FIELD_FacetCount, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(Long value, SetMode mode) {
        putDirect(FIELD_FacetCount, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for facetCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_FacetCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(long value) {
        putDirect(FIELD_FacetCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public FilterValue clone()
        throws CloneNotSupportedException
    {
        return ((FilterValue) super.clone());
    }

    @Override
    public FilterValue copy()
        throws CloneNotSupportedException
    {
        return ((FilterValue) super.copy());
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

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        public PathSpec facetCount() {
            return new PathSpec(getPathComponents(), "facetCount");
        }

    }

}
