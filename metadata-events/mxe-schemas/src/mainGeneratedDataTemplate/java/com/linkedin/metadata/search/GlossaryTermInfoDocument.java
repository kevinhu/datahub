
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Data model for GlossaryTermInfo entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/GlossaryTermInfoDocument.pdl.")
public class GlossaryTermInfoDocument
    extends RecordTemplate
{

    private final static GlossaryTermInfoDocument.Fields _fields = new GlossaryTermInfoDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for GlossaryTermInfo entity search*/record GlossaryTermInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the GlossaryTerm.*/urn:{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}/**Name of business term*/name:optional string/**Definition of business term*/definition:optional string/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/termSource:optional string/**External Reference to the business-term (URL)*/sourceRef:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_TermSource = SCHEMA.getField("termSource");
    private final static RecordDataSchema.Field FIELD_SourceRef = SCHEMA.getField("sourceRef");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
    }

    public GlossaryTermInfoDocument() {
        super(new DataMap(11, 0.75F), SCHEMA, 3);
    }

    public GlossaryTermInfoDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTermInfoDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public GlossaryTermInfoDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public GlossaryTermInfoDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see GlossaryTermInfoDocument.Fields#removed
     */
    public GlossaryTermInfoDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    public GlossaryTermInfoDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#browsePaths
     */
    public GlossaryTermInfoDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    public com.linkedin.common.urn.GlossaryTermUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryTermUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    public GlossaryTermInfoDocument setUrn(com.linkedin.common.urn.GlossaryTermUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#urn
     */
    public GlossaryTermInfoDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryTermUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see GlossaryTermInfoDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see GlossaryTermInfoDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see GlossaryTermInfoDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see GlossaryTermInfoDocument.Fields#name
     */
    public GlossaryTermInfoDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#name
     */
    public GlossaryTermInfoDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for definition
     * 
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    public boolean hasDefinition() {
        return contains(FIELD_Definition);
    }

    /**
     * Remover for definition
     * 
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    public void removeDefinition() {
        remove(FIELD_Definition);
    }

    /**
     * Getter for definition
     * 
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    public String getDefinition(GetMode mode) {
        return obtainDirect(FIELD_Definition, String.class, mode);
    }

    /**
     * Getter for definition
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    @Nullable
    public String getDefinition() {
        return obtainDirect(FIELD_Definition, String.class, GetMode.STRICT);
    }

    /**
     * Setter for definition
     * 
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    public GlossaryTermInfoDocument setDefinition(String value, SetMode mode) {
        putDirect(FIELD_Definition, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for definition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#definition
     */
    public GlossaryTermInfoDocument setDefinition(
        @Nonnull
        String value) {
        putDirect(FIELD_Definition, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    public GlossaryTermInfoDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#owners
     */
    public GlossaryTermInfoDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for termSource
     * 
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    public boolean hasTermSource() {
        return contains(FIELD_TermSource);
    }

    /**
     * Remover for termSource
     * 
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    public void removeTermSource() {
        remove(FIELD_TermSource);
    }

    /**
     * Getter for termSource
     * 
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    public String getTermSource(GetMode mode) {
        return obtainDirect(FIELD_TermSource, String.class, mode);
    }

    /**
     * Getter for termSource
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    @Nullable
    public String getTermSource() {
        return obtainDirect(FIELD_TermSource, String.class, GetMode.STRICT);
    }

    /**
     * Setter for termSource
     * 
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    public GlossaryTermInfoDocument setTermSource(String value, SetMode mode) {
        putDirect(FIELD_TermSource, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for termSource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#termSource
     */
    public GlossaryTermInfoDocument setTermSource(
        @Nonnull
        String value) {
        putDirect(FIELD_TermSource, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceRef
     * 
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    public boolean hasSourceRef() {
        return contains(FIELD_SourceRef);
    }

    /**
     * Remover for sourceRef
     * 
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    public void removeSourceRef() {
        remove(FIELD_SourceRef);
    }

    /**
     * Getter for sourceRef
     * 
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    public String getSourceRef(GetMode mode) {
        return obtainDirect(FIELD_SourceRef, String.class, mode);
    }

    /**
     * Getter for sourceRef
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    @Nullable
    public String getSourceRef() {
        return obtainDirect(FIELD_SourceRef, String.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceRef
     * 
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    public GlossaryTermInfoDocument setSourceRef(String value, SetMode mode) {
        putDirect(FIELD_SourceRef, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceRef
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfoDocument.Fields#sourceRef
     */
    public GlossaryTermInfoDocument setSourceRef(
        @Nonnull
        String value) {
        putDirect(FIELD_SourceRef, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTermInfoDocument clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermInfoDocument) super.clone());
    }

    @Override
    public GlossaryTermInfoDocument copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermInfoDocument) super.copy());
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
         * Whether the entity has been removed or not
         * 
         */
        public PathSpec removed() {
            return new PathSpec(getPathComponents(), "removed");
        }

        /**
         * All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.
         * 
         */
        public PathSpec browsePaths() {
            return new PathSpec(getPathComponents(), "browsePaths");
        }

        /**
         * All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.
         * 
         */
        public PathSpec browsePaths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "browsePaths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Urn for the GlossaryTerm.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Name of business term
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Definition of business term
         * 
         */
        public PathSpec definition() {
            return new PathSpec(getPathComponents(), "definition");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dataset
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dataset
         * 
         */
        public PathSpec owners(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "owners");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL
         * 
         */
        public PathSpec termSource() {
            return new PathSpec(getPathComponents(), "termSource");
        }

        /**
         * External Reference to the business-term (URL)
         * 
         */
        public PathSpec sourceRef() {
            return new PathSpec(getPathComponents(), "sourceRef");
        }

    }

}
