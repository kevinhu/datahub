
package com.linkedin.metadata.relationship;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/MetadataGraphEvent.pdl.")
public class RelationshipArray
    extends WrappingArrayTemplate<Relationship>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.relationship/**A generic model for the Has-A relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.ChartUrn\",\"source\":\"com.linkedin.common.urn.DashboardUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryTermUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryNodeUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record Contains includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{}}{namespace com.linkedin.metadata.relationship/**A generic model for the Is-Part-Of relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DataFlowUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record IsPartOf includes BaseRelationship{}}{namespace com.linkedin.metadata.relationship/**A generic model for the Owned-By relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataProcessUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.MLModelUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryTermUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record OwnedBy includes BaseRelationship{/**The type of the ownership*/type:{namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}}}}{namespace com.linkedin.metadata.relationship/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Consumes includes BaseRelationship{}}{namespace com.linkedin.metadata.relationship/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Produces includes BaseRelationship{}}]]", SchemaFormatType.PDL));

    public RelationshipArray() {
        this(new DataList());
    }

    public RelationshipArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RelationshipArray(Collection<Relationship> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RelationshipArray(DataList data) {
        super(data, SCHEMA, Relationship.class);
    }

    public RelationshipArray(Relationship first, Relationship... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public RelationshipArray clone()
        throws CloneNotSupportedException
    {
        return ((RelationshipArray) super.clone());
    }

    @Override
    public RelationshipArray copy()
        throws CloneNotSupportedException
    {
        return ((RelationshipArray) super.copy());
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

        public com.linkedin.metadata.relationship.Relationship.Fields items() {
            return new com.linkedin.metadata.relationship.Relationship.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
