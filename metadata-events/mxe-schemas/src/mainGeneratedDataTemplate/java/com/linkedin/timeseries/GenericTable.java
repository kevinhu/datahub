
package com.linkedin.timeseries;

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
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringArrayArray;


/**
 * Defines a generic table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/GenericTable.pdl.")
public class GenericTable
    extends RecordTemplate
{

    private final static GenericTable.Fields _fields = new GenericTable.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines a generic table.*/record GenericTable{/**The names of the columns.*/columnNames:array[string]/**The types of the columns.*/columnTypes:array[string]/**The data rows.*/rows:optional array[array[string]]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_ColumnNames = SCHEMA.getField("columnNames");
    private final static RecordDataSchema.Field FIELD_ColumnTypes = SCHEMA.getField("columnTypes");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");

    public GenericTable() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
    }

    public GenericTable(DataMap data) {
        super(data, SCHEMA);
    }

    public static GenericTable.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public boolean hasColumnNames() {
        return contains(FIELD_ColumnNames);
    }

    /**
     * Remover for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public void removeColumnNames() {
        remove(FIELD_ColumnNames);
    }

    /**
     * Getter for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public StringArray getColumnNames(GetMode mode) {
        return obtainWrapped(FIELD_ColumnNames, StringArray.class, mode);
    }

    /**
     * Getter for columnNames
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericTable.Fields#columnNames
     */
    @Nonnull
    public StringArray getColumnNames() {
        return obtainWrapped(FIELD_ColumnNames, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public GenericTable setColumnNames(StringArray value, SetMode mode) {
        putWrapped(FIELD_ColumnNames, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for columnNames
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericTable.Fields#columnNames
     */
    public GenericTable setColumnNames(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_ColumnNames, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public boolean hasColumnTypes() {
        return contains(FIELD_ColumnTypes);
    }

    /**
     * Remover for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public void removeColumnTypes() {
        remove(FIELD_ColumnTypes);
    }

    /**
     * Getter for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public StringArray getColumnTypes(GetMode mode) {
        return obtainWrapped(FIELD_ColumnTypes, StringArray.class, mode);
    }

    /**
     * Getter for columnTypes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericTable.Fields#columnTypes
     */
    @Nonnull
    public StringArray getColumnTypes() {
        return obtainWrapped(FIELD_ColumnTypes, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public GenericTable setColumnTypes(StringArray value, SetMode mode) {
        putWrapped(FIELD_ColumnTypes, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for columnTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericTable.Fields#columnTypes
     */
    public GenericTable setColumnTypes(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_ColumnTypes, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see GenericTable.Fields#rows
     */
    public boolean hasRows() {
        return contains(FIELD_Rows);
    }

    /**
     * Remover for rows
     * 
     * @see GenericTable.Fields#rows
     */
    public void removeRows() {
        remove(FIELD_Rows);
    }

    /**
     * Getter for rows
     * 
     * @see GenericTable.Fields#rows
     */
    public StringArrayArray getRows(GetMode mode) {
        return obtainWrapped(FIELD_Rows, StringArrayArray.class, mode);
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GenericTable.Fields#rows
     */
    @Nullable
    public StringArrayArray getRows() {
        return obtainWrapped(FIELD_Rows, StringArrayArray.class, GetMode.STRICT);
    }

    /**
     * Setter for rows
     * 
     * @see GenericTable.Fields#rows
     */
    public GenericTable setRows(StringArrayArray value, SetMode mode) {
        putWrapped(FIELD_Rows, StringArrayArray.class, value, mode);
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericTable.Fields#rows
     */
    public GenericTable setRows(
        @Nonnull
        StringArrayArray value) {
        putWrapped(FIELD_Rows, StringArrayArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GenericTable clone()
        throws CloneNotSupportedException
    {
        return ((GenericTable) super.clone());
    }

    @Override
    public GenericTable copy()
        throws CloneNotSupportedException
    {
        return ((GenericTable) super.copy());
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
         * The names of the columns.
         * 
         */
        public PathSpec columnNames() {
            return new PathSpec(getPathComponents(), "columnNames");
        }

        /**
         * The names of the columns.
         * 
         */
        public PathSpec columnNames(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "columnNames");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The types of the columns.
         * 
         */
        public PathSpec columnTypes() {
            return new PathSpec(getPathComponents(), "columnTypes");
        }

        /**
         * The types of the columns.
         * 
         */
        public PathSpec columnTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "columnTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The data rows.
         * 
         */
        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

        /**
         * The data rows.
         * 
         */
        public PathSpec rows(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "rows");
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
