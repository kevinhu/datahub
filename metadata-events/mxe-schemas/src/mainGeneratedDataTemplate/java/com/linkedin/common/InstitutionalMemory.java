
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
 * Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InstitutionalMemory.pdl.")
public class InstitutionalMemory
    extends RecordTemplate
{

    private final static InstitutionalMemory.Fields _fields = new InstitutionalMemory.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Elements = SCHEMA.getField("elements");

    public InstitutionalMemory() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public InstitutionalMemory(DataMap data) {
        super(data, SCHEMA);
    }

    public static InstitutionalMemory.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public boolean hasElements() {
        return contains(FIELD_Elements);
    }

    /**
     * Remover for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public void removeElements() {
        remove(FIELD_Elements);
    }

    /**
     * Getter for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public InstitutionalMemoryMetadataArray getElements(GetMode mode) {
        return obtainWrapped(FIELD_Elements, InstitutionalMemoryMetadataArray.class, mode);
    }

    /**
     * Getter for elements
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemory.Fields#elements
     */
    @Nonnull
    public InstitutionalMemoryMetadataArray getElements() {
        return obtainWrapped(FIELD_Elements, InstitutionalMemoryMetadataArray.class, GetMode.STRICT);
    }

    /**
     * Setter for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public InstitutionalMemory setElements(InstitutionalMemoryMetadataArray value, SetMode mode) {
        putWrapped(FIELD_Elements, InstitutionalMemoryMetadataArray.class, value, mode);
        return this;
    }

    /**
     * Setter for elements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemory.Fields#elements
     */
    public InstitutionalMemory setElements(
        @Nonnull
        InstitutionalMemoryMetadataArray value) {
        putWrapped(FIELD_Elements, InstitutionalMemoryMetadataArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public InstitutionalMemory clone()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemory) super.clone());
    }

    @Override
    public InstitutionalMemory copy()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemory) super.copy());
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
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public com.linkedin.common.InstitutionalMemoryMetadataArray.Fields elements() {
            return new com.linkedin.common.InstitutionalMemoryMetadataArray.Fields(getPathComponents(), "elements");
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public PathSpec elements(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "elements");
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
