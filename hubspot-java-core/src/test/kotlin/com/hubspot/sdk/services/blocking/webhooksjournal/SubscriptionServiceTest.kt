// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubscriptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val subscriptionService = client.webhooksJournal().subscriptions()

        val journalSubscriptionResponse =
            subscriptionService.create(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        journalSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val subscriptionService = client.webhooksJournal().subscriptions()

        val journalCollectionResponseSubscriptionResponseNoPaging = subscriptionService.list()

        journalCollectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val subscriptionService = client.webhooksJournal().subscriptions()

        subscriptionService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteForPortal() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val subscriptionService = client.webhooksJournal().subscriptions()

        subscriptionService.deleteForPortal(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val subscriptionService = client.webhooksJournal().subscriptions()

        val journalSubscriptionResponse = subscriptionService.get(0L)

        journalSubscriptionResponse.validate()
    }
}
