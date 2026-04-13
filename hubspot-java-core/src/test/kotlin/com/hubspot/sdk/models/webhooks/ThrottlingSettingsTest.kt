// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThrottlingSettingsTest {

    @Test
    fun create() {
        val throttlingSettings = ThrottlingSettings.builder().maxConcurrentRequests(0).build()

        assertThat(throttlingSettings.maxConcurrentRequests()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val throttlingSettings = ThrottlingSettings.builder().maxConcurrentRequests(0).build()

        val roundtrippedThrottlingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(throttlingSettings),
                jacksonTypeRef<ThrottlingSettings>(),
            )

        assertThat(roundtrippedThrottlingSettings).isEqualTo(throttlingSettings)
    }
}
