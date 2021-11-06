
package com.linkedin.metadata.snapshot;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.aspect.DataHubPolicyAspectArray;


/**
 * A metadata snapshot for DataHub Access Policy data.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataHubPolicySnapshot.pdl.")
public class DataHubPolicySnapshot
    extends RecordTemplate
{

    private final static DataHubPolicySnapshot.Fields _fields = new DataHubPolicySnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for DataHub Access Policy data.*/@Entity={\"keyAspect\":\"dataHubPolicyKey\",\"name\":\"dataHubPolicy\"}record DataHubPolicySnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The list of metadata aspects associated with the DataHub access policy.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a DataHub access policy.*/typeref DataHubPolicyAspect=union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/displayName:string/**Description of the Policy*/description:string/**The type of policy*/type:string/**The state of policy, ACTIVE or INACTIVE*/state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}/**The privileges that the policy grants.*/privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[com.linkedin.common.Urn]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}/**Whether the policy should be editable via the UI*/editable:boolean=true}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataHubPolicySnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public DataHubPolicySnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubPolicySnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataHubPolicySnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataHubPolicySnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataHubPolicySnapshot.Fields#urn
     */
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicySnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataHubPolicySnapshot.Fields#urn
     */
    public DataHubPolicySnapshot setUrn(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicySnapshot.Fields#urn
     */
    public DataHubPolicySnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    public DataHubPolicyAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, DataHubPolicyAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    @Nonnull
    public DataHubPolicyAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, DataHubPolicyAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    public DataHubPolicySnapshot setAspects(DataHubPolicyAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, DataHubPolicyAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicySnapshot.Fields#aspects
     */
    public DataHubPolicySnapshot setAspects(
        @Nonnull
        DataHubPolicyAspectArray value) {
        putWrapped(FIELD_Aspects, DataHubPolicyAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataHubPolicySnapshot clone()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicySnapshot) super.clone());
    }

    @Override
    public DataHubPolicySnapshot copy()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicySnapshot) super.copy());
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
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the DataHub access policy.
         * 
         */
        public com.linkedin.metadata.aspect.DataHubPolicyAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.DataHubPolicyAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the DataHub access policy.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
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
