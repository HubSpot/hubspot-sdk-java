// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DefinitionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelNoPagingFuture =
            definitionServiceAsync.create(
                DefinitionCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .publicAssociationDefinitionCreateRequest(
                        PublicAssociationDefinitionCreateRequest.builder()
                            .label("label")
                            .name("name")
                            .inverseLabel("inverseLabel")
                            .build()
                    )
                    .build()
            )

        val collectionResponseAssociationSpecWithLabelNoPaging =
            collectionResponseAssociationSpecWithLabelNoPagingFuture.get()
        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val future =
            definitionServiceAsync.update(
                DefinitionUpdateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .publicAssociationDefinitionUpdateRequest(
                        PublicAssociationDefinitionUpdateRequest.builder()
                            .associationTypeId(0)
                            .label("label")
                            .inverseLabel("inverseLabel")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelNoPagingFuture =
            definitionServiceAsync.list(
                DefinitionListParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponseAssociationSpecWithLabelNoPaging =
            collectionResponseAssociationSpecWithLabelNoPagingFuture.get()
        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val future =
            definitionServiceAsync.delete(
                DefinitionDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .associationTypeId(0)
                    .build()
            )

        val response = future.get()
    }
}
