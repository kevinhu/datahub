
package com.linkedin.metadata.run;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/DeleteEntityResponse.pdl.")
public class DeleteEntityResponse
    extends RecordTemplate
{

    private final static DeleteEntityResponse.Fields _fields = new DeleteEntityResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record DeleteEntityResponse{urn:string,rows:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");

    public DeleteEntityResponse() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public DeleteEntityResponse(DataMap data) {
        super(data, SCHEMA);
    }

    public static DeleteEntityResponse.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    public String getUrn(GetMode mode) {
        return obtainDirect(FIELD_Urn, String.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteEntityResponse.Fields#urn
     */
    @Nonnull
    public String getUrn() {
        return obtainDirect(FIELD_Urn, String.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    public DeleteEntityResponse setUrn(String value, SetMode mode) {
        putDirect(FIELD_Urn, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteEntityResponse.Fields#urn
     */
    public DeleteEntityResponse setUrn(
        @Nonnull
        String value) {
        putDirect(FIELD_Urn, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public boolean hasRows() {
        return contains(FIELD_Rows);
    }

    /**
     * Remover for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public void removeRows() {
        remove(FIELD_Rows);
    }

    /**
     * Getter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public Long getRows(GetMode mode) {
        return obtainDirect(FIELD_Rows, Long.class, mode);
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteEntityResponse.Fields#rows
     */
    @Nonnull
    public Long getRows() {
        return obtainDirect(FIELD_Rows, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(Long value, SetMode mode) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(
        @Nonnull
        Long value) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(long value) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DeleteEntityResponse clone()
        throws CloneNotSupportedException
    {
        return ((DeleteEntityResponse) super.clone());
    }

    @Override
    public DeleteEntityResponse copy()
        throws CloneNotSupportedException
    {
        return ((DeleteEntityResponse) super.copy());
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

        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

    }

}
