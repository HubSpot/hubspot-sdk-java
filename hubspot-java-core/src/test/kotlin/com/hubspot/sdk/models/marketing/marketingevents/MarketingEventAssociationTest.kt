// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventAssociationTest {

    @Test
    fun create() {
        val marketingEventAssociation =
            MarketingEventAssociation.builder()
                .marketingEventId("marketingEventId")
                .name("name")
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        assertThat(marketingEventAssociation.marketingEventId()).isEqualTo("marketingEventId")
        assertThat(marketingEventAssociation.name()).isEqualTo("name")
        assertThat(marketingEventAssociation.externalAccountId()).contains("externalAccountId")
        assertThat(marketingEventAssociation.externalEventId()).contains("externalEventId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventAssociation =
            MarketingEventAssociation.builder()
                .marketingEventId("marketingEventId")
                .name("name")
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        val roundtrippedMarketingEventAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventAssociation),
                jacksonTypeRef<MarketingEventAssociation>(),
            )

        assertThat(roundtrippedMarketingEventAssociation).isEqualTo(marketingEventAssociation)
    }
}
