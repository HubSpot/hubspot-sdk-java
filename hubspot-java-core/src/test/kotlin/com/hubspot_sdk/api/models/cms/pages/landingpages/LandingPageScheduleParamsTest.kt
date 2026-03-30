// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageScheduleParamsTest {

    @Test
    fun create() {
        LandingPageScheduleParams.builder()
            .contentScheduleRequestVNext(
                ContentScheduleRequestVNext.builder()
                    .id("id")
                    .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageScheduleParams.builder()
                .contentScheduleRequestVNext(
                    ContentScheduleRequestVNext.builder()
                        .id("id")
                        .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ContentScheduleRequestVNext.builder()
                    .id("id")
                    .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
