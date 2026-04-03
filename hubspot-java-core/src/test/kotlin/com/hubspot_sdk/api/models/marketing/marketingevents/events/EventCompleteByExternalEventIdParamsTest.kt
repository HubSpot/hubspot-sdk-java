// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents.events

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventCompleteRequestParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCompleteByExternalEventIdParamsTest {

    @Test
    fun create() {
        EventCompleteByExternalEventIdParams.builder()
            .externalEventId("externalEventId")
            .externalAccountId("externalAccountId")
            .marketingEventCompleteRequestParams(
                MarketingEventCompleteRequestParams.builder()
                    .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventCompleteByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventCompleteRequestParams(
                    MarketingEventCompleteRequestParams.builder()
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EventCompleteByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventCompleteRequestParams(
                    MarketingEventCompleteRequestParams.builder()
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }

    @Test
    fun body() {
        val params =
            EventCompleteByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventCompleteRequestParams(
                    MarketingEventCompleteRequestParams.builder()
                        .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MarketingEventCompleteRequestParams.builder()
                    .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
