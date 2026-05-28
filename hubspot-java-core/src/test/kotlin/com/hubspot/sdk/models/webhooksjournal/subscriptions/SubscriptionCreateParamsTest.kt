// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal.subscriptions

import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.SubscriptionUpsertRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
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
            SubscriptionCreateParams.builder()
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
                SubscriptionUpsertRequest.ofObject(
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
