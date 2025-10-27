// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicObjectIdDeleteRequestTest {

    @Test
    fun create() {
        val marketingEventPublicObjectIdDeleteRequest =
            MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()

        assertThat(marketingEventPublicObjectIdDeleteRequest.objectId()).isEqualTo("objectId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicObjectIdDeleteRequest =
            MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()

        val roundtrippedMarketingEventPublicObjectIdDeleteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicObjectIdDeleteRequest),
                jacksonTypeRef<MarketingEventPublicObjectIdDeleteRequest>(),
            )

        assertThat(roundtrippedMarketingEventPublicObjectIdDeleteRequest)
            .isEqualTo(marketingEventPublicObjectIdDeleteRequest)
    }
}
