// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInput
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientListAssociationsParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PartnerClientServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerClientServiceAsync = client.crm().objects().partnerClients()

        val simplePublicObjectFuture =
            partnerClientServiceAsync.update(
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

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerClientServiceAsync = client.crm().objects().partnerClients()

        val pageFuture = partnerClientServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerClientServiceAsync = client.crm().objects().partnerClients()

        val simplePublicObjectWithAssociationsFuture =
            partnerClientServiceAsync.get(
                PartnerClientGetParams.builder()
                    .partnerClientId("partnerClientId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        val simplePublicObjectWithAssociations = simplePublicObjectWithAssociationsFuture.get()
        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAssociations() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerClientServiceAsync = client.crm().objects().partnerClients()

        val pageFuture =
            partnerClientServiceAsync.listAssociations(
                PartnerClientListAssociationsParams.builder()
                    .partnerClientId("partnerClientId")
                    .toObjectType("toObjectType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerClientServiceAsync = client.crm().objects().partnerClients()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            partnerClientServiceAsync.search(
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

        val collectionResponseWithTotalSimplePublicObject =
            collectionResponseWithTotalSimplePublicObjectFuture.get()
        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
