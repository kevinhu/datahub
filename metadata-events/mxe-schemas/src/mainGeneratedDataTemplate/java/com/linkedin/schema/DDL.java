
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
 * Schema text for the data definition language that describes an Relational DBMS table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/DDL.pdl.")
public class DDL
    extends RecordTemplate
{

    private final static DDL.Fields _fields = new DDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text for the data definition language that describes an Relational DBMS table.*/record DDL{/**The native SQL DDL that describe an Relational DBMS table.*/tableDDL:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TableDDL = SCHEMA.getField("tableDDL");

    public DDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DDL(DataMap data) {
        super(data, SCHEMA);
    }

    public static DDL.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public boolean hasTableDDL() {
        return contains(FIELD_TableDDL);
    }

    /**
     * Remover for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public void removeTableDDL() {
        remove(FIELD_TableDDL);
    }

    /**
     * Getter for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public String getTableDDL(GetMode mode) {
        return obtainDirect(FIELD_TableDDL, String.class, mode);
    }

    /**
     * Getter for tableDDL
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DDL.Fields#tableDDL
     */
    @Nonnull
    public String getTableDDL() {
        return obtainDirect(FIELD_TableDDL, String.class, GetMode.STRICT);
    }

    /**
     * Setter for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public DDL setTableDDL(String value, SetMode mode) {
        putDirect(FIELD_TableDDL, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for tableDDL
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DDL.Fields#tableDDL
     */
    public DDL setTableDDL(
        @Nonnull
        String value) {
        putDirect(FIELD_TableDDL, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DDL clone()
        throws CloneNotSupportedException
    {
        return ((DDL) super.clone());
    }

    @Override
    public DDL copy()
        throws CloneNotSupportedException
    {
        return ((DDL) super.copy());
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
         * The native SQL DDL that describe an Relational DBMS table.
         * 
         */
        public PathSpec tableDDL() {
            return new PathSpec(getPathComponents(), "tableDDL");
        }

    }

}
