// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.AssociationDefinitionEgg
import com.hubspot.sdk.models.ObjectTypeDefinitionLabels
import com.hubspot.sdk.models.ObjectTypeDefinitionPatch
import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaEgg
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectTypePropertyCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ObjectSchemaServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val objectSchemaFuture =
            objectSchemaServiceAsync.create(
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

        val objectSchema = objectSchemaFuture.get()
        objectSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val baseObjectTypeDefinitionFuture =
            objectSchemaServiceAsync.update(
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

        val baseObjectTypeDefinition = baseObjectTypeDefinitionFuture.get()
        baseObjectTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val collectionResponseObjectSchemaNoPagingFuture =
            objectSchemaServiceAsync.list(
                ObjectSchemaListParams.builder()
                    .archived(true)
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .build()
            )

        val collectionResponseObjectSchemaNoPaging =
            collectionResponseObjectSchemaNoPagingFuture.get()
        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val future =
            objectSchemaServiceAsync.delete(
                ObjectSchemaDeleteParams.builder().objectType("objectType").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAssociation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val baseAssociationDefinitionFuture =
            objectSchemaServiceAsync.createAssociation(
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

        val baseAssociationDefinition = baseAssociationDefinitionFuture.get()
        baseAssociationDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val future =
            objectSchemaServiceAsync.deleteAssociation(
                ObjectSchemaDeleteAssociationParams.builder()
                    .objectType("objectType")
                    .associationIdentifier("associationIdentifier")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val objectSchemaServiceAsync = client.crm().objectSchemas()

        val objectSchemaFuture =
            objectSchemaServiceAsync.get(
                ObjectSchemaGetParams.builder()
                    .objectType("objectType")
                    .includeAssociationDefinitions(true)
                    .includeAuditMetadata(true)
                    .includePropertyDefinitions(true)
                    .build()
            )

        val objectSchema = objectSchemaFuture.get()
        objectSchema.validate()
    }
}
