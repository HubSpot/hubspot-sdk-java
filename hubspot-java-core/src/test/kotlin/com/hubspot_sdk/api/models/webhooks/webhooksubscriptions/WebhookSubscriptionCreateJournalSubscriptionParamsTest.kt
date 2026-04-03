// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSubscriptionCreateJournalSubscriptionParamsTest {

    @Test
    fun create() {
        WebhookSubscriptionCreateJournalSubscriptionParams.builder()
            .subscriptionUpsertRequest(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookSubscriptionCreateJournalSubscriptionParams.builder()
                .subscriptionUpsertRequest(
                    ObjectSubscriptionUpsertRequest.builder()
                        .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                        .addObjectId(0L)
                        .objectTypeId("objectTypeId")
                        .portalId(0L)
                        .addProperty("string")
                        .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    ObjectSubscriptionUpsertRequest.builder()
                        .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                        .addObjectId(0L)
                        .objectTypeId("objectTypeId")
                        .portalId(0L)
                        .addProperty("string")
                        .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                        .build()
                )
            )
    }
}
