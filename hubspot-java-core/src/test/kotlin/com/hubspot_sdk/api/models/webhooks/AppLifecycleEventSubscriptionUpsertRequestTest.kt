// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppLifecycleEventSubscriptionUpsertRequestTest {

    @Test
    fun create() {
        val appLifecycleEventSubscriptionUpsertRequest =
            AppLifecycleEventSubscriptionUpsertRequest.builder()
                .eventTypeId("eventTypeId")
                .addProperty("string")
                .subscriptionType(
                    AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.OBJECT
                )
                .build()

        assertThat(appLifecycleEventSubscriptionUpsertRequest.eventTypeId())
            .isEqualTo("eventTypeId")
        assertThat(appLifecycleEventSubscriptionUpsertRequest.properties())
            .containsExactly("string")
        assertThat(appLifecycleEventSubscriptionUpsertRequest.subscriptionType())
            .isEqualTo(AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appLifecycleEventSubscriptionUpsertRequest =
            AppLifecycleEventSubscriptionUpsertRequest.builder()
                .eventTypeId("eventTypeId")
                .addProperty("string")
                .subscriptionType(
                    AppLifecycleEventSubscriptionUpsertRequest.SubscriptionType.OBJECT
                )
                .build()

        val roundtrippedAppLifecycleEventSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appLifecycleEventSubscriptionUpsertRequest),
                jacksonTypeRef<AppLifecycleEventSubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedAppLifecycleEventSubscriptionUpsertRequest)
            .isEqualTo(appLifecycleEventSubscriptionUpsertRequest)
    }
}
