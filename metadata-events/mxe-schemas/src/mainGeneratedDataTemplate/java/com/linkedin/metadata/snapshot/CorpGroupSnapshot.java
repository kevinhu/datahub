
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
import com.linkedin.metadata.aspect.CorpGroupAspectArray;


/**
 * A metadata snapshot for a specific CorpGroup entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/CorpGroupSnapshot.pdl.")
public class CorpGroupSnapshot
    extends RecordTemplate
{

    private final static CorpGroupSnapshot.Fields _fields = new CorpGroupSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific CorpGroup entity.*/@Entity={\"keyAspect\":\"corpGroupKey\",\"name\":\"corpGroup\"}record CorpGroupSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}/**The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpGroup*/typeref CorpGroupAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[com.linkedin.common.CorpGroupUrn]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public CorpGroupSnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpGroupSnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    public com.linkedin.common.urn.CorpGroupUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpGroupUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    public CorpGroupSnapshot setUrn(com.linkedin.common.urn.CorpGroupUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupSnapshot.Fields#urn
     */
    public CorpGroupSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpGroupUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public CorpGroupAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, CorpGroupAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupSnapshot.Fields#aspects
     */
    @Nonnull
    public CorpGroupAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, CorpGroupAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public CorpGroupSnapshot setAspects(CorpGroupAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, CorpGroupAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public CorpGroupSnapshot setAspects(
        @Nonnull
        CorpGroupAspectArray value) {
        putWrapped(FIELD_Aspects, CorpGroupAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpGroupSnapshot clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupSnapshot) super.clone());
    }

    @Override
    public CorpGroupSnapshot copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupSnapshot) super.copy());
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
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.CorpGroupAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.CorpGroupAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
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
