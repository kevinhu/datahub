
package com.linkedin.chart;

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
 * Information for chart query which is used for getting data of the chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartQuery.pdl.")
public class ChartQuery
    extends RecordTemplate
{

    private final static ChartQuery.Fields _fields = new ChartQuery.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"fieldName\":\"queryType\",\"filterNameOverride\":\"Query Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_RawQuery = SCHEMA.getField("rawQuery");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public ChartQuery() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public ChartQuery(DataMap data) {
        super(data, SCHEMA);
    }

    public static ChartQuery.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public boolean hasRawQuery() {
        return contains(FIELD_RawQuery);
    }

    /**
     * Remover for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public void removeRawQuery() {
        remove(FIELD_RawQuery);
    }

    /**
     * Getter for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public String getRawQuery(GetMode mode) {
        return obtainDirect(FIELD_RawQuery, String.class, mode);
    }

    /**
     * Getter for rawQuery
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartQuery.Fields#rawQuery
     */
    @Nonnull
    public String getRawQuery() {
        return obtainDirect(FIELD_RawQuery, String.class, GetMode.STRICT);
    }

    /**
     * Setter for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public ChartQuery setRawQuery(String value, SetMode mode) {
        putDirect(FIELD_RawQuery, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for rawQuery
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartQuery.Fields#rawQuery
     */
    public ChartQuery setRawQuery(
        @Nonnull
        String value) {
        putDirect(FIELD_RawQuery, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see ChartQuery.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see ChartQuery.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see ChartQuery.Fields#type
     */
    public ChartQueryType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, ChartQueryType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartQuery.Fields#type
     */
    @Nonnull
    public ChartQueryType getType() {
        return obtainDirect(FIELD_Type, ChartQueryType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see ChartQuery.Fields#type
     */
    public ChartQuery setType(ChartQueryType value, SetMode mode) {
        putDirect(FIELD_Type, ChartQueryType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartQuery.Fields#type
     */
    public ChartQuery setType(
        @Nonnull
        ChartQueryType value) {
        putDirect(FIELD_Type, ChartQueryType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ChartQuery clone()
        throws CloneNotSupportedException
    {
        return ((ChartQuery) super.clone());
    }

    @Override
    public ChartQuery copy()
        throws CloneNotSupportedException
    {
        return ((ChartQuery) super.copy());
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
         * Raw query to build a chart from input datasets
         * 
         */
        public PathSpec rawQuery() {
            return new PathSpec(getPathComponents(), "rawQuery");
        }

        /**
         * Chart query type
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

}
