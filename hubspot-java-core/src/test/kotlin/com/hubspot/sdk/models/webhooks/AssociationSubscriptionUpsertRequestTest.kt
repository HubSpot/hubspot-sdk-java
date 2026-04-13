// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationSubscriptionUpsertRequestTest {

    @Test
    fun create() {
        val associationSubscriptionUpsertRequest =
            AssociationSubscriptionUpsertRequest.builder()
                .addAction(AssociationSubscriptionUpsertRequest.Action.CREATE)
                .addAssociatedObjectTypeId("string")
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(AssociationSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        assertThat(associationSubscriptionUpsertRequest.actions())
            .containsExactly(AssociationSubscriptionUpsertRequest.Action.CREATE)
        assertThat(associationSubscriptionUpsertRequest.associatedObjectTypeIds())
            .containsExactly("string")
        assertThat(associationSubscriptionUpsertRequest.objectIds()).containsExactly(0L)
        assertThat(associationSubscriptionUpsertRequest.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(associationSubscriptionUpsertRequest.portalId()).isEqualTo(0L)
        assertThat(associationSubscriptionUpsertRequest.subscriptionType())
            .isEqualTo(AssociationSubscriptionUpsertRequest.SubscriptionType.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationSubscriptionUpsertRequest =
            AssociationSubscriptionUpsertRequest.builder()
                .addAction(AssociationSubscriptionUpsertRequest.Action.CREATE)
                .addAssociatedObjectTypeId("string")
                .addObjectId(0L)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(AssociationSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val roundtrippedAssociationSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSubscriptionUpsertRequest),
                jacksonTypeRef<AssociationSubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedAssociationSubscriptionUpsertRequest)
            .isEqualTo(associationSubscriptionUpsertRequest)
    }
}
