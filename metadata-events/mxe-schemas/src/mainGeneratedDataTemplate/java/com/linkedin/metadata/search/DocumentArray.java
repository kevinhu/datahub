
package com.linkedin.metadata.search;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/MetadataSearchEvent.pdl.")
public class DocumentArray
    extends WrappingArrayTemplate<Document>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.search/**Data model for CorpUserInfo entity search*/record CorpUserInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the CorpUser.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**ldap of the CorpUser*/ldap:optional string/**title of the CorpUser*/title:optional string/**direct manager's ldap of the CorpUser*/managerLdap:optional string/**Common name of the CorpUser, format is firstName + lastName (split by a whitespace)*/fullName:optional string/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/teams:optional array[string]/**Skills that the user possesses e.g. Machine Learning*/skills:optional array[string]/**Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/active:optional boolean/**The user's full email(s).*/emails:optional array[string]}}{namespace com.linkedin.metadata.search/**Data model for dataset entity search*/record DatasetDocument includes BaseDocument{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform name for the dataset*/platform:optional string/**Fabric type where dataset belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Flag to indicate if the dataset is deprecated.*/deprecated:optional boolean/**Documentation of the dataset.*/description:optional string/**Field paths of the dataset*/fieldPaths:optional array[string]/**Flag to indicate if the dataset has non empty corp users as owners or not.*/hasOwners:optional boolean/**Flag to indicate if the dataset has non-empty schema or not.*/hasSchema:optional boolean/**Lineage information represented by the number of immediate downstream datasets of this dataset.*/numDownstreamDatasets:optional long/**List of upstreams for this dataset*/upstreams:optional array[com.linkedin.common.DatasetUrn]/**List of tags for this dataset*/tags:optional array[string]/**List of field descriptions*/fieldDescriptions:optional array[string]/**List of tags applied to fields*/fieldTags:optional array[string]/**List of field descriptions*/editedFieldDescriptions:optional array[string]/**List of tags applied to fields*/editedFieldTags:optional array[string]/**List of terms for this dataset*/glossaryTerms:optional array[string]}}]]", SchemaFormatType.PDL));

    public DocumentArray() {
        this(new DataList());
    }

    public DocumentArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DocumentArray(Collection<Document> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DocumentArray(DataList data) {
        super(data, SCHEMA, Document.class);
    }

    public DocumentArray(Document first, Document... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DocumentArray clone()
        throws CloneNotSupportedException
    {
        return ((DocumentArray) super.clone());
    }

    @Override
    public DocumentArray copy()
        throws CloneNotSupportedException
    {
        return ((DocumentArray) super.copy());
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

        public com.linkedin.metadata.search.Document.Fields items() {
            return new com.linkedin.metadata.search.Document.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
