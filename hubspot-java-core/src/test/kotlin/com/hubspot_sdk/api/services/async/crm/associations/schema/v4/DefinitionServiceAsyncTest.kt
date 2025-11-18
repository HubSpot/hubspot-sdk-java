// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListLabelsParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateLabelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DefinitionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createLabel() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelFuture =
            definitionServiceAsync.createLabel(
                DefinitionCreateLabelParams.builder()
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

        val collectionResponseAssociationSpecWithLabel =
            collectionResponseAssociationSpecWithLabelFuture.get()
        collectionResponseAssociationSpecWithLabel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteLabel() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val future =
            definitionServiceAsync.deleteLabel(
                DefinitionDeleteLabelParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .associationTypeId(0)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLabels() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelFuture =
            definitionServiceAsync.listLabels(
                DefinitionListLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponseAssociationSpecWithLabel =
            collectionResponseAssociationSpecWithLabelFuture.get()
        collectionResponseAssociationSpecWithLabel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLabel() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionServiceAsync = client.crm().associations().schema().v4().definitions()

        val future =
            definitionServiceAsync.updateLabel(
                DefinitionUpdateLabelParams.builder()
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
}
