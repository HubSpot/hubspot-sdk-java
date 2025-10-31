// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventCompleteRequestParamsTest {

    @Test
    fun create() {
        val marketingEventCompleteRequestParams =
            MarketingEventCompleteRequestParams.builder()
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventCompleteRequestParams.endDateTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventCompleteRequestParams.startDateTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventCompleteRequestParams =
            MarketingEventCompleteRequestParams.builder()
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventCompleteRequestParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventCompleteRequestParams),
                jacksonTypeRef<MarketingEventCompleteRequestParams>(),
            )

        assertThat(roundtrippedMarketingEventCompleteRequestParams)
            .isEqualTo(marketingEventCompleteRequestParams)
    }
}
