
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
 * Array field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ArrayType.pdl.")
public class ArrayType
    extends RecordTemplate
{

    private final static ArrayType.Fields _fields = new ArrayType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_NestedType = SCHEMA.getField("nestedType");

    public ArrayType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public ArrayType(DataMap data) {
        super(data, SCHEMA);
    }

    public static ArrayType.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public boolean hasNestedType() {
        return contains(FIELD_NestedType);
    }

    /**
     * Remover for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public void removeNestedType() {
        remove(FIELD_NestedType);
    }

    /**
     * Getter for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public StringArray getNestedType(GetMode mode) {
        return obtainWrapped(FIELD_NestedType, StringArray.class, mode);
    }

    /**
     * Getter for nestedType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ArrayType.Fields#nestedType
     */
    @Nullable
    public StringArray getNestedType() {
        return obtainWrapped(FIELD_NestedType, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public ArrayType setNestedType(StringArray value, SetMode mode) {
        putWrapped(FIELD_NestedType, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for nestedType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ArrayType.Fields#nestedType
     */
    public ArrayType setNestedType(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_NestedType, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ArrayType clone()
        throws CloneNotSupportedException
    {
        return ((ArrayType) super.clone());
    }

    @Override
    public ArrayType copy()
        throws CloneNotSupportedException
    {
        return ((ArrayType) super.copy());
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
         * List of types this array holds.
         * 
         */
        public PathSpec nestedType() {
            return new PathSpec(getPathComponents(), "nestedType");
        }

        /**
         * List of types this array holds.
         * 
         */
        public PathSpec nestedType(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "nestedType");
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
