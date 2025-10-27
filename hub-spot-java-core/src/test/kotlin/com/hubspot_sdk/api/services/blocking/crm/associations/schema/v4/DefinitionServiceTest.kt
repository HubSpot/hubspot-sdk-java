// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
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
internal class DefinitionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelNoPaging =
            definitionService.create(
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

        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        definitionService.update(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        val collectionResponseAssociationSpecWithLabelNoPaging =
            definitionService.list(
                DefinitionListParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.crm().associations().schema().v4().definitions()

        definitionService.delete(
            DefinitionDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .associationTypeId(0)
                .build()
        )
    }
}
