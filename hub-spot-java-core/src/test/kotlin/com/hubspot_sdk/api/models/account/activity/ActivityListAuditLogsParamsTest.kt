// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.hubspot_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActivityListAuditLogsParamsTest {

    @Test
    fun create() {
        ActivityListAuditLogsParams.builder()
            .addActingUserId(0)
            .after("after")
            .limit(0)
            .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActivityListAuditLogsParams.builder()
                .addActingUserId(0)
                .after("after")
                .limit(0)
                .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("actingUserId", listOf("0").joinToString(","))
                    .put("after", "after")
                    .put("limit", "0")
                    .put("occurredAfter", "2019-12-27T18:11:19.117Z")
                    .put("occurredBefore", "2019-12-27T18:11:19.117Z")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActivityListAuditLogsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
