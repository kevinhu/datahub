
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
import com.linkedin.metadata.aspect.GlossaryTermAspectArray;


/**
 * A metadata snapshot for a specific GlossaryTerm entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/GlossaryTermSnapshot.pdl.")
public class GlossaryTermSnapshot
    extends RecordTemplate
{

    private final static GlossaryTermSnapshot.Fields _fields = new GlossaryTermSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific GlossaryTerm entity.*/@Entity={\"keyAspect\":\"glossaryTermKey\",\"name\":\"glossaryTerm\"}record GlossaryTermSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}/**The list of metadata aspects associated with the GlossaryTerm. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpUser*/typeref GlossaryTermAspect=union[{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo{/**Definition of business term*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryNode\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryNode\",\"doc\":\"Standardized business node identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business node with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}/**A key-value map to capture any other non-standardized properties for the glossary term*/customProperties:map[string,string]={}/**Schema definition of the glossary term*/rawSchema:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"name\":\"IsA\",\"entityTypes\":[\"glossaryTerm\"]}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"boostScore\":2.0,\"fieldType\":\"URN\"}isRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"name\":\"HasA\",\"entityTypes\":[\"glossaryTerm\"]}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"boostScore\":2.0,\"fieldType\":\"URN\"}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
    }

    public GlossaryTermSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public GlossaryTermSnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTermSnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryTermSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryTermSnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryTermSnapshot.Fields#urn
     */
    public com.linkedin.common.urn.GlossaryTermUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryTermUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryTermSnapshot.Fields#urn
     */
    public GlossaryTermSnapshot setUrn(com.linkedin.common.urn.GlossaryTermUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermSnapshot.Fields#urn
     */
    public GlossaryTermSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryTermUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    public GlossaryTermAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, GlossaryTermAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    @Nonnull
    public GlossaryTermAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, GlossaryTermAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    public GlossaryTermSnapshot setAspects(GlossaryTermAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, GlossaryTermAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermSnapshot.Fields#aspects
     */
    public GlossaryTermSnapshot setAspects(
        @Nonnull
        GlossaryTermAspectArray value) {
        putWrapped(FIELD_Aspects, GlossaryTermAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTermSnapshot clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermSnapshot) super.clone());
    }

    @Override
    public GlossaryTermSnapshot copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermSnapshot) super.copy());
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
         * The list of metadata aspects associated with the GlossaryTerm. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.GlossaryTermAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.GlossaryTermAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the GlossaryTerm. Depending on the use case, this can either be all, or a selection, of supported aspects.
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
