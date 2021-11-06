
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Downstream lineage information about a dataset including the source reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/EntityRelationship.pdl.")
public class EntityRelationship
    extends RecordTemplate
{

    private final static EntityRelationship.Fields _fields = new EntityRelationship.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Downstream lineage information about a dataset including the source reporting the lineage*/record EntityRelationship{/**Audit stamp containing who reported the lineage and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**The downstream dataset the lineage points to*/entity:Urn/**The type of the relationship*/type:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public EntityRelationship() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public EntityRelationship(DataMap data) {
        super(data, SCHEMA);
    }

    public static EntityRelationship.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for created
     * 
     * @see EntityRelationship.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see EntityRelationship.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see EntityRelationship.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EntityRelationship.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see EntityRelationship.Fields#created
     */
    public EntityRelationship setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationship.Fields#created
     */
    public EntityRelationship setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see EntityRelationship.Fields#entity
     */
    public boolean hasEntity() {
        return contains(FIELD_Entity);
    }

    /**
     * Remover for entity
     * 
     * @see EntityRelationship.Fields#entity
     */
    public void removeEntity() {
        remove(FIELD_Entity);
    }

    /**
     * Getter for entity
     * 
     * @see EntityRelationship.Fields#entity
     */
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationship.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for entity
     * 
     * @see EntityRelationship.Fields#entity
     */
    public EntityRelationship setEntity(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationship.Fields#entity
     */
    public EntityRelationship setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see EntityRelationship.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see EntityRelationship.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see EntityRelationship.Fields#type
     */
    public String getType(GetMode mode) {
        return obtainDirect(FIELD_Type, String.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityRelationship.Fields#type
     */
    @Nonnull
    public String getType() {
        return obtainDirect(FIELD_Type, String.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see EntityRelationship.Fields#type
     */
    public EntityRelationship setType(String value, SetMode mode) {
        putDirect(FIELD_Type, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityRelationship.Fields#type
     */
    public EntityRelationship setType(
        @Nonnull
        String value) {
        putDirect(FIELD_Type, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EntityRelationship clone()
        throws CloneNotSupportedException
    {
        return ((EntityRelationship) super.clone());
    }

    @Override
    public EntityRelationship copy()
        throws CloneNotSupportedException
    {
        return ((EntityRelationship) super.copy());
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
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * The downstream dataset the lineage points to
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * The type of the relationship
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

}
