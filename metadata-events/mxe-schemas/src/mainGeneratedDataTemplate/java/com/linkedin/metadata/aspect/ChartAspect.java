
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/ChartAspect.pdl.")
public class ChartAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the chart*/@Searchable={}description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/chartUrl:optional com.linkedin.common.Url/**Data sources for the chart*/@Relationship.`/*/string`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]/**Type of the chart*/@Searchable={\"filterNameOverride\":\"Chart Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}/**Access level for the chart*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"fieldName\":\"queryType\",\"filterNameOverride\":\"Query Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.chart/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableChartProperties\"record EditableChartProperties includes com.linkedin.common.ChangeAuditStamps{/**Edited documentation of the chart */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\"}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_ChartKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.ChartKey");
    private final static DataSchema MEMBER_ChartInfo = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartInfo");
    private final static DataSchema MEMBER_ChartQuery = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartQuery");
    private final static DataSchema MEMBER_EditableChartProperties = SCHEMA.getTypeByMemberKey("com.linkedin.chart.EditableChartProperties");
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    private final static DataSchema MEMBER_GlossaryTerms = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlossaryTerms");
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    private final static TyperefInfo TYPEREFINFO = new ChartAspect.UnionTyperefInfo();

    public ChartAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public ChartAspect(Object data) {
        super(data, SCHEMA);
    }

    public static ChartAspect create(com.linkedin.metadata.key.ChartKey value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setChartKey(value);
        return newUnion;
    }

    public boolean isChartKey() {
        return memberIs("com.linkedin.metadata.key.ChartKey");
    }

    public com.linkedin.metadata.key.ChartKey getChartKey() {
        return obtainWrapped(MEMBER_ChartKey, com.linkedin.metadata.key.ChartKey.class, "com.linkedin.metadata.key.ChartKey");
    }

    public void setChartKey(com.linkedin.metadata.key.ChartKey value) {
        selectWrapped(MEMBER_ChartKey, com.linkedin.metadata.key.ChartKey.class, "com.linkedin.metadata.key.ChartKey", value);
    }

    public static ChartAspect create(com.linkedin.chart.ChartInfo value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setChartInfo(value);
        return newUnion;
    }

    public boolean isChartInfo() {
        return memberIs("com.linkedin.chart.ChartInfo");
    }

    public com.linkedin.chart.ChartInfo getChartInfo() {
        return obtainWrapped(MEMBER_ChartInfo, com.linkedin.chart.ChartInfo.class, "com.linkedin.chart.ChartInfo");
    }

    public void setChartInfo(com.linkedin.chart.ChartInfo value) {
        selectWrapped(MEMBER_ChartInfo, com.linkedin.chart.ChartInfo.class, "com.linkedin.chart.ChartInfo", value);
    }

    public static ChartAspect create(com.linkedin.chart.ChartQuery value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setChartQuery(value);
        return newUnion;
    }

    public boolean isChartQuery() {
        return memberIs("com.linkedin.chart.ChartQuery");
    }

    public com.linkedin.chart.ChartQuery getChartQuery() {
        return obtainWrapped(MEMBER_ChartQuery, com.linkedin.chart.ChartQuery.class, "com.linkedin.chart.ChartQuery");
    }

    public void setChartQuery(com.linkedin.chart.ChartQuery value) {
        selectWrapped(MEMBER_ChartQuery, com.linkedin.chart.ChartQuery.class, "com.linkedin.chart.ChartQuery", value);
    }

    public static ChartAspect create(com.linkedin.chart.EditableChartProperties value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setEditableChartProperties(value);
        return newUnion;
    }

    public boolean isEditableChartProperties() {
        return memberIs("com.linkedin.chart.EditableChartProperties");
    }

    public com.linkedin.chart.EditableChartProperties getEditableChartProperties() {
        return obtainWrapped(MEMBER_EditableChartProperties, com.linkedin.chart.EditableChartProperties.class, "com.linkedin.chart.EditableChartProperties");
    }

    public void setEditableChartProperties(com.linkedin.chart.EditableChartProperties value) {
        selectWrapped(MEMBER_EditableChartProperties, com.linkedin.chart.EditableChartProperties.class, "com.linkedin.chart.EditableChartProperties", value);
    }

    public static ChartAspect create(com.linkedin.common.Ownership value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setOwnership(value);
        return newUnion;
    }

    public boolean isOwnership() {
        return memberIs("com.linkedin.common.Ownership");
    }

    public com.linkedin.common.Ownership getOwnership() {
        return obtainWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership");
    }

    public void setOwnership(com.linkedin.common.Ownership value) {
        selectWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership", value);
    }

    public static ChartAspect create(com.linkedin.common.Status value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setStatus(value);
        return newUnion;
    }

    public boolean isStatus() {
        return memberIs("com.linkedin.common.Status");
    }

    public com.linkedin.common.Status getStatus() {
        return obtainWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status");
    }

    public void setStatus(com.linkedin.common.Status value) {
        selectWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status", value);
    }

    public static ChartAspect create(com.linkedin.common.GlobalTags value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setGlobalTags(value);
        return newUnion;
    }

    public boolean isGlobalTags() {
        return memberIs("com.linkedin.common.GlobalTags");
    }

    public com.linkedin.common.GlobalTags getGlobalTags() {
        return obtainWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags");
    }

    public void setGlobalTags(com.linkedin.common.GlobalTags value) {
        selectWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags", value);
    }

    public static ChartAspect create(com.linkedin.common.BrowsePaths value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setBrowsePaths(value);
        return newUnion;
    }

    public boolean isBrowsePaths() {
        return memberIs("com.linkedin.common.BrowsePaths");
    }

    public com.linkedin.common.BrowsePaths getBrowsePaths() {
        return obtainWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths");
    }

    public void setBrowsePaths(com.linkedin.common.BrowsePaths value) {
        selectWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths", value);
    }

    public static ChartAspect create(com.linkedin.common.GlossaryTerms value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setGlossaryTerms(value);
        return newUnion;
    }

    public boolean isGlossaryTerms() {
        return memberIs("com.linkedin.common.GlossaryTerms");
    }

    public com.linkedin.common.GlossaryTerms getGlossaryTerms() {
        return obtainWrapped(MEMBER_GlossaryTerms, com.linkedin.common.GlossaryTerms.class, "com.linkedin.common.GlossaryTerms");
    }

    public void setGlossaryTerms(com.linkedin.common.GlossaryTerms value) {
        selectWrapped(MEMBER_GlossaryTerms, com.linkedin.common.GlossaryTerms.class, "com.linkedin.common.GlossaryTerms", value);
    }

    public static ChartAspect create(com.linkedin.common.InstitutionalMemory value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setInstitutionalMemory(value);
        return newUnion;
    }

    public boolean isInstitutionalMemory() {
        return memberIs("com.linkedin.common.InstitutionalMemory");
    }

    public com.linkedin.common.InstitutionalMemory getInstitutionalMemory() {
        return obtainWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory");
    }

    public void setInstitutionalMemory(com.linkedin.common.InstitutionalMemory value) {
        selectWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory", value);
    }

    public static ChartAspect create(com.linkedin.common.DataPlatformInstance value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setDataPlatformInstance(value);
        return newUnion;
    }

    public boolean isDataPlatformInstance() {
        return memberIs("com.linkedin.common.DataPlatformInstance");
    }

    public com.linkedin.common.DataPlatformInstance getDataPlatformInstance() {
        return obtainWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance");
    }

    public void setDataPlatformInstance(com.linkedin.common.DataPlatformInstance value) {
        selectWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance", value);
    }

    @Override
    public ChartAspect clone()
        throws CloneNotSupportedException
    {
        return ((ChartAspect) super.clone());
    }

    @Override
    public ChartAspect copy()
        throws CloneNotSupportedException
    {
        return ((ChartAspect) super.copy());
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

        public com.linkedin.metadata.key.ChartKey.Fields ChartKey() {
            return new com.linkedin.metadata.key.ChartKey.Fields(getPathComponents(), "com.linkedin.metadata.key.ChartKey");
        }

        public com.linkedin.chart.ChartInfo.Fields ChartInfo() {
            return new com.linkedin.chart.ChartInfo.Fields(getPathComponents(), "com.linkedin.chart.ChartInfo");
        }

        public com.linkedin.chart.ChartQuery.Fields ChartQuery() {
            return new com.linkedin.chart.ChartQuery.Fields(getPathComponents(), "com.linkedin.chart.ChartQuery");
        }

        public com.linkedin.chart.EditableChartProperties.Fields EditableChartProperties() {
            return new com.linkedin.chart.EditableChartProperties.Fields(getPathComponents(), "com.linkedin.chart.EditableChartProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.GlossaryTerms.Fields GlossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "com.linkedin.common.GlossaryTerms");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }


    /**
     * A union of all supported metadata aspects for a Chart
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Chart*/typeref ChartAspect=union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the chart*/@Searchable={}description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/chartUrl:optional com.linkedin.common.Url/**Data sources for the chart*/@Relationship.`/*/string`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]/**Type of the chart*/@Searchable={\"filterNameOverride\":\"Chart Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}/**Access level for the chart*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"fieldName\":\"queryType\",\"filterNameOverride\":\"Query Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.chart/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableChartProperties\"record EditableChartProperties includes com.linkedin.common.ChangeAuditStamps{/**Edited documentation of the chart */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\"}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
