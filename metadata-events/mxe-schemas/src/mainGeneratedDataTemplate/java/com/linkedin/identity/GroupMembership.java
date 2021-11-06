
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * Carries information about the CorpGroups a user is in.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/GroupMembership.pdl.")
public class GroupMembership
    extends RecordTemplate
{

    private final static GroupMembership.Fields _fields = new GroupMembership.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"name\":\"IsMemberOfGroup\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    public GroupMembership() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public GroupMembership(DataMap data) {
        super(data, SCHEMA);
    }

    public static GroupMembership.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    public UrnArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, UrnArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupMembership.Fields#groups
     */
    @Nonnull
    public UrnArray getGroups() {
        return obtainWrapped(FIELD_Groups, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    public GroupMembership setGroups(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Groups, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupMembership.Fields#groups
     */
    public GroupMembership setGroups(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Groups, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GroupMembership clone()
        throws CloneNotSupportedException
    {
        return ((GroupMembership) super.clone());
    }

    @Override
    public GroupMembership copy()
        throws CloneNotSupportedException
    {
        return ((GroupMembership) super.copy());
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

        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

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

    }

}
