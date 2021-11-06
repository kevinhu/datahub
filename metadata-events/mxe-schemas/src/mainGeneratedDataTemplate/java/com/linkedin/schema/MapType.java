
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


/**
 * Map field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/MapType.pdl.")
public class MapType
    extends RecordTemplate
{

    private final static MapType.Fields _fields = new MapType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_KeyType = SCHEMA.getField("keyType");
    private final static RecordDataSchema.Field FIELD_ValueType = SCHEMA.getField("valueType");

    public MapType() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public MapType(DataMap data) {
        super(data, SCHEMA);
    }

    public static MapType.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public boolean hasKeyType() {
        return contains(FIELD_KeyType);
    }

    /**
     * Remover for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public void removeKeyType() {
        remove(FIELD_KeyType);
    }

    /**
     * Getter for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public String getKeyType(GetMode mode) {
        return obtainDirect(FIELD_KeyType, String.class, mode);
    }

    /**
     * Getter for keyType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MapType.Fields#keyType
     */
    @Nullable
    public String getKeyType() {
        return obtainDirect(FIELD_KeyType, String.class, GetMode.STRICT);
    }

    /**
     * Setter for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public MapType setKeyType(String value, SetMode mode) {
        putDirect(FIELD_KeyType, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for keyType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MapType.Fields#keyType
     */
    public MapType setKeyType(
        @Nonnull
        String value) {
        putDirect(FIELD_KeyType, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public boolean hasValueType() {
        return contains(FIELD_ValueType);
    }

    /**
     * Remover for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public void removeValueType() {
        remove(FIELD_ValueType);
    }

    /**
     * Getter for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public String getValueType(GetMode mode) {
        return obtainDirect(FIELD_ValueType, String.class, mode);
    }

    /**
     * Getter for valueType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MapType.Fields#valueType
     */
    @Nullable
    public String getValueType() {
        return obtainDirect(FIELD_ValueType, String.class, GetMode.STRICT);
    }

    /**
     * Setter for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public MapType setValueType(String value, SetMode mode) {
        putDirect(FIELD_ValueType, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for valueType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MapType.Fields#valueType
     */
    public MapType setValueType(
        @Nonnull
        String value) {
        putDirect(FIELD_ValueType, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MapType clone()
        throws CloneNotSupportedException
    {
        return ((MapType) super.clone());
    }

    @Override
    public MapType copy()
        throws CloneNotSupportedException
    {
        return ((MapType) super.copy());
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
         * Key type in a map
         * 
         */
        public PathSpec keyType() {
            return new PathSpec(getPathComponents(), "keyType");
        }

        /**
         * Type of the value in a map
         * 
         */
        public PathSpec valueType() {
            return new PathSpec(getPathComponents(), "valueType");
        }

    }

}
