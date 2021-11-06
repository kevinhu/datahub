
package com.linkedin.ml.metadata;

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
 * Source Code
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/SourceCode.pdl.")
public class SourceCode
    extends RecordTemplate
{

    private final static SourceCode.Fields _fields = new SourceCode.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_SourceCode = SCHEMA.getField("sourceCode");

    public SourceCode() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public SourceCode(DataMap data) {
        super(data, SCHEMA);
    }

    public static SourceCode.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public boolean hasSourceCode() {
        return contains(FIELD_SourceCode);
    }

    /**
     * Remover for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public void removeSourceCode() {
        remove(FIELD_SourceCode);
    }

    /**
     * Getter for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public SourceCodeUrlArray getSourceCode(GetMode mode) {
        return obtainWrapped(FIELD_SourceCode, SourceCodeUrlArray.class, mode);
    }

    /**
     * Getter for sourceCode
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SourceCode.Fields#sourceCode
     */
    @Nonnull
    public SourceCodeUrlArray getSourceCode() {
        return obtainWrapped(FIELD_SourceCode, SourceCodeUrlArray.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public SourceCode setSourceCode(SourceCodeUrlArray value, SetMode mode) {
        putWrapped(FIELD_SourceCode, SourceCodeUrlArray.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceCode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SourceCode.Fields#sourceCode
     */
    public SourceCode setSourceCode(
        @Nonnull
        SourceCodeUrlArray value) {
        putWrapped(FIELD_SourceCode, SourceCodeUrlArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SourceCode clone()
        throws CloneNotSupportedException
    {
        return ((SourceCode) super.clone());
    }

    @Override
    public SourceCode copy()
        throws CloneNotSupportedException
    {
        return ((SourceCode) super.copy());
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
         * Source Code along with types
         * 
         */
        public com.linkedin.ml.metadata.SourceCodeUrlArray.Fields sourceCode() {
            return new com.linkedin.ml.metadata.SourceCodeUrlArray.Fields(getPathComponents(), "sourceCode");
        }

        /**
         * Source Code along with types
         * 
         */
        public PathSpec sourceCode(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceCode");
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
