// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingsLinkListParamsTest {

    @Test
    fun create() {
        MeetingsLinkListParams.builder()
            .after("after")
            .limit(0)
            .name("name")
            .organizerUserId("organizerUserId")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MeetingsLinkListParams.builder()
                .after("after")
                .limit(0)
                .name("name")
                .organizerUserId("organizerUserId")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("name", "name")
                    .put("organizerUserId", "organizerUserId")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MeetingsLinkListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
