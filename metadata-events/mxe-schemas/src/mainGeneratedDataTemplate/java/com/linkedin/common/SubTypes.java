
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
 * Sub Types. Use this aspect to specialize a generic Entity
 * e.g. Making a Dataset also be a View or also be a LookerExplore
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/SubTypes.pdl.")
public class SubTypes
    extends RecordTemplate
{

    private final static SubTypes.Fields _fields = new SubTypes.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Sub Types. Use this aspect to specialize a generic Entity\ne.g. Making a Dataset also be a View or also be a LookerExplore*/@Aspect.name=\"subTypes\"record SubTypes{/**The names of the specific types.\n*/@Searchable.`/*`={\"filterNameOverride\":\"Sub Type\",\"queryByDefault\":true,\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}typeNames:array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TypeNames = SCHEMA.getField("typeNames");

    public SubTypes() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public SubTypes(DataMap data) {
        super(data, SCHEMA);
    }

    public static SubTypes.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public boolean hasTypeNames() {
        return contains(FIELD_TypeNames);
    }

    /**
     * Remover for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public void removeTypeNames() {
        remove(FIELD_TypeNames);
    }

    /**
     * Getter for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public StringArray getTypeNames(GetMode mode) {
        return obtainWrapped(FIELD_TypeNames, StringArray.class, mode);
    }

    /**
     * Getter for typeNames
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SubTypes.Fields#typeNames
     */
    @Nonnull
    public StringArray getTypeNames() {
        return obtainWrapped(FIELD_TypeNames, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public SubTypes setTypeNames(StringArray value, SetMode mode) {
        putWrapped(FIELD_TypeNames, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for typeNames
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SubTypes.Fields#typeNames
     */
    public SubTypes setTypeNames(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_TypeNames, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SubTypes clone()
        throws CloneNotSupportedException
    {
        return ((SubTypes) super.clone());
    }

    @Override
    public SubTypes copy()
        throws CloneNotSupportedException
    {
        return ((SubTypes) super.copy());
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
         * The names of the specific types.
         * 
         * 
         */
        public PathSpec typeNames() {
            return new PathSpec(getPathComponents(), "typeNames");
        }

        /**
         * The names of the specific types.
         * 
         * 
         */
        public PathSpec typeNames(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "typeNames");
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
