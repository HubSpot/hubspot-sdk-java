// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings.basic

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasicListParamsTest {

    @Test
    fun create() {
        BasicListParams.builder()
            .after("after")
            .limit(0)
            .name("name")
            .organizerUserId("organizerUserId")
            .type(BasicListParams.Type.GROUP_CALENDAR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BasicListParams.builder()
                .after("after")
                .limit(0)
                .name("name")
                .organizerUserId("organizerUserId")
                .type(BasicListParams.Type.GROUP_CALENDAR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("name", "name")
                    .put("organizerUserId", "organizerUserId")
                    .put("type", "GROUP_CALENDAR")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BasicListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
