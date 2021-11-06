
package com.linkedin.glossary;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Properties associated with a GlossaryTerm
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/glossary/GlossaryTermInfo.pdl.")
public class GlossaryTermInfo
    extends RecordTemplate
{

    private final static GlossaryTermInfo.Fields _fields = new GlossaryTermInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo{/**Definition of business term*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryNode\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryNode\",\"doc\":\"Standardized business node identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business node with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}/**A key-value map to capture any other non-standardized properties for the glossary term*/customProperties:map[string,string]={}/**Schema definition of the glossary term*/rawSchema:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");
    private final static RecordDataSchema.Field FIELD_ParentNode = SCHEMA.getField("parentNode");
    private final static RecordDataSchema.Field FIELD_TermSource = SCHEMA.getField("termSource");
    private final static RecordDataSchema.Field FIELD_SourceRef = SCHEMA.getField("sourceRef");
    private final static RecordDataSchema.Field FIELD_SourceUrl = SCHEMA.getField("sourceUrl");
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_RawSchema = SCHEMA.getField("rawSchema");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryNodeUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public GlossaryTermInfo() {
        super(new DataMap(10, 0.75F), SCHEMA, 2);
    }

    public GlossaryTermInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTermInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public boolean hasDefinition() {
        return contains(FIELD_Definition);
    }

    /**
     * Remover for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public void removeDefinition() {
        remove(FIELD_Definition);
    }

    /**
     * Getter for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public String getDefinition(GetMode mode) {
        return obtainDirect(FIELD_Definition, String.class, mode);
    }

    /**
     * Getter for definition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfo.Fields#definition
     */
    @Nonnull
    public String getDefinition() {
        return obtainDirect(FIELD_Definition, String.class, GetMode.STRICT);
    }

    /**
     * Setter for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public GlossaryTermInfo setDefinition(String value, SetMode mode) {
        putDirect(FIELD_Definition, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for definition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#definition
     */
    public GlossaryTermInfo setDefinition(
        @Nonnull
        String value) {
        putDirect(FIELD_Definition, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public boolean hasParentNode() {
        return contains(FIELD_ParentNode);
    }

    /**
     * Remover for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public void removeParentNode() {
        remove(FIELD_ParentNode);
    }

    /**
     * Getter for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode(GetMode mode) {
        return obtainCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, mode);
    }

    /**
     * Getter for parentNode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#parentNode
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode() {
        return obtainCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public GlossaryTermInfo setParentNode(com.linkedin.common.urn.GlossaryNodeUrn value, SetMode mode) {
        putCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for parentNode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public GlossaryTermInfo setParentNode(
        @Nonnull
        com.linkedin.common.urn.GlossaryNodeUrn value) {
        putCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public boolean hasTermSource() {
        return contains(FIELD_TermSource);
    }

    /**
     * Remover for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public void removeTermSource() {
        remove(FIELD_TermSource);
    }

    /**
     * Getter for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public String getTermSource(GetMode mode) {
        return obtainDirect(FIELD_TermSource, String.class, mode);
    }

    /**
     * Getter for termSource
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfo.Fields#termSource
     */
    @Nonnull
    public String getTermSource() {
        return obtainDirect(FIELD_TermSource, String.class, GetMode.STRICT);
    }

    /**
     * Setter for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public GlossaryTermInfo setTermSource(String value, SetMode mode) {
        putDirect(FIELD_TermSource, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for termSource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#termSource
     */
    public GlossaryTermInfo setTermSource(
        @Nonnull
        String value) {
        putDirect(FIELD_TermSource, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public boolean hasSourceRef() {
        return contains(FIELD_SourceRef);
    }

    /**
     * Remover for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public void removeSourceRef() {
        remove(FIELD_SourceRef);
    }

    /**
     * Getter for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public String getSourceRef(GetMode mode) {
        return obtainDirect(FIELD_SourceRef, String.class, mode);
    }

    /**
     * Getter for sourceRef
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    @Nullable
    public String getSourceRef() {
        return obtainDirect(FIELD_SourceRef, String.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public GlossaryTermInfo setSourceRef(String value, SetMode mode) {
        putDirect(FIELD_SourceRef, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceRef
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public GlossaryTermInfo setSourceRef(
        @Nonnull
        String value) {
        putDirect(FIELD_SourceRef, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public boolean hasSourceUrl() {
        return contains(FIELD_SourceUrl);
    }

    /**
     * Remover for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public void removeSourceUrl() {
        remove(FIELD_SourceUrl);
    }

    /**
     * Getter for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public com.linkedin.common.url.Url getSourceUrl(GetMode mode) {
        return obtainCustomType(FIELD_SourceUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for sourceUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getSourceUrl() {
        return obtainCustomType(FIELD_SourceUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public GlossaryTermInfo setSourceUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_SourceUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public GlossaryTermInfo setSourceUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_SourceUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public GlossaryTermInfo setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public GlossaryTermInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    public boolean hasRawSchema() {
        return contains(FIELD_RawSchema);
    }

    /**
     * Remover for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    public void removeRawSchema() {
        remove(FIELD_RawSchema);
    }

    /**
     * Getter for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    public String getRawSchema(GetMode mode) {
        return obtainDirect(FIELD_RawSchema, String.class, mode);
    }

    /**
     * Getter for rawSchema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Nullable
    public String getRawSchema() {
        return obtainDirect(FIELD_RawSchema, String.class, GetMode.STRICT);
    }

    /**
     * Setter for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    public GlossaryTermInfo setRawSchema(String value, SetMode mode) {
        putDirect(FIELD_RawSchema, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for rawSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    public GlossaryTermInfo setRawSchema(
        @Nonnull
        String value) {
        putDirect(FIELD_RawSchema, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTermInfo clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermInfo) super.clone());
    }

    @Override
    public GlossaryTermInfo copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermInfo) super.copy());
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
         * Definition of business term
         * 
         */
        public PathSpec definition() {
            return new PathSpec(getPathComponents(), "definition");
        }

        /**
         * Parent node of the glossary term
         * 
         */
        public PathSpec parentNode() {
            return new PathSpec(getPathComponents(), "parentNode");
        }

        /**
         * Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL
         * 
         */
        public PathSpec termSource() {
            return new PathSpec(getPathComponents(), "termSource");
        }

        /**
         * External Reference to the business-term
         * 
         */
        public PathSpec sourceRef() {
            return new PathSpec(getPathComponents(), "sourceRef");
        }

        /**
         * The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.
         * 
         */
        public PathSpec sourceUrl() {
            return new PathSpec(getPathComponents(), "sourceUrl");
        }

        /**
         * A key-value map to capture any other non-standardized properties for the glossary term
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * Schema definition of the glossary term
         * 
         */
        public PathSpec rawSchema() {
            return new PathSpec(getPathComponents(), "rawSchema");
        }

    }

}
