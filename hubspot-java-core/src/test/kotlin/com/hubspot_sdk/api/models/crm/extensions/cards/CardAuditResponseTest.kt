// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuditResponseTest {

    @Test
    fun create() {
        val cardAuditResponse =
            CardAuditResponse.builder()
                .actionType(CardAuditResponse.ActionType.CREATE)
                .applicationId(0)
                .authSource(CardAuditResponse.AuthSource.APP)
                .changedAt(0L)
                .initiatingUserId(0)
                .objectTypeId(0)
                .build()

        assertThat(cardAuditResponse.actionType()).isEqualTo(CardAuditResponse.ActionType.CREATE)
        assertThat(cardAuditResponse.applicationId()).isEqualTo(0)
        assertThat(cardAuditResponse.authSource()).isEqualTo(CardAuditResponse.AuthSource.APP)
        assertThat(cardAuditResponse.changedAt()).isEqualTo(0L)
        assertThat(cardAuditResponse.initiatingUserId()).isEqualTo(0)
        assertThat(cardAuditResponse.objectTypeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardAuditResponse =
            CardAuditResponse.builder()
                .actionType(CardAuditResponse.ActionType.CREATE)
                .applicationId(0)
                .authSource(CardAuditResponse.AuthSource.APP)
                .changedAt(0L)
                .initiatingUserId(0)
                .objectTypeId(0)
                .build()

        val roundtrippedCardAuditResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardAuditResponse),
                jacksonTypeRef<CardAuditResponse>(),
            )

        assertThat(roundtrippedCardAuditResponse).isEqualTo(cardAuditResponse)
    }
}
