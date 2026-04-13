// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventExternalUniqueIdentifierTest {

    @Test
    fun create() {
        val marketingEventExternalUniqueIdentifier =
            MarketingEventExternalUniqueIdentifier.builder()
                .appId(0)
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        assertThat(marketingEventExternalUniqueIdentifier.appId()).isEqualTo(0)
        assertThat(marketingEventExternalUniqueIdentifier.externalAccountId())
            .isEqualTo("externalAccountId")
        assertThat(marketingEventExternalUniqueIdentifier.externalEventId())
            .isEqualTo("externalEventId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventExternalUniqueIdentifier =
            MarketingEventExternalUniqueIdentifier.builder()
                .appId(0)
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        val roundtrippedMarketingEventExternalUniqueIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventExternalUniqueIdentifier),
                jacksonTypeRef<MarketingEventExternalUniqueIdentifier>(),
            )

        assertThat(roundtrippedMarketingEventExternalUniqueIdentifier)
            .isEqualTo(marketingEventExternalUniqueIdentifier)
    }
}
