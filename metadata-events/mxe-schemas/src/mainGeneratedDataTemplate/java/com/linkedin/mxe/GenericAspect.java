
package com.linkedin.mxe;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.ByteString;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Generic record structure for serializing an Aspect
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/GenericAspect.pdl.")
public class GenericAspect
    extends RecordTemplate
{

    private final static GenericAspect.Fields _fields = new GenericAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{value:bytes,contentType:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_ContentType = SCHEMA.getField("contentType");

    public GenericAspect() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public GenericAspect(DataMap data) {
        super(data, SCHEMA);
    }

    public static GenericAspect.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for value
     * 
     * @see GenericAspect.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see GenericAspect.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see GenericAspect.Fields#value
     */
    public ByteString getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, ByteString.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericAspect.Fields#value
     */
    @Nonnull
    public ByteString getValue() {
        return obtainDirect(FIELD_Value, ByteString.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see GenericAspect.Fields#value
     */
    public GenericAspect setValue(ByteString value, SetMode mode) {
        putDirect(FIELD_Value, ByteString.class, ByteString.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericAspect.Fields#value
     */
    public GenericAspect setValue(
        @Nonnull
        ByteString value) {
        putDirect(FIELD_Value, ByteString.class, ByteString.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public boolean hasContentType() {
        return contains(FIELD_ContentType);
    }

    /**
     * Remover for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public void removeContentType() {
        remove(FIELD_ContentType);
    }

    /**
     * Getter for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public String getContentType(GetMode mode) {
        return obtainDirect(FIELD_ContentType, String.class, mode);
    }

    /**
     * Getter for contentType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericAspect.Fields#contentType
     */
    @Nonnull
    public String getContentType() {
        return obtainDirect(FIELD_ContentType, String.class, GetMode.STRICT);
    }

    /**
     * Setter for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public GenericAspect setContentType(String value, SetMode mode) {
        putDirect(FIELD_ContentType, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for contentType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericAspect.Fields#contentType
     */
    public GenericAspect setContentType(
        @Nonnull
        String value) {
        putDirect(FIELD_ContentType, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GenericAspect clone()
        throws CloneNotSupportedException
    {
        return ((GenericAspect) super.clone());
    }

    @Override
    public GenericAspect copy()
        throws CloneNotSupportedException
    {
        return ((GenericAspect) super.copy());
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

        public PathSpec contentType() {
            return new PathSpec(getPathComponents(), "contentType");
        }

    }

}
