
package com.linkedin.metadata.query;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The model for listing a set of entity urns.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/ListUrnsResult.pdl.")
public class ListUrnsResult
    extends RecordTemplate
{

    private final static ListUrnsResult.Fields _fields = new ListUrnsResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The model for listing a set of entity urns.*/record ListUrnsResult{/**A list of entities returned from the list*/entities:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Offset of the first entity in the result*/start:int/**Size of each page in the result*/count:int/**The total number of entities directly under searched path*/total:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Start = SCHEMA.getField("start");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");

    public ListUrnsResult() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
    }

    public ListUrnsResult(DataMap data) {
        super(data, SCHEMA);
    }

    public static ListUrnsResult.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for entities
     * 
     * @see ListUrnsResult.Fields#entities
     */
    public boolean hasEntities() {
        return contains(FIELD_Entities);
    }

    /**
     * Remover for entities
     * 
     * @see ListUrnsResult.Fields#entities
     */
    public void removeEntities() {
        remove(FIELD_Entities);
    }

    /**
     * Getter for entities
     * 
     * @see ListUrnsResult.Fields#entities
     */
    public UrnArray getEntities(GetMode mode) {
        return obtainWrapped(FIELD_Entities, UrnArray.class, mode);
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListUrnsResult.Fields#entities
     */
    @Nonnull
    public UrnArray getEntities() {
        return obtainWrapped(FIELD_Entities, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for entities
     * 
     * @see ListUrnsResult.Fields#entities
     */
    public ListUrnsResult setEntities(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Entities, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListUrnsResult.Fields#entities
     */
    public ListUrnsResult setEntities(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Entities, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for start
     * 
     * @see ListUrnsResult.Fields#start
     */
    public boolean hasStart() {
        return contains(FIELD_Start);
    }

    /**
     * Remover for start
     * 
     * @see ListUrnsResult.Fields#start
     */
    public void removeStart() {
        remove(FIELD_Start);
    }

    /**
     * Getter for start
     * 
     * @see ListUrnsResult.Fields#start
     */
    public Integer getStart(GetMode mode) {
        return obtainDirect(FIELD_Start, Integer.class, mode);
    }

    /**
     * Getter for start
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListUrnsResult.Fields#start
     */
    @Nonnull
    public Integer getStart() {
        return obtainDirect(FIELD_Start, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for start
     * 
     * @see ListUrnsResult.Fields#start
     */
    public ListUrnsResult setStart(Integer value, SetMode mode) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for start
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListUrnsResult.Fields#start
     */
    public ListUrnsResult setStart(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for start
     * 
     * @see ListUrnsResult.Fields#start
     */
    public ListUrnsResult setStart(int value) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see ListUrnsResult.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see ListUrnsResult.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see ListUrnsResult.Fields#count
     */
    public Integer getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Integer.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListUrnsResult.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        return obtainDirect(FIELD_Count, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see ListUrnsResult.Fields#count
     */
    public ListUrnsResult setCount(Integer value, SetMode mode) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListUrnsResult.Fields#count
     */
    public ListUrnsResult setCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see ListUrnsResult.Fields#count
     */
    public ListUrnsResult setCount(int value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see ListUrnsResult.Fields#total
     */
    public boolean hasTotal() {
        return contains(FIELD_Total);
    }

    /**
     * Remover for total
     * 
     * @see ListUrnsResult.Fields#total
     */
    public void removeTotal() {
        remove(FIELD_Total);
    }

    /**
     * Getter for total
     * 
     * @see ListUrnsResult.Fields#total
     */
    public Integer getTotal(GetMode mode) {
        return obtainDirect(FIELD_Total, Integer.class, mode);
    }

    /**
     * Getter for total
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListUrnsResult.Fields#total
     */
    @Nonnull
    public Integer getTotal() {
        return obtainDirect(FIELD_Total, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for total
     * 
     * @see ListUrnsResult.Fields#total
     */
    public ListUrnsResult setTotal(Integer value, SetMode mode) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for total
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListUrnsResult.Fields#total
     */
    public ListUrnsResult setTotal(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for total
     * 
     * @see ListUrnsResult.Fields#total
     */
    public ListUrnsResult setTotal(int value) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ListUrnsResult clone()
        throws CloneNotSupportedException
    {
        return ((ListUrnsResult) super.clone());
    }

    @Override
    public ListUrnsResult copy()
        throws CloneNotSupportedException
    {
        return ((ListUrnsResult) super.copy());
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
         * A list of entities returned from the list
         * 
         */
        public PathSpec entities() {
            return new PathSpec(getPathComponents(), "entities");
        }

        /**
         * A list of entities returned from the list
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec start() {
            return new PathSpec(getPathComponents(), "start");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

    }

}
