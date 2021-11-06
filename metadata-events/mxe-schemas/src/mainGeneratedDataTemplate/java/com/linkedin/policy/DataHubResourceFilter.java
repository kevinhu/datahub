
package com.linkedin.policy;

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
import com.linkedin.data.template.StringArray;


/**
 * Information used to filter DataHub resource.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/DataHubResourceFilter.pdl.")
public class DataHubResourceFilter
    extends RecordTemplate
{

    private final static DataHubResourceFilter.Fields _fields = new DataHubResourceFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Resources = SCHEMA.getField("resources");
    private final static RecordDataSchema.Field FIELD_AllResources = SCHEMA.getField("allResources");

    public DataHubResourceFilter() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public DataHubResourceFilter(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubResourceFilter.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    public String getType(GetMode mode) {
        return obtainDirect(FIELD_Type, String.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#type
     */
    @Nullable
    public String getType() {
        return obtainDirect(FIELD_Type, String.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    public DataHubResourceFilter setType(String value, SetMode mode) {
        putDirect(FIELD_Type, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#type
     */
    public DataHubResourceFilter setType(
        @Nonnull
        String value) {
        putDirect(FIELD_Type, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    public boolean hasResources() {
        return contains(FIELD_Resources);
    }

    /**
     * Remover for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    public void removeResources() {
        remove(FIELD_Resources);
    }

    /**
     * Getter for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    public StringArray getResources(GetMode mode) {
        return obtainWrapped(FIELD_Resources, StringArray.class, mode);
    }

    /**
     * Getter for resources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#resources
     */
    @Nullable
    public StringArray getResources() {
        return obtainWrapped(FIELD_Resources, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    public DataHubResourceFilter setResources(StringArray value, SetMode mode) {
        putWrapped(FIELD_Resources, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for resources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#resources
     */
    public DataHubResourceFilter setResources(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Resources, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    public boolean hasAllResources() {
        return contains(FIELD_AllResources);
    }

    /**
     * Remover for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    public void removeAllResources() {
        remove(FIELD_AllResources);
    }

    /**
     * Getter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    public Boolean isAllResources(GetMode mode) {
        return obtainDirect(FIELD_AllResources, Boolean.class, mode);
    }

    /**
     * Getter for allResources
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Nonnull
    public Boolean isAllResources() {
        return obtainDirect(FIELD_AllResources, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    public DataHubResourceFilter setAllResources(Boolean value, SetMode mode) {
        putDirect(FIELD_AllResources, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for allResources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#allResources
     */
    public DataHubResourceFilter setAllResources(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_AllResources, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    public DataHubResourceFilter setAllResources(boolean value) {
        putDirect(FIELD_AllResources, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataHubResourceFilter clone()
        throws CloneNotSupportedException
    {
        return ((DataHubResourceFilter) super.clone());
    }

    @Override
    public DataHubResourceFilter copy()
        throws CloneNotSupportedException
    {
        return ((DataHubResourceFilter) super.copy());
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
         * The type of resource that the policy applies to. This will most often be a data asset entity name, for
         * example 'dataset'. It is not strictly required because in the future we will want to support filtering a resource
         * by domain, as well.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        public PathSpec resources() {
            return new PathSpec(getPathComponents(), "resources");
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        public PathSpec resources(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "resources");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether the policy should be applied to all assets matching the filter.
         * 
         */
        public PathSpec allResources() {
            return new PathSpec(getPathComponents(), "allResources");
        }

    }

}
