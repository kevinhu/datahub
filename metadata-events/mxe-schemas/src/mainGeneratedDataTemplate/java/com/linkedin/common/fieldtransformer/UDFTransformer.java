
package com.linkedin.common.fieldtransformer;

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
 * Field transformation expressed in UDF
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/fieldtransformer/UDFTransformer.pdl.")
public class UDFTransformer
    extends RecordTemplate
{

    private final static UDFTransformer.Fields _fields = new UDFTransformer.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Udf = SCHEMA.getField("udf");

    public UDFTransformer() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public UDFTransformer(DataMap data) {
        super(data, SCHEMA);
    }

    public static UDFTransformer.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public boolean hasUdf() {
        return contains(FIELD_Udf);
    }

    /**
     * Remover for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public void removeUdf() {
        remove(FIELD_Udf);
    }

    /**
     * Getter for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public String getUdf(GetMode mode) {
        return obtainDirect(FIELD_Udf, String.class, mode);
    }

    /**
     * Getter for udf
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UDFTransformer.Fields#udf
     */
    @Nonnull
    public String getUdf() {
        return obtainDirect(FIELD_Udf, String.class, GetMode.STRICT);
    }

    /**
     * Setter for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public UDFTransformer setUdf(String value, SetMode mode) {
        putDirect(FIELD_Udf, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for udf
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UDFTransformer.Fields#udf
     */
    public UDFTransformer setUdf(
        @Nonnull
        String value) {
        putDirect(FIELD_Udf, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UDFTransformer clone()
        throws CloneNotSupportedException
    {
        return ((UDFTransformer) super.clone());
    }

    @Override
    public UDFTransformer copy()
        throws CloneNotSupportedException
    {
        return ((UDFTransformer) super.copy());
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
         * A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.
         * 
         */
        public PathSpec udf() {
            return new PathSpec(getPathComponents(), "udf");
        }

    }

}
