// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.objects.SimplePublicObjectInput
import com.hubspot.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientListAssociationsParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PartnerClientServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val partnerClientService = client.crm().objects().partnerClients()

        val simplePublicObject =
            partnerClientService.update(
                PartnerClientUpdateParams.builder()
                    .partnerClientId("partnerClientId")
                    .idProperty("idProperty")
                    .simplePublicObjectInput(
                        SimplePublicObjectInput.builder()
                            .properties(
                                SimplePublicObjectInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val partnerClientService = client.crm().objects().partnerClients()

        val page = partnerClientService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val partnerClientService = client.crm().objects().partnerClients()

        val simplePublicObjectWithAssociations =
            partnerClientService.get(
                PartnerClientGetParams.builder()
                    .partnerClientId("partnerClientId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAssociations() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val partnerClientService = client.crm().objects().partnerClients()

        val page =
            partnerClientService.listAssociations(
                PartnerClientListAssociationsParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val partnerClientService = client.crm().objects().partnerClients()

        val collectionResponseWithTotalSimplePublicObject =
            partnerClientService.search(
                PublicObjectSearchRequest.builder()
                    .after("after")
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.BETWEEN)
                                    .propertyName("propertyName")
                                    .highValue("highValue")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .limit(0)
                    .addProperty("string")
                    .addSort("string")
                    .query("query")
                    .build()
            )

        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
