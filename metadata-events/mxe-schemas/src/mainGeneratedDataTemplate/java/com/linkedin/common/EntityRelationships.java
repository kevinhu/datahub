
package com.linkedin.common;

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
 * Downstream lineage of a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/EntityRelationships.pdl.")
public class EntityRelationships
    extends RecordTemplate
{

    private final static EntityRelationships.Fields _fields = new EntityRelationships.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Downstream lineage of a dataset*/record EntityRelationships{/**List of related entities*/relationships:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record EntityRelationship{/**Audit stamp containing who reported the lineage and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**The downstream dataset the lineage points to*/entity:Urn/**The type of the relationship*/type:string}]/**The start of the result set*/start:int/**The start of the result set*/count:int/**Total number of edges found.*/total:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Relationships = SCHEMA.getField("relationships");
    private final static RecordDataSchema.Field FIELD_Start = SCHEMA.getField("start");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");

    public EntityRelationships() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
    }

    public EntityRelationships(DataMap data) {
        super(data, SCHEMA);
    }

    public static EntityRelationships.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    public boolean hasRelationships() {
        return contains(FIELD_Relationships);
    }

    /**
     * Remover for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    public void removeRelationships() {
        remove(FIELD_Relationships);
    }

    /**
     * Getter for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    public EntityRelationshipArray getRelationships(GetMode mode) {
        return obtainWrapped(FIELD_Relationships, EntityRelationshipArray.class, mode);
    }

    /**
     * Getter for relationships
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationships.Fields#relationships
     */
    @Nonnull
    public EntityRelationshipArray getRelationships() {
        return obtainWrapped(FIELD_Relationships, EntityRelationshipArray.class, GetMode.STRICT);
    }

    /**
     * Setter for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    public EntityRelationships setRelationships(EntityRelationshipArray value, SetMode mode) {
        putWrapped(FIELD_Relationships, EntityRelationshipArray.class, value, mode);
        return this;
    }

    /**
     * Setter for relationships
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationships.Fields#relationships
     */
    public EntityRelationships setRelationships(
        @Nonnull
        EntityRelationshipArray value) {
        putWrapped(FIELD_Relationships, EntityRelationshipArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public boolean hasStart() {
        return contains(FIELD_Start);
    }

    /**
     * Remover for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public void removeStart() {
        remove(FIELD_Start);
    }

    /**
     * Getter for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public Integer getStart(GetMode mode) {
        return obtainDirect(FIELD_Start, Integer.class, mode);
    }

    /**
     * Getter for start
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationships.Fields#start
     */
    @Nonnull
    public Integer getStart() {
        return obtainDirect(FIELD_Start, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(Integer value, SetMode mode) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for start
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(int value) {
        putDirect(FIELD_Start, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public Integer getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Integer.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationships.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        return obtainDirect(FIELD_Count, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(Integer value, SetMode mode) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(int value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public boolean hasTotal() {
        return contains(FIELD_Total);
    }

    /**
     * Remover for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public void removeTotal() {
        remove(FIELD_Total);
    }

    /**
     * Getter for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public Integer getTotal(GetMode mode) {
        return obtainDirect(FIELD_Total, Integer.class, mode);
    }

    /**
     * Getter for total
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationships.Fields#total
     */
    @Nonnull
    public Integer getTotal() {
        return obtainDirect(FIELD_Total, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(Integer value, SetMode mode) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for total
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(int value) {
        putDirect(FIELD_Total, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EntityRelationships clone()
        throws CloneNotSupportedException
    {
        return ((EntityRelationships) super.clone());
    }

    @Override
    public EntityRelationships copy()
        throws CloneNotSupportedException
    {
        return ((EntityRelationships) super.copy());
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
         * List of related entities
         * 
         */
        public com.linkedin.common.EntityRelationshipArray.Fields relationships() {
            return new com.linkedin.common.EntityRelationshipArray.Fields(getPathComponents(), "relationships");
        }

        /**
         * List of related entities
         * 
         */
        public PathSpec relationships(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relationships");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The start of the result set
         * 
         */
        public PathSpec start() {
            return new PathSpec(getPathComponents(), "start");
        }

        /**
         * The start of the result set
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * Total number of edges found.
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

    }

}
