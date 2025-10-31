// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinitionPatch
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SchemaServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaService = client.cms().mediaBridge().schemas()

        val objectTypeDefinition =
            schemaService.update(
                SchemaUpdateParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .objectTypeDefinitionPatch(
                        ObjectTypeDefinitionPatch.builder()
                            .clearDescription(true)
                            .description("description")
                            .labels(
                                ObjectTypeDefinitionLabels.builder()
                                    .plural("plural")
                                    .singular("singular")
                                    .build()
                            )
                            .primaryDisplayProperty("my_object_property")
                            .addRequiredProperty("my_object_property")
                            .restorable(true)
                            .addSearchableProperty("my_object_property")
                            .addSecondaryDisplayProperty("string")
                            .build()
                    )
                    .build()
            )

        objectTypeDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaService = client.cms().mediaBridge().schemas()

        val collectionResponseObjectSchemaNoPaging = schemaService.list("appId")

        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAssociation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaService = client.cms().mediaBridge().schemas()

        val response =
            schemaService.createAssociation(
                SchemaCreateAssociationParams.builder()
                    .appId("appId")
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAssociation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaService = client.cms().mediaBridge().schemas()

        schemaService.deleteAssociation(
            SchemaDeleteAssociationParams.builder()
                .appId("appId")
                .objectType("objectType")
                .associationId("associationId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaService = client.cms().mediaBridge().schemas()

        val objectSchema =
            schemaService.get(
                SchemaGetParams.builder().appId("appId").objectType("objectType").build()
            )

        objectSchema.validate()
    }
}
