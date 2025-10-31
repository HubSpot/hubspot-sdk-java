// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects.partnerclients

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.associations.AssociationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().objects().partnerClients().associations()

        val simplePublicObjectWithAssociations =
            associationService.update(
                AssociationUpdateParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .associationType("associationType")
                    .build()
            )

        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().objects().partnerClients().associations()

        val page =
            associationService.list(
                AssociationListParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val associationService = client.crm().objects().partnerClients().associations()

        associationService.delete(
            AssociationDeleteParams.builder()
                .partnerClientId("partnerClientId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .associationType("associationType")
                .build()
        )
    }
}
