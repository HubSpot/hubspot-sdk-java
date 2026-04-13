// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.objects.SimplePublicObjectInput
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PartnerServiceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerServiceServiceAsync = client.crm().objects().partnerServices()

        val simplePublicObjectFuture =
            partnerServiceServiceAsync.update(
                PartnerServiceUpdateParams.builder()
                    .partnerServiceId("partnerServiceId")
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
        val partnerServiceServiceAsync = client.crm().objects().partnerServices()

        val pageFuture =
            partnerServiceServiceAsync.list(
                PartnerServiceListParams.builder()
                    .partnerServiceId("partnerServiceId")
                    .toObjectType("toObjectType")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerServiceServiceAsync = client.crm().objects().partnerServices()

        val simplePublicObjectWithAssociationsFuture =
            partnerServiceServiceAsync.get(
                PartnerServiceGetParams.builder()
                    .partnerServiceId("partnerServiceId")
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
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val partnerServiceServiceAsync = client.crm().objects().partnerServices()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            partnerServiceServiceAsync.search(
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
