
package com.linkedin.policy;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Information used to filter DataHub actors.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/DataHubActorFilter.pdl.")
public class DataHubActorFilter
    extends RecordTemplate
{

    private final static DataHubActorFilter.Fields _fields = new DataHubActorFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Whether the filter should apply to all users.*/allUsers:boolean=false/**Whether the filter should apply to all groups.*/allGroups:boolean=false}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_ResourceOwners = SCHEMA.getField("resourceOwners");
    private final static RecordDataSchema.Field FIELD_AllUsers = SCHEMA.getField("allUsers");
    private final static RecordDataSchema.Field FIELD_AllGroups = SCHEMA.getField("allGroups");

    public DataHubActorFilter() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
    }

    public DataHubActorFilter(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubActorFilter.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for users
     * 
     * @see DataHubActorFilter.Fields#users
     */
    public boolean hasUsers() {
        return contains(FIELD_Users);
    }

    /**
     * Remover for users
     * 
     * @see DataHubActorFilter.Fields#users
     */
    public void removeUsers() {
        remove(FIELD_Users);
    }

    /**
     * Getter for users
     * 
     * @see DataHubActorFilter.Fields#users
     */
    public UrnArray getUsers(GetMode mode) {
        return obtainWrapped(FIELD_Users, UrnArray.class, mode);
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubActorFilter.Fields#users
     */
    @Nullable
    public UrnArray getUsers() {
        return obtainWrapped(FIELD_Users, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for users
     * 
     * @see DataHubActorFilter.Fields#users
     */
    public DataHubActorFilter setUsers(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Users, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for users
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#users
     */
    public DataHubActorFilter setUsers(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Users, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see DataHubActorFilter.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see DataHubActorFilter.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see DataHubActorFilter.Fields#groups
     */
    public UrnArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, UrnArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubActorFilter.Fields#groups
     */
    @Nullable
    public UrnArray getGroups() {
        return obtainWrapped(FIELD_Groups, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see DataHubActorFilter.Fields#groups
     */
    public DataHubActorFilter setGroups(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Groups, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#groups
     */
    public DataHubActorFilter setGroups(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Groups, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public boolean hasResourceOwners() {
        return contains(FIELD_ResourceOwners);
    }

    /**
     * Remover for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public void removeResourceOwners() {
        remove(FIELD_ResourceOwners);
    }

    /**
     * Getter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public Boolean isResourceOwners(GetMode mode) {
        return obtainDirect(FIELD_ResourceOwners, Boolean.class, mode);
    }

    /**
     * Getter for resourceOwners
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    @Nonnull
    public Boolean isResourceOwners() {
        return obtainDirect(FIELD_ResourceOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_ResourceOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for resourceOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_ResourceOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(boolean value) {
        putDirect(FIELD_ResourceOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public boolean hasAllUsers() {
        return contains(FIELD_AllUsers);
    }

    /**
     * Remover for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public void removeAllUsers() {
        remove(FIELD_AllUsers);
    }

    /**
     * Getter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public Boolean isAllUsers(GetMode mode) {
        return obtainDirect(FIELD_AllUsers, Boolean.class, mode);
    }

    /**
     * Getter for allUsers
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#allUsers
     */
    @Nonnull
    public Boolean isAllUsers() {
        return obtainDirect(FIELD_AllUsers, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(Boolean value, SetMode mode) {
        putDirect(FIELD_AllUsers, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for allUsers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_AllUsers, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(boolean value) {
        putDirect(FIELD_AllUsers, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public boolean hasAllGroups() {
        return contains(FIELD_AllGroups);
    }

    /**
     * Remover for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public void removeAllGroups() {
        remove(FIELD_AllGroups);
    }

    /**
     * Getter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public Boolean isAllGroups(GetMode mode) {
        return obtainDirect(FIELD_AllGroups, Boolean.class, mode);
    }

    /**
     * Getter for allGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#allGroups
     */
    @Nonnull
    public Boolean isAllGroups() {
        return obtainDirect(FIELD_AllGroups, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(Boolean value, SetMode mode) {
        putDirect(FIELD_AllGroups, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for allGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_AllGroups, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(boolean value) {
        putDirect(FIELD_AllGroups, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataHubActorFilter clone()
        throws CloneNotSupportedException
    {
        return ((DataHubActorFilter) super.clone());
    }

    @Override
    public DataHubActorFilter copy()
        throws CloneNotSupportedException
    {
        return ((DataHubActorFilter) super.copy());
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
         * A specific set of users to apply the policy to (disjunctive)
         * 
         */
        public PathSpec users() {
            return new PathSpec(getPathComponents(), "users");
        }

        /**
         * A specific set of users to apply the policy to (disjunctive)
         * 
         */
        public PathSpec users(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "users");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A specific set of groups to apply the policy to (disjunctive)
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * A specific set of groups to apply the policy to (disjunctive)
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether the filter should return true for owners of a particular resource.
         * Only applies to policies of type 'Metadata', which have a resource associated with them.
         * 
         */
        public PathSpec resourceOwners() {
            return new PathSpec(getPathComponents(), "resourceOwners");
        }

        /**
         * Whether the filter should apply to all users.
         * 
         */
        public PathSpec allUsers() {
            return new PathSpec(getPathComponents(), "allUsers");
        }

        /**
         * Whether the filter should apply to all groups.
         * 
         */
        public PathSpec allGroups() {
            return new PathSpec(getPathComponents(), "allGroups");
        }

    }

}
