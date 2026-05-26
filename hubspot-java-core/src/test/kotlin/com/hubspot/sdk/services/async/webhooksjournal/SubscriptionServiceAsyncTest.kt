// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubscriptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val subscriptionServiceAsync = client.webhooksJournal().subscriptions()

        val journalSubscriptionResponseFuture =
            subscriptionServiceAsync.create(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        val journalSubscriptionResponse = journalSubscriptionResponseFuture.get()
        journalSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val subscriptionServiceAsync = client.webhooksJournal().subscriptions()

        val journalCollectionResponseSubscriptionResponseNoPagingFuture =
            subscriptionServiceAsync.list()

        val journalCollectionResponseSubscriptionResponseNoPaging =
            journalCollectionResponseSubscriptionResponseNoPagingFuture.get()
        journalCollectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val subscriptionServiceAsync = client.webhooksJournal().subscriptions()

        val future = subscriptionServiceAsync.delete(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteForPortal() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val subscriptionServiceAsync = client.webhooksJournal().subscriptions()

        val future = subscriptionServiceAsync.deleteForPortal(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val subscriptionServiceAsync = client.webhooksJournal().subscriptions()

        val journalSubscriptionResponseFuture = subscriptionServiceAsync.get(0L)

        val journalSubscriptionResponse = journalSubscriptionResponseFuture.get()
        journalSubscriptionResponse.validate()
    }
}
