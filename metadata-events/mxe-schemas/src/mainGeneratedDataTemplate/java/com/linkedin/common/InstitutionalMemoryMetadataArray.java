
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InstitutionalMemory.pdl.")
public class InstitutionalMemoryMetadataArray
    extends WrappingArrayTemplate<InstitutionalMemoryMetadata>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}]", SchemaFormatType.PDL));

    public InstitutionalMemoryMetadataArray() {
        this(new DataList());
    }

    public InstitutionalMemoryMetadataArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public InstitutionalMemoryMetadataArray(Collection<InstitutionalMemoryMetadata> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public InstitutionalMemoryMetadataArray(DataList data) {
        super(data, SCHEMA, InstitutionalMemoryMetadata.class);
    }

    public InstitutionalMemoryMetadataArray(InstitutionalMemoryMetadata first, InstitutionalMemoryMetadata... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public InstitutionalMemoryMetadataArray clone()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemoryMetadataArray) super.clone());
    }

    @Override
    public InstitutionalMemoryMetadataArray copy()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemoryMetadataArray) super.copy());
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

        public com.linkedin.common.InstitutionalMemoryMetadata.Fields items() {
            return new com.linkedin.common.InstitutionalMemoryMetadata.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
