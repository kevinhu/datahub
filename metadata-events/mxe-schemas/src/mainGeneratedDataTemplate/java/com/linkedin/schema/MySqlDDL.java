
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
 * Schema holder for MySql data definition language that describes an MySql table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/MySqlDDL.pdl.")
public class MySqlDDL
    extends RecordTemplate
{

    private final static MySqlDDL.Fields _fields = new MySqlDDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TableSchema = SCHEMA.getField("tableSchema");

    public MySqlDDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public MySqlDDL(DataMap data) {
        super(data, SCHEMA);
    }

    public static MySqlDDL.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for tableSchema
     * 
     * @see MySqlDDL.Fields#tableSchema
     */
    public boolean hasTableSchema() {
        return contains(FIELD_TableSchema);
    }

    /**
     * Remover for tableSchema
     * 
     * @see MySqlDDL.Fields#tableSchema
     */
    public void removeTableSchema() {
        remove(FIELD_TableSchema);
    }

    /**
     * Getter for tableSchema
     * 
     * @see MySqlDDL.Fields#tableSchema
     */
    public String getTableSchema(GetMode mode) {
        return obtainDirect(FIELD_TableSchema, String.class, mode);
    }

    /**
     * Getter for tableSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MySqlDDL.Fields#tableSchema
     */
    @Nonnull
    public String getTableSchema() {
        return obtainDirect(FIELD_TableSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for tableSchema
     * 
     * @see MySqlDDL.Fields#tableSchema
     */
    public MySqlDDL setTableSchema(String value, SetMode mode) {
        putDirect(FIELD_TableSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for tableSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MySqlDDL.Fields#tableSchema
     */
    public MySqlDDL setTableSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_TableSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MySqlDDL clone()
        throws CloneNotSupportedException
    {
        return ((MySqlDDL) super.clone());
    }

    @Override
    public MySqlDDL copy()
        throws CloneNotSupportedException
    {
        return ((MySqlDDL) super.copy());
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
         * The native schema in the dataset's platform. This is a human readable (json blob) table schema.
         * 
         */
        public PathSpec tableSchema() {
            return new PathSpec(getPathComponents(), "tableSchema");
        }

    }

}
