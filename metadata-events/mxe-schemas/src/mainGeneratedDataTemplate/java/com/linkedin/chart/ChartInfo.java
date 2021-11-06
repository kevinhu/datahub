
package com.linkedin.chart;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AccessLevel;
import com.linkedin.common.ChangeAuditStamps;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about a chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartInfo.pdl.")
public class ChartInfo
    extends RecordTemplate
{

    private final static ChartInfo.Fields _fields = new ChartInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the chart*/@Searchable={}description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/chartUrl:optional com.linkedin.common.Url/**Data sources for the chart*/@Relationship.`/*/string`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]/**Type of the chart*/@Searchable={\"filterNameOverride\":\"Chart Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}/**Access level for the chart*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_ChartUrl = SCHEMA.getField("chartUrl");
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Access = SCHEMA.getField("access");
    private final static RecordDataSchema.Field FIELD_LastRefreshed = SCHEMA.getField("lastRefreshed");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public ChartInfo() {
        super(new DataMap(14, 0.75F), SCHEMA, 4);
    }

    public ChartInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static ChartInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
     */
    public ChartInfo setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#customProperties
     */
    public ChartInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
     */
    public ChartInfo setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#externalUrl
     */
    public ChartInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see ChartInfo.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see ChartInfo.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see ChartInfo.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#title
     */
    @Nonnull
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see ChartInfo.Fields#title
     */
    public ChartInfo setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#title
     */
    public ChartInfo setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see ChartInfo.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see ChartInfo.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see ChartInfo.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#description
     */
    @Nonnull
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see ChartInfo.Fields#description
     */
    public ChartInfo setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#description
     */
    public ChartInfo setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    public ChangeAuditStamps getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, ChangeAuditStamps.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#lastModified
     */
    @Nonnull
    public ChangeAuditStamps getLastModified() {
        return obtainWrapped(FIELD_LastModified, ChangeAuditStamps.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    public ChartInfo setLastModified(ChangeAuditStamps value, SetMode mode) {
        putWrapped(FIELD_LastModified, ChangeAuditStamps.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#lastModified
     */
    public ChartInfo setLastModified(
        @Nonnull
        ChangeAuditStamps value) {
        putWrapped(FIELD_LastModified, ChangeAuditStamps.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public boolean hasChartUrl() {
        return contains(FIELD_ChartUrl);
    }

    /**
     * Remover for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public void removeChartUrl() {
        remove(FIELD_ChartUrl);
    }

    /**
     * Getter for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public com.linkedin.common.url.Url getChartUrl(GetMode mode) {
        return obtainCustomType(FIELD_ChartUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for chartUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#chartUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getChartUrl() {
        return obtainCustomType(FIELD_ChartUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public ChartInfo setChartUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ChartUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for chartUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#chartUrl
     */
    public ChartInfo setChartUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ChartUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    public boolean hasInputs() {
        return contains(FIELD_Inputs);
    }

    /**
     * Remover for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    public void removeInputs() {
        remove(FIELD_Inputs);
    }

    /**
     * Getter for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    public ChartDataSourceTypeArray getInputs(GetMode mode) {
        return obtainWrapped(FIELD_Inputs, ChartDataSourceTypeArray.class, mode);
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#inputs
     */
    @Nullable
    public ChartDataSourceTypeArray getInputs() {
        return obtainWrapped(FIELD_Inputs, ChartDataSourceTypeArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    public ChartInfo setInputs(ChartDataSourceTypeArray value, SetMode mode) {
        putWrapped(FIELD_Inputs, ChartDataSourceTypeArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#inputs
     */
    public ChartInfo setInputs(
        @Nonnull
        ChartDataSourceTypeArray value) {
        putWrapped(FIELD_Inputs, ChartDataSourceTypeArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see ChartInfo.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see ChartInfo.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see ChartInfo.Fields#type
     */
    public ChartType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, ChartType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#type
     */
    @Nullable
    public ChartType getType() {
        return obtainDirect(FIELD_Type, ChartType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see ChartInfo.Fields#type
     */
    public ChartInfo setType(ChartType value, SetMode mode) {
        putDirect(FIELD_Type, ChartType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#type
     */
    public ChartInfo setType(
        @Nonnull
        ChartType value) {
        putDirect(FIELD_Type, ChartType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for access
     * 
     * @see ChartInfo.Fields#access
     */
    public boolean hasAccess() {
        return contains(FIELD_Access);
    }

    /**
     * Remover for access
     * 
     * @see ChartInfo.Fields#access
     */
    public void removeAccess() {
        remove(FIELD_Access);
    }

    /**
     * Getter for access
     * 
     * @see ChartInfo.Fields#access
     */
    public AccessLevel getAccess(GetMode mode) {
        return obtainDirect(FIELD_Access, AccessLevel.class, mode);
    }

    /**
     * Getter for access
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#access
     */
    @Nullable
    public AccessLevel getAccess() {
        return obtainDirect(FIELD_Access, AccessLevel.class, GetMode.STRICT);
    }

    /**
     * Setter for access
     * 
     * @see ChartInfo.Fields#access
     */
    public ChartInfo setAccess(AccessLevel value, SetMode mode) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for access
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#access
     */
    public ChartInfo setAccess(
        @Nonnull
        AccessLevel value) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public boolean hasLastRefreshed() {
        return contains(FIELD_LastRefreshed);
    }

    /**
     * Remover for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public void removeLastRefreshed() {
        remove(FIELD_LastRefreshed);
    }

    /**
     * Getter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public Long getLastRefreshed(GetMode mode) {
        return obtainDirect(FIELD_LastRefreshed, Long.class, mode);
    }

    /**
     * Getter for lastRefreshed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#lastRefreshed
     */
    @Nullable
    public Long getLastRefreshed() {
        return obtainDirect(FIELD_LastRefreshed, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(Long value, SetMode mode) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(
        @Nonnull
        Long value) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(long value) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ChartInfo clone()
        throws CloneNotSupportedException
    {
        return ((ChartInfo) super.clone());
    }

    @Override
    public ChartInfo copy()
        throws CloneNotSupportedException
    {
        return ((ChartInfo) super.copy());
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Title of the chart
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Detailed description about the chart
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Captures information about who created/last modified/deleted this chart and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields lastModified() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "lastModified");
        }

        /**
         * URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart
         * 
         */
        public PathSpec chartUrl() {
            return new PathSpec(getPathComponents(), "chartUrl");
        }

        /**
         * Data sources for the chart
         * 
         */
        public com.linkedin.chart.ChartDataSourceTypeArray.Fields inputs() {
            return new com.linkedin.chart.ChartDataSourceTypeArray.Fields(getPathComponents(), "inputs");
        }

        /**
         * Data sources for the chart
         * 
         */
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Type of the chart
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Access level for the chart
         * 
         */
        public PathSpec access() {
            return new PathSpec(getPathComponents(), "access");
        }

        /**
         * The time when this chart last refreshed
         * 
         */
        public PathSpec lastRefreshed() {
            return new PathSpec(getPathComponents(), "lastRefreshed");
        }

    }

}
