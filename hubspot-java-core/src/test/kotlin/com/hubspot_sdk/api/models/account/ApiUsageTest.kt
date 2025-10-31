// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiUsageTest {

    @Test
    fun create() {
        val apiUsage =
            ApiUsage.builder()
                .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currentUsage(0)
                .fetchStatus(ApiUsage.FetchStatus.SUCCESS)
                .name("name")
                .usageLimit(0)
                .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(apiUsage.collectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiUsage.currentUsage()).isEqualTo(0)
        assertThat(apiUsage.fetchStatus()).isEqualTo(ApiUsage.FetchStatus.SUCCESS)
        assertThat(apiUsage.name()).isEqualTo("name")
        assertThat(apiUsage.usageLimit()).isEqualTo(0)
        assertThat(apiUsage.resetsAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiUsage =
            ApiUsage.builder()
                .collectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currentUsage(0)
                .fetchStatus(ApiUsage.FetchStatus.SUCCESS)
                .name("name")
                .usageLimit(0)
                .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedApiUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiUsage),
                jacksonTypeRef<ApiUsage>(),
            )

        assertThat(roundtrippedApiUsage).isEqualTo(apiUsage)
    }
}
