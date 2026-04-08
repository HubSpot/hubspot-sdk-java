// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateJournalSubscriptionParamsTest {

    @Test
    fun create() {
        WebhookCreateJournalSubscriptionParams.builder()
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
            WebhookCreateJournalSubscriptionParams.builder()
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
