
package com.linkedin.metadata.browse;

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
 * The model for the result of a browse query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResult.pdl.")
public class BrowseResult
    extends RecordTemplate
{

    private final static BrowseResult.Fields _fields = new BrowseResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for the result of a browse query*/record BrowseResult{/**A list of entities under the queried path*/entities:array[/**Data model for an entity returned as part of a browse query*/record BrowseResultEntity{/**Name of the entity*/name:optional string/**URN of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]/**A list of groups and total number of entities inside those groups under the queried path*/groups:array[record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}]=[]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**Total number of entities we can reach from path*/totalNumEntities:long}/**Offset of the first entity in the result*/from:int/**Size of each page in the result*/pageSize:int/**The total number of entities directly under queried path*/numEntities:int/**The total number of groups directly under queried path*/numGroups:int/**The total number of elements (entities + groups) directly under queried path*/numElements:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_From = SCHEMA.getField("from");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumEntities = SCHEMA.getField("numEntities");
    private final static RecordDataSchema.Field FIELD_NumGroups = SCHEMA.getField("numGroups");
    private final static RecordDataSchema.Field FIELD_NumElements = SCHEMA.getField("numElements");

    public BrowseResult() {
        super(new DataMap(11, 0.75F), SCHEMA, 4);
    }

    public BrowseResult(DataMap data) {
        super(data, SCHEMA);
    }

    public static BrowseResult.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    public boolean hasEntities() {
        return contains(FIELD_Entities);
    }

    /**
     * Remover for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    public void removeEntities() {
        remove(FIELD_Entities);
    }

    /**
     * Getter for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    public BrowseResultEntityArray getEntities(GetMode mode) {
        return obtainWrapped(FIELD_Entities, BrowseResultEntityArray.class, mode);
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#entities
     */
    @Nonnull
    public BrowseResultEntityArray getEntities() {
        return obtainWrapped(FIELD_Entities, BrowseResultEntityArray.class, GetMode.STRICT);
    }

    /**
     * Setter for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    public BrowseResult setEntities(BrowseResultEntityArray value, SetMode mode) {
        putWrapped(FIELD_Entities, BrowseResultEntityArray.class, value, mode);
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#entities
     */
    public BrowseResult setEntities(
        @Nonnull
        BrowseResultEntityArray value) {
        putWrapped(FIELD_Entities, BrowseResultEntityArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public BrowseResultGroupArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, BrowseResultGroupArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#groups
     */
    @Nonnull
    public BrowseResultGroupArray getGroups() {
        return obtainWrapped(FIELD_Groups, BrowseResultGroupArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public BrowseResult setGroups(BrowseResultGroupArray value, SetMode mode) {
        putWrapped(FIELD_Groups, BrowseResultGroupArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#groups
     */
    public BrowseResult setGroups(
        @Nonnull
        BrowseResultGroupArray value) {
        putWrapped(FIELD_Groups, BrowseResultGroupArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public boolean hasMetadata() {
        return contains(FIELD_Metadata);
    }

    /**
     * Remover for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public void removeMetadata() {
        remove(FIELD_Metadata);
    }

    /**
     * Getter for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public BrowseResultMetadata getMetadata(GetMode mode) {
        return obtainWrapped(FIELD_Metadata, BrowseResultMetadata.class, mode);
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#metadata
     */
    @Nonnull
    public BrowseResultMetadata getMetadata() {
        return obtainWrapped(FIELD_Metadata, BrowseResultMetadata.class, GetMode.STRICT);
    }

    /**
     * Setter for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public BrowseResult setMetadata(BrowseResultMetadata value, SetMode mode) {
        putWrapped(FIELD_Metadata, BrowseResultMetadata.class, value, mode);
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#metadata
     */
    public BrowseResult setMetadata(
        @Nonnull
        BrowseResultMetadata value) {
        putWrapped(FIELD_Metadata, BrowseResultMetadata.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for from
     * 
     * @see BrowseResult.Fields#from
     */
    public boolean hasFrom() {
        return contains(FIELD_From);
    }

    /**
     * Remover for from
     * 
     * @see BrowseResult.Fields#from
     */
    public void removeFrom() {
        remove(FIELD_From);
    }

    /**
     * Getter for from
     * 
     * @see BrowseResult.Fields#from
     */
    public Integer getFrom(GetMode mode) {
        return obtainDirect(FIELD_From, Integer.class, mode);
    }

    /**
     * Getter for from
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#from
     */
    @Nonnull
    public Integer getFrom() {
        return obtainDirect(FIELD_From, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for from
     * 
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(Integer value, SetMode mode) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for from
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(
        @Nonnull
        Integer value) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for from
     * 
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(int value) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public boolean hasPageSize() {
        return contains(FIELD_PageSize);
    }

    /**
     * Remover for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public void removePageSize() {
        remove(FIELD_PageSize);
    }

    /**
     * Getter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public Integer getPageSize(GetMode mode) {
        return obtainDirect(FIELD_PageSize, Integer.class, mode);
    }

    /**
     * Getter for pageSize
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#pageSize
     */
    @Nonnull
    public Integer getPageSize() {
        return obtainDirect(FIELD_PageSize, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(Integer value, SetMode mode) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(
        @Nonnull
        Integer value) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(int value) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public boolean hasNumEntities() {
        return contains(FIELD_NumEntities);
    }

    /**
     * Remover for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public void removeNumEntities() {
        remove(FIELD_NumEntities);
    }

    /**
     * Getter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public Integer getNumEntities(GetMode mode) {
        return obtainDirect(FIELD_NumEntities, Integer.class, mode);
    }

    /**
     * Getter for numEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numEntities
     */
    @Nonnull
    public Integer getNumEntities() {
        return obtainDirect(FIELD_NumEntities, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(Integer value, SetMode mode) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(int value) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public boolean hasNumGroups() {
        return contains(FIELD_NumGroups);
    }

    /**
     * Remover for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public void removeNumGroups() {
        remove(FIELD_NumGroups);
    }

    /**
     * Getter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public Integer getNumGroups(GetMode mode) {
        return obtainDirect(FIELD_NumGroups, Integer.class, mode);
    }

    /**
     * Getter for numGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numGroups
     */
    @Nonnull
    public Integer getNumGroups() {
        return obtainDirect(FIELD_NumGroups, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(Integer value, SetMode mode) {
        putDirect(FIELD_NumGroups, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumGroups, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(int value) {
        putDirect(FIELD_NumGroups, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public boolean hasNumElements() {
        return contains(FIELD_NumElements);
    }

    /**
     * Remover for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public void removeNumElements() {
        remove(FIELD_NumElements);
    }

    /**
     * Getter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public Integer getNumElements(GetMode mode) {
        return obtainDirect(FIELD_NumElements, Integer.class, mode);
    }

    /**
     * Getter for numElements
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numElements
     */
    @Nonnull
    public Integer getNumElements() {
        return obtainDirect(FIELD_NumElements, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(Integer value, SetMode mode) {
        putDirect(FIELD_NumElements, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numElements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumElements, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(int value) {
        putDirect(FIELD_NumElements, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BrowseResult clone()
        throws CloneNotSupportedException
    {
        return ((BrowseResult) super.clone());
    }

    @Override
    public BrowseResult copy()
        throws CloneNotSupportedException
    {
        return ((BrowseResult) super.copy());
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
         * A list of entities under the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultEntityArray.Fields entities() {
            return new com.linkedin.metadata.browse.BrowseResultEntityArray.Fields(getPathComponents(), "entities");
        }

        /**
         * A list of entities under the queried path
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultGroupArray.Fields groups() {
            return new com.linkedin.metadata.browse.BrowseResultGroupArray.Fields(getPathComponents(), "groups");
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultMetadata.Fields metadata() {
            return new com.linkedin.metadata.browse.BrowseResultMetadata.Fields(getPathComponents(), "metadata");
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec from() {
            return new PathSpec(getPathComponents(), "from");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec pageSize() {
            return new PathSpec(getPathComponents(), "pageSize");
        }

        /**
         * The total number of entities directly under queried path
         * 
         */
        public PathSpec numEntities() {
            return new PathSpec(getPathComponents(), "numEntities");
        }

        /**
         * The total number of groups directly under queried path
         * 
         */
        public PathSpec numGroups() {
            return new PathSpec(getPathComponents(), "numGroups");
        }

        /**
         * The total number of elements (entities + groups) directly under queried path
         * 
         */
        public PathSpec numElements() {
            return new PathSpec(getPathComponents(), "numElements");
        }

    }

}
