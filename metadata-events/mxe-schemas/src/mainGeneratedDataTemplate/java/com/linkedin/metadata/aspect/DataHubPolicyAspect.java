
package com.linkedin.metadata.aspect;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/DataHubPolicyAspect.pdl.")
public class DataHubPolicyAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/displayName:string/**Description of the Policy*/description:string/**The type of policy*/type:string/**The state of policy, ACTIVE or INACTIVE*/state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}/**The privileges that the policy grants.*/privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}/**Whether the policy should be editable via the UI*/editable:boolean=true}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_DataHubPolicyKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataHubPolicyKey");
    private final static DataSchema MEMBER_DataHubPolicyInfo = SCHEMA.getTypeByMemberKey("com.linkedin.policy.DataHubPolicyInfo");
    private final static TyperefInfo TYPEREFINFO = new DataHubPolicyAspect.UnionTyperefInfo();

    public DataHubPolicyAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DataHubPolicyAspect(Object data) {
        super(data, SCHEMA);
    }

    public static DataHubPolicyAspect create(com.linkedin.metadata.key.DataHubPolicyKey value) {
        DataHubPolicyAspect newUnion = new DataHubPolicyAspect();
        newUnion.setDataHubPolicyKey(value);
        return newUnion;
    }

    public boolean isDataHubPolicyKey() {
        return memberIs("com.linkedin.metadata.key.DataHubPolicyKey");
    }

    public com.linkedin.metadata.key.DataHubPolicyKey getDataHubPolicyKey() {
        return obtainWrapped(MEMBER_DataHubPolicyKey, com.linkedin.metadata.key.DataHubPolicyKey.class, "com.linkedin.metadata.key.DataHubPolicyKey");
    }

    public void setDataHubPolicyKey(com.linkedin.metadata.key.DataHubPolicyKey value) {
        selectWrapped(MEMBER_DataHubPolicyKey, com.linkedin.metadata.key.DataHubPolicyKey.class, "com.linkedin.metadata.key.DataHubPolicyKey", value);
    }

    public static DataHubPolicyAspect create(com.linkedin.policy.DataHubPolicyInfo value) {
        DataHubPolicyAspect newUnion = new DataHubPolicyAspect();
        newUnion.setDataHubPolicyInfo(value);
        return newUnion;
    }

    public boolean isDataHubPolicyInfo() {
        return memberIs("com.linkedin.policy.DataHubPolicyInfo");
    }

    public com.linkedin.policy.DataHubPolicyInfo getDataHubPolicyInfo() {
        return obtainWrapped(MEMBER_DataHubPolicyInfo, com.linkedin.policy.DataHubPolicyInfo.class, "com.linkedin.policy.DataHubPolicyInfo");
    }

    public void setDataHubPolicyInfo(com.linkedin.policy.DataHubPolicyInfo value) {
        selectWrapped(MEMBER_DataHubPolicyInfo, com.linkedin.policy.DataHubPolicyInfo.class, "com.linkedin.policy.DataHubPolicyInfo", value);
    }

    @Override
    public DataHubPolicyAspect clone()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyAspect) super.clone());
    }

    @Override
    public DataHubPolicyAspect copy()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyAspect) super.copy());
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

        public com.linkedin.metadata.key.DataHubPolicyKey.Fields DataHubPolicyKey() {
            return new com.linkedin.metadata.key.DataHubPolicyKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataHubPolicyKey");
        }

        public com.linkedin.policy.DataHubPolicyInfo.Fields DataHubPolicyInfo() {
            return new com.linkedin.policy.DataHubPolicyInfo.Fields(getPathComponents(), "com.linkedin.policy.DataHubPolicyInfo");
        }

    }


    /**
     * A union of all supported metadata aspects for a DataHub access policy.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a DataHub access policy.*/typeref DataHubPolicyAspect=union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/displayName:string/**Description of the Policy*/description:string/**The type of policy*/type:string/**The state of policy, ACTIVE or INACTIVE*/state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}/**The privileges that the policy grants.*/privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}/**Whether the policy should be editable via the UI*/editable:boolean=true}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
