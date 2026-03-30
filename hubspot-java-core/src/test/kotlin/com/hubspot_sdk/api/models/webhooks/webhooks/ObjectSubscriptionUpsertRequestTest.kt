// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSubscriptionUpsertRequestTest {

    @Test
    fun create() {
        val objectSubscriptionUpsertRequest =
            ObjectSubscriptionUpsertRequest.builder()
                .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .addProperty("string")
                .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        assertThat(objectSubscriptionUpsertRequest.actions())
            .containsExactly(ObjectSubscriptionUpsertRequest.Action.CREATE)
        assertThat(objectSubscriptionUpsertRequest.objectIds()).containsExactly(0L)
        assertThat(objectSubscriptionUpsertRequest.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(objectSubscriptionUpsertRequest.portalId()).isEqualTo(0L)
        assertThat(objectSubscriptionUpsertRequest.properties()).containsExactly("string")
        assertThat(objectSubscriptionUpsertRequest.subscriptionType())
            .isEqualTo(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectSubscriptionUpsertRequest =
            ObjectSubscriptionUpsertRequest.builder()
                .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .addProperty("string")
                .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val roundtrippedObjectSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectSubscriptionUpsertRequest),
                jacksonTypeRef<ObjectSubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedObjectSubscriptionUpsertRequest)
            .isEqualTo(objectSubscriptionUpsertRequest)
    }
}
