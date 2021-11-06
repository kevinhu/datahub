
package com.linkedin.metadata.aspect;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataHubPolicySnapshot.pdl.")
public class DataHubPolicyAspectArray
    extends WrappingArrayTemplate<DataHubPolicyAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/displayName:string/**Description of the Policy*/description:string/**The type of policy*/type:string/**The state of policy, ACTIVE or INACTIVE*/state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}/**The privileges that the policy grants.*/privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}/**Whether the policy should be editable via the UI*/editable:boolean=true}}]]", SchemaFormatType.PDL));

    public DataHubPolicyAspectArray() {
        this(new DataList());
    }

    public DataHubPolicyAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataHubPolicyAspectArray(Collection<DataHubPolicyAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataHubPolicyAspectArray(DataList data) {
        super(data, SCHEMA, DataHubPolicyAspect.class);
    }

    public DataHubPolicyAspectArray(DataHubPolicyAspect first, DataHubPolicyAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DataHubPolicyAspectArray clone()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyAspectArray) super.clone());
    }

    @Override
    public DataHubPolicyAspectArray copy()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyAspectArray) super.copy());
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

        public com.linkedin.metadata.aspect.DataHubPolicyAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataHubPolicyAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
