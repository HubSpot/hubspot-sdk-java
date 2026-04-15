// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.websitepages

import com.hubspot.sdk.models.cms.ContentScheduleRequestVNext
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebsitePageScheduleParamsTest {

    @Test
    fun create() {
        WebsitePageScheduleParams.builder()
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
            WebsitePageScheduleParams.builder()
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
