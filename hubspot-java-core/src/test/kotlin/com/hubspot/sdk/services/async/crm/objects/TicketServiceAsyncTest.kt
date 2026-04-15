// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.objects.PublicAssociationsForObject
import com.hubspot.sdk.models.crm.objects.PublicMergeInput
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInput
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.tickets.TicketGetParams
import com.hubspot.sdk.models.crm.objects.tickets.TicketUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TicketServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val simplePublicObjectFuture =
            ticketServiceAsync.create(
                SimplePublicObjectInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val simplePublicObjectFuture =
            ticketServiceAsync.update(
                TicketUpdateParams.builder()
                    .ticketId("ticketId")
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
        val ticketServiceAsync = client.crm().objects().tickets()

        val pageFuture = ticketServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val future = ticketServiceAsync.delete("ticketId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val simplePublicObjectWithAssociationsFuture =
            ticketServiceAsync.get(
                TicketGetParams.builder()
                    .ticketId("ticketId")
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
    fun merge() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val simplePublicObjectFuture =
            ticketServiceAsync.merge(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ticketServiceAsync = client.crm().objects().tickets()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            ticketServiceAsync.search(
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
