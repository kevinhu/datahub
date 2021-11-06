
package com.linkedin.policy;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Information about a DataHub (UI) access policy.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/DataHubPolicyInfo.pdl.")
public class DataHubPolicyInfo
    extends RecordTemplate
{

    private final static DataHubPolicyInfo.Fields _fields = new DataHubPolicyInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/displayName:string/**Description of the Policy*/description:string/**The type of policy*/type:string/**The state of policy, ACTIVE or INACTIVE*/state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/allResources:boolean=false}/**The privileges that the policy grants.*/privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}/**Whether the policy should be editable via the UI*/editable:boolean=true}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");
    private final static RecordDataSchema.Field FIELD_Resources = SCHEMA.getField("resources");
    private final static RecordDataSchema.Field FIELD_Privileges = SCHEMA.getField("privileges");
    private final static RecordDataSchema.Field FIELD_Actors = SCHEMA.getField("actors");
    private final static RecordDataSchema.Field FIELD_Editable = SCHEMA.getField("editable");

    public DataHubPolicyInfo() {
        super(new DataMap(11, 0.75F), SCHEMA, 4);
    }

    public DataHubPolicyInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubPolicyInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        return contains(FIELD_DisplayName);
    }

    /**
     * Remover for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public void removeDisplayName() {
        remove(FIELD_DisplayName);
    }

    /**
     * Getter for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public String getDisplayName(GetMode mode) {
        return obtainDirect(FIELD_DisplayName, String.class, mode);
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#displayName
     */
    @Nonnull
    public String getDisplayName() {
        return obtainDirect(FIELD_DisplayName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public DataHubPolicyInfo setDisplayName(String value, SetMode mode) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public DataHubPolicyInfo setDisplayName(
        @Nonnull
        String value) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#description
     */
    @Nonnull
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    public DataHubPolicyInfo setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#description
     */
    public DataHubPolicyInfo setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    public String getType(GetMode mode) {
        return obtainDirect(FIELD_Type, String.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#type
     */
    @Nonnull
    public String getType() {
        return obtainDirect(FIELD_Type, String.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    public DataHubPolicyInfo setType(String value, SetMode mode) {
        putDirect(FIELD_Type, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#type
     */
    public DataHubPolicyInfo setType(
        @Nonnull
        String value) {
        putDirect(FIELD_Type, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    public boolean hasState() {
        return contains(FIELD_State);
    }

    /**
     * Remover for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    public void removeState() {
        remove(FIELD_State);
    }

    /**
     * Getter for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    public String getState(GetMode mode) {
        return obtainDirect(FIELD_State, String.class, mode);
    }

    /**
     * Getter for state
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#state
     */
    @Nonnull
    public String getState() {
        return obtainDirect(FIELD_State, String.class, GetMode.STRICT);
    }

    /**
     * Setter for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    public DataHubPolicyInfo setState(String value, SetMode mode) {
        putDirect(FIELD_State, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for state
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#state
     */
    public DataHubPolicyInfo setState(
        @Nonnull
        String value) {
        putDirect(FIELD_State, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public boolean hasResources() {
        return contains(FIELD_Resources);
    }

    /**
     * Remover for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public void removeResources() {
        remove(FIELD_Resources);
    }

    /**
     * Getter for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public DataHubResourceFilter getResources(GetMode mode) {
        return obtainWrapped(FIELD_Resources, DataHubResourceFilter.class, mode);
    }

    /**
     * Getter for resources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPolicyInfo.Fields#resources
     */
    @Nullable
    public DataHubResourceFilter getResources() {
        return obtainWrapped(FIELD_Resources, DataHubResourceFilter.class, GetMode.STRICT);
    }

    /**
     * Setter for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public DataHubPolicyInfo setResources(DataHubResourceFilter value, SetMode mode) {
        putWrapped(FIELD_Resources, DataHubResourceFilter.class, value, mode);
        return this;
    }

    /**
     * Setter for resources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#resources
     */
    public DataHubPolicyInfo setResources(
        @Nonnull
        DataHubResourceFilter value) {
        putWrapped(FIELD_Resources, DataHubResourceFilter.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public boolean hasPrivileges() {
        return contains(FIELD_Privileges);
    }

    /**
     * Remover for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public void removePrivileges() {
        remove(FIELD_Privileges);
    }

    /**
     * Getter for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public StringArray getPrivileges(GetMode mode) {
        return obtainWrapped(FIELD_Privileges, StringArray.class, mode);
    }

    /**
     * Getter for privileges
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#privileges
     */
    @Nonnull
    public StringArray getPrivileges() {
        return obtainWrapped(FIELD_Privileges, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public DataHubPolicyInfo setPrivileges(StringArray value, SetMode mode) {
        putWrapped(FIELD_Privileges, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for privileges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public DataHubPolicyInfo setPrivileges(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Privileges, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public boolean hasActors() {
        return contains(FIELD_Actors);
    }

    /**
     * Remover for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public void removeActors() {
        remove(FIELD_Actors);
    }

    /**
     * Getter for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public DataHubActorFilter getActors(GetMode mode) {
        return obtainWrapped(FIELD_Actors, DataHubActorFilter.class, mode);
    }

    /**
     * Getter for actors
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#actors
     */
    @Nonnull
    public DataHubActorFilter getActors() {
        return obtainWrapped(FIELD_Actors, DataHubActorFilter.class, GetMode.STRICT);
    }

    /**
     * Setter for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public DataHubPolicyInfo setActors(DataHubActorFilter value, SetMode mode) {
        putWrapped(FIELD_Actors, DataHubActorFilter.class, value, mode);
        return this;
    }

    /**
     * Setter for actors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#actors
     */
    public DataHubPolicyInfo setActors(
        @Nonnull
        DataHubActorFilter value) {
        putWrapped(FIELD_Actors, DataHubActorFilter.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public boolean hasEditable() {
        return contains(FIELD_Editable);
    }

    /**
     * Remover for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public void removeEditable() {
        remove(FIELD_Editable);
    }

    /**
     * Getter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public Boolean isEditable(GetMode mode) {
        return obtainDirect(FIELD_Editable, Boolean.class, mode);
    }

    /**
     * Getter for editable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#editable
     */
    @Nonnull
    public Boolean isEditable() {
        return obtainDirect(FIELD_Editable, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(Boolean value, SetMode mode) {
        putDirect(FIELD_Editable, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for editable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Editable, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(boolean value) {
        putDirect(FIELD_Editable, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataHubPolicyInfo clone()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyInfo) super.clone());
    }

    @Override
    public DataHubPolicyInfo copy()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyInfo) super.copy());
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
         * Display name of the Policy
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * Description of the Policy
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The type of policy
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The state of policy, ACTIVE or INACTIVE
         * 
         */
        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

        /**
         * The resource that the policy applies to. Not required for some 'Platform' privileges.
         * 
         */
        public com.linkedin.policy.DataHubResourceFilter.Fields resources() {
            return new com.linkedin.policy.DataHubResourceFilter.Fields(getPathComponents(), "resources");
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public PathSpec privileges() {
            return new PathSpec(getPathComponents(), "privileges");
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public PathSpec privileges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "privileges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The actors that the policy applies to.
         * 
         */
        public com.linkedin.policy.DataHubActorFilter.Fields actors() {
            return new com.linkedin.policy.DataHubActorFilter.Fields(getPathComponents(), "actors");
        }

        /**
         * Whether the policy should be editable via the UI
         * 
         */
        public PathSpec editable() {
            return new PathSpec(getPathComponents(), "editable");
        }

    }

}
