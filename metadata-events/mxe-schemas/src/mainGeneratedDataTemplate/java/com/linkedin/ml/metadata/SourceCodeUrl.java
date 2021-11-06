
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * Source Code Url Entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/SourceCodeUrl.pdl.")
public class SourceCodeUrl
    extends RecordTemplate
{

    private final static SourceCodeUrl.Fields _fields = new SourceCodeUrl.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_SourceCodeUrl = SCHEMA.getField("sourceCodeUrl");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public SourceCodeUrl() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public SourceCodeUrl(DataMap data) {
        super(data, SCHEMA);
    }

    public static SourceCodeUrl.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    public SourceCodeUrlType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, SourceCodeUrlType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SourceCodeUrl.Fields#type
     */
    @Nonnull
    public SourceCodeUrlType getType() {
        return obtainDirect(FIELD_Type, SourceCodeUrlType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    public SourceCodeUrl setType(SourceCodeUrlType value, SetMode mode) {
        putDirect(FIELD_Type, SourceCodeUrlType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SourceCodeUrl.Fields#type
     */
    public SourceCodeUrl setType(
        @Nonnull
        SourceCodeUrlType value) {
        putDirect(FIELD_Type, SourceCodeUrlType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public boolean hasSourceCodeUrl() {
        return contains(FIELD_SourceCodeUrl);
    }

    /**
     * Remover for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public void removeSourceCodeUrl() {
        remove(FIELD_SourceCodeUrl);
    }

    /**
     * Getter for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public com.linkedin.common.url.Url getSourceCodeUrl(GetMode mode) {
        return obtainCustomType(FIELD_SourceCodeUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for sourceCodeUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    @Nonnull
    public com.linkedin.common.url.Url getSourceCodeUrl() {
        return obtainCustomType(FIELD_SourceCodeUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public SourceCodeUrl setSourceCodeUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_SourceCodeUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceCodeUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public SourceCodeUrl setSourceCodeUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_SourceCodeUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SourceCodeUrl clone()
        throws CloneNotSupportedException
    {
        return ((SourceCodeUrl) super.clone());
    }

    @Override
    public SourceCodeUrl copy()
        throws CloneNotSupportedException
    {
        return ((SourceCodeUrl) super.copy());
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
         * Source Code Url Types
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Source Code Url
         * 
         */
        public PathSpec sourceCodeUrl() {
            return new PathSpec(getPathComponents(), "sourceCodeUrl");
        }

    }

}
