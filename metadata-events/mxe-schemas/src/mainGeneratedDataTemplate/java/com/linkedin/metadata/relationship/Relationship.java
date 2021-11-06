
package com.linkedin.metadata.relationship;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/relationship/Relationship.pdl.")
public class Relationship
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.relationship/**A generic model for the Has-A relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.ChartUrn\",\"source\":\"com.linkedin.common.urn.DashboardUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryTermUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryNodeUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record Contains includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{}}{namespace com.linkedin.metadata.relationship/**A generic model for the Is-Part-Of relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DataFlowUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record IsPartOf includes BaseRelationship{}}{namespace com.linkedin.metadata.relationship/**A generic model for the Owned-By relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataProcessUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.MLModelUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryTermUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record OwnedBy includes BaseRelationship{/**The type of the ownership*/type:{namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}}}}{namespace com.linkedin.metadata.relationship/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Consumes includes BaseRelationship{}}{namespace com.linkedin.metadata.relationship/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Produces includes BaseRelationship{}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_Contains = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.relationship.Contains");
    private final static DataSchema MEMBER_IsPartOf = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.relationship.IsPartOf");
    private final static DataSchema MEMBER_OwnedBy = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.relationship.OwnedBy");
    private final static DataSchema MEMBER_Consumes = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.relationship.Consumes");
    private final static DataSchema MEMBER_Produces = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.relationship.Produces");
    private final static TyperefInfo TYPEREFINFO = new Relationship.UnionTyperefInfo();

    public Relationship() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Relationship(Object data) {
        super(data, SCHEMA);
    }

    public static Relationship create(com.linkedin.metadata.relationship.Contains value) {
        Relationship newUnion = new Relationship();
        newUnion.setContains(value);
        return newUnion;
    }

    public boolean isContains() {
        return memberIs("com.linkedin.metadata.relationship.Contains");
    }

    public com.linkedin.metadata.relationship.Contains getContains() {
        return obtainWrapped(MEMBER_Contains, com.linkedin.metadata.relationship.Contains.class, "com.linkedin.metadata.relationship.Contains");
    }

    public void setContains(com.linkedin.metadata.relationship.Contains value) {
        selectWrapped(MEMBER_Contains, com.linkedin.metadata.relationship.Contains.class, "com.linkedin.metadata.relationship.Contains", value);
    }

    public static Relationship create(com.linkedin.metadata.relationship.IsPartOf value) {
        Relationship newUnion = new Relationship();
        newUnion.setIsPartOf(value);
        return newUnion;
    }

    public boolean isIsPartOf() {
        return memberIs("com.linkedin.metadata.relationship.IsPartOf");
    }

    public com.linkedin.metadata.relationship.IsPartOf getIsPartOf() {
        return obtainWrapped(MEMBER_IsPartOf, com.linkedin.metadata.relationship.IsPartOf.class, "com.linkedin.metadata.relationship.IsPartOf");
    }

    public void setIsPartOf(com.linkedin.metadata.relationship.IsPartOf value) {
        selectWrapped(MEMBER_IsPartOf, com.linkedin.metadata.relationship.IsPartOf.class, "com.linkedin.metadata.relationship.IsPartOf", value);
    }

    public static Relationship create(com.linkedin.metadata.relationship.OwnedBy value) {
        Relationship newUnion = new Relationship();
        newUnion.setOwnedBy(value);
        return newUnion;
    }

    public boolean isOwnedBy() {
        return memberIs("com.linkedin.metadata.relationship.OwnedBy");
    }

    public com.linkedin.metadata.relationship.OwnedBy getOwnedBy() {
        return obtainWrapped(MEMBER_OwnedBy, com.linkedin.metadata.relationship.OwnedBy.class, "com.linkedin.metadata.relationship.OwnedBy");
    }

    public void setOwnedBy(com.linkedin.metadata.relationship.OwnedBy value) {
        selectWrapped(MEMBER_OwnedBy, com.linkedin.metadata.relationship.OwnedBy.class, "com.linkedin.metadata.relationship.OwnedBy", value);
    }

    public static Relationship create(com.linkedin.metadata.relationship.Consumes value) {
        Relationship newUnion = new Relationship();
        newUnion.setConsumes(value);
        return newUnion;
    }

    public boolean isConsumes() {
        return memberIs("com.linkedin.metadata.relationship.Consumes");
    }

    public com.linkedin.metadata.relationship.Consumes getConsumes() {
        return obtainWrapped(MEMBER_Consumes, com.linkedin.metadata.relationship.Consumes.class, "com.linkedin.metadata.relationship.Consumes");
    }

    public void setConsumes(com.linkedin.metadata.relationship.Consumes value) {
        selectWrapped(MEMBER_Consumes, com.linkedin.metadata.relationship.Consumes.class, "com.linkedin.metadata.relationship.Consumes", value);
    }

    public static Relationship create(com.linkedin.metadata.relationship.Produces value) {
        Relationship newUnion = new Relationship();
        newUnion.setProduces(value);
        return newUnion;
    }

    public boolean isProduces() {
        return memberIs("com.linkedin.metadata.relationship.Produces");
    }

    public com.linkedin.metadata.relationship.Produces getProduces() {
        return obtainWrapped(MEMBER_Produces, com.linkedin.metadata.relationship.Produces.class, "com.linkedin.metadata.relationship.Produces");
    }

    public void setProduces(com.linkedin.metadata.relationship.Produces value) {
        selectWrapped(MEMBER_Produces, com.linkedin.metadata.relationship.Produces.class, "com.linkedin.metadata.relationship.Produces", value);
    }

    @Override
    public Relationship clone()
        throws CloneNotSupportedException
    {
        return ((Relationship) super.clone());
    }

    @Override
    public Relationship copy()
        throws CloneNotSupportedException
    {
        return ((Relationship) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
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

        public com.linkedin.metadata.relationship.Contains.Fields Contains() {
            return new com.linkedin.metadata.relationship.Contains.Fields(getPathComponents(), "com.linkedin.metadata.relationship.Contains");
        }

        public com.linkedin.metadata.relationship.IsPartOf.Fields IsPartOf() {
            return new com.linkedin.metadata.relationship.IsPartOf.Fields(getPathComponents(), "com.linkedin.metadata.relationship.IsPartOf");
        }

        public com.linkedin.metadata.relationship.OwnedBy.Fields OwnedBy() {
            return new com.linkedin.metadata.relationship.OwnedBy.Fields(getPathComponents(), "com.linkedin.metadata.relationship.OwnedBy");
        }

        public com.linkedin.metadata.relationship.Consumes.Fields Consumes() {
            return new com.linkedin.metadata.relationship.Consumes.Fields(getPathComponents(), "com.linkedin.metadata.relationship.Consumes");
        }

        public com.linkedin.metadata.relationship.Produces.Fields Produces() {
            return new com.linkedin.metadata.relationship.Produces.Fields(getPathComponents(), "com.linkedin.metadata.relationship.Produces");
        }

    }


    /**
     * A union of all supported relationship types.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.relationship/**A union of all supported relationship types.*/typeref Relationship=union[/**A generic model for the Has-A relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.ChartUrn\",\"source\":\"com.linkedin.common.urn.DashboardUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryTermUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryNodeUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record Contains includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{}/**A generic model for the Is-Part-Of relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DataFlowUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record IsPartOf includes BaseRelationship{}/**A generic model for the Owned-By relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataProcessUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.MLModelUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryTermUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record OwnedBy includes BaseRelationship{/**The type of the ownership*/type:{namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}}}/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Consumes includes BaseRelationship{}/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Produces includes BaseRelationship{}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
