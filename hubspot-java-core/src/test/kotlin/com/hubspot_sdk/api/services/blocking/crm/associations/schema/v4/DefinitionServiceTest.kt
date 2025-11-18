// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class DefinitionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createLabel() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabel =
            definitionService.createLabel(
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

        collectionResponseAssociationSpecWithLabel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteLabel() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        definitionService.deleteLabel(
            DefinitionDeleteLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .associationTypeId(0)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLabels() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabel =
            definitionService.listLabels(
                DefinitionListLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponseAssociationSpecWithLabel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLabel() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        definitionService.updateLabel(
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
    }
}
