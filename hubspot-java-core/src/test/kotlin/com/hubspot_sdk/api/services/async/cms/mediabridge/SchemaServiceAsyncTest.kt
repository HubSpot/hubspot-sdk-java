// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class SchemaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaServiceAsync = client.cms().mediaBridge().schemas()

        val objectTypeDefinitionFuture =
            schemaServiceAsync.update(
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

        val objectTypeDefinition = objectTypeDefinitionFuture.get()
        objectTypeDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaServiceAsync = client.cms().mediaBridge().schemas()

        val collectionResponseObjectSchemaNoPagingFuture = schemaServiceAsync.list("appId")

        val collectionResponseObjectSchemaNoPaging =
            collectionResponseObjectSchemaNoPagingFuture.get()
        collectionResponseObjectSchemaNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAssociation() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaServiceAsync = client.cms().mediaBridge().schemas()

        val responseFuture =
            schemaServiceAsync.createAssociation(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAssociation() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaServiceAsync = client.cms().mediaBridge().schemas()

        val future =
            schemaServiceAsync.deleteAssociation(
                SchemaDeleteAssociationParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .associationId("associationId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val schemaServiceAsync = client.cms().mediaBridge().schemas()

        val objectSchemaFuture =
            schemaServiceAsync.get(
                SchemaGetParams.builder().appId("appId").objectType("objectType").build()
            )

        val objectSchema = objectSchemaFuture.get()
        objectSchema.validate()
    }
}
