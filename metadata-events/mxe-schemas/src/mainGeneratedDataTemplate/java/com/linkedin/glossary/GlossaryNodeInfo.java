
package com.linkedin.glossary;

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


/**
 * Properties associated with a GlossaryNode
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/glossary/GlossaryNodeInfo.pdl.")
public class GlossaryNodeInfo
    extends RecordTemplate
{

    private final static GlossaryNodeInfo.Fields _fields = new GlossaryNodeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryNode\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryNode\",\"doc\":\"Standardized business node identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business node with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryNodeUrn=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");
    private final static RecordDataSchema.Field FIELD_ParentNode = SCHEMA.getField("parentNode");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryNodeUrn.class);
    }

    public GlossaryNodeInfo() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public GlossaryNodeInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryNodeInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
     */
    public boolean hasDefinition() {
        return contains(FIELD_Definition);
    }

    /**
     * Remover for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
     */
    public void removeDefinition() {
        remove(FIELD_Definition);
    }

    /**
     * Getter for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
     */
    public String getDefinition(GetMode mode) {
        return obtainDirect(FIELD_Definition, String.class, mode);
    }

    /**
     * Getter for definition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryNodeInfo.Fields#definition
     */
    @Nonnull
    public String getDefinition() {
        return obtainDirect(FIELD_Definition, String.class, GetMode.STRICT);
    }

    /**
     * Setter for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
     */
    public GlossaryNodeInfo setDefinition(String value, SetMode mode) {
        putDirect(FIELD_Definition, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for definition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryNodeInfo.Fields#definition
     */
    public GlossaryNodeInfo setDefinition(
        @Nonnull
        String value) {
        putDirect(FIELD_Definition, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public boolean hasParentNode() {
        return contains(FIELD_ParentNode);
    }

    /**
     * Remover for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public void removeParentNode() {
        remove(FIELD_ParentNode);
    }

    /**
     * Getter for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode(GetMode mode) {
        return obtainCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, mode);
    }

    /**
     * Getter for parentNode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode() {
        return obtainCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public GlossaryNodeInfo setParentNode(com.linkedin.common.urn.GlossaryNodeUrn value, SetMode mode) {
        putCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for parentNode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public GlossaryNodeInfo setParentNode(
        @Nonnull
        com.linkedin.common.urn.GlossaryNodeUrn value) {
        putCustomType(FIELD_ParentNode, com.linkedin.common.urn.GlossaryNodeUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryNodeInfo clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryNodeInfo) super.clone());
    }

    @Override
    public GlossaryNodeInfo copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryNodeInfo) super.copy());
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
         * Definition of business node
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

    }

}
