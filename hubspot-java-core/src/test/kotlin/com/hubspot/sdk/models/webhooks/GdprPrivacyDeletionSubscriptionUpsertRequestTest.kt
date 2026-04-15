// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GdprPrivacyDeletionSubscriptionUpsertRequestTest {

    @Test
    fun create() {
        val gdprPrivacyDeletionSubscriptionUpsertRequest =
            GdprPrivacyDeletionSubscriptionUpsertRequest.builder()
                .addAction(GdprPrivacyDeletionSubscriptionUpsertRequest.Action.CREATE)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(
                    GdprPrivacyDeletionSubscriptionUpsertRequest.SubscriptionType.OBJECT
                )
                .build()

        assertThat(gdprPrivacyDeletionSubscriptionUpsertRequest.actions())
            .containsExactly(GdprPrivacyDeletionSubscriptionUpsertRequest.Action.CREATE)
        assertThat(gdprPrivacyDeletionSubscriptionUpsertRequest.objectTypeId())
            .isEqualTo("objectTypeId")
        assertThat(gdprPrivacyDeletionSubscriptionUpsertRequest.portalId()).isEqualTo(0L)
        assertThat(gdprPrivacyDeletionSubscriptionUpsertRequest.subscriptionType())
            .isEqualTo(GdprPrivacyDeletionSubscriptionUpsertRequest.SubscriptionType.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gdprPrivacyDeletionSubscriptionUpsertRequest =
            GdprPrivacyDeletionSubscriptionUpsertRequest.builder()
                .addAction(GdprPrivacyDeletionSubscriptionUpsertRequest.Action.CREATE)
                .objectTypeId("objectTypeId")
                .portalId(0L)
                .subscriptionType(
                    GdprPrivacyDeletionSubscriptionUpsertRequest.SubscriptionType.OBJECT
                )
                .build()

        val roundtrippedGdprPrivacyDeletionSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gdprPrivacyDeletionSubscriptionUpsertRequest),
                jacksonTypeRef<GdprPrivacyDeletionSubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedGdprPrivacyDeletionSubscriptionUpsertRequest)
            .isEqualTo(gdprPrivacyDeletionSubscriptionUpsertRequest)
    }
}
