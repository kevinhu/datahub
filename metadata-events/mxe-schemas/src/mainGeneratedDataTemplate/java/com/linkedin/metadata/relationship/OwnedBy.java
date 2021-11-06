
package com.linkedin.metadata.relationship;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.OwnershipType;
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
 * A generic model for the Owned-By relationship
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/relationship/OwnedBy.pdl.")
public class OwnedBy
    extends RecordTemplate
{

    private final static OwnedBy.Fields _fields = new OwnedBy.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.relationship/**A generic model for the Owned-By relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataProcessUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.MLModelUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryTermUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record OwnedBy includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{/**The type of the ownership*/type:{namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Destination = SCHEMA.getField("destination");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public OwnedBy() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public OwnedBy(DataMap data) {
        super(data, SCHEMA);
    }

    public static OwnedBy.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for source
     * 
     * @see OwnedBy.Fields#source
     */
    public boolean hasSource() {
        return contains(FIELD_Source);
    }

    /**
     * Remover for source
     * 
     * @see OwnedBy.Fields#source
     */
    public void removeSource() {
        remove(FIELD_Source);
    }

    /**
     * Getter for source
     * 
     * @see OwnedBy.Fields#source
     */
    public com.linkedin.common.urn.Urn getSource(GetMode mode) {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnedBy.Fields#source
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSource() {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for source
     * 
     * @see OwnedBy.Fields#source
     */
    public OwnedBy setSource(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnedBy.Fields#source
     */
    public OwnedBy setSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for destination
     * 
     * @see OwnedBy.Fields#destination
     */
    public boolean hasDestination() {
        return contains(FIELD_Destination);
    }

    /**
     * Remover for destination
     * 
     * @see OwnedBy.Fields#destination
     */
    public void removeDestination() {
        remove(FIELD_Destination);
    }

    /**
     * Getter for destination
     * 
     * @see OwnedBy.Fields#destination
     */
    public com.linkedin.common.urn.Urn getDestination(GetMode mode) {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for destination
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnedBy.Fields#destination
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestination() {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for destination
     * 
     * @see OwnedBy.Fields#destination
     */
    public OwnedBy setDestination(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for destination
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnedBy.Fields#destination
     */
    public OwnedBy setDestination(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see OwnedBy.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see OwnedBy.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see OwnedBy.Fields#type
     */
    public OwnershipType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, OwnershipType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnedBy.Fields#type
     */
    @Nonnull
    public OwnershipType getType() {
        return obtainDirect(FIELD_Type, OwnershipType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see OwnedBy.Fields#type
     */
    public OwnedBy setType(OwnershipType value, SetMode mode) {
        putDirect(FIELD_Type, OwnershipType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnedBy.Fields#type
     */
    public OwnedBy setType(
        @Nonnull
        OwnershipType value) {
        putDirect(FIELD_Type, OwnershipType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public OwnedBy clone()
        throws CloneNotSupportedException
    {
        return ((OwnedBy) super.clone());
    }

    @Override
    public OwnedBy copy()
        throws CloneNotSupportedException
    {
        return ((OwnedBy) super.copy());
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
         * Urn for the source of the relationship
         * 
         */
        public PathSpec source() {
            return new PathSpec(getPathComponents(), "source");
        }

        /**
         * Urn for the destination of the relationship
         * 
         */
        public PathSpec destination() {
            return new PathSpec(getPathComponents(), "destination");
        }

        /**
         * The type of the ownership
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

}
