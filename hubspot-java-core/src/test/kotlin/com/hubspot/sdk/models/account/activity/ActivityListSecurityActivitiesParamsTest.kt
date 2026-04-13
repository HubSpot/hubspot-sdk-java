// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActivityListSecurityActivitiesParamsTest {

    @Test
    fun create() {
        ActivityListSecurityActivitiesParams.builder()
            .after("after")
            .fromTimestamp(0L)
            .limit(0)
            .toTimestamp(0L)
            .userId(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActivityListSecurityActivitiesParams.builder()
                .after("after")
                .fromTimestamp(0L)
                .limit(0)
                .toTimestamp(0L)
                .userId(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("fromTimestamp", "0")
                    .put("limit", "0")
                    .put("toTimestamp", "0")
                    .put("userId", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActivityListSecurityActivitiesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
