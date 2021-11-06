
package com.linkedin.schema;

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
 * Union field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/UnionType.pdl.")
public class UnionType
    extends RecordTemplate
{

    private final static UnionType.Fields _fields = new UnionType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_NestedTypes = SCHEMA.getField("nestedTypes");

    public UnionType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public UnionType(DataMap data) {
        super(data, SCHEMA);
    }

    public static UnionType.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public boolean hasNestedTypes() {
        return contains(FIELD_NestedTypes);
    }

    /**
     * Remover for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public void removeNestedTypes() {
        remove(FIELD_NestedTypes);
    }

    /**
     * Getter for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public StringArray getNestedTypes(GetMode mode) {
        return obtainWrapped(FIELD_NestedTypes, StringArray.class, mode);
    }

    /**
     * Getter for nestedTypes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UnionType.Fields#nestedTypes
     */
    @Nullable
    public StringArray getNestedTypes() {
        return obtainWrapped(FIELD_NestedTypes, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public UnionType setNestedTypes(StringArray value, SetMode mode) {
        putWrapped(FIELD_NestedTypes, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for nestedTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UnionType.Fields#nestedTypes
     */
    public UnionType setNestedTypes(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_NestedTypes, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UnionType clone()
        throws CloneNotSupportedException
    {
        return ((UnionType) super.clone());
    }

    @Override
    public UnionType copy()
        throws CloneNotSupportedException
    {
        return ((UnionType) super.copy());
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
         * List of types in union type.
         * 
         */
        public PathSpec nestedTypes() {
            return new PathSpec(getPathComponents(), "nestedTypes");
        }

        /**
         * List of types in union type.
         * 
         */
        public PathSpec nestedTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "nestedTypes");
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
