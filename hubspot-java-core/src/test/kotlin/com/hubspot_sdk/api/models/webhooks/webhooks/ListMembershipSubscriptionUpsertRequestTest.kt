// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListMembershipSubscriptionUpsertRequestTest {

    @Test
    fun create() {
        val listMembershipSubscriptionUpsertRequest =
            ListMembershipSubscriptionUpsertRequest.builder()
                .addAction(ListMembershipSubscriptionUpsertRequest.Action.CREATE)
                .addListId(0L)
                .addObjectId(0L)
                .portalId(0L)
                .subscriptionType(ListMembershipSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        assertThat(listMembershipSubscriptionUpsertRequest.actions())
            .containsExactly(ListMembershipSubscriptionUpsertRequest.Action.CREATE)
        assertThat(listMembershipSubscriptionUpsertRequest.listIds()).containsExactly(0L)
        assertThat(listMembershipSubscriptionUpsertRequest.objectIds()).containsExactly(0L)
        assertThat(listMembershipSubscriptionUpsertRequest.portalId()).isEqualTo(0L)
        assertThat(listMembershipSubscriptionUpsertRequest.subscriptionType())
            .isEqualTo(ListMembershipSubscriptionUpsertRequest.SubscriptionType.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listMembershipSubscriptionUpsertRequest =
            ListMembershipSubscriptionUpsertRequest.builder()
                .addAction(ListMembershipSubscriptionUpsertRequest.Action.CREATE)
                .addListId(0L)
                .addObjectId(0L)
                .portalId(0L)
                .subscriptionType(ListMembershipSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                .build()

        val roundtrippedListMembershipSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listMembershipSubscriptionUpsertRequest),
                jacksonTypeRef<ListMembershipSubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedListMembershipSubscriptionUpsertRequest)
            .isEqualTo(listMembershipSubscriptionUpsertRequest)
    }
}
