
package com.linkedin.schema;

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
 * Schema holder for presto data definition language that describes a presto view.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/PrestoDDL.pdl.")
public class PrestoDDL
    extends RecordTemplate
{

    private final static PrestoDDL.Fields _fields = new PrestoDDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_RawSchema = SCHEMA.getField("rawSchema");

    public PrestoDDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public PrestoDDL(DataMap data) {
        super(data, SCHEMA);
    }

    public static PrestoDDL.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public boolean hasRawSchema() {
        return contains(FIELD_RawSchema);
    }

    /**
     * Remover for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public void removeRawSchema() {
        remove(FIELD_RawSchema);
    }

    /**
     * Getter for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public String getRawSchema(GetMode mode) {
        return obtainDirect(FIELD_RawSchema, String.class, mode);
    }

    /**
     * Getter for rawSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PrestoDDL.Fields#rawSchema
     */
    @Nonnull
    public String getRawSchema() {
        return obtainDirect(FIELD_RawSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public PrestoDDL setRawSchema(String value, SetMode mode) {
        putDirect(FIELD_RawSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for rawSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PrestoDDL.Fields#rawSchema
     */
    public PrestoDDL setRawSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_RawSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public PrestoDDL clone()
        throws CloneNotSupportedException
    {
        return ((PrestoDDL) super.clone());
    }

    @Override
    public PrestoDDL copy()
        throws CloneNotSupportedException
    {
        return ((PrestoDDL) super.copy());
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
         * The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.
         * 
         */
        public PathSpec rawSchema() {
            return new PathSpec(getPathComponents(), "rawSchema");
        }

    }

}
