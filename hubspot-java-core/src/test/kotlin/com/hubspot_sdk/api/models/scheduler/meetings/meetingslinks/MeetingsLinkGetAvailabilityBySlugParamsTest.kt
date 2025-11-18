// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingsLinkGetAvailabilityBySlugParamsTest {

    @Test
    fun create() {
        MeetingsLinkGetAvailabilityBySlugParams.builder()
            .slug("slug")
            .timezone("timezone")
            .monthOffset(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MeetingsLinkGetAvailabilityBySlugParams.builder()
                .slug("slug")
                .timezone("timezone")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MeetingsLinkGetAvailabilityBySlugParams.builder()
                .slug("slug")
                .timezone("timezone")
                .monthOffset(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("timezone", "timezone").put("monthOffset", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MeetingsLinkGetAvailabilityBySlugParams.builder()
                .slug("slug")
                .timezone("timezone")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("timezone", "timezone").build())
    }
}
