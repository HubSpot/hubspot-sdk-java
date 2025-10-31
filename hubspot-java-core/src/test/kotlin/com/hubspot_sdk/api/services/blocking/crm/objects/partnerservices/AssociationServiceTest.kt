// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects.partnerservices

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationUpdateParams
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
        val associationService = client.crm().objects().partnerServices().associations()

        val simplePublicObjectWithAssociations =
            associationService.update(
                AssociationUpdateParams.builder()
                    .partnerServiceId("partnerServiceId")
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
        val associationService = client.crm().objects().partnerServices().associations()

        val page =
            associationService.list(
                AssociationListParams.builder()
                    .partnerServiceId("partnerServiceId")
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
        val associationService = client.crm().objects().partnerServices().associations()

        associationService.delete(
            AssociationDeleteParams.builder()
                .partnerServiceId("partnerServiceId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .associationType("associationType")
                .build()
        )
    }
}
