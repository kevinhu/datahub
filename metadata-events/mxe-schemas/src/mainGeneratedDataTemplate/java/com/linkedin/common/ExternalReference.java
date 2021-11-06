
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
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
 * A reference to an external platform.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/ExternalReference.pdl.")
public class ExternalReference
    extends RecordTemplate
{

    private final static ExternalReference.Fields _fields = new ExternalReference.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public ExternalReference() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ExternalReference(DataMap data) {
        super(data, SCHEMA);
    }

    public static ExternalReference.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see ExternalReference.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see ExternalReference.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see ExternalReference.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExternalReference.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see ExternalReference.Fields#externalUrl
     */
    public ExternalReference setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExternalReference.Fields#externalUrl
     */
    public ExternalReference setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ExternalReference clone()
        throws CloneNotSupportedException
    {
        return ((ExternalReference) super.clone());
    }

    @Override
    public ExternalReference copy()
        throws CloneNotSupportedException
    {
        return ((ExternalReference) super.copy());
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
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

    }

}
