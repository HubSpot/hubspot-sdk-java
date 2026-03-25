// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.ObjectTypeDefinitionPatch
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaEgg
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectTypePropertyCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ObjectSchemaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        val objectSchema =
            objectSchemaService.create(
                ObjectSchemaEgg.builder()
                    .allowsSensitiveProperties(true)
                    .addAssociatedObject("string")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .name("name")
                    .addProperty(
                        ObjectTypePropertyCreate.builder()
                            .fieldType("fieldType")
                            .label("label")
                            .name("name")
                            .type(ObjectTypePropertyCreate.Type.BOOL)
                            .description("description")
                            .displayOrder(0)
                            .externalOptionsReferenceType("externalOptionsReferenceType")
                            .formField(true)
                            .groupName("groupName")
                            .hasUniqueValue(true)
                            .hidden(true)
                            .numberDisplayHint(ObjectTypePropertyCreate.NumberDisplayHint.CURRENCY)
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .optionSortStrategy(
                                ObjectTypePropertyCreate.OptionSortStrategy.ALPHABETICAL
                            )
                            .referencedObjectType("referencedObjectType")
                            .searchableInGlobalSearch(true)
                            .showCurrencySymbol(true)
                            .textDisplayHint(ObjectTypePropertyCreate.TextDisplayHint.DOMAIN_NAME)
                            .build()
                    )
                    .addRequiredProperty("string")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .description("description")
                    .primaryDisplayProperty("primaryDisplayProperty")
                    .build()
            )

        objectSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        val objectTypeDefinition =
            objectSchemaService.update(
                ObjectSchemaUpdateParams.builder()
                    .objectType("objectType")
                    .objectTypeDefinitionPatch(
                        ObjectTypeDefinitionPatch.builder()
                            .clearDescription(true)
                            .allowsSensitiveProperties(true)
                            .description("description")
                            .labels(
                                ObjectTypeDefinitionLabels.builder()
                                    .plural("plural")
                                    .singular("singular")
                                    .build()
                            )
                            .primaryDisplayProperty("primaryDisplayProperty")
                            .addRequiredProperty("string")
                            .restorable(true)
                            .addSearchableProperty("string")
                            .addSecondaryDisplayProperty("string")
                            .build()
                    )
                    .build()
            )

        objectTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        val collectionResponseObjectSchemaNoPaging =
            objectSchemaService.list(
                ObjectSchemaListParams.builder()
                    .archived(true)
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .build()
            )

        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        objectSchemaService.delete(
            ObjectSchemaDeleteParams.builder().objectType("objectType").archived(true).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAssociation() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        val associationDefinition =
            objectSchemaService.createAssociation(
                ObjectSchemaCreateAssociationParams.builder()
                    .objectType("objectType")
                    .associationDefinitionEgg(
                        AssociationDefinitionEgg.builder()
                            .fromObjectTypeId("fromObjectTypeId")
                            .toObjectTypeId("toObjectTypeId")
                            .name("name")
                            .build()
                    )
                    .build()
            )

        associationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociation() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        objectSchemaService.deleteAssociation(
            ObjectSchemaDeleteAssociationParams.builder()
                .objectType("objectType")
                .associationIdentifier("associationIdentifier")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val objectSchemaService = client.crm().objectSchemas()

        val objectSchema =
            objectSchemaService.get(
                ObjectSchemaGetParams.builder()
                    .objectType("objectType")
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .build()
            )

        objectSchema.validate()
    }
}
